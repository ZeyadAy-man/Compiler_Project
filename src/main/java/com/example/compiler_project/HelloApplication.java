package com.example.compiler_project;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class HelloApplication extends Application {

    private TextArea inputArea;
    private TextArea lineNumbersArea;
    private TextArea errorsArea;
    private ImageView parseTreeView;
    private ImageView checkIconView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CS407 Compiler - Perfect Scroll & Alignment");

        // ===== Input Panel =====
        Label inputLabel = new Label("Input Program");
        inputLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        // Line numbers area
        lineNumbersArea = new TextArea("1");
        lineNumbersArea.setEditable(false);
        lineNumbersArea.setWrapText(false);
        lineNumbersArea.setPrefWidth(40);
        lineNumbersArea.setStyle(
                "-fx-control-inner-background: #DDDDDD;" +
                        "-fx-font-family: 'Consolas';" +
                        "-fx-font-size: 16px;" +
                        "-fx-text-fill: black;" +
                        "-fx-padding: 0;"
        );

        // Input text area
        inputArea = new TextArea();
        inputArea.setWrapText(false);
        inputArea.setStyle(
                "-fx-font-family: 'Consolas';" +
                        "-fx-font-size: 16px;" +
                        "-fx-border-color: #006666;" +
                        "-fx-border-width: 2;"
        );

        inputArea.textProperty().addListener((obs, oldText, newText) -> updateLineNumbers());

        // Put them side by side (one scrollbar)
        HBox textAreaContainer = new HBox(lineNumbersArea, inputArea);
        HBox.setHgrow(inputArea, Priority.ALWAYS);

        // Sync scrollbars
        bindScrollBars(lineNumbersArea, inputArea);

        Button compileBtn = new Button("Compile");
        compileBtn.setStyle("-fx-background-color: #009688; -fx-text-fill: white; -fx-font-weight: bold;");
        compileBtn.setOnAction(e -> onCompile());

        Button fromFileBtn = new Button("From File...");
        fromFileBtn.setOnAction(e -> onFromFile(primaryStage));
        fromFileBtn.setStyle("-fx-background-color: #003333; -fx-text-fill: white; -fx-font-weight: bold;");

        HBox inputHeader = new HBox(12, inputLabel, fromFileBtn);
        inputHeader.setAlignment(Pos.CENTER_LEFT);

        VBox inputBox = new VBox(10, inputHeader, textAreaContainer, compileBtn);
        inputBox.setPadding(new Insets(12));
        inputBox.setStyle("-fx-background-color: #E3F2FD; -fx-border-color: #006666; -fx-border-width: 3; -fx-border-radius: 6; -fx-background-radius: 6;");
        VBox.setVgrow(textAreaContainer, Priority.ALWAYS);

        TitledPane inputPane = new TitledPane("Input", inputBox);
        inputPane.setCollapsible(false);

        // ===== Output Panel =====
        Label parseTreeLabel = new Label("Parse Tree");
        parseTreeLabel.setStyle("-fx-font-weight: bold;");
        Button showBtn = new Button("Show");
        showBtn.setOnAction(e -> onShowParseTree());

        HBox parseHeader = new HBox(10, parseTreeLabel, showBtn);
        parseHeader.setAlignment(Pos.CENTER_LEFT);

        parseTreeView = new ImageView();
        parseTreeView.setPreserveRatio(true);
        parseTreeView.setFitWidth(720);
        parseTreeView.setFitHeight(320);
        parseTreeView.setStyle("-fx-border-color: #FF9999; -fx-border-width: 1;");

        VBox leftOutput = new VBox(10, parseHeader, parseTreeView);
        leftOutput.setAlignment(Pos.TOP_LEFT);
        VBox.setVgrow(leftOutput, Priority.ALWAYS);

        Label outputLabel = new Label("Output");
        outputLabel.setStyle("-fx-font-weight: bold;");

        checkIconView = new ImageView();
        checkIconView.setFitWidth(24);
        checkIconView.setFitHeight(24);
        HBox rightHeader = new HBox(10, outputLabel, checkIconView);
        rightHeader.setAlignment(Pos.CENTER_LEFT);

        errorsArea = new TextArea();
        errorsArea.setEditable(false);
        errorsArea.setStyle("-fx-font-family: 'Consolas'; -fx-font-size: 12px; -fx-border-color: #FF9999; -fx-border-width: 1;");
        VBox.setVgrow(errorsArea, Priority.ALWAYS);

        VBox rightOutput = new VBox(10, rightHeader, errorsArea);
        rightOutput.setAlignment(Pos.TOP_LEFT);
        rightOutput.setPrefWidth(340);

        HBox outputContent = new HBox(18, leftOutput, rightOutput);
        outputContent.setPadding(new Insets(12));
        outputContent.setStyle("-fx-background-color: white;");
        HBox.setHgrow(leftOutput, Priority.ALWAYS);

        TitledPane outputPane = new TitledPane("Output", outputContent);
        outputPane.setCollapsible(false);
        VBox.setVgrow(outputPane, Priority.ALWAYS);

        // Root layout
        VBox root = new VBox(10, inputPane, outputPane);
        root.setPadding(new Insets(12));
        root.setStyle("-fx-background-color: #006666;");
        VBox.setVgrow(outputPane, Priority.ALWAYS);

        Scene scene = new Scene(root, 1120, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // ===== Scroll sync logic =====
    private void bindScrollBars(TextArea lineArea, TextArea textArea) {
        ScrollBar textScrollBar = getScrollBar(textArea, Orientation.VERTICAL);
        ScrollBar lineScrollBar = getScrollBar(lineArea, Orientation.VERTICAL);
        if (textScrollBar != null && lineScrollBar != null) {
            ChangeListener<Number> listener = (obs, oldVal, newVal) -> lineScrollBar.setValue(newVal.doubleValue());
            textScrollBar.valueProperty().addListener(listener);
            lineScrollBar.valueProperty().addListener((obs, oldVal, newVal) -> textScrollBar.setValue(newVal.doubleValue()));
        }
    }

    private ScrollBar getScrollBar(TextArea textArea, Orientation orientation) {
        for (Node node : textArea.lookupAll(".scroll-bar")) {
            if (node instanceof ScrollBar sb && sb.getOrientation() == orientation) {
                return sb;
            }
        }
        return null;
    }

    // ===== Actions =====
    private void onFromFile(Stage stage) {
        try {
            FileChooser chooser = new FileChooser();
            chooser.setTitle("Open File");
            File file = chooser.showOpenDialog(stage);
            if (file != null) {
                String text = Files.readString(file.toPath(), StandardCharsets.UTF_8);
                inputArea.setText(text);
            }
        } catch (Exception ignored) {
        }
    }

    private void onCompile() {
        try {
            new ProcessBuilder("DOT.BAT").start();
            String msg = "abc"; // placeholder
            boolean hasError = (msg != null && msg.contains("line"));

            if (hasError) {
                errorsArea.setStyle("-fx-text-fill: red;");
                errorsArea.setText("Error:\n" + msg);
                setCheckIcon("False.JPG");
                parseTreeView.setImage(null);
            } else {
                errorsArea.setStyle("-fx-text-fill: #00660A;");
                errorsArea.setText("Compiled Successfully\n" + (msg == null ? "" : msg));
                setCheckIcon("Correct.JPG");
                parseTreeView.setImage(null);
            }
        } catch (Exception ignored) {
        }
    }

    private void onShowParseTree() {
        try {
            String msg = "abc"; // placeholder
            boolean hasError = (msg != null && msg.contains("line"));
            if (hasError) {
                parseTreeView.setImage(null);
                Tooltip.install(parseTreeView, new Tooltip("No Parse Tree Available"));
            } else {
                File imgFile = new File("Parse.png");
                if (imgFile.exists()) {
                    Image img = new Image(imgFile.toURI().toString(), false);
                    parseTreeView.setImage(img);
                } else {
                    parseTreeView.setImage(null);
                    Tooltip.install(parseTreeView, new Tooltip("Parse.png not found"));
                }
            }
        } catch (Exception ignored) {
        }
    }

    private void setCheckIcon(String filename) {
        try {
            File f = new File(filename);
            if (f.exists()) {
                Image icon = new Image(f.toURI().toString(), 24, 24, true, true);
                checkIconView.setImage(icon);
            } else {
                checkIconView.setImage(null);
            }
        } catch (Exception ignored) {
        }
    }

    private void updateLineNumbers() {
        String text = inputArea.getText();
        int lines = text.split("\n", -1).length;
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i <= lines; i++) {
            numbers.append(i).append("\n");
        }
        lineNumbersArea.setText(numbers.toString());
    }
}
