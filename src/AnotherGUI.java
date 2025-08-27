import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

/**
 * @author Hanood
 */
public class AnotherGUI extends javax.swing.JFrame {

    static String args[];
    Compiler_ProjectParser parser;
    private int mode = 0; // 0: Dark, 1: Light, 2: High Contrast
    private JTextArea lineNumberArea; // Declared once here
    private JScrollPane lineNumberScrollPane; // Scroll pane for line numbers

    /**
     * Creates new form AnotherGUI
     */
    public AnotherGUI() {
        initComponents();
        customizeDesign();
        styleButtons();
    }

    private void customizeDesign() {
        setTitle("CS407 Compiler - Modern IDE Style");
        setSize(1000, 600);
        applyDarkMode();
    }

    // Method to center text in JTextArea by padding with spaces
    private void centerTextInTextArea(JTextArea textArea) {
        String[] lines = textArea.getText().split("\n");
        StringBuilder centeredText = new StringBuilder();
        int maxWidth = String.valueOf(lines.length).length(); // Max digits in line numbers

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (!line.isEmpty()) {
                // Calculate padding to center the line number
                int padding = (maxWidth - line.length()) / 2;
                centeredText.append(" ".repeat(Math.max(0, padding)))
                        .append(line)
                        .append(" ".repeat(Math.max(0, padding)))
                        .append("\n");
            } else {
                centeredText.append("\n");
            }
        }
        textArea.setText(centeredText.toString());
    }

    private void applyDarkMode() {
        jPanel2.setBackground(new Color(45, 47, 58));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 255, 204), 5));

        jPanel1.setBackground(new Color(30, 32, 40));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14), new Color(0, 255, 204)));

        OutputPanel.setBackground(new Color(30, 32, 40));
        OutputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14), new Color(0, 255, 204)));

        jLabel2.setForeground(new Color(0, 255, 204));
        jLabel4.setForeground(new Color(0, 255, 204));
        jLabel6.setForeground(new Color(0, 255, 204));

        Input.setBackground(new Color(20, 22, 30));
        Input.setForeground(new Color(200, 200, 200));
        Input.setFont(new Font("Consolas", Font.PLAIN, 18)); // Increased font size
        Input.setBorder(new javax.swing.border.LineBorder(new Color(0, 255, 204), 2, true));

        lineNumberArea.setBackground(new Color(20, 22, 30));
        lineNumberArea.setForeground(new Color(200, 200, 200));
        lineNumberArea.setFont(new Font("Consolas", Font.BOLD, 18));
        centerTextInTextArea(lineNumberArea);
        lineNumberArea.setBorder(new javax.swing.border.LineBorder(new Color(0, 255, 204), 2, true));

        Errors.setBackground(new Color(20, 22, 30));
        Errors.setForeground(new Color(200, 200, 200));
        Errors.setBorder(new javax.swing.border.LineBorder(new Color(255, 77, 77), 1, true));

        ParseTree.setForeground(new Color(255, 77, 77));
        ParseTree.setBorder(new javax.swing.border.LineBorder(new Color(255, 77, 77), 1, true));

        jButton7.setText("Light Mode");
    }

    private void applyLightMode() {
        jPanel2.setBackground(new Color(245, 247, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(30, 144, 255), 5));

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14), new Color(30, 144, 255)));

        OutputPanel.setBackground(new Color(255, 255, 255));
        OutputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14), new Color(30, 144, 255)));

        jLabel2.setForeground(new Color(30, 144, 255));
        jLabel4.setForeground(new Color(30, 144, 255));
        jLabel6.setForeground(new Color(30, 144, 255));

        Input.setBackground(Color.WHITE);
        Input.setForeground(Color.BLACK);
        Input.setFont(new Font("Consolas", Font.PLAIN, 18)); // Increased font size
        Input.setBorder(new javax.swing.border.LineBorder(new Color(30, 144, 255), 2, true));

        lineNumberArea.setBackground(Color.WHITE);
        lineNumberArea.setForeground(Color.BLACK);
        lineNumberArea.setFont(new Font("Consolas", Font.BOLD, 18));
        centerTextInTextArea(lineNumberArea);
        lineNumberArea.setBorder(new javax.swing.border.LineBorder(new Color(30, 144, 255), 2, true));

        Errors.setBackground(Color.WHITE);
        Errors.setForeground(Color.BLACK);
        Errors.setBorder(new javax.swing.border.LineBorder(new Color(255, 77, 77), 1, true));

        ParseTree.setForeground(Color.BLACK);
        ParseTree.setBorder(new javax.swing.border.LineBorder(new Color(255, 77, 77), 1, true));

        jButton7.setText("High Contrast Mode");
    }

    private void applyHighContrastMode() {
        jPanel2.setBackground(new Color(20, 20, 25));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 220, 255), 5));

        jPanel1.setBackground(new Color(20, 20, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14), new Color(0, 220, 255)));

        OutputPanel.setBackground(new Color(20, 20, 25));
        OutputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14), new Color(0, 220, 255)));

        jLabel2.setForeground(new Color(230, 230, 230));
        jLabel4.setForeground(new Color(230, 230, 230));
        jLabel6.setForeground(new Color(230, 230, 230));

        Input.setBackground(new Color(20, 20, 25));
        Input.setForeground(new Color(230, 230, 230));
        Input.setFont(new Font("Consolas", Font.PLAIN, 18)); // Increased font size
        Input.setBorder(new javax.swing.border.LineBorder(new Color(0, 220, 255), 2, true));

        lineNumberArea.setBackground(new Color(20, 20, 25));
        lineNumberArea.setForeground(new Color(230, 230, 230));
        lineNumberArea.setFont(new Font("Consolas", Font.BOLD, 18));
        centerTextInTextArea(lineNumberArea);
        lineNumberArea.setBorder(new javax.swing.border.LineBorder(new Color(0, 220, 255), 2, true));

        Errors.setBackground(new Color(20, 20, 25));
        Errors.setForeground(new Color(230, 230, 230));
        Errors.setBorder(new javax.swing.border.LineBorder(new Color(255, 77, 77), 1, true));

        ParseTree.setForeground(new Color(255, 77, 77));
        ParseTree.setBorder(new javax.swing.border.LineBorder(new Color(255, 77, 77), 1, true));

        jButton7.setText("Dark Mode");
    }

    private void styleButtons() {
        JButton[] buttons = {jButton4, jButton5, jButton6, jButton7};
        for (JButton button : buttons) {
            button.setFont(new java.awt.Font("Segoe UI", 1, 14));
            button.setForeground(Color.WHITE);
            button.setFocusPainted(false);
            button.setBorder(new RoundedBorder(getAccentColor(), 12));
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(true);

            button.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
                @Override
                protected void paintButtonPressed(Graphics g, javax.swing.AbstractButton b) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    Color darkerAccent = getAccentColor().darker();
                    g2.setPaint(new GradientPaint(0, 0, darkerAccent, 0, b.getHeight(), darkerAccent.darker()));
                    g2.fillRoundRect(0, 0, b.getWidth(), b.getHeight(), 12, 12);
                    g2.dispose();
                }

                @Override
                public void paint(Graphics g, javax.swing.JComponent c) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    Color baseColor = getAccentColor();
                    Color gradientEnd = baseColor.brighter();
                    g2.setPaint(new GradientPaint(0, 0, baseColor, 0, c.getHeight(), gradientEnd));
                    g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 12, 12);
                    super.paint(g2, c);
                    g2.dispose();
                }
            });

            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setForeground(new Color(255, 255, 255, 200));
                    button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setForeground(Color.WHITE);
                    button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                }
            });
        }

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16));
    }

    private class RoundedBorder implements Border {
        private Color color;
        private int radius;

        public RoundedBorder(Color color, int radius) {
            this.color = color;
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(color);
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
            g2.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(8, 16, 8, 16);
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }
    }

    private Color getAccentColor() {
        switch (mode) {
            case 0: return new Color(0, 255, 204); // Dark Mode accent
            case 1: return new Color(30, 144, 255); // Light Mode accent
            case 2: return new Color(0, 220, 255); // High Contrast Mode accent
            default: return new Color(0, 255, 204);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel2 = new JPanel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jScrollPane3 = new JScrollPane();
        Input = new JTextArea();
        lineNumberArea = new JTextArea();
        lineNumberScrollPane = new JScrollPane();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton7 = new JButton();
        OutputPanel = new JPanel();
        jButton6 = new JButton();
        jLabel4 = new JLabel();
        jLabel6 = new JLabel();
        ParseTree = new JLabel();
        jScrollPane1 = new JScrollPane();
        Errors = new JTextArea();
        Check = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new Color(45, 47, 58));
        jPanel2.setBorder(new LineBorder(new Color(0, 255, 204), 5, true));

        jPanel1.setBackground(new Color(30, 32, 40));
        jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Input",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Segoe UI", 1, 14), new Color(0, 255, 204)));

        jLabel2.setFont(new Font("Segoe UI", 1, 12));
        jLabel2.setForeground(new Color(0, 255, 204));
        jLabel2.setText("Input Program");

        Input.setColumns(20);
        Input.setFont(new Font("Consolas", 0, 18)); // Increased font size
        Input.setRows(5);
        Input.setBorder(new LineBorder(new Color(0, 255, 204), 2, true));
        jScrollPane3.setViewportView(Input);

        lineNumberArea.setEditable(false);
        lineNumberArea.setColumns(6);
        lineNumberArea.setFont(new Font("Consolas", Font.BOLD, 18));
        lineNumberArea.setRows(5);
        lineNumberArea.setText("1\n");
        lineNumberArea.setBackground(new Color(20, 22, 30));
        lineNumberArea.setForeground(new Color(200, 200, 200));
        lineNumberArea.setBorder(new LineBorder(new Color(0, 255, 204), 2, true));
        centerTextInTextArea(lineNumberArea);
        lineNumberScrollPane.setViewportView(lineNumberArea);
        lineNumberScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        lineNumberScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Synchronize scrolling
        jScrollPane3.getVerticalScrollBar().getModel().addChangeListener(e -> {
            lineNumberScrollPane.getVerticalScrollBar().setValue(jScrollPane3.getVerticalScrollBar().getValue());
        });
        lineNumberScrollPane.getVerticalScrollBar().getModel().addChangeListener(e -> {
            jScrollPane3.getVerticalScrollBar().setValue(lineNumberScrollPane.getVerticalScrollBar().getValue());
        });

        // Panel to hold line numbers and input area
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(lineNumberScrollPane, BorderLayout.WEST);
        inputPanel.add(jScrollPane3, BorderLayout.CENTER);

        // Update line numbers dynamically
        Input.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { updateLineNumbers(); }
            public void removeUpdate(DocumentEvent e) { updateLineNumbers(); }
            public void changedUpdate(DocumentEvent e) { updateLineNumbers(); }

            private void updateLineNumbers() {
                Element root = Input.getDocument().getDefaultRootElement();
                int lineCount = root.getElementCount();
                StringBuilder lineNumbers = new StringBuilder();
                for (int i = 1; i <= lineCount; i++) {
                    lineNumbers.append(i).append("\n");
                }
                lineNumberArea.setText(lineNumbers.toString());
                centerTextInTextArea(lineNumberArea); // Apply centering
            }
        });

        jButton4.setFont(new Font("Segoe UI", 1, 14));
        jButton4.setText("Compile");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new Font("Segoe UI", 1, 12));
        jButton5.setForeground(Color.WHITE);
        jButton5.setText("From File...");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new Font("Segoe UI", 1, 12));
        jButton7.setForeground(Color.WHITE);
        jButton7.setText("Light Mode");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(inputPanel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(inputPanel, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        OutputPanel.setBackground(new Color(30, 32, 40));
        OutputPanel.setBorder(BorderFactory.createTitledBorder(null, "Output",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Segoe UI", 1, 14), new Color(0, 255, 204)));

        jButton6.setFont(new Font("Segoe UI", 1, 12));
        jButton6.setForeground(Color.WHITE);
        jButton6.setText("Show");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Segoe UI", 1, 12));
        jLabel4.setForeground(new Color(0, 255, 204));
        jLabel4.setText("Parse Tree");

        jLabel6.setFont(new Font("Segoe UI", 1, 12));
        jLabel6.setForeground(new Color(0, 255, 204));
        jLabel6.setText("Output");

        ParseTree.setForeground(new Color(255, 77, 77));
        ParseTree.setBorder(new LineBorder(new Color(255, 77, 77), 1, true));

        jScrollPane1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

        Errors.setColumns(20);
        Errors.setEditable(false);
        Errors.setFont(new Font("Consolas", 0, 12));
        Errors.setRows(5);
        Errors.setBorder(new LineBorder(new Color(255, 77, 77), 1, true));
        jScrollPane1.setViewportView(Errors);

        Check.setBackground(new Color(30, 32, 40));

        GroupLayout OutputPanelLayout = new GroupLayout(OutputPanel);
        OutputPanel.setLayout(OutputPanelLayout);
        OutputPanelLayout.setHorizontalGroup(
                OutputPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(OutputPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OutputPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(ParseTree, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(OutputPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(OutputPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(OutputPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Check, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addContainerGap())
        );
        OutputPanelLayout.setVerticalGroup(
                OutputPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(OutputPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OutputPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(OutputPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6))
                                        .addComponent(Check, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(OutputPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(ParseTree, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                .addContainerGap())
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OutputPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OutputPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            ANTLRStringStream input = new ANTLRStringStream(Input.getText());
            Compiler_ProjectLexer lexer = new Compiler_ProjectLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new Compiler_ProjectParser(tokens);
            Compiler_ProjectParser.program_return r = parser.program();
            CommonTree t = (CommonTree) r.getTree();
            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(t);

            String stt = st.toString();
            stt = stt.replaceFirst("bgcolor=\"lightgrey\"", "bgcolor=\"0 .4 .7\"");
            stt = stt.replaceFirst("fontcolor=\"blue\"", "fontcolor=\"black\"");
            stt = stt.replaceFirst("style=\"filled, solid, bold\"", "style=\"filled, solid, regular\"");
            stt = stt.replaceFirst("style=\"bold\"", "style=\"regular\"");

            PrintWriter output = new PrintWriter(new File("Dot.dot"));
            output.print(stt);
            output.close();

            Process process = new ProcessBuilder("DOT.BAT").start();

            String msg = parser.s;
            if (msg.contains("line")) {
                Errors.setForeground(Color.RED);
                Errors.setText("Error: \n" + msg);
                Check.setIcon(new ImageIcon("False.JPG"));
            } else {
                Errors.setForeground(new Color(0, 102, 10));
                Errors.setText("Compiled Successfully \n" + msg);
                Check.setIcon(new ImageIcon("Correct.JPG"));
            }
            ParseTree.setIcon(null);
            ParseTree.setText(null);
        } catch (Exception e) {}
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            JFileChooser jFileChooser1 = new JFileChooser();
            int choice = jFileChooser1.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                java.io.File file = jFileChooser1.getSelectedFile();
                java.util.Scanner scan = new java.util.Scanner(file);
                String t = "";
                while (scan.hasNext()) {
                    t += scan.nextLine() + "\n";
                }
                Input.setText(t);
            }
        } catch (Exception e) {}
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int WIDTH = ParseTree.getWidth();
            int HEIGHT = ParseTree.getHeight();
            Image I = ImageIO.read(new File("Parse.png")).getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
            ImageIcon img = new ImageIcon(I);
            String msg = parser.s;
            if (msg.contains("line")) {
                ParseTree.setText("No Parse Tree Available");
            } else {
                ParseTree.setIcon(img);
            }
        } catch (Exception e) {}
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        mode = (mode + 1) % 3;
        switch (mode) {
            case 0:
                applyDarkMode();
                break;
            case 1:
                applyLightMode();
                break;
            case 2:
                applyHighContrastMode();
                break;
        }
        styleButtons();
    }

    public static void main(String args[]) {
        AnotherGUI.args = args;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {}
        java.awt.EventQueue.invokeLater(() -> {
            AnotherGUI MyForm = new AnotherGUI();
            MyForm.setLocationRelativeTo(null);
            MyForm.setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Check;
    private javax.swing.JTextArea Errors;
    private javax.swing.JTextArea Input;
    private javax.swing.JPanel OutputPanel;
    private javax.swing.JLabel ParseTree;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration
}