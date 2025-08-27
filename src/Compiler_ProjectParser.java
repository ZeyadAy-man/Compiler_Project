// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g 2025-08-26 15:34:14

import org.antlr.runtime.*;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Compiler_ProjectParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arguments", "ArithmaticOperators", "AssigningWith", "AssignmentAutoOperators", "AssignmentOperators", "AutoDecl", "BooleanAssiging", "BooleanDecl", "BooleanValue", "Booleans", "BreakStmt", "CallingFunctions", "ChangingByOne", "ChangingByVariable", "CharValue", "ClassDeclaration", "Comment", "ConditionBrackets", "ConstructorDecl", "DeclarationWith", "DeclarationWithout", "ElseBody", "FloatAssigning", "FloatDecl", "FloatValue", "ForLoopBrackets", "ForLoopStmt", "FunctionBody", "FunctionDeclaration", "FunctionParameters", "ID", "IfBody", "IfStmt", "IncludeStmt", "InputStmt", "IntValue", "IntegerAssigning", "IntegerDecl", "LambdaFunction", "LogicalOperators", "MainFunctionDeclaration", "ObjectDecl", "OutputStmt", "Parameters", "PointerMemberFunctionCall", "Program", "ReturnStmt", "StringAssigning", "StringDecl", "StringValue", "SwitchBody", "SwitchCase", "SwitchDefault", "SwitchExpression", "SwitchStmt", "UsingNameSpaceStmt", "VectorDecl", "WS", "WhileLoopBody", "WhileLoopCondition", "WhileLoopStmt", "'!'", "'!='", "'#'", "'&'", "'('", "')'", "','", "'->'", "'.'", "':'", "';'", "'<'", "'<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'['", "']'", "'auto'", "'bool'", "'break'", "'case'", "'class'", "'const'", "'default'", "'else'", "'float'", "'for'", "'if'", "'include'", "'int'", "'main'", "'namespace'", "'private'", "'public'", "'return'", "'std'", "'string'", "'switch'", "'using'", "'vector'", "'void'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int Arguments=4;
    public static final int ArithmaticOperators=5;
    public static final int AssigningWith=6;
    public static final int AssignmentAutoOperators=7;
    public static final int AssignmentOperators=8;
    public static final int AutoDecl=9;
    public static final int BooleanAssiging=10;
    public static final int BooleanDecl=11;
    public static final int BooleanValue=12;
    public static final int Booleans=13;
    public static final int BreakStmt=14;
    public static final int CallingFunctions=15;
    public static final int ChangingByOne=16;
    public static final int ChangingByVariable=17;
    public static final int CharValue=18;
    public static final int ClassDeclaration=19;
    public static final int Comment=20;
    public static final int ConditionBrackets=21;
    public static final int ConstructorDecl=22;
    public static final int DeclarationWith=23;
    public static final int DeclarationWithout=24;
    public static final int ElseBody=25;
    public static final int FloatAssigning=26;
    public static final int FloatDecl=27;
    public static final int FloatValue=28;
    public static final int ForLoopBrackets=29;
    public static final int ForLoopStmt=30;
    public static final int FunctionBody=31;
    public static final int FunctionDeclaration=32;
    public static final int FunctionParameters=33;
    public static final int ID=34;
    public static final int IfBody=35;
    public static final int IfStmt=36;
    public static final int IncludeStmt=37;
    public static final int InputStmt=38;
    public static final int IntValue=39;
    public static final int IntegerAssigning=40;
    public static final int IntegerDecl=41;
    public static final int LambdaFunction=42;
    public static final int LogicalOperators=43;
    public static final int MainFunctionDeclaration=44;
    public static final int ObjectDecl=45;
    public static final int OutputStmt=46;
    public static final int Parameters=47;
    public static final int PointerMemberFunctionCall=48;
    public static final int Program=49;
    public static final int ReturnStmt=50;
    public static final int StringAssigning=51;
    public static final int StringDecl=52;
    public static final int StringValue=53;
    public static final int SwitchBody=54;
    public static final int SwitchCase=55;
    public static final int SwitchDefault=56;
    public static final int SwitchExpression=57;
    public static final int SwitchStmt=58;
    public static final int UsingNameSpaceStmt=59;
    public static final int VectorDecl=60;
    public static final int WS=61;
    public static final int WhileLoopBody=62;
    public static final int WhileLoopCondition=63;
    public static final int WhileLoopStmt=64;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Compiler_ProjectParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Compiler_ProjectParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return Compiler_ProjectParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g"; }


    String s="";


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:57:1: program : ( includeStmt )+ usingNameSpaceStmt ( classDeclaration )+ mainFunctionDeclaration -> ^( Program ( includeStmt )+ usingNameSpaceStmt ( classDeclaration )+ mainFunctionDeclaration ) ;
    public final Compiler_ProjectParser.program_return program() throws RecognitionException {
        Compiler_ProjectParser.program_return retval = new Compiler_ProjectParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Compiler_ProjectParser.includeStmt_return includeStmt1 =null;

        Compiler_ProjectParser.usingNameSpaceStmt_return usingNameSpaceStmt2 =null;

        Compiler_ProjectParser.classDeclaration_return classDeclaration3 =null;

        Compiler_ProjectParser.mainFunctionDeclaration_return mainFunctionDeclaration4 =null;


        RewriteRuleSubtreeStream stream_usingNameSpaceStmt=new RewriteRuleSubtreeStream(adaptor,"rule usingNameSpaceStmt");
        RewriteRuleSubtreeStream stream_includeStmt=new RewriteRuleSubtreeStream(adaptor,"rule includeStmt");
        RewriteRuleSubtreeStream stream_mainFunctionDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule mainFunctionDeclaration");
        RewriteRuleSubtreeStream stream_classDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule classDeclaration");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:57:9: ( ( includeStmt )+ usingNameSpaceStmt ( classDeclaration )+ mainFunctionDeclaration -> ^( Program ( includeStmt )+ usingNameSpaceStmt ( classDeclaration )+ mainFunctionDeclaration ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:57:11: ( includeStmt )+ usingNameSpaceStmt ( classDeclaration )+ mainFunctionDeclaration
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:57:11: ( includeStmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==67) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:57:11: includeStmt
            	    {
            	    pushFollow(FOLLOW_includeStmt_in_program172);
            	    includeStmt1=includeStmt();

            	    state._fsp--;

            	    stream_includeStmt.add(includeStmt1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            pushFollow(FOLLOW_usingNameSpaceStmt_in_program175);
            usingNameSpaceStmt2=usingNameSpaceStmt();

            state._fsp--;

            stream_usingNameSpaceStmt.add(usingNameSpaceStmt2.getTree());

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:57:43: ( classDeclaration )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==90) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:57:43: classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_program177);
            	    classDeclaration3=classDeclaration();

            	    state._fsp--;

            	    stream_classDeclaration.add(classDeclaration3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            pushFollow(FOLLOW_mainFunctionDeclaration_in_program180);
            mainFunctionDeclaration4=mainFunctionDeclaration();

            state._fsp--;

            stream_mainFunctionDeclaration.add(mainFunctionDeclaration4.getTree());

            // AST REWRITE
            // elements: mainFunctionDeclaration, includeStmt, usingNameSpaceStmt, classDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:85: -> ^( Program ( includeStmt )+ usingNameSpaceStmt ( classDeclaration )+ mainFunctionDeclaration )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:58:3: ^( Program ( includeStmt )+ usingNameSpaceStmt ( classDeclaration )+ mainFunctionDeclaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Program, "Program")
                , root_1);

                if ( !(stream_includeStmt.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_includeStmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_includeStmt.nextTree());

                }
                stream_includeStmt.reset();

                adaptor.addChild(root_1, stream_usingNameSpaceStmt.nextTree());

                if ( !(stream_classDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_classDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDeclaration.nextTree());

                }
                stream_classDeclaration.reset();

                adaptor.addChild(root_1, stream_mainFunctionDeclaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class mainFunctionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mainFunctionDeclaration"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:67:1: mainFunctionDeclaration : 'int' 'main' '(' ')' '{' ( stmts )* ( returnStmt )? '}' -> ^( MainFunctionDeclaration 'int' 'main' '(' ')' '{' ( stmts )* ( returnStmt )? '}' ) ;
    public final Compiler_ProjectParser.mainFunctionDeclaration_return mainFunctionDeclaration() throws RecognitionException {
        Compiler_ProjectParser.mainFunctionDeclaration_return retval = new Compiler_ProjectParser.mainFunctionDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal5=null;
        Token string_literal6=null;
        Token char_literal7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal12=null;
        Compiler_ProjectParser.stmts_return stmts10 =null;

        Compiler_ProjectParser.returnStmt_return returnStmt11 =null;


        Object string_literal5_tree=null;
        Object string_literal6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_returnStmt=new RewriteRuleSubtreeStream(adaptor,"rule returnStmt");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:68:2: ( 'int' 'main' '(' ')' '{' ( stmts )* ( returnStmt )? '}' -> ^( MainFunctionDeclaration 'int' 'main' '(' ')' '{' ( stmts )* ( returnStmt )? '}' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:68:4: 'int' 'main' '(' ')' '{' ( stmts )* ( returnStmt )? '}'
            {
            string_literal5=(Token)match(input,98,FOLLOW_98_in_mainFunctionDeclaration245);  
            stream_98.add(string_literal5);


            string_literal6=(Token)match(input,99,FOLLOW_99_in_mainFunctionDeclaration247);  
            stream_99.add(string_literal6);


            char_literal7=(Token)match(input,69,FOLLOW_69_in_mainFunctionDeclaration249);  
            stream_69.add(char_literal7);


            char_literal8=(Token)match(input,70,FOLLOW_70_in_mainFunctionDeclaration251);  
            stream_70.add(char_literal8);


            char_literal9=(Token)match(input,111,FOLLOW_111_in_mainFunctionDeclaration253);  
            stream_111.add(char_literal9);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:68:29: ( stmts )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Comment||LA3_0==ID||(LA3_0 >= 86 && LA3_0 <= 87)||LA3_0==91||(LA3_0 >= 94 && LA3_0 <= 96)||LA3_0==98||(LA3_0 >= 105 && LA3_0 <= 106)||LA3_0==108||LA3_0==110) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:68:29: stmts
            	    {
            	    pushFollow(FOLLOW_stmts_in_mainFunctionDeclaration255);
            	    stmts10=stmts();

            	    state._fsp--;

            	    stream_stmts.add(stmts10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:68:36: ( returnStmt )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==103) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:68:37: returnStmt
                    {
                    pushFollow(FOLLOW_returnStmt_in_mainFunctionDeclaration259);
                    returnStmt11=returnStmt();

                    state._fsp--;

                    stream_returnStmt.add(returnStmt11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,112,FOLLOW_112_in_mainFunctionDeclaration263);  
            stream_112.add(char_literal12);


            // AST REWRITE
            // elements: stmts, 98, 70, 112, 111, 99, returnStmt, 69
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:54: -> ^( MainFunctionDeclaration 'int' 'main' '(' ')' '{' ( stmts )* ( returnStmt )? '}' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:69:3: ^( MainFunctionDeclaration 'int' 'main' '(' ')' '{' ( stmts )* ( returnStmt )? '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MainFunctionDeclaration, "MainFunctionDeclaration")
                , root_1);

                adaptor.addChild(root_1, 
                stream_98.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_99.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_111.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:69:54: ( stmts )*
                while ( stream_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmts.nextTree());

                }
                stream_stmts.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:69:61: ( returnStmt )?
                if ( stream_returnStmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_returnStmt.nextTree());

                }
                stream_returnStmt.reset();

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "mainFunctionDeclaration"


    public static class returnStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:78:1: returnStmt : 'return' IntValue ';' -> ^( ReturnStmt 'return' IntValue ';' ) ;
    public final Compiler_ProjectParser.returnStmt_return returnStmt() throws RecognitionException {
        Compiler_ProjectParser.returnStmt_return retval = new Compiler_ProjectParser.returnStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal13=null;
        Token IntValue14=null;
        Token char_literal15=null;

        Object string_literal13_tree=null;
        Object IntValue14_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_IntValue=new RewriteRuleTokenStream(adaptor,"token IntValue");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:79:2: ( 'return' IntValue ';' -> ^( ReturnStmt 'return' IntValue ';' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:79:4: 'return' IntValue ';'
            {
            string_literal13=(Token)match(input,103,FOLLOW_103_in_returnStmt338);  
            stream_103.add(string_literal13);


            IntValue14=(Token)match(input,IntValue,FOLLOW_IntValue_in_returnStmt340);  
            stream_IntValue.add(IntValue14);


            char_literal15=(Token)match(input,75,FOLLOW_75_in_returnStmt342);  
            stream_75.add(char_literal15);


            // AST REWRITE
            // elements: 103, IntValue, 75
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:26: -> ^( ReturnStmt 'return' IntValue ';' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:79:29: ^( ReturnStmt 'return' IntValue ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ReturnStmt, "ReturnStmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_103.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IntValue.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "returnStmt"


    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDeclaration"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:88:1: classDeclaration : 'class' ID '{' 'private' ':' ( declarationWith )* 'public' ':' ( publicValues )* '}' ';' -> ^( ClassDeclaration 'class' ID '{' 'private' ':' ( declarationWith )* 'public' ':' ( publicValues )* '}' ';' ) ;
    public final Compiler_ProjectParser.classDeclaration_return classDeclaration() throws RecognitionException {
        Compiler_ProjectParser.classDeclaration_return retval = new Compiler_ProjectParser.classDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal16=null;
        Token ID17=null;
        Token char_literal18=null;
        Token string_literal19=null;
        Token char_literal20=null;
        Token string_literal22=null;
        Token char_literal23=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Compiler_ProjectParser.declarationWith_return declarationWith21 =null;

        Compiler_ProjectParser.publicValues_return publicValues24 =null;


        Object string_literal16_tree=null;
        Object ID17_tree=null;
        Object char_literal18_tree=null;
        Object string_literal19_tree=null;
        Object char_literal20_tree=null;
        Object string_literal22_tree=null;
        Object char_literal23_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_publicValues=new RewriteRuleSubtreeStream(adaptor,"rule publicValues");
        RewriteRuleSubtreeStream stream_declarationWith=new RewriteRuleSubtreeStream(adaptor,"rule declarationWith");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:89:2: ( 'class' ID '{' 'private' ':' ( declarationWith )* 'public' ':' ( publicValues )* '}' ';' -> ^( ClassDeclaration 'class' ID '{' 'private' ':' ( declarationWith )* 'public' ':' ( publicValues )* '}' ';' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:89:4: 'class' ID '{' 'private' ':' ( declarationWith )* 'public' ':' ( publicValues )* '}' ';'
            {
            string_literal16=(Token)match(input,90,FOLLOW_90_in_classDeclaration401);  
            stream_90.add(string_literal16);


            ID17=(Token)match(input,ID,FOLLOW_ID_in_classDeclaration403);  
            stream_ID.add(ID17);


            char_literal18=(Token)match(input,111,FOLLOW_111_in_classDeclaration405);  
            stream_111.add(char_literal18);


            string_literal19=(Token)match(input,101,FOLLOW_101_in_classDeclaration407);  
            stream_101.add(string_literal19);


            char_literal20=(Token)match(input,74,FOLLOW_74_in_classDeclaration409);  
            stream_74.add(char_literal20);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:89:33: ( declarationWith )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID||(LA5_0 >= 86 && LA5_0 <= 87)||LA5_0==91||LA5_0==94||LA5_0==98||LA5_0==105||LA5_0==108) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:89:33: declarationWith
            	    {
            	    pushFollow(FOLLOW_declarationWith_in_classDeclaration411);
            	    declarationWith21=declarationWith();

            	    state._fsp--;

            	    stream_declarationWith.add(declarationWith21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            string_literal22=(Token)match(input,102,FOLLOW_102_in_classDeclaration414);  
            stream_102.add(string_literal22);


            char_literal23=(Token)match(input,74,FOLLOW_74_in_classDeclaration416);  
            stream_74.add(char_literal23);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:89:63: ( publicValues )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID||(LA6_0 >= 86 && LA6_0 <= 87)||LA6_0==91||LA6_0==94||LA6_0==98||LA6_0==105||(LA6_0 >= 108 && LA6_0 <= 109)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:89:63: publicValues
            	    {
            	    pushFollow(FOLLOW_publicValues_in_classDeclaration418);
            	    publicValues24=publicValues();

            	    state._fsp--;

            	    stream_publicValues.add(publicValues24.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            char_literal25=(Token)match(input,112,FOLLOW_112_in_classDeclaration421);  
            stream_112.add(char_literal25);


            char_literal26=(Token)match(input,75,FOLLOW_75_in_classDeclaration423);  
            stream_75.add(char_literal26);


            // AST REWRITE
            // elements: 101, 74, ID, 111, declarationWith, 75, 74, publicValues, 90, 102, 112
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:85: -> ^( ClassDeclaration 'class' ID '{' 'private' ':' ( declarationWith )* 'public' ':' ( publicValues )* '}' ';' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:90:3: ^( ClassDeclaration 'class' ID '{' 'private' ':' ( declarationWith )* 'public' ':' ( publicValues )* '}' ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ClassDeclaration, "ClassDeclaration")
                , root_1);

                adaptor.addChild(root_1, 
                stream_90.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_111.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_101.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:90:51: ( declarationWith )*
                while ( stream_declarationWith.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarationWith.nextTree());

                }
                stream_declarationWith.reset();

                adaptor.addChild(root_1, 
                stream_102.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:90:81: ( publicValues )*
                while ( stream_publicValues.hasNext() ) {
                    adaptor.addChild(root_1, stream_publicValues.nextTree());

                }
                stream_publicValues.reset();

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"


    public static class publicValues_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "publicValues"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:99:1: publicValues : ( declarationWith | functionDeclaration | constructorDecl ) ^;
    public final Compiler_ProjectParser.publicValues_return publicValues() throws RecognitionException {
        Compiler_ProjectParser.publicValues_return retval = new Compiler_ProjectParser.publicValues_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Compiler_ProjectParser.declarationWith_return declarationWith27 =null;

        Compiler_ProjectParser.functionDeclaration_return functionDeclaration28 =null;

        Compiler_ProjectParser.constructorDecl_return constructorDecl29 =null;



        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:100:2: ( ( declarationWith | functionDeclaration | constructorDecl ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:100:4: ( declarationWith | functionDeclaration | constructorDecl ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:100:4: ( declarationWith | functionDeclaration | constructorDecl )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 86:
            case 91:
            case 108:
                {
                alt7=1;
                }
                break;
            case 105:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==ID) ) {
                    int LA7_8 = input.LA(3);

                    if ( (LA7_8==71||LA7_8==75||LA7_8==79) ) {
                        alt7=1;
                    }
                    else if ( (LA7_8==69) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }
                }
                break;
            case 98:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==ID) ) {
                    int LA7_9 = input.LA(3);

                    if ( (LA7_9==71||LA7_9==75||LA7_9==79) ) {
                        alt7=1;
                    }
                    else if ( (LA7_9==69) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;

                }
                }
                break;
            case 94:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==ID) ) {
                    int LA7_10 = input.LA(3);

                    if ( (LA7_10==71||LA7_10==75||LA7_10==79) ) {
                        alt7=1;
                    }
                    else if ( (LA7_10==69) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 10, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;

                }
                }
                break;
            case 87:
                {
                int LA7_5 = input.LA(2);

                if ( (LA7_5==ID) ) {
                    int LA7_11 = input.LA(3);

                    if ( (LA7_11==71||LA7_11==75||LA7_11==79) ) {
                        alt7=1;
                    }
                    else if ( (LA7_11==69) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 11, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 69:
                    {
                    alt7=3;
                    }
                    break;
                case 68:
                    {
                    alt7=1;
                    }
                    break;
                case ID:
                    {
                    int LA7_13 = input.LA(3);

                    if ( (LA7_13==69) ) {
                        switch ( input.LA(4) ) {
                        case BooleanValue:
                        case FloatValue:
                        case IntValue:
                        case StringValue:
                        case 84:
                        case 111:
                            {
                            alt7=1;
                            }
                            break;
                        case ID:
                            {
                            int LA7_15 = input.LA(5);

                            if ( (LA7_15==ArithmaticOperators||(LA7_15 >= 69 && LA7_15 <= 71)||LA7_15==73) ) {
                                alt7=1;
                            }
                            else if ( (LA7_15==ID||LA7_15==68) ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 15, input);

                                throw nvae;

                            }
                            }
                            break;
                        case 71:
                            {
                            switch ( input.LA(5) ) {
                            case BooleanValue:
                            case FloatValue:
                            case IntValue:
                            case StringValue:
                            case 84:
                            case 111:
                                {
                                alt7=1;
                                }
                                break;
                            case ID:
                                {
                                int LA7_18 = input.LA(6);

                                if ( (LA7_18==ArithmaticOperators||(LA7_18 >= 69 && LA7_18 <= 71)||LA7_18==73) ) {
                                    alt7=1;
                                }
                                else if ( (LA7_18==ID||LA7_18==68) ) {
                                    alt7=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 7, 18, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case 86:
                            case 87:
                            case 91:
                            case 94:
                            case 98:
                            case 105:
                            case 108:
                                {
                                alt7=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 16, input);

                                throw nvae;

                            }

                            }
                            break;
                        case 70:
                            {
                            int LA7_17 = input.LA(5);

                            if ( (LA7_17==75) ) {
                                alt7=1;
                            }
                            else if ( (LA7_17==91||LA7_17==111) ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 17, input);

                                throw nvae;

                            }
                            }
                            break;
                        case 86:
                        case 87:
                        case 91:
                        case 94:
                        case 98:
                        case 105:
                        case 108:
                            {
                            alt7=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 14, input);

                            throw nvae;

                        }

                    }
                    else if ( (LA7_13==75) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 6, input);

                    throw nvae;

                }

                }
                break;
            case 109:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:100:5: declarationWith
                    {
                    pushFollow(FOLLOW_declarationWith_in_publicValues504);
                    declarationWith27=declarationWith();

                    state._fsp--;

                    adaptor.addChild(root_0, declarationWith27.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:101:3: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_publicValues511);
                    functionDeclaration28=functionDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, functionDeclaration28.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:102:3: constructorDecl
                    {
                    pushFollow(FOLLOW_constructorDecl_in_publicValues519);
                    constructorDecl29=constructorDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, constructorDecl29.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "publicValues"


    public static class constructorDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorDecl"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:111:1: constructorDecl : ID '(' parameters ')' ':' ( callingFunctions )? ( ',' callingFunctions )* '{' ( assigningWith )* '}' -> ^( ConstructorDecl ID '(' parameters ')' ':' ( callingFunctions )? ( ',' callingFunctions )* '{' ( assigningWith )* '}' ) ;
    public final Compiler_ProjectParser.constructorDecl_return constructorDecl() throws RecognitionException {
        Compiler_ProjectParser.constructorDecl_return retval = new Compiler_ProjectParser.constructorDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Compiler_ProjectParser.parameters_return parameters32 =null;

        Compiler_ProjectParser.callingFunctions_return callingFunctions35 =null;

        Compiler_ProjectParser.callingFunctions_return callingFunctions37 =null;

        Compiler_ProjectParser.assigningWith_return assigningWith39 =null;


        Object ID30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_callingFunctions=new RewriteRuleSubtreeStream(adaptor,"rule callingFunctions");
        RewriteRuleSubtreeStream stream_assigningWith=new RewriteRuleSubtreeStream(adaptor,"rule assigningWith");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:112:2: ( ID '(' parameters ')' ':' ( callingFunctions )? ( ',' callingFunctions )* '{' ( assigningWith )* '}' -> ^( ConstructorDecl ID '(' parameters ')' ':' ( callingFunctions )? ( ',' callingFunctions )* '{' ( assigningWith )* '}' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:112:4: ID '(' parameters ')' ':' ( callingFunctions )? ( ',' callingFunctions )* '{' ( assigningWith )* '}'
            {
            ID30=(Token)match(input,ID,FOLLOW_ID_in_constructorDecl571);  
            stream_ID.add(ID30);


            char_literal31=(Token)match(input,69,FOLLOW_69_in_constructorDecl573);  
            stream_69.add(char_literal31);


            pushFollow(FOLLOW_parameters_in_constructorDecl575);
            parameters32=parameters();

            state._fsp--;

            stream_parameters.add(parameters32.getTree());

            char_literal33=(Token)match(input,70,FOLLOW_70_in_constructorDecl577);  
            stream_70.add(char_literal33);


            char_literal34=(Token)match(input,74,FOLLOW_74_in_constructorDecl579);  
            stream_74.add(char_literal34);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:112:30: ( callingFunctions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:112:30: callingFunctions
                    {
                    pushFollow(FOLLOW_callingFunctions_in_constructorDecl581);
                    callingFunctions35=callingFunctions();

                    state._fsp--;

                    stream_callingFunctions.add(callingFunctions35.getTree());

                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:112:48: ( ',' callingFunctions )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==71) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:112:49: ',' callingFunctions
            	    {
            	    char_literal36=(Token)match(input,71,FOLLOW_71_in_constructorDecl585);  
            	    stream_71.add(char_literal36);


            	    pushFollow(FOLLOW_callingFunctions_in_constructorDecl587);
            	    callingFunctions37=callingFunctions();

            	    state._fsp--;

            	    stream_callingFunctions.add(callingFunctions37.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            char_literal38=(Token)match(input,111,FOLLOW_111_in_constructorDecl591);  
            stream_111.add(char_literal38);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:112:76: ( assigningWith )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==79) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:112:76: assigningWith
            	    {
            	    pushFollow(FOLLOW_assigningWith_in_constructorDecl593);
            	    assigningWith39=assigningWith();

            	    state._fsp--;

            	    stream_assigningWith.add(assigningWith39.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            char_literal40=(Token)match(input,112,FOLLOW_112_in_constructorDecl596);  
            stream_112.add(char_literal40);


            // AST REWRITE
            // elements: parameters, 70, callingFunctions, 71, 112, 111, 69, ID, 74, callingFunctions, assigningWith
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:95: -> ^( ConstructorDecl ID '(' parameters ')' ':' ( callingFunctions )? ( ',' callingFunctions )* '{' ( assigningWith )* '}' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:113:3: ^( ConstructorDecl ID '(' parameters ')' ':' ( callingFunctions )? ( ',' callingFunctions )* '{' ( assigningWith )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ConstructorDecl, "ConstructorDecl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, stream_parameters.nextTree());

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:113:47: ( callingFunctions )?
                if ( stream_callingFunctions.hasNext() ) {
                    adaptor.addChild(root_1, stream_callingFunctions.nextTree());

                }
                stream_callingFunctions.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:113:65: ( ',' callingFunctions )*
                while ( stream_71.hasNext()||stream_callingFunctions.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_71.nextNode()
                    );

                    adaptor.addChild(root_1, stream_callingFunctions.nextTree());

                }
                stream_71.reset();
                stream_callingFunctions.reset();

                adaptor.addChild(root_1, 
                stream_111.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:113:93: ( assigningWith )*
                while ( stream_assigningWith.hasNext() ) {
                    adaptor.addChild(root_1, stream_assigningWith.nextTree());

                }
                stream_assigningWith.reset();

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "constructorDecl"


    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDeclaration"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:122:1: functionDeclaration : functionDataTypes ID functionParameters ( 'const' )? functionBody -> ^( FunctionDeclaration functionDataTypes ID functionParameters ( 'const' )? functionBody ) ;
    public final Compiler_ProjectParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        Compiler_ProjectParser.functionDeclaration_return retval = new Compiler_ProjectParser.functionDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID42=null;
        Token string_literal44=null;
        Compiler_ProjectParser.functionDataTypes_return functionDataTypes41 =null;

        Compiler_ProjectParser.functionParameters_return functionParameters43 =null;

        Compiler_ProjectParser.functionBody_return functionBody45 =null;


        Object ID42_tree=null;
        Object string_literal44_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_functionDataTypes=new RewriteRuleSubtreeStream(adaptor,"rule functionDataTypes");
        RewriteRuleSubtreeStream stream_functionParameters=new RewriteRuleSubtreeStream(adaptor,"rule functionParameters");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:123:2: ( functionDataTypes ID functionParameters ( 'const' )? functionBody -> ^( FunctionDeclaration functionDataTypes ID functionParameters ( 'const' )? functionBody ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:123:4: functionDataTypes ID functionParameters ( 'const' )? functionBody
            {
            pushFollow(FOLLOW_functionDataTypes_in_functionDeclaration679);
            functionDataTypes41=functionDataTypes();

            state._fsp--;

            stream_functionDataTypes.add(functionDataTypes41.getTree());

            ID42=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration681);  
            stream_ID.add(ID42);


            pushFollow(FOLLOW_functionParameters_in_functionDeclaration683);
            functionParameters43=functionParameters();

            state._fsp--;

            stream_functionParameters.add(functionParameters43.getTree());

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:123:44: ( 'const' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==91) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:123:44: 'const'
                    {
                    string_literal44=(Token)match(input,91,FOLLOW_91_in_functionDeclaration685);  
                    stream_91.add(string_literal44);


                    }
                    break;

            }


            pushFollow(FOLLOW_functionBody_in_functionDeclaration689);
            functionBody45=functionBody();

            state._fsp--;

            stream_functionBody.add(functionBody45.getTree());

            // AST REWRITE
            // elements: functionParameters, functionDataTypes, ID, functionBody, 91
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:67: -> ^( FunctionDeclaration functionDataTypes ID functionParameters ( 'const' )? functionBody )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:124:3: ^( FunctionDeclaration functionDataTypes ID functionParameters ( 'const' )? functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FunctionDeclaration, "FunctionDeclaration")
                , root_1);

                adaptor.addChild(root_1, stream_functionDataTypes.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_functionParameters.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:124:65: ( 'const' )?
                if ( stream_91.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_91.nextNode()
                    );

                }
                stream_91.reset();

                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"


    public static class functionBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionBody"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:133:1: functionBody : '{' ( stmts )* ( 'return' values ';' )? '}' -> ^( FunctionBody '{' ( stmts )* ( 'return' values ';' )? '}' ) ;
    public final Compiler_ProjectParser.functionBody_return functionBody() throws RecognitionException {
        Compiler_ProjectParser.functionBody_return retval = new Compiler_ProjectParser.functionBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal46=null;
        Token string_literal48=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Compiler_ProjectParser.stmts_return stmts47 =null;

        Compiler_ProjectParser.values_return values49 =null;


        Object char_literal46_tree=null;
        Object string_literal48_tree=null;
        Object char_literal50_tree=null;
        Object char_literal51_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"rule values");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:134:2: ( '{' ( stmts )* ( 'return' values ';' )? '}' -> ^( FunctionBody '{' ( stmts )* ( 'return' values ';' )? '}' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:134:4: '{' ( stmts )* ( 'return' values ';' )? '}'
            {
            char_literal46=(Token)match(input,111,FOLLOW_111_in_functionBody758);  
            stream_111.add(char_literal46);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:134:8: ( stmts )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comment||LA12_0==ID||(LA12_0 >= 86 && LA12_0 <= 87)||LA12_0==91||(LA12_0 >= 94 && LA12_0 <= 96)||LA12_0==98||(LA12_0 >= 105 && LA12_0 <= 106)||LA12_0==108||LA12_0==110) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:134:8: stmts
            	    {
            	    pushFollow(FOLLOW_stmts_in_functionBody760);
            	    stmts47=stmts();

            	    state._fsp--;

            	    stream_stmts.add(stmts47.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:134:15: ( 'return' values ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==103) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:134:16: 'return' values ';'
                    {
                    string_literal48=(Token)match(input,103,FOLLOW_103_in_functionBody764);  
                    stream_103.add(string_literal48);


                    pushFollow(FOLLOW_values_in_functionBody766);
                    values49=values();

                    state._fsp--;

                    stream_values.add(values49.getTree());

                    char_literal50=(Token)match(input,75,FOLLOW_75_in_functionBody768);  
                    stream_75.add(char_literal50);


                    }
                    break;

            }


            char_literal51=(Token)match(input,112,FOLLOW_112_in_functionBody772);  
            stream_112.add(char_literal51);


            // AST REWRITE
            // elements: 112, 75, 111, stmts, values, 103
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:42: -> ^( FunctionBody '{' ( stmts )* ( 'return' values ';' )? '}' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:135:3: ^( FunctionBody '{' ( stmts )* ( 'return' values ';' )? '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FunctionBody, "FunctionBody")
                , root_1);

                adaptor.addChild(root_1, 
                stream_111.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:135:22: ( stmts )*
                while ( stream_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmts.nextTree());

                }
                stream_stmts.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:135:29: ( 'return' values ';' )?
                if ( stream_75.hasNext()||stream_values.hasNext()||stream_103.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_103.nextNode()
                    );

                    adaptor.addChild(root_1, stream_values.nextTree());

                    adaptor.addChild(root_1, 
                    stream_75.nextNode()
                    );

                }
                stream_75.reset();
                stream_values.reset();
                stream_103.reset();

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "functionBody"


    public static class functionParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionParameters"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:144:1: functionParameters : '(' parameters ')' -> ^( FunctionParameters '(' parameters ')' ) ;
    public final Compiler_ProjectParser.functionParameters_return functionParameters() throws RecognitionException {
        Compiler_ProjectParser.functionParameters_return retval = new Compiler_ProjectParser.functionParameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal52=null;
        Token char_literal54=null;
        Compiler_ProjectParser.parameters_return parameters53 =null;


        Object char_literal52_tree=null;
        Object char_literal54_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:145:2: ( '(' parameters ')' -> ^( FunctionParameters '(' parameters ')' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:145:4: '(' parameters ')'
            {
            char_literal52=(Token)match(input,69,FOLLOW_69_in_functionParameters844);  
            stream_69.add(char_literal52);


            pushFollow(FOLLOW_parameters_in_functionParameters846);
            parameters53=parameters();

            state._fsp--;

            stream_parameters.add(parameters53.getTree());

            char_literal54=(Token)match(input,70,FOLLOW_70_in_functionParameters848);  
            stream_70.add(char_literal54);


            // AST REWRITE
            // elements: parameters, 70, 69
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:23: -> ^( FunctionParameters '(' parameters ')' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:146:3: ^( FunctionParameters '(' parameters ')' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FunctionParameters, "FunctionParameters")
                , root_1);

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, stream_parameters.nextTree());

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "functionParameters"


    public static class functionDataTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDataTypes"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:155:1: functionDataTypes : ( dataTypes | 'void' ) ^;
    public final Compiler_ProjectParser.functionDataTypes_return functionDataTypes() throws RecognitionException {
        Compiler_ProjectParser.functionDataTypes_return retval = new Compiler_ProjectParser.functionDataTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal56=null;
        Compiler_ProjectParser.dataTypes_return dataTypes55 =null;


        Object string_literal56_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:156:2: ( ( dataTypes | 'void' ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:156:4: ( dataTypes | 'void' ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:156:4: ( dataTypes | 'void' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID||LA14_0==87||LA14_0==94||LA14_0==98||LA14_0==105) ) {
                alt14=1;
            }
            else if ( (LA14_0==109) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:156:5: dataTypes
                    {
                    pushFollow(FOLLOW_dataTypes_in_functionDataTypes911);
                    dataTypes55=dataTypes();

                    state._fsp--;

                    adaptor.addChild(root_0, dataTypes55.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:157:3: 'void'
                    {
                    string_literal56=(Token)match(input,109,FOLLOW_109_in_functionDataTypes917); 
                    string_literal56_tree = 
                    (Object)adaptor.create(string_literal56)
                    ;
                    adaptor.addChild(root_0, string_literal56_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "functionDataTypes"


    public static class stmts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmts"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:166:1: stmts : ( inputStmt | outputStmt | ifStmt | declarationWith | ( callingFunctions ';' ) | ( ID assigningWith ) | switchStmt | forLoopStmt | whileLoopStmt | Comment | pointerMemberFunctionCall ) ^;
    public final Compiler_ProjectParser.stmts_return stmts() throws RecognitionException {
        Compiler_ProjectParser.stmts_return retval = new Compiler_ProjectParser.stmts_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal62=null;
        Token ID63=null;
        Token Comment68=null;
        Compiler_ProjectParser.inputStmt_return inputStmt57 =null;

        Compiler_ProjectParser.outputStmt_return outputStmt58 =null;

        Compiler_ProjectParser.ifStmt_return ifStmt59 =null;

        Compiler_ProjectParser.declarationWith_return declarationWith60 =null;

        Compiler_ProjectParser.callingFunctions_return callingFunctions61 =null;

        Compiler_ProjectParser.assigningWith_return assigningWith64 =null;

        Compiler_ProjectParser.switchStmt_return switchStmt65 =null;

        Compiler_ProjectParser.forLoopStmt_return forLoopStmt66 =null;

        Compiler_ProjectParser.whileLoopStmt_return whileLoopStmt67 =null;

        Compiler_ProjectParser.pointerMemberFunctionCall_return pointerMemberFunctionCall69 =null;


        Object char_literal62_tree=null;
        Object ID63_tree=null;
        Object Comment68_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:166:7: ( ( inputStmt | outputStmt | ifStmt | declarationWith | ( callingFunctions ';' ) | ( ID assigningWith ) | switchStmt | forLoopStmt | whileLoopStmt | Comment | pointerMemberFunctionCall ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:166:9: ( inputStmt | outputStmt | ifStmt | declarationWith | ( callingFunctions ';' ) | ( ID assigningWith ) | switchStmt | forLoopStmt | whileLoopStmt | Comment | pointerMemberFunctionCall ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:166:9: ( inputStmt | outputStmt | ifStmt | declarationWith | ( callingFunctions ';' ) | ( ID assigningWith ) | switchStmt | forLoopStmt | whileLoopStmt | Comment | pointerMemberFunctionCall )
            int alt15=11;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 83:
                    {
                    alt15=1;
                    }
                    break;
                case 77:
                    {
                    alt15=2;
                    }
                    break;
                case 69:
                case 73:
                    {
                    alt15=5;
                    }
                    break;
                case 72:
                    {
                    alt15=11;
                    }
                    break;
                case ID:
                case 68:
                    {
                    alt15=4;
                    }
                    break;
                case 79:
                    {
                    alt15=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }

                }
                break;
            case 96:
                {
                alt15=3;
                }
                break;
            case 86:
            case 87:
            case 91:
            case 94:
            case 98:
            case 105:
            case 108:
                {
                alt15=4;
                }
                break;
            case 106:
                {
                alt15=7;
                }
                break;
            case 95:
                {
                alt15=8;
                }
                break;
            case 110:
                {
                alt15=9;
                }
                break;
            case Comment:
                {
                alt15=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:166:10: inputStmt
                    {
                    pushFollow(FOLLOW_inputStmt_in_stmts967);
                    inputStmt57=inputStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, inputStmt57.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:167:3: outputStmt
                    {
                    pushFollow(FOLLOW_outputStmt_in_stmts975);
                    outputStmt58=outputStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, outputStmt58.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:168:3: ifStmt
                    {
                    pushFollow(FOLLOW_ifStmt_in_stmts984);
                    ifStmt59=ifStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStmt59.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:169:3: declarationWith
                    {
                    pushFollow(FOLLOW_declarationWith_in_stmts994);
                    declarationWith60=declarationWith();

                    state._fsp--;

                    adaptor.addChild(root_0, declarationWith60.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:170:3: ( callingFunctions ';' )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:170:3: ( callingFunctions ';' )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:170:4: callingFunctions ';'
                    {
                    pushFollow(FOLLOW_callingFunctions_in_stmts1003);
                    callingFunctions61=callingFunctions();

                    state._fsp--;

                    adaptor.addChild(root_0, callingFunctions61.getTree());

                    char_literal62=(Token)match(input,75,FOLLOW_75_in_stmts1005); 
                    char_literal62_tree = 
                    (Object)adaptor.create(char_literal62)
                    ;
                    adaptor.addChild(root_0, char_literal62_tree);


                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:171:3: ( ID assigningWith )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:171:3: ( ID assigningWith )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:171:4: ID assigningWith
                    {
                    ID63=(Token)match(input,ID,FOLLOW_ID_in_stmts1015); 
                    ID63_tree = 
                    (Object)adaptor.create(ID63)
                    ;
                    adaptor.addChild(root_0, ID63_tree);


                    pushFollow(FOLLOW_assigningWith_in_stmts1017);
                    assigningWith64=assigningWith();

                    state._fsp--;

                    adaptor.addChild(root_0, assigningWith64.getTree());

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:172:3: switchStmt
                    {
                    pushFollow(FOLLOW_switchStmt_in_stmts1027);
                    switchStmt65=switchStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, switchStmt65.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:173:3: forLoopStmt
                    {
                    pushFollow(FOLLOW_forLoopStmt_in_stmts1036);
                    forLoopStmt66=forLoopStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, forLoopStmt66.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:174:3: whileLoopStmt
                    {
                    pushFollow(FOLLOW_whileLoopStmt_in_stmts1045);
                    whileLoopStmt67=whileLoopStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, whileLoopStmt67.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:175:3: Comment
                    {
                    Comment68=(Token)match(input,Comment,FOLLOW_Comment_in_stmts1054); 
                    Comment68_tree = 
                    (Object)adaptor.create(Comment68)
                    ;
                    adaptor.addChild(root_0, Comment68_tree);


                    }
                    break;
                case 11 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:176:3: pointerMemberFunctionCall
                    {
                    pushFollow(FOLLOW_pointerMemberFunctionCall_in_stmts1063);
                    pointerMemberFunctionCall69=pointerMemberFunctionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, pointerMemberFunctionCall69.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "stmts"


    public static class whileLoopStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileLoopStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:185:1: whileLoopStmt : 'while' whileLoopCondition whileLoopBody -> ^( WhileLoopStmt 'while' whileLoopCondition whileLoopBody ) ;
    public final Compiler_ProjectParser.whileLoopStmt_return whileLoopStmt() throws RecognitionException {
        Compiler_ProjectParser.whileLoopStmt_return retval = new Compiler_ProjectParser.whileLoopStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal70=null;
        Compiler_ProjectParser.whileLoopCondition_return whileLoopCondition71 =null;

        Compiler_ProjectParser.whileLoopBody_return whileLoopBody72 =null;


        Object string_literal70_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_whileLoopBody=new RewriteRuleSubtreeStream(adaptor,"rule whileLoopBody");
        RewriteRuleSubtreeStream stream_whileLoopCondition=new RewriteRuleSubtreeStream(adaptor,"rule whileLoopCondition");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:186:2: ( 'while' whileLoopCondition whileLoopBody -> ^( WhileLoopStmt 'while' whileLoopCondition whileLoopBody ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:186:4: 'while' whileLoopCondition whileLoopBody
            {
            string_literal70=(Token)match(input,110,FOLLOW_110_in_whileLoopStmt1116);  
            stream_110.add(string_literal70);


            pushFollow(FOLLOW_whileLoopCondition_in_whileLoopStmt1118);
            whileLoopCondition71=whileLoopCondition();

            state._fsp--;

            stream_whileLoopCondition.add(whileLoopCondition71.getTree());

            pushFollow(FOLLOW_whileLoopBody_in_whileLoopStmt1120);
            whileLoopBody72=whileLoopBody();

            state._fsp--;

            stream_whileLoopBody.add(whileLoopBody72.getTree());

            // AST REWRITE
            // elements: whileLoopBody, whileLoopCondition, 110
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 186:45: -> ^( WhileLoopStmt 'while' whileLoopCondition whileLoopBody )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:187:3: ^( WhileLoopStmt 'while' whileLoopCondition whileLoopBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WhileLoopStmt, "WhileLoopStmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_110.nextNode()
                );

                adaptor.addChild(root_1, stream_whileLoopCondition.nextTree());

                adaptor.addChild(root_1, stream_whileLoopBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "whileLoopStmt"


    public static class whileLoopBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileLoopBody"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:196:1: whileLoopBody : '{' ( stmts )* '}' -> ^( WhileLoopBody '{' ( stmts )* '}' ) ;
    public final Compiler_ProjectParser.whileLoopBody_return whileLoopBody() throws RecognitionException {
        Compiler_ProjectParser.whileLoopBody_return retval = new Compiler_ProjectParser.whileLoopBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal73=null;
        Token char_literal75=null;
        Compiler_ProjectParser.stmts_return stmts74 =null;


        Object char_literal73_tree=null;
        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:197:2: ( '{' ( stmts )* '}' -> ^( WhileLoopBody '{' ( stmts )* '}' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:197:4: '{' ( stmts )* '}'
            {
            char_literal73=(Token)match(input,111,FOLLOW_111_in_whileLoopBody1181);  
            stream_111.add(char_literal73);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:197:8: ( stmts )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comment||LA16_0==ID||(LA16_0 >= 86 && LA16_0 <= 87)||LA16_0==91||(LA16_0 >= 94 && LA16_0 <= 96)||LA16_0==98||(LA16_0 >= 105 && LA16_0 <= 106)||LA16_0==108||LA16_0==110) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:197:8: stmts
            	    {
            	    pushFollow(FOLLOW_stmts_in_whileLoopBody1183);
            	    stmts74=stmts();

            	    state._fsp--;

            	    stream_stmts.add(stmts74.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            char_literal75=(Token)match(input,112,FOLLOW_112_in_whileLoopBody1186);  
            stream_112.add(char_literal75);


            // AST REWRITE
            // elements: stmts, 111, 112
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:19: -> ^( WhileLoopBody '{' ( stmts )* '}' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:198:3: ^( WhileLoopBody '{' ( stmts )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WhileLoopBody, "WhileLoopBody")
                , root_1);

                adaptor.addChild(root_1, 
                stream_111.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:198:23: ( stmts )*
                while ( stream_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmts.nextTree());

                }
                stream_stmts.reset();

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "whileLoopBody"


    public static class whileLoopCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileLoopCondition"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:207:1: whileLoopCondition : '(' whileLoopConditionExpr ')' -> ^( WhileLoopCondition '(' whileLoopConditionExpr ')' ) ;
    public final Compiler_ProjectParser.whileLoopCondition_return whileLoopCondition() throws RecognitionException {
        Compiler_ProjectParser.whileLoopCondition_return retval = new Compiler_ProjectParser.whileLoopCondition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal76=null;
        Token char_literal78=null;
        Compiler_ProjectParser.whileLoopConditionExpr_return whileLoopConditionExpr77 =null;


        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_whileLoopConditionExpr=new RewriteRuleSubtreeStream(adaptor,"rule whileLoopConditionExpr");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:208:2: ( '(' whileLoopConditionExpr ')' -> ^( WhileLoopCondition '(' whileLoopConditionExpr ')' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:208:4: '(' whileLoopConditionExpr ')'
            {
            char_literal76=(Token)match(input,69,FOLLOW_69_in_whileLoopCondition1250);  
            stream_69.add(char_literal76);


            pushFollow(FOLLOW_whileLoopConditionExpr_in_whileLoopCondition1252);
            whileLoopConditionExpr77=whileLoopConditionExpr();

            state._fsp--;

            stream_whileLoopConditionExpr.add(whileLoopConditionExpr77.getTree());

            char_literal78=(Token)match(input,70,FOLLOW_70_in_whileLoopCondition1254);  
            stream_70.add(char_literal78);


            // AST REWRITE
            // elements: 69, whileLoopConditionExpr, 70
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 208:35: -> ^( WhileLoopCondition '(' whileLoopConditionExpr ')' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:209:3: ^( WhileLoopCondition '(' whileLoopConditionExpr ')' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WhileLoopCondition, "WhileLoopCondition")
                , root_1);

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, stream_whileLoopConditionExpr.nextTree());

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "whileLoopCondition"


    public static class whileLoopConditionExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileLoopConditionExpr"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:218:1: whileLoopConditionExpr : ( booleans | ID ( '>>' ID )+ ) ^;
    public final Compiler_ProjectParser.whileLoopConditionExpr_return whileLoopConditionExpr() throws RecognitionException {
        Compiler_ProjectParser.whileLoopConditionExpr_return retval = new Compiler_ProjectParser.whileLoopConditionExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID80=null;
        Token string_literal81=null;
        Token ID82=null;
        Compiler_ProjectParser.booleans_return booleans79 =null;


        Object ID80_tree=null;
        Object string_literal81_tree=null;
        Object ID82_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:219:2: ( ( booleans | ID ( '>>' ID )+ ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:219:4: ( booleans | ID ( '>>' ID )+ ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:219:4: ( booleans | ID ( '>>' ID )+ )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BooleanValue||LA18_0==IntValue||LA18_0==65) ) {
                alt18=1;
            }
            else if ( (LA18_0==ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==66||(LA18_2 >= 69 && LA18_2 <= 70)||LA18_2==73||LA18_2==76||LA18_2==78||(LA18_2 >= 80 && LA18_2 <= 82)) ) {
                    alt18=1;
                }
                else if ( (LA18_2==83) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:219:5: booleans
                    {
                    pushFollow(FOLLOW_booleans_in_whileLoopConditionExpr1316);
                    booleans79=booleans();

                    state._fsp--;

                    adaptor.addChild(root_0, booleans79.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:219:16: ID ( '>>' ID )+
                    {
                    ID80=(Token)match(input,ID,FOLLOW_ID_in_whileLoopConditionExpr1320); 
                    ID80_tree = 
                    (Object)adaptor.create(ID80)
                    ;
                    adaptor.addChild(root_0, ID80_tree);


                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:219:19: ( '>>' ID )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==83) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:219:20: '>>' ID
                    	    {
                    	    string_literal81=(Token)match(input,83,FOLLOW_83_in_whileLoopConditionExpr1323); 
                    	    string_literal81_tree = 
                    	    (Object)adaptor.create(string_literal81)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal81_tree);


                    	    ID82=(Token)match(input,ID,FOLLOW_ID_in_whileLoopConditionExpr1325); 
                    	    ID82_tree = 
                    	    (Object)adaptor.create(ID82)
                    	    ;
                    	    adaptor.addChild(root_0, ID82_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "whileLoopConditionExpr"


    public static class forLoopStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forLoopStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:228:1: forLoopStmt : 'for' '(' forLoopBrackets ')' forBody -> ^( ForLoopStmt 'for' '(' forLoopBrackets ')' forBody ) ;
    public final Compiler_ProjectParser.forLoopStmt_return forLoopStmt() throws RecognitionException {
        Compiler_ProjectParser.forLoopStmt_return retval = new Compiler_ProjectParser.forLoopStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal83=null;
        Token char_literal84=null;
        Token char_literal86=null;
        Compiler_ProjectParser.forLoopBrackets_return forLoopBrackets85 =null;

        Compiler_ProjectParser.forBody_return forBody87 =null;


        Object string_literal83_tree=null;
        Object char_literal84_tree=null;
        Object char_literal86_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_forBody=new RewriteRuleSubtreeStream(adaptor,"rule forBody");
        RewriteRuleSubtreeStream stream_forLoopBrackets=new RewriteRuleSubtreeStream(adaptor,"rule forLoopBrackets");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:229:2: ( 'for' '(' forLoopBrackets ')' forBody -> ^( ForLoopStmt 'for' '(' forLoopBrackets ')' forBody ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:229:4: 'for' '(' forLoopBrackets ')' forBody
            {
            string_literal83=(Token)match(input,95,FOLLOW_95_in_forLoopStmt1376);  
            stream_95.add(string_literal83);


            char_literal84=(Token)match(input,69,FOLLOW_69_in_forLoopStmt1378);  
            stream_69.add(char_literal84);


            pushFollow(FOLLOW_forLoopBrackets_in_forLoopStmt1380);
            forLoopBrackets85=forLoopBrackets();

            state._fsp--;

            stream_forLoopBrackets.add(forLoopBrackets85.getTree());

            char_literal86=(Token)match(input,70,FOLLOW_70_in_forLoopStmt1382);  
            stream_70.add(char_literal86);


            pushFollow(FOLLOW_forBody_in_forLoopStmt1384);
            forBody87=forBody();

            state._fsp--;

            stream_forBody.add(forBody87.getTree());

            // AST REWRITE
            // elements: 95, 69, forLoopBrackets, forBody, 70
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 229:42: -> ^( ForLoopStmt 'for' '(' forLoopBrackets ')' forBody )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:230:3: ^( ForLoopStmt 'for' '(' forLoopBrackets ')' forBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ForLoopStmt, "ForLoopStmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_95.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, stream_forLoopBrackets.nextTree());

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_1, stream_forBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "forLoopStmt"


    public static class forBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forBody"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:239:1: forBody : ( ( '{' ( stmts )* '}' ) | stmts ) ^;
    public final Compiler_ProjectParser.forBody_return forBody() throws RecognitionException {
        Compiler_ProjectParser.forBody_return retval = new Compiler_ProjectParser.forBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal88=null;
        Token char_literal90=null;
        Compiler_ProjectParser.stmts_return stmts89 =null;

        Compiler_ProjectParser.stmts_return stmts91 =null;


        Object char_literal88_tree=null;
        Object char_literal90_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:240:2: ( ( ( '{' ( stmts )* '}' ) | stmts ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:240:4: ( ( '{' ( stmts )* '}' ) | stmts ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:240:4: ( ( '{' ( stmts )* '}' ) | stmts )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==111) ) {
                alt20=1;
            }
            else if ( (LA20_0==Comment||LA20_0==ID||(LA20_0 >= 86 && LA20_0 <= 87)||LA20_0==91||(LA20_0 >= 94 && LA20_0 <= 96)||LA20_0==98||(LA20_0 >= 105 && LA20_0 <= 106)||LA20_0==108||LA20_0==110) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:240:5: ( '{' ( stmts )* '}' )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:240:5: ( '{' ( stmts )* '}' )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:240:6: '{' ( stmts )* '}'
                    {
                    char_literal88=(Token)match(input,111,FOLLOW_111_in_forBody1452); 
                    char_literal88_tree = 
                    (Object)adaptor.create(char_literal88)
                    ;
                    adaptor.addChild(root_0, char_literal88_tree);


                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:240:10: ( stmts )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==Comment||LA19_0==ID||(LA19_0 >= 86 && LA19_0 <= 87)||LA19_0==91||(LA19_0 >= 94 && LA19_0 <= 96)||LA19_0==98||(LA19_0 >= 105 && LA19_0 <= 106)||LA19_0==108||LA19_0==110) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:240:10: stmts
                    	    {
                    	    pushFollow(FOLLOW_stmts_in_forBody1454);
                    	    stmts89=stmts();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmts89.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    char_literal90=(Token)match(input,112,FOLLOW_112_in_forBody1457); 
                    char_literal90_tree = 
                    (Object)adaptor.create(char_literal90)
                    ;
                    adaptor.addChild(root_0, char_literal90_tree);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:241:3: stmts
                    {
                    pushFollow(FOLLOW_stmts_in_forBody1464);
                    stmts91=stmts();

                    state._fsp--;

                    adaptor.addChild(root_0, stmts91.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "forBody"


    public static class forLoopBrackets_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forLoopBrackets"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:250:1: forLoopBrackets : declarationWithout forLoopBracketsOptions -> ^( ForLoopBrackets declarationWithout forLoopBracketsOptions ) ;
    public final Compiler_ProjectParser.forLoopBrackets_return forLoopBrackets() throws RecognitionException {
        Compiler_ProjectParser.forLoopBrackets_return retval = new Compiler_ProjectParser.forLoopBrackets_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Compiler_ProjectParser.declarationWithout_return declarationWithout92 =null;

        Compiler_ProjectParser.forLoopBracketsOptions_return forLoopBracketsOptions93 =null;


        RewriteRuleSubtreeStream stream_declarationWithout=new RewriteRuleSubtreeStream(adaptor,"rule declarationWithout");
        RewriteRuleSubtreeStream stream_forLoopBracketsOptions=new RewriteRuleSubtreeStream(adaptor,"rule forLoopBracketsOptions");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:251:2: ( declarationWithout forLoopBracketsOptions -> ^( ForLoopBrackets declarationWithout forLoopBracketsOptions ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:251:4: declarationWithout forLoopBracketsOptions
            {
            pushFollow(FOLLOW_declarationWithout_in_forLoopBrackets1518);
            declarationWithout92=declarationWithout();

            state._fsp--;

            stream_declarationWithout.add(declarationWithout92.getTree());

            pushFollow(FOLLOW_forLoopBracketsOptions_in_forLoopBrackets1521);
            forLoopBracketsOptions93=forLoopBracketsOptions();

            state._fsp--;

            stream_forLoopBracketsOptions.add(forLoopBracketsOptions93.getTree());

            // AST REWRITE
            // elements: declarationWithout, forLoopBracketsOptions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 251:47: -> ^( ForLoopBrackets declarationWithout forLoopBracketsOptions )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:252:3: ^( ForLoopBrackets declarationWithout forLoopBracketsOptions )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ForLoopBrackets, "ForLoopBrackets")
                , root_1);

                adaptor.addChild(root_1, stream_declarationWithout.nextTree());

                adaptor.addChild(root_1, stream_forLoopBracketsOptions.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "forLoopBrackets"


    public static class forLoopBracketsOptions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forLoopBracketsOptions"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:261:1: forLoopBracketsOptions : ( ( ';' ( booleans )? ';' ( changing )? ) | ( ':' ID ) ) ^;
    public final Compiler_ProjectParser.forLoopBracketsOptions_return forLoopBracketsOptions() throws RecognitionException {
        Compiler_ProjectParser.forLoopBracketsOptions_return retval = new Compiler_ProjectParser.forLoopBracketsOptions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token ID99=null;
        Compiler_ProjectParser.booleans_return booleans95 =null;

        Compiler_ProjectParser.changing_return changing97 =null;


        Object char_literal94_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        Object ID99_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:2: ( ( ( ';' ( booleans )? ';' ( changing )? ) | ( ':' ID ) ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:4: ( ( ';' ( booleans )? ';' ( changing )? ) | ( ':' ID ) ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:4: ( ( ';' ( booleans )? ';' ( changing )? ) | ( ':' ID ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==75) ) {
                alt23=1;
            }
            else if ( (LA23_0==74) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:5: ( ';' ( booleans )? ';' ( changing )? )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:5: ( ';' ( booleans )? ';' ( changing )? )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:6: ';' ( booleans )? ';' ( changing )?
                    {
                    char_literal94=(Token)match(input,75,FOLLOW_75_in_forLoopBracketsOptions1583); 
                    char_literal94_tree = 
                    (Object)adaptor.create(char_literal94)
                    ;
                    adaptor.addChild(root_0, char_literal94_tree);


                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:10: ( booleans )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==BooleanValue||LA21_0==ID||LA21_0==IntValue||LA21_0==65) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:10: booleans
                            {
                            pushFollow(FOLLOW_booleans_in_forLoopBracketsOptions1585);
                            booleans95=booleans();

                            state._fsp--;

                            adaptor.addChild(root_0, booleans95.getTree());

                            }
                            break;

                    }


                    char_literal96=(Token)match(input,75,FOLLOW_75_in_forLoopBracketsOptions1588); 
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    adaptor.addChild(root_0, char_literal96_tree);


                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:24: ( changing )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:24: changing
                            {
                            pushFollow(FOLLOW_changing_in_forLoopBracketsOptions1590);
                            changing97=changing();

                            state._fsp--;

                            adaptor.addChild(root_0, changing97.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:37: ( ':' ID )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:37: ( ':' ID )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:262:38: ':' ID
                    {
                    char_literal98=(Token)match(input,74,FOLLOW_74_in_forLoopBracketsOptions1597); 
                    char_literal98_tree = 
                    (Object)adaptor.create(char_literal98)
                    ;
                    adaptor.addChild(root_0, char_literal98_tree);


                    ID99=(Token)match(input,ID,FOLLOW_ID_in_forLoopBracketsOptions1599); 
                    ID99_tree = 
                    (Object)adaptor.create(ID99)
                    ;
                    adaptor.addChild(root_0, ID99_tree);


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "forLoopBracketsOptions"


    public static class changing_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "changing"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:271:1: changing : ( changingByVariable | changingByOne ) ^;
    public final Compiler_ProjectParser.changing_return changing() throws RecognitionException {
        Compiler_ProjectParser.changing_return retval = new Compiler_ProjectParser.changing_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Compiler_ProjectParser.changingByVariable_return changingByVariable100 =null;

        Compiler_ProjectParser.changingByOne_return changingByOne101 =null;



        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:272:2: ( ( changingByVariable | changingByOne ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:272:4: ( changingByVariable | changingByOne ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:272:4: ( changingByVariable | changingByOne )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==AssignmentOperators) ) {
                    alt24=1;
                }
                else if ( (LA24_1==AssignmentAutoOperators) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:272:5: changingByVariable
                    {
                    pushFollow(FOLLOW_changingByVariable_in_changing1650);
                    changingByVariable100=changingByVariable();

                    state._fsp--;

                    adaptor.addChild(root_0, changingByVariable100.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:273:3: changingByOne
                    {
                    pushFollow(FOLLOW_changingByOne_in_changing1656);
                    changingByOne101=changingByOne();

                    state._fsp--;

                    adaptor.addChild(root_0, changingByOne101.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "changing"


    public static class changingByVariable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "changingByVariable"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:282:1: changingByVariable : ID AssignmentOperators changingRate -> ^( ChangingByVariable ID AssignmentOperators changingRate ) ;
    public final Compiler_ProjectParser.changingByVariable_return changingByVariable() throws RecognitionException {
        Compiler_ProjectParser.changingByVariable_return retval = new Compiler_ProjectParser.changingByVariable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID102=null;
        Token AssignmentOperators103=null;
        Compiler_ProjectParser.changingRate_return changingRate104 =null;


        Object ID102_tree=null;
        Object AssignmentOperators103_tree=null;
        RewriteRuleTokenStream stream_AssignmentOperators=new RewriteRuleTokenStream(adaptor,"token AssignmentOperators");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_changingRate=new RewriteRuleSubtreeStream(adaptor,"rule changingRate");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:283:2: ( ID AssignmentOperators changingRate -> ^( ChangingByVariable ID AssignmentOperators changingRate ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:283:4: ID AssignmentOperators changingRate
            {
            ID102=(Token)match(input,ID,FOLLOW_ID_in_changingByVariable1707);  
            stream_ID.add(ID102);


            AssignmentOperators103=(Token)match(input,AssignmentOperators,FOLLOW_AssignmentOperators_in_changingByVariable1709);  
            stream_AssignmentOperators.add(AssignmentOperators103);


            pushFollow(FOLLOW_changingRate_in_changingByVariable1711);
            changingRate104=changingRate();

            state._fsp--;

            stream_changingRate.add(changingRate104.getTree());

            // AST REWRITE
            // elements: changingRate, ID, AssignmentOperators
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:40: -> ^( ChangingByVariable ID AssignmentOperators changingRate )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:284:3: ^( ChangingByVariable ID AssignmentOperators changingRate )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ChangingByVariable, "ChangingByVariable")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_AssignmentOperators.nextNode()
                );

                adaptor.addChild(root_1, stream_changingRate.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "changingByVariable"


    public static class changingRate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "changingRate"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:293:1: changingRate : ( ID | IntValue ) ^;
    public final Compiler_ProjectParser.changingRate_return changingRate() throws RecognitionException {
        Compiler_ProjectParser.changingRate_return retval = new Compiler_ProjectParser.changingRate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set105=null;

        Object set105_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:294:2: ( ( ID | IntValue ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:294:4: ( ID | IntValue ) ^
            {
            root_0 = (Object)adaptor.nil();


            set105=(Token)input.LT(1);

            set105=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==IntValue ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set105)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "changingRate"


    public static class changingByOne_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "changingByOne"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:303:1: changingByOne : ID AssignmentAutoOperators -> ^( ChangingByOne ID AssignmentAutoOperators ) ;
    public final Compiler_ProjectParser.changingByOne_return changingByOne() throws RecognitionException {
        Compiler_ProjectParser.changingByOne_return retval = new Compiler_ProjectParser.changingByOne_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID106=null;
        Token AssignmentAutoOperators107=null;

        Object ID106_tree=null;
        Object AssignmentAutoOperators107_tree=null;
        RewriteRuleTokenStream stream_AssignmentAutoOperators=new RewriteRuleTokenStream(adaptor,"token AssignmentAutoOperators");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:304:2: ( ID AssignmentAutoOperators -> ^( ChangingByOne ID AssignmentAutoOperators ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:304:4: ID AssignmentAutoOperators
            {
            ID106=(Token)match(input,ID,FOLLOW_ID_in_changingByOne1828);  
            stream_ID.add(ID106);


            AssignmentAutoOperators107=(Token)match(input,AssignmentAutoOperators,FOLLOW_AssignmentAutoOperators_in_changingByOne1830);  
            stream_AssignmentAutoOperators.add(AssignmentAutoOperators107);


            // AST REWRITE
            // elements: ID, AssignmentAutoOperators
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 304:31: -> ^( ChangingByOne ID AssignmentAutoOperators )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:305:3: ^( ChangingByOne ID AssignmentAutoOperators )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ChangingByOne, "ChangingByOne")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_AssignmentAutoOperators.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "changingByOne"


    public static class switchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:314:1: switchStmt : 'switch' switchExpression switchBody -> ^( SwitchStmt 'switch' switchExpression switchBody ) ;
    public final Compiler_ProjectParser.switchStmt_return switchStmt() throws RecognitionException {
        Compiler_ProjectParser.switchStmt_return retval = new Compiler_ProjectParser.switchStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal108=null;
        Compiler_ProjectParser.switchExpression_return switchExpression109 =null;

        Compiler_ProjectParser.switchBody_return switchBody110 =null;


        Object string_literal108_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_switchBody=new RewriteRuleSubtreeStream(adaptor,"rule switchBody");
        RewriteRuleSubtreeStream stream_switchExpression=new RewriteRuleSubtreeStream(adaptor,"rule switchExpression");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:315:2: ( 'switch' switchExpression switchBody -> ^( SwitchStmt 'switch' switchExpression switchBody ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:315:4: 'switch' switchExpression switchBody
            {
            string_literal108=(Token)match(input,106,FOLLOW_106_in_switchStmt1889);  
            stream_106.add(string_literal108);


            pushFollow(FOLLOW_switchExpression_in_switchStmt1891);
            switchExpression109=switchExpression();

            state._fsp--;

            stream_switchExpression.add(switchExpression109.getTree());

            pushFollow(FOLLOW_switchBody_in_switchStmt1893);
            switchBody110=switchBody();

            state._fsp--;

            stream_switchBody.add(switchBody110.getTree());

            // AST REWRITE
            // elements: switchBody, 106, switchExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 315:41: -> ^( SwitchStmt 'switch' switchExpression switchBody )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:316:3: ^( SwitchStmt 'switch' switchExpression switchBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SwitchStmt, "SwitchStmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_106.nextNode()
                );

                adaptor.addChild(root_1, stream_switchExpression.nextTree());

                adaptor.addChild(root_1, stream_switchBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "switchStmt"


    public static class switchBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchBody"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:325:1: switchBody : '{' ( switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )? )+ switchDefault '}' -> ^( SwitchBody '{' ( switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )? )+ switchDefault '}' ) ;
    public final Compiler_ProjectParser.switchBody_return switchBody() throws RecognitionException {
        Compiler_ProjectParser.switchBody_return retval = new Compiler_ProjectParser.switchBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal111=null;
        Token string_literal114=null;
        Token char_literal116=null;
        Token char_literal118=null;
        Compiler_ProjectParser.switchCase_return switchCase112 =null;

        Compiler_ProjectParser.breakStmt_return breakStmt113 =null;

        Compiler_ProjectParser.switchCaseValues_return switchCaseValues115 =null;

        Compiler_ProjectParser.switchDefault_return switchDefault117 =null;


        Object char_literal111_tree=null;
        Object string_literal114_tree=null;
        Object char_literal116_tree=null;
        Object char_literal118_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_switchCase=new RewriteRuleSubtreeStream(adaptor,"rule switchCase");
        RewriteRuleSubtreeStream stream_switchCaseValues=new RewriteRuleSubtreeStream(adaptor,"rule switchCaseValues");
        RewriteRuleSubtreeStream stream_breakStmt=new RewriteRuleSubtreeStream(adaptor,"rule breakStmt");
        RewriteRuleSubtreeStream stream_switchDefault=new RewriteRuleSubtreeStream(adaptor,"rule switchDefault");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:326:2: ( '{' ( switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )? )+ switchDefault '}' -> ^( SwitchBody '{' ( switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )? )+ switchDefault '}' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:326:4: '{' ( switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )? )+ switchDefault '}'
            {
            char_literal111=(Token)match(input,111,FOLLOW_111_in_switchBody1954);  
            stream_111.add(char_literal111);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:327:5: ( switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )? )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==89) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:327:6: switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )?
            	    {
            	    pushFollow(FOLLOW_switchCase_in_switchBody1962);
            	    switchCase112=switchCase();

            	    state._fsp--;

            	    stream_switchCase.add(switchCase112.getTree());

            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:327:17: ( breakStmt )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==88) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:327:17: breakStmt
            	            {
            	            pushFollow(FOLLOW_breakStmt_in_switchBody1964);
            	            breakStmt113=breakStmt();

            	            state._fsp--;

            	            stream_breakStmt.add(breakStmt113.getTree());

            	            }
            	            break;

            	    }


            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:327:28: ( 'return' switchCaseValues ';' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==103) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:327:29: 'return' switchCaseValues ';'
            	            {
            	            string_literal114=(Token)match(input,103,FOLLOW_103_in_switchBody1968);  
            	            stream_103.add(string_literal114);


            	            pushFollow(FOLLOW_switchCaseValues_in_switchBody1970);
            	            switchCaseValues115=switchCaseValues();

            	            state._fsp--;

            	            stream_switchCaseValues.add(switchCaseValues115.getTree());

            	            char_literal116=(Token)match(input,75,FOLLOW_75_in_switchBody1972);  
            	            stream_75.add(char_literal116);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            pushFollow(FOLLOW_switchDefault_in_switchBody1982);
            switchDefault117=switchDefault();

            state._fsp--;

            stream_switchDefault.add(switchDefault117.getTree());

            char_literal118=(Token)match(input,112,FOLLOW_112_in_switchBody1986);  
            stream_112.add(char_literal118);


            // AST REWRITE
            // elements: 112, switchCase, breakStmt, 103, 75, switchCaseValues, 111, switchDefault
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 329:7: -> ^( SwitchBody '{' ( switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )? )+ switchDefault '}' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:330:3: ^( SwitchBody '{' ( switchCase ( breakStmt )? ( 'return' switchCaseValues ';' )? )+ switchDefault '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SwitchBody, "SwitchBody")
                , root_1);

                adaptor.addChild(root_1, 
                stream_111.nextNode()
                );

                if ( !(stream_switchCase.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_switchCase.hasNext() ) {
                    adaptor.addChild(root_1, stream_switchCase.nextTree());

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:332:17: ( breakStmt )?
                    if ( stream_breakStmt.hasNext() ) {
                        adaptor.addChild(root_1, stream_breakStmt.nextTree());

                    }
                    stream_breakStmt.reset();

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:332:28: ( 'return' switchCaseValues ';' )?
                    if ( stream_103.hasNext()||stream_75.hasNext()||stream_switchCaseValues.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_103.nextNode()
                        );

                        adaptor.addChild(root_1, stream_switchCaseValues.nextTree());

                        adaptor.addChild(root_1, 
                        stream_75.nextNode()
                        );

                    }
                    stream_103.reset();
                    stream_75.reset();
                    stream_switchCaseValues.reset();

                }
                stream_switchCase.reset();

                adaptor.addChild(root_1, stream_switchDefault.nextTree());

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "switchBody"


    public static class switchExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchExpression"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:344:1: switchExpression : '(' ID ')' -> ^( SwitchExpression '(' ID ')' ) ;
    public final Compiler_ProjectParser.switchExpression_return switchExpression() throws RecognitionException {
        Compiler_ProjectParser.switchExpression_return retval = new Compiler_ProjectParser.switchExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal119=null;
        Token ID120=null;
        Token char_literal121=null;

        Object char_literal119_tree=null;
        Object ID120_tree=null;
        Object char_literal121_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:345:2: ( '(' ID ')' -> ^( SwitchExpression '(' ID ')' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:345:4: '(' ID ')'
            {
            char_literal119=(Token)match(input,69,FOLLOW_69_in_switchExpression2081);  
            stream_69.add(char_literal119);


            ID120=(Token)match(input,ID,FOLLOW_ID_in_switchExpression2083);  
            stream_ID.add(ID120);


            char_literal121=(Token)match(input,70,FOLLOW_70_in_switchExpression2085);  
            stream_70.add(char_literal121);


            // AST REWRITE
            // elements: 70, ID, 69
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 345:15: -> ^( SwitchExpression '(' ID ')' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:345:18: ^( SwitchExpression '(' ID ')' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SwitchExpression, "SwitchExpression")
                , root_1);

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "switchExpression"


    public static class switchCase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchCase"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:354:1: switchCase : 'case' switchCaseValues ':' switchInnerStmts -> ^( SwitchCase 'case' switchCaseValues ':' switchInnerStmts ) ;
    public final Compiler_ProjectParser.switchCase_return switchCase() throws RecognitionException {
        Compiler_ProjectParser.switchCase_return retval = new Compiler_ProjectParser.switchCase_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal122=null;
        Token char_literal124=null;
        Compiler_ProjectParser.switchCaseValues_return switchCaseValues123 =null;

        Compiler_ProjectParser.switchInnerStmts_return switchInnerStmts125 =null;


        Object string_literal122_tree=null;
        Object char_literal124_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_switchCaseValues=new RewriteRuleSubtreeStream(adaptor,"rule switchCaseValues");
        RewriteRuleSubtreeStream stream_switchInnerStmts=new RewriteRuleSubtreeStream(adaptor,"rule switchInnerStmts");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:355:2: ( 'case' switchCaseValues ':' switchInnerStmts -> ^( SwitchCase 'case' switchCaseValues ':' switchInnerStmts ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:355:4: 'case' switchCaseValues ':' switchInnerStmts
            {
            string_literal122=(Token)match(input,89,FOLLOW_89_in_switchCase2144);  
            stream_89.add(string_literal122);


            pushFollow(FOLLOW_switchCaseValues_in_switchCase2146);
            switchCaseValues123=switchCaseValues();

            state._fsp--;

            stream_switchCaseValues.add(switchCaseValues123.getTree());

            char_literal124=(Token)match(input,74,FOLLOW_74_in_switchCase2149);  
            stream_74.add(char_literal124);


            pushFollow(FOLLOW_switchInnerStmts_in_switchCase2151);
            switchInnerStmts125=switchInnerStmts();

            state._fsp--;

            stream_switchInnerStmts.add(switchInnerStmts125.getTree());

            // AST REWRITE
            // elements: 74, switchInnerStmts, 89, switchCaseValues
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 355:50: -> ^( SwitchCase 'case' switchCaseValues ':' switchInnerStmts )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:356:3: ^( SwitchCase 'case' switchCaseValues ':' switchInnerStmts )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SwitchCase, "SwitchCase")
                , root_1);

                adaptor.addChild(root_1, 
                stream_89.nextNode()
                );

                adaptor.addChild(root_1, stream_switchCaseValues.nextTree());

                adaptor.addChild(root_1, 
                stream_74.nextNode()
                );

                adaptor.addChild(root_1, stream_switchInnerStmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "switchCase"


    public static class switchDefault_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchDefault"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:365:1: switchDefault : ( 'default' ':' switchInnerStmts )? -> ^( SwitchDefault ( 'default' ':' switchInnerStmts )? ) ;
    public final Compiler_ProjectParser.switchDefault_return switchDefault() throws RecognitionException {
        Compiler_ProjectParser.switchDefault_return retval = new Compiler_ProjectParser.switchDefault_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal126=null;
        Token char_literal127=null;
        Compiler_ProjectParser.switchInnerStmts_return switchInnerStmts128 =null;


        Object string_literal126_tree=null;
        Object char_literal127_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_switchInnerStmts=new RewriteRuleSubtreeStream(adaptor,"rule switchInnerStmts");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:366:2: ( ( 'default' ':' switchInnerStmts )? -> ^( SwitchDefault ( 'default' ':' switchInnerStmts )? ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:366:4: ( 'default' ':' switchInnerStmts )?
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:366:4: ( 'default' ':' switchInnerStmts )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==92) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:366:5: 'default' ':' switchInnerStmts
                    {
                    string_literal126=(Token)match(input,92,FOLLOW_92_in_switchDefault2217);  
                    stream_92.add(string_literal126);


                    char_literal127=(Token)match(input,74,FOLLOW_74_in_switchDefault2219);  
                    stream_74.add(char_literal127);


                    pushFollow(FOLLOW_switchInnerStmts_in_switchDefault2221);
                    switchInnerStmts128=switchInnerStmts();

                    state._fsp--;

                    stream_switchInnerStmts.add(switchInnerStmts128.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: switchInnerStmts, 92, 74
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 366:38: -> ^( SwitchDefault ( 'default' ':' switchInnerStmts )? )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:367:3: ^( SwitchDefault ( 'default' ':' switchInnerStmts )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SwitchDefault, "SwitchDefault")
                , root_1);

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:367:19: ( 'default' ':' switchInnerStmts )?
                if ( stream_switchInnerStmts.hasNext()||stream_92.hasNext()||stream_74.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_92.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_74.nextNode()
                    );

                    adaptor.addChild(root_1, stream_switchInnerStmts.nextTree());

                }
                stream_switchInnerStmts.reset();
                stream_92.reset();
                stream_74.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "switchDefault"


    public static class breakStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "breakStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:376:1: breakStmt : ( 'break' ';' ) -> ^( BreakStmt 'break' ';' ) ;
    public final Compiler_ProjectParser.breakStmt_return breakStmt() throws RecognitionException {
        Compiler_ProjectParser.breakStmt_return retval = new Compiler_ProjectParser.breakStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal129=null;
        Token char_literal130=null;

        Object string_literal129_tree=null;
        Object char_literal130_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:377:2: ( ( 'break' ';' ) -> ^( BreakStmt 'break' ';' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:377:4: ( 'break' ';' )
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:377:4: ( 'break' ';' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:377:5: 'break' ';'
            {
            string_literal129=(Token)match(input,88,FOLLOW_88_in_breakStmt2288);  
            stream_88.add(string_literal129);


            char_literal130=(Token)match(input,75,FOLLOW_75_in_breakStmt2290);  
            stream_75.add(char_literal130);


            }


            // AST REWRITE
            // elements: 88, 75
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 377:18: -> ^( BreakStmt 'break' ';' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:378:3: ^( BreakStmt 'break' ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BreakStmt, "BreakStmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_88.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "breakStmt"


    public static class switchCaseValues_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchCaseValues"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:387:1: switchCaseValues : ( IntValue | BooleanValue ) ^;
    public final Compiler_ProjectParser.switchCaseValues_return switchCaseValues() throws RecognitionException {
        Compiler_ProjectParser.switchCaseValues_return retval = new Compiler_ProjectParser.switchCaseValues_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set131=null;

        Object set131_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:388:2: ( ( IntValue | BooleanValue ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:388:4: ( IntValue | BooleanValue ) ^
            {
            root_0 = (Object)adaptor.nil();


            set131=(Token)input.LT(1);

            set131=(Token)input.LT(1);

            if ( input.LA(1)==BooleanValue||input.LA(1)==IntValue ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set131)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "switchCaseValues"


    public static class switchInnerStmts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchInnerStmts"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:398:1: switchInnerStmts : ( inputStmt | outputStmt | declarationWith | ( callingFunctions ';' ) | ( ID assigningWith ) ) ^;
    public final Compiler_ProjectParser.switchInnerStmts_return switchInnerStmts() throws RecognitionException {
        Compiler_ProjectParser.switchInnerStmts_return retval = new Compiler_ProjectParser.switchInnerStmts_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal136=null;
        Token ID137=null;
        Compiler_ProjectParser.inputStmt_return inputStmt132 =null;

        Compiler_ProjectParser.outputStmt_return outputStmt133 =null;

        Compiler_ProjectParser.declarationWith_return declarationWith134 =null;

        Compiler_ProjectParser.callingFunctions_return callingFunctions135 =null;

        Compiler_ProjectParser.assigningWith_return assigningWith138 =null;


        Object char_literal136_tree=null;
        Object ID137_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:399:2: ( ( inputStmt | outputStmt | declarationWith | ( callingFunctions ';' ) | ( ID assigningWith ) ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:399:4: ( inputStmt | outputStmt | declarationWith | ( callingFunctions ';' ) | ( ID assigningWith ) ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:399:4: ( inputStmt | outputStmt | declarationWith | ( callingFunctions ';' ) | ( ID assigningWith ) )
            int alt29=5;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                switch ( input.LA(2) ) {
                case 83:
                    {
                    alt29=1;
                    }
                    break;
                case 77:
                    {
                    alt29=2;
                    }
                    break;
                case 69:
                case 73:
                    {
                    alt29=4;
                    }
                    break;
                case ID:
                case 68:
                    {
                    alt29=3;
                    }
                    break;
                case 79:
                    {
                    alt29=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }

            }
            else if ( ((LA29_0 >= 86 && LA29_0 <= 87)||LA29_0==91||LA29_0==94||LA29_0==98||LA29_0==105||LA29_0==108) ) {
                alt29=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:399:5: inputStmt
                    {
                    pushFollow(FOLLOW_inputStmt_in_switchInnerStmts2410);
                    inputStmt132=inputStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, inputStmt132.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:400:3: outputStmt
                    {
                    pushFollow(FOLLOW_outputStmt_in_switchInnerStmts2418);
                    outputStmt133=outputStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, outputStmt133.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:401:3: declarationWith
                    {
                    pushFollow(FOLLOW_declarationWith_in_switchInnerStmts2427);
                    declarationWith134=declarationWith();

                    state._fsp--;

                    adaptor.addChild(root_0, declarationWith134.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:402:3: ( callingFunctions ';' )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:402:3: ( callingFunctions ';' )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:402:4: callingFunctions ';'
                    {
                    pushFollow(FOLLOW_callingFunctions_in_switchInnerStmts2436);
                    callingFunctions135=callingFunctions();

                    state._fsp--;

                    adaptor.addChild(root_0, callingFunctions135.getTree());

                    char_literal136=(Token)match(input,75,FOLLOW_75_in_switchInnerStmts2438); 
                    char_literal136_tree = 
                    (Object)adaptor.create(char_literal136)
                    ;
                    adaptor.addChild(root_0, char_literal136_tree);


                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:403:3: ( ID assigningWith )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:403:3: ( ID assigningWith )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:403:4: ID assigningWith
                    {
                    ID137=(Token)match(input,ID,FOLLOW_ID_in_switchInnerStmts2447); 
                    ID137_tree = 
                    (Object)adaptor.create(ID137)
                    ;
                    adaptor.addChild(root_0, ID137_tree);


                    pushFollow(FOLLOW_assigningWith_in_switchInnerStmts2449);
                    assigningWith138=assigningWith();

                    state._fsp--;

                    adaptor.addChild(root_0, assigningWith138.getTree());

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "switchInnerStmts"


    public static class ifStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:412:1: ifStmt : ifBody ( elseBody )? -> ^( IfStmt ifBody ( elseBody )? ) ;
    public final Compiler_ProjectParser.ifStmt_return ifStmt() throws RecognitionException {
        Compiler_ProjectParser.ifStmt_return retval = new Compiler_ProjectParser.ifStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Compiler_ProjectParser.ifBody_return ifBody139 =null;

        Compiler_ProjectParser.elseBody_return elseBody140 =null;


        RewriteRuleSubtreeStream stream_ifBody=new RewriteRuleSubtreeStream(adaptor,"rule ifBody");
        RewriteRuleSubtreeStream stream_elseBody=new RewriteRuleSubtreeStream(adaptor,"rule elseBody");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:412:8: ( ifBody ( elseBody )? -> ^( IfStmt ifBody ( elseBody )? ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:412:10: ifBody ( elseBody )?
            {
            pushFollow(FOLLOW_ifBody_in_ifStmt2498);
            ifBody139=ifBody();

            state._fsp--;

            stream_ifBody.add(ifBody139.getTree());

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:412:17: ( elseBody )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==93) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:412:17: elseBody
                    {
                    pushFollow(FOLLOW_elseBody_in_ifStmt2500);
                    elseBody140=elseBody();

                    state._fsp--;

                    stream_elseBody.add(elseBody140.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: elseBody, ifBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 412:27: -> ^( IfStmt ifBody ( elseBody )? )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:413:3: ^( IfStmt ifBody ( elseBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IfStmt, "IfStmt")
                , root_1);

                adaptor.addChild(root_1, stream_ifBody.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:413:19: ( elseBody )?
                if ( stream_elseBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseBody.nextTree());

                }
                stream_elseBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "ifStmt"


    public static class ifBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifBody"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:422:1: ifBody : 'if' conditionBrackets bodyExpression -> ^( IfBody 'if' conditionBrackets bodyExpression ) ;
    public final Compiler_ProjectParser.ifBody_return ifBody() throws RecognitionException {
        Compiler_ProjectParser.ifBody_return retval = new Compiler_ProjectParser.ifBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal141=null;
        Compiler_ProjectParser.conditionBrackets_return conditionBrackets142 =null;

        Compiler_ProjectParser.bodyExpression_return bodyExpression143 =null;


        Object string_literal141_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleSubtreeStream stream_conditionBrackets=new RewriteRuleSubtreeStream(adaptor,"rule conditionBrackets");
        RewriteRuleSubtreeStream stream_bodyExpression=new RewriteRuleSubtreeStream(adaptor,"rule bodyExpression");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:422:8: ( 'if' conditionBrackets bodyExpression -> ^( IfBody 'if' conditionBrackets bodyExpression ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:422:10: 'if' conditionBrackets bodyExpression
            {
            string_literal141=(Token)match(input,96,FOLLOW_96_in_ifBody2560);  
            stream_96.add(string_literal141);


            pushFollow(FOLLOW_conditionBrackets_in_ifBody2562);
            conditionBrackets142=conditionBrackets();

            state._fsp--;

            stream_conditionBrackets.add(conditionBrackets142.getTree());

            pushFollow(FOLLOW_bodyExpression_in_ifBody2564);
            bodyExpression143=bodyExpression();

            state._fsp--;

            stream_bodyExpression.add(bodyExpression143.getTree());

            // AST REWRITE
            // elements: 96, bodyExpression, conditionBrackets
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 422:48: -> ^( IfBody 'if' conditionBrackets bodyExpression )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:423:3: ^( IfBody 'if' conditionBrackets bodyExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IfBody, "IfBody")
                , root_1);

                adaptor.addChild(root_1, 
                stream_96.nextNode()
                );

                adaptor.addChild(root_1, stream_conditionBrackets.nextTree());

                adaptor.addChild(root_1, stream_bodyExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "ifBody"


    public static class elseBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseBody"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:432:1: elseBody : 'else' bodyExpression -> ^( ElseBody 'else' bodyExpression ) ;
    public final Compiler_ProjectParser.elseBody_return elseBody() throws RecognitionException {
        Compiler_ProjectParser.elseBody_return retval = new Compiler_ProjectParser.elseBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal144=null;
        Compiler_ProjectParser.bodyExpression_return bodyExpression145 =null;


        Object string_literal144_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_bodyExpression=new RewriteRuleSubtreeStream(adaptor,"rule bodyExpression");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:432:9: ( 'else' bodyExpression -> ^( ElseBody 'else' bodyExpression ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:432:11: 'else' bodyExpression
            {
            string_literal144=(Token)match(input,93,FOLLOW_93_in_elseBody2623);  
            stream_93.add(string_literal144);


            pushFollow(FOLLOW_bodyExpression_in_elseBody2625);
            bodyExpression145=bodyExpression();

            state._fsp--;

            stream_bodyExpression.add(bodyExpression145.getTree());

            // AST REWRITE
            // elements: 93, bodyExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 432:33: -> ^( ElseBody 'else' bodyExpression )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:433:3: ^( ElseBody 'else' bodyExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ElseBody, "ElseBody")
                , root_1);

                adaptor.addChild(root_1, 
                stream_93.nextNode()
                );

                adaptor.addChild(root_1, stream_bodyExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "elseBody"


    public static class bodyExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bodyExpression"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:1: bodyExpression : ( '{' ( stmts )* ( 'return' ';' )? '}' | stmts ) ^;
    public final Compiler_ProjectParser.bodyExpression_return bodyExpression() throws RecognitionException {
        Compiler_ProjectParser.bodyExpression_return retval = new Compiler_ProjectParser.bodyExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal146=null;
        Token string_literal148=null;
        Token char_literal149=null;
        Token char_literal150=null;
        Compiler_ProjectParser.stmts_return stmts147 =null;

        Compiler_ProjectParser.stmts_return stmts151 =null;


        Object char_literal146_tree=null;
        Object string_literal148_tree=null;
        Object char_literal149_tree=null;
        Object char_literal150_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:15: ( ( '{' ( stmts )* ( 'return' ';' )? '}' | stmts ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:18: ( '{' ( stmts )* ( 'return' ';' )? '}' | stmts ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:18: ( '{' ( stmts )* ( 'return' ';' )? '}' | stmts )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==111) ) {
                alt33=1;
            }
            else if ( (LA33_0==Comment||LA33_0==ID||(LA33_0 >= 86 && LA33_0 <= 87)||LA33_0==91||(LA33_0 >= 94 && LA33_0 <= 96)||LA33_0==98||(LA33_0 >= 105 && LA33_0 <= 106)||LA33_0==108||LA33_0==110) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:19: '{' ( stmts )* ( 'return' ';' )? '}'
                    {
                    char_literal146=(Token)match(input,111,FOLLOW_111_in_bodyExpression2684); 
                    char_literal146_tree = 
                    (Object)adaptor.create(char_literal146)
                    ;
                    adaptor.addChild(root_0, char_literal146_tree);


                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:23: ( stmts )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comment||LA31_0==ID||(LA31_0 >= 86 && LA31_0 <= 87)||LA31_0==91||(LA31_0 >= 94 && LA31_0 <= 96)||LA31_0==98||(LA31_0 >= 105 && LA31_0 <= 106)||LA31_0==108||LA31_0==110) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:23: stmts
                    	    {
                    	    pushFollow(FOLLOW_stmts_in_bodyExpression2686);
                    	    stmts147=stmts();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmts147.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:30: ( 'return' ';' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==103) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:31: 'return' ';'
                            {
                            string_literal148=(Token)match(input,103,FOLLOW_103_in_bodyExpression2690); 
                            string_literal148_tree = 
                            (Object)adaptor.create(string_literal148)
                            ;
                            adaptor.addChild(root_0, string_literal148_tree);


                            char_literal149=(Token)match(input,75,FOLLOW_75_in_bodyExpression2692); 
                            char_literal149_tree = 
                            (Object)adaptor.create(char_literal149)
                            ;
                            adaptor.addChild(root_0, char_literal149_tree);


                            }
                            break;

                    }


                    char_literal150=(Token)match(input,112,FOLLOW_112_in_bodyExpression2695); 
                    char_literal150_tree = 
                    (Object)adaptor.create(char_literal150)
                    ;
                    adaptor.addChild(root_0, char_literal150_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:442:51: stmts
                    {
                    pushFollow(FOLLOW_stmts_in_bodyExpression2699);
                    stmts151=stmts();

                    state._fsp--;

                    adaptor.addChild(root_0, stmts151.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "bodyExpression"


    public static class conditionBrackets_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionBrackets"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:451:1: conditionBrackets : '(' booleans ')' -> ^( ConditionBrackets '(' booleans ')' ) ;
    public final Compiler_ProjectParser.conditionBrackets_return conditionBrackets() throws RecognitionException {
        Compiler_ProjectParser.conditionBrackets_return retval = new Compiler_ProjectParser.conditionBrackets_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal152=null;
        Token char_literal154=null;
        Compiler_ProjectParser.booleans_return booleans153 =null;


        Object char_literal152_tree=null;
        Object char_literal154_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_booleans=new RewriteRuleSubtreeStream(adaptor,"rule booleans");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:451:18: ( '(' booleans ')' -> ^( ConditionBrackets '(' booleans ')' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:451:20: '(' booleans ')'
            {
            char_literal152=(Token)match(input,69,FOLLOW_69_in_conditionBrackets2746);  
            stream_69.add(char_literal152);


            pushFollow(FOLLOW_booleans_in_conditionBrackets2748);
            booleans153=booleans();

            state._fsp--;

            stream_booleans.add(booleans153.getTree());

            char_literal154=(Token)match(input,70,FOLLOW_70_in_conditionBrackets2750);  
            stream_70.add(char_literal154);


            // AST REWRITE
            // elements: 70, booleans, 69
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 451:37: -> ^( ConditionBrackets '(' booleans ')' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:452:4: ^( ConditionBrackets '(' booleans ')' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ConditionBrackets, "ConditionBrackets")
                , root_1);

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, stream_booleans.nextTree());

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "conditionBrackets"


    public static class inputStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inputStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:461:1: inputStmt : ID '>>' values ( '>>' values )* ';' -> ^( InputStmt ID '>>' values ( '>>' values )* ';' ) ;
    public final Compiler_ProjectParser.inputStmt_return inputStmt() throws RecognitionException {
        Compiler_ProjectParser.inputStmt_return retval = new Compiler_ProjectParser.inputStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID155=null;
        Token string_literal156=null;
        Token string_literal158=null;
        Token char_literal160=null;
        Compiler_ProjectParser.values_return values157 =null;

        Compiler_ProjectParser.values_return values159 =null;


        Object ID155_tree=null;
        Object string_literal156_tree=null;
        Object string_literal158_tree=null;
        Object char_literal160_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"rule values");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:461:10: ( ID '>>' values ( '>>' values )* ';' -> ^( InputStmt ID '>>' values ( '>>' values )* ';' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:461:12: ID '>>' values ( '>>' values )* ';'
            {
            ID155=(Token)match(input,ID,FOLLOW_ID_in_inputStmt2810);  
            stream_ID.add(ID155);


            string_literal156=(Token)match(input,83,FOLLOW_83_in_inputStmt2812);  
            stream_83.add(string_literal156);


            pushFollow(FOLLOW_values_in_inputStmt2814);
            values157=values();

            state._fsp--;

            stream_values.add(values157.getTree());

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:461:27: ( '>>' values )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==83) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:461:28: '>>' values
            	    {
            	    string_literal158=(Token)match(input,83,FOLLOW_83_in_inputStmt2817);  
            	    stream_83.add(string_literal158);


            	    pushFollow(FOLLOW_values_in_inputStmt2819);
            	    values159=values();

            	    state._fsp--;

            	    stream_values.add(values159.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            char_literal160=(Token)match(input,75,FOLLOW_75_in_inputStmt2823);  
            stream_75.add(char_literal160);


            // AST REWRITE
            // elements: 75, 83, values, 83, ID, values
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 461:46: -> ^( InputStmt ID '>>' values ( '>>' values )* ';' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:462:3: ^( InputStmt ID '>>' values ( '>>' values )* ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(InputStmt, "InputStmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_83.nextNode()
                );

                adaptor.addChild(root_1, stream_values.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:462:30: ( '>>' values )*
                while ( stream_83.hasNext()||stream_values.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_83.nextNode()
                    );

                    adaptor.addChild(root_1, stream_values.nextTree());

                }
                stream_83.reset();
                stream_values.reset();

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "inputStmt"


    public static class outputStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outputStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:471:1: outputStmt : ID '<<' values ( '<<' values )* ';' -> ^( OutputStmt ID '<<' values ( '<<' values )* ';' ) ;
    public final Compiler_ProjectParser.outputStmt_return outputStmt() throws RecognitionException {
        Compiler_ProjectParser.outputStmt_return retval = new Compiler_ProjectParser.outputStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID161=null;
        Token string_literal162=null;
        Token string_literal164=null;
        Token char_literal166=null;
        Compiler_ProjectParser.values_return values163 =null;

        Compiler_ProjectParser.values_return values165 =null;


        Object ID161_tree=null;
        Object string_literal162_tree=null;
        Object string_literal164_tree=null;
        Object char_literal166_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"rule values");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:471:11: ( ID '<<' values ( '<<' values )* ';' -> ^( OutputStmt ID '<<' values ( '<<' values )* ';' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:471:13: ID '<<' values ( '<<' values )* ';'
            {
            ID161=(Token)match(input,ID,FOLLOW_ID_in_outputStmt2891);  
            stream_ID.add(ID161);


            string_literal162=(Token)match(input,77,FOLLOW_77_in_outputStmt2893);  
            stream_77.add(string_literal162);


            pushFollow(FOLLOW_values_in_outputStmt2895);
            values163=values();

            state._fsp--;

            stream_values.add(values163.getTree());

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:471:28: ( '<<' values )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==77) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:471:29: '<<' values
            	    {
            	    string_literal164=(Token)match(input,77,FOLLOW_77_in_outputStmt2898);  
            	    stream_77.add(string_literal164);


            	    pushFollow(FOLLOW_values_in_outputStmt2900);
            	    values165=values();

            	    state._fsp--;

            	    stream_values.add(values165.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            char_literal166=(Token)match(input,75,FOLLOW_75_in_outputStmt2904);  
            stream_75.add(char_literal166);


            // AST REWRITE
            // elements: 77, 77, values, ID, 75, values
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 471:47: -> ^( OutputStmt ID '<<' values ( '<<' values )* ';' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:472:3: ^( OutputStmt ID '<<' values ( '<<' values )* ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OutputStmt, "OutputStmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_77.nextNode()
                );

                adaptor.addChild(root_1, stream_values.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:472:31: ( '<<' values )*
                while ( stream_77.hasNext()||stream_values.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_77.nextNode()
                    );

                    adaptor.addChild(root_1, stream_values.nextTree());

                }
                stream_77.reset();
                stream_values.reset();

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "outputStmt"


    public static class pointerMemberFunctionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pointerMemberFunctionCall"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:481:1: pointerMemberFunctionCall : ID '->' callingFunctions ';' -> ^( PointerMemberFunctionCall ID '->' callingFunctions ';' ) ;
    public final Compiler_ProjectParser.pointerMemberFunctionCall_return pointerMemberFunctionCall() throws RecognitionException {
        Compiler_ProjectParser.pointerMemberFunctionCall_return retval = new Compiler_ProjectParser.pointerMemberFunctionCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID167=null;
        Token string_literal168=null;
        Token char_literal170=null;
        Compiler_ProjectParser.callingFunctions_return callingFunctions169 =null;


        Object ID167_tree=null;
        Object string_literal168_tree=null;
        Object char_literal170_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_callingFunctions=new RewriteRuleSubtreeStream(adaptor,"rule callingFunctions");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:482:2: ( ID '->' callingFunctions ';' -> ^( PointerMemberFunctionCall ID '->' callingFunctions ';' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:482:4: ID '->' callingFunctions ';'
            {
            ID167=(Token)match(input,ID,FOLLOW_ID_in_pointerMemberFunctionCall2974);  
            stream_ID.add(ID167);


            string_literal168=(Token)match(input,72,FOLLOW_72_in_pointerMemberFunctionCall2976);  
            stream_72.add(string_literal168);


            pushFollow(FOLLOW_callingFunctions_in_pointerMemberFunctionCall2978);
            callingFunctions169=callingFunctions();

            state._fsp--;

            stream_callingFunctions.add(callingFunctions169.getTree());

            char_literal170=(Token)match(input,75,FOLLOW_75_in_pointerMemberFunctionCall2980);  
            stream_75.add(char_literal170);


            // AST REWRITE
            // elements: ID, callingFunctions, 75, 72
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 482:33: -> ^( PointerMemberFunctionCall ID '->' callingFunctions ';' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:483:3: ^( PointerMemberFunctionCall ID '->' callingFunctions ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PointerMemberFunctionCall, "PointerMemberFunctionCall")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_72.nextNode()
                );

                adaptor.addChild(root_1, stream_callingFunctions.nextTree());

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "pointerMemberFunctionCall"


    public static class lambdaFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lambdaFunction"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:492:1: lambdaFunction : '[' ( '&' )? ']' '(' parameters ')' '{' 'return' values ';' '}' -> ^( LambdaFunction '[' ( '&' )? ']' '(' parameters ')' '{' 'return' values ';' '}' ) ;
    public final Compiler_ProjectParser.lambdaFunction_return lambdaFunction() throws RecognitionException {
        Compiler_ProjectParser.lambdaFunction_return retval = new Compiler_ProjectParser.lambdaFunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal171=null;
        Token char_literal172=null;
        Token char_literal173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal177=null;
        Token string_literal178=null;
        Token char_literal180=null;
        Token char_literal181=null;
        Compiler_ProjectParser.parameters_return parameters175 =null;

        Compiler_ProjectParser.values_return values179 =null;


        Object char_literal171_tree=null;
        Object char_literal172_tree=null;
        Object char_literal173_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        Object char_literal177_tree=null;
        Object string_literal178_tree=null;
        Object char_literal180_tree=null;
        Object char_literal181_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"rule values");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:492:15: ( '[' ( '&' )? ']' '(' parameters ')' '{' 'return' values ';' '}' -> ^( LambdaFunction '[' ( '&' )? ']' '(' parameters ')' '{' 'return' values ';' '}' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:492:17: '[' ( '&' )? ']' '(' parameters ')' '{' 'return' values ';' '}'
            {
            char_literal171=(Token)match(input,84,FOLLOW_84_in_lambdaFunction3041);  
            stream_84.add(char_literal171);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:492:21: ( '&' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==68) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:492:21: '&'
                    {
                    char_literal172=(Token)match(input,68,FOLLOW_68_in_lambdaFunction3043);  
                    stream_68.add(char_literal172);


                    }
                    break;

            }


            char_literal173=(Token)match(input,85,FOLLOW_85_in_lambdaFunction3046);  
            stream_85.add(char_literal173);


            char_literal174=(Token)match(input,69,FOLLOW_69_in_lambdaFunction3048);  
            stream_69.add(char_literal174);


            pushFollow(FOLLOW_parameters_in_lambdaFunction3050);
            parameters175=parameters();

            state._fsp--;

            stream_parameters.add(parameters175.getTree());

            char_literal176=(Token)match(input,70,FOLLOW_70_in_lambdaFunction3052);  
            stream_70.add(char_literal176);


            char_literal177=(Token)match(input,111,FOLLOW_111_in_lambdaFunction3054);  
            stream_111.add(char_literal177);


            string_literal178=(Token)match(input,103,FOLLOW_103_in_lambdaFunction3056);  
            stream_103.add(string_literal178);


            pushFollow(FOLLOW_values_in_lambdaFunction3058);
            values179=values();

            state._fsp--;

            stream_values.add(values179.getTree());

            char_literal180=(Token)match(input,75,FOLLOW_75_in_lambdaFunction3060);  
            stream_75.add(char_literal180);


            char_literal181=(Token)match(input,112,FOLLOW_112_in_lambdaFunction3062);  
            stream_112.add(char_literal181);


            // AST REWRITE
            // elements: 112, 84, 111, parameters, 68, values, 85, 70, 103, 75, 69
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 492:77: -> ^( LambdaFunction '[' ( '&' )? ']' '(' parameters ')' '{' 'return' values ';' '}' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:493:3: ^( LambdaFunction '[' ( '&' )? ']' '(' parameters ')' '{' 'return' values ';' '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LambdaFunction, "LambdaFunction")
                , root_1);

                adaptor.addChild(root_1, 
                stream_84.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:493:24: ( '&' )?
                if ( stream_68.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_68.nextNode()
                    );

                }
                stream_68.reset();

                adaptor.addChild(root_1, 
                stream_85.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, stream_parameters.nextTree());

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_111.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_103.nextNode()
                );

                adaptor.addChild(root_1, stream_values.nextTree());

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_112.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "lambdaFunction"


    public static class parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:502:1: parameters : ( declarationWithout )? ( ',' declarationWithout )* -> ^( Parameters ( declarationWithout )? ( ',' declarationWithout )* ) ;
    public final Compiler_ProjectParser.parameters_return parameters() throws RecognitionException {
        Compiler_ProjectParser.parameters_return retval = new Compiler_ProjectParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal183=null;
        Compiler_ProjectParser.declarationWithout_return declarationWithout182 =null;

        Compiler_ProjectParser.declarationWithout_return declarationWithout184 =null;


        Object char_literal183_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_declarationWithout=new RewriteRuleSubtreeStream(adaptor,"rule declarationWithout");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:502:11: ( ( declarationWithout )? ( ',' declarationWithout )* -> ^( Parameters ( declarationWithout )? ( ',' declarationWithout )* ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:502:13: ( declarationWithout )? ( ',' declarationWithout )*
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:502:13: ( declarationWithout )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID||(LA37_0 >= 86 && LA37_0 <= 87)||LA37_0==91||LA37_0==94||LA37_0==98||LA37_0==105||LA37_0==108) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:502:13: declarationWithout
                    {
                    pushFollow(FOLLOW_declarationWithout_in_parameters3138);
                    declarationWithout182=declarationWithout();

                    state._fsp--;

                    stream_declarationWithout.add(declarationWithout182.getTree());

                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:502:33: ( ',' declarationWithout )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==71) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:502:34: ',' declarationWithout
            	    {
            	    char_literal183=(Token)match(input,71,FOLLOW_71_in_parameters3142);  
            	    stream_71.add(char_literal183);


            	    pushFollow(FOLLOW_declarationWithout_in_parameters3144);
            	    declarationWithout184=declarationWithout();

            	    state._fsp--;

            	    stream_declarationWithout.add(declarationWithout184.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // AST REWRITE
            // elements: 71, declarationWithout, declarationWithout
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 502:59: -> ^( Parameters ( declarationWithout )? ( ',' declarationWithout )* )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:503:3: ^( Parameters ( declarationWithout )? ( ',' declarationWithout )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Parameters, "Parameters")
                , root_1);

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:503:16: ( declarationWithout )?
                if ( stream_declarationWithout.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarationWithout.nextTree());

                }
                stream_declarationWithout.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:503:36: ( ',' declarationWithout )*
                while ( stream_71.hasNext()||stream_declarationWithout.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_71.nextNode()
                    );

                    adaptor.addChild(root_1, stream_declarationWithout.nextTree());

                }
                stream_71.reset();
                stream_declarationWithout.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class usingNameSpaceStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "usingNameSpaceStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:512:1: usingNameSpaceStmt : ( 'using' 'namespace' 'std' ';' )? -> ^( UsingNameSpaceStmt ( 'using' 'namespace' 'std' ';' )? ) ;
    public final Compiler_ProjectParser.usingNameSpaceStmt_return usingNameSpaceStmt() throws RecognitionException {
        Compiler_ProjectParser.usingNameSpaceStmt_return retval = new Compiler_ProjectParser.usingNameSpaceStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal185=null;
        Token string_literal186=null;
        Token string_literal187=null;
        Token char_literal188=null;

        Object string_literal185_tree=null;
        Object string_literal186_tree=null;
        Object string_literal187_tree=null;
        Object char_literal188_tree=null;
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:512:19: ( ( 'using' 'namespace' 'std' ';' )? -> ^( UsingNameSpaceStmt ( 'using' 'namespace' 'std' ';' )? ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:512:21: ( 'using' 'namespace' 'std' ';' )?
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:512:21: ( 'using' 'namespace' 'std' ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==107) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:512:22: 'using' 'namespace' 'std' ';'
                    {
                    string_literal185=(Token)match(input,107,FOLLOW_107_in_usingNameSpaceStmt3210);  
                    stream_107.add(string_literal185);


                    string_literal186=(Token)match(input,100,FOLLOW_100_in_usingNameSpaceStmt3212);  
                    stream_100.add(string_literal186);


                    string_literal187=(Token)match(input,104,FOLLOW_104_in_usingNameSpaceStmt3214);  
                    stream_104.add(string_literal187);


                    char_literal188=(Token)match(input,75,FOLLOW_75_in_usingNameSpaceStmt3216);  
                    stream_75.add(char_literal188);


                    }
                    break;

            }


            // AST REWRITE
            // elements: 104, 75, 107, 100
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 512:54: -> ^( UsingNameSpaceStmt ( 'using' 'namespace' 'std' ';' )? )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:513:4: ^( UsingNameSpaceStmt ( 'using' 'namespace' 'std' ';' )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UsingNameSpaceStmt, "UsingNameSpaceStmt")
                , root_1);

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:513:25: ( 'using' 'namespace' 'std' ';' )?
                if ( stream_104.hasNext()||stream_75.hasNext()||stream_107.hasNext()||stream_100.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_107.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_100.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_104.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_75.nextNode()
                    );

                }
                stream_104.reset();
                stream_75.reset();
                stream_107.reset();
                stream_100.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "usingNameSpaceStmt"


    public static class includeStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includeStmt"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:522:1: includeStmt : ( '#' 'include' '<' possibleLibraries '>' ) -> ^( IncludeStmt '#' 'include' '<' possibleLibraries '>' ) ;
    public final Compiler_ProjectParser.includeStmt_return includeStmt() throws RecognitionException {
        Compiler_ProjectParser.includeStmt_return retval = new Compiler_ProjectParser.includeStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal189=null;
        Token string_literal190=null;
        Token char_literal191=null;
        Token char_literal193=null;
        Compiler_ProjectParser.possibleLibraries_return possibleLibraries192 =null;


        Object char_literal189_tree=null;
        Object string_literal190_tree=null;
        Object char_literal191_tree=null;
        Object char_literal193_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_possibleLibraries=new RewriteRuleSubtreeStream(adaptor,"rule possibleLibraries");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:522:12: ( ( '#' 'include' '<' possibleLibraries '>' ) -> ^( IncludeStmt '#' 'include' '<' possibleLibraries '>' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:522:14: ( '#' 'include' '<' possibleLibraries '>' )
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:522:14: ( '#' 'include' '<' possibleLibraries '>' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:522:15: '#' 'include' '<' possibleLibraries '>'
            {
            char_literal189=(Token)match(input,67,FOLLOW_67_in_includeStmt3284);  
            stream_67.add(char_literal189);


            string_literal190=(Token)match(input,97,FOLLOW_97_in_includeStmt3286);  
            stream_97.add(string_literal190);


            char_literal191=(Token)match(input,76,FOLLOW_76_in_includeStmt3288);  
            stream_76.add(char_literal191);


            pushFollow(FOLLOW_possibleLibraries_in_includeStmt3290);
            possibleLibraries192=possibleLibraries();

            state._fsp--;

            stream_possibleLibraries.add(possibleLibraries192.getTree());

            char_literal193=(Token)match(input,81,FOLLOW_81_in_includeStmt3292);  
            stream_81.add(char_literal193);


            }


            // AST REWRITE
            // elements: 76, 97, 67, possibleLibraries, 81
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 522:56: -> ^( IncludeStmt '#' 'include' '<' possibleLibraries '>' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:523:3: ^( IncludeStmt '#' 'include' '<' possibleLibraries '>' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IncludeStmt, "IncludeStmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_67.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_97.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_76.nextNode()
                );

                adaptor.addChild(root_1, stream_possibleLibraries.nextTree());

                adaptor.addChild(root_1, 
                stream_81.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "includeStmt"


    public static class possibleLibraries_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "possibleLibraries"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:532:1: possibleLibraries : ( ID | 'vector' ) ^;
    public final Compiler_ProjectParser.possibleLibraries_return possibleLibraries() throws RecognitionException {
        Compiler_ProjectParser.possibleLibraries_return retval = new Compiler_ProjectParser.possibleLibraries_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set194=null;

        Object set194_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:533:2: ( ( ID | 'vector' ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:533:4: ( ID | 'vector' ) ^
            {
            root_0 = (Object)adaptor.nil();


            set194=(Token)input.LT(1);

            set194=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==108 ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set194)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "possibleLibraries"


    public static class declarationWith_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarationWith"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:542:1: declarationWith : declarationWithout ';' -> ^( DeclarationWith declarationWithout ';' ) ;
    public final Compiler_ProjectParser.declarationWith_return declarationWith() throws RecognitionException {
        Compiler_ProjectParser.declarationWith_return retval = new Compiler_ProjectParser.declarationWith_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal196=null;
        Compiler_ProjectParser.declarationWithout_return declarationWithout195 =null;


        Object char_literal196_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_declarationWithout=new RewriteRuleSubtreeStream(adaptor,"rule declarationWithout");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:542:16: ( declarationWithout ';' -> ^( DeclarationWith declarationWithout ';' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:542:18: declarationWithout ';'
            {
            pushFollow(FOLLOW_declarationWithout_in_declarationWith3410);
            declarationWithout195=declarationWithout();

            state._fsp--;

            stream_declarationWithout.add(declarationWithout195.getTree());

            char_literal196=(Token)match(input,75,FOLLOW_75_in_declarationWith3412);  
            stream_75.add(char_literal196);


            // AST REWRITE
            // elements: declarationWithout, 75
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 542:41: -> ^( DeclarationWith declarationWithout ';' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:543:4: ^( DeclarationWith declarationWithout ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DeclarationWith, "DeclarationWith")
                , root_1);

                adaptor.addChild(root_1, stream_declarationWithout.nextTree());

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "declarationWith"


    public static class declarationWithout_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarationWithout"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:552:1: declarationWithout : ( 'const' )? declarations -> ^( DeclarationWithout ( 'const' )? declarations ) ;
    public final Compiler_ProjectParser.declarationWithout_return declarationWithout() throws RecognitionException {
        Compiler_ProjectParser.declarationWithout_return retval = new Compiler_ProjectParser.declarationWithout_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal197=null;
        Compiler_ProjectParser.declarations_return declarations198 =null;


        Object string_literal197_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:552:19: ( ( 'const' )? declarations -> ^( DeclarationWithout ( 'const' )? declarations ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:552:21: ( 'const' )? declarations
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:552:21: ( 'const' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==91) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:552:21: 'const'
                    {
                    string_literal197=(Token)match(input,91,FOLLOW_91_in_declarationWithout3470);  
                    stream_91.add(string_literal197);


                    }
                    break;

            }


            pushFollow(FOLLOW_declarations_in_declarationWithout3473);
            declarations198=declarations();

            state._fsp--;

            stream_declarations.add(declarations198.getTree());

            // AST REWRITE
            // elements: declarations, 91
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 552:43: -> ^( DeclarationWithout ( 'const' )? declarations )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:553:4: ^( DeclarationWithout ( 'const' )? declarations )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DeclarationWithout, "DeclarationWithout")
                , root_1);

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:553:25: ( 'const' )?
                if ( stream_91.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_91.nextNode()
                    );

                }
                stream_91.reset();

                adaptor.addChild(root_1, stream_declarations.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "declarationWithout"


    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarations"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:562:1: declarations : ( stringDecl | integerDecl | floatDecl | booleanDecl | autoDecl | vectorDecl | objectDecl ) ^;
    public final Compiler_ProjectParser.declarations_return declarations() throws RecognitionException {
        Compiler_ProjectParser.declarations_return retval = new Compiler_ProjectParser.declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Compiler_ProjectParser.stringDecl_return stringDecl199 =null;

        Compiler_ProjectParser.integerDecl_return integerDecl200 =null;

        Compiler_ProjectParser.floatDecl_return floatDecl201 =null;

        Compiler_ProjectParser.booleanDecl_return booleanDecl202 =null;

        Compiler_ProjectParser.autoDecl_return autoDecl203 =null;

        Compiler_ProjectParser.vectorDecl_return vectorDecl204 =null;

        Compiler_ProjectParser.objectDecl_return objectDecl205 =null;



        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:563:2: ( ( stringDecl | integerDecl | floatDecl | booleanDecl | autoDecl | vectorDecl | objectDecl ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:563:4: ( stringDecl | integerDecl | floatDecl | booleanDecl | autoDecl | vectorDecl | objectDecl ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:563:4: ( stringDecl | integerDecl | floatDecl | booleanDecl | autoDecl | vectorDecl | objectDecl )
            int alt41=7;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt41=1;
                }
                break;
            case 98:
                {
                alt41=2;
                }
                break;
            case 94:
                {
                alt41=3;
                }
                break;
            case 87:
                {
                alt41=4;
                }
                break;
            case 86:
                {
                alt41=5;
                }
                break;
            case 108:
                {
                alt41=6;
                }
                break;
            case ID:
                {
                alt41=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:563:5: stringDecl
                    {
                    pushFollow(FOLLOW_stringDecl_in_declarations3535);
                    stringDecl199=stringDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, stringDecl199.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:564:3: integerDecl
                    {
                    pushFollow(FOLLOW_integerDecl_in_declarations3543);
                    integerDecl200=integerDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, integerDecl200.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:565:3: floatDecl
                    {
                    pushFollow(FOLLOW_floatDecl_in_declarations3551);
                    floatDecl201=floatDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, floatDecl201.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:566:3: booleanDecl
                    {
                    pushFollow(FOLLOW_booleanDecl_in_declarations3559);
                    booleanDecl202=booleanDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanDecl202.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:567:3: autoDecl
                    {
                    pushFollow(FOLLOW_autoDecl_in_declarations3566);
                    autoDecl203=autoDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, autoDecl203.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:568:3: vectorDecl
                    {
                    pushFollow(FOLLOW_vectorDecl_in_declarations3574);
                    vectorDecl204=vectorDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, vectorDecl204.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:569:3: objectDecl
                    {
                    pushFollow(FOLLOW_objectDecl_in_declarations3582);
                    objectDecl205=objectDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, objectDecl205.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "declarations"


    public static class values_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "values"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:578:1: values : ( BooleanValue | ( integers ( ArithmaticOperators integers )* ) | ( floats ( ArithmaticOperators floats )* ) | ( callingFunctions ( comparisonOperators booleanExpressions )? ) | StringValue | lambdaFunction | '{' '}' ) ^;
    public final Compiler_ProjectParser.values_return values() throws RecognitionException {
        Compiler_ProjectParser.values_return retval = new Compiler_ProjectParser.values_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BooleanValue206=null;
        Token ArithmaticOperators208=null;
        Token ArithmaticOperators211=null;
        Token StringValue216=null;
        Token char_literal218=null;
        Token char_literal219=null;
        Compiler_ProjectParser.integers_return integers207 =null;

        Compiler_ProjectParser.integers_return integers209 =null;

        Compiler_ProjectParser.floats_return floats210 =null;

        Compiler_ProjectParser.floats_return floats212 =null;

        Compiler_ProjectParser.callingFunctions_return callingFunctions213 =null;

        Compiler_ProjectParser.comparisonOperators_return comparisonOperators214 =null;

        Compiler_ProjectParser.booleanExpressions_return booleanExpressions215 =null;

        Compiler_ProjectParser.lambdaFunction_return lambdaFunction217 =null;


        Object BooleanValue206_tree=null;
        Object ArithmaticOperators208_tree=null;
        Object ArithmaticOperators211_tree=null;
        Object StringValue216_tree=null;
        Object char_literal218_tree=null;
        Object char_literal219_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:578:8: ( ( BooleanValue | ( integers ( ArithmaticOperators integers )* ) | ( floats ( ArithmaticOperators floats )* ) | ( callingFunctions ( comparisonOperators booleanExpressions )? ) | StringValue | lambdaFunction | '{' '}' ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:578:10: ( BooleanValue | ( integers ( ArithmaticOperators integers )* ) | ( floats ( ArithmaticOperators floats )* ) | ( callingFunctions ( comparisonOperators booleanExpressions )? ) | StringValue | lambdaFunction | '{' '}' ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:578:10: ( BooleanValue | ( integers ( ArithmaticOperators integers )* ) | ( floats ( ArithmaticOperators floats )* ) | ( callingFunctions ( comparisonOperators booleanExpressions )? ) | StringValue | lambdaFunction | '{' '}' )
            int alt45=7;
            switch ( input.LA(1) ) {
            case BooleanValue:
                {
                alt45=1;
                }
                break;
            case ID:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==69||LA45_2==73) ) {
                    alt45=4;
                }
                else if ( (LA45_2==ArithmaticOperators||(LA45_2 >= 70 && LA45_2 <= 71)||LA45_2==75||LA45_2==77||LA45_2==83) ) {
                    alt45=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;

                }
                }
                break;
            case IntValue:
                {
                alt45=2;
                }
                break;
            case FloatValue:
                {
                alt45=3;
                }
                break;
            case StringValue:
                {
                alt45=5;
                }
                break;
            case 84:
                {
                alt45=6;
                }
                break;
            case 111:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:578:11: BooleanValue
                    {
                    BooleanValue206=(Token)match(input,BooleanValue,FOLLOW_BooleanValue_in_values3631); 
                    BooleanValue206_tree = 
                    (Object)adaptor.create(BooleanValue206)
                    ;
                    adaptor.addChild(root_0, BooleanValue206_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:579:3: ( integers ( ArithmaticOperators integers )* )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:579:3: ( integers ( ArithmaticOperators integers )* )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:579:4: integers ( ArithmaticOperators integers )*
                    {
                    pushFollow(FOLLOW_integers_in_values3638);
                    integers207=integers();

                    state._fsp--;

                    adaptor.addChild(root_0, integers207.getTree());

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:579:13: ( ArithmaticOperators integers )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==ArithmaticOperators) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:579:14: ArithmaticOperators integers
                    	    {
                    	    ArithmaticOperators208=(Token)match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_values3641); 
                    	    ArithmaticOperators208_tree = 
                    	    (Object)adaptor.create(ArithmaticOperators208)
                    	    ;
                    	    adaptor.addChild(root_0, ArithmaticOperators208_tree);


                    	    pushFollow(FOLLOW_integers_in_values3643);
                    	    integers209=integers();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, integers209.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:580:3: ( floats ( ArithmaticOperators floats )* )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:580:3: ( floats ( ArithmaticOperators floats )* )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:580:4: floats ( ArithmaticOperators floats )*
                    {
                    pushFollow(FOLLOW_floats_in_values3654);
                    floats210=floats();

                    state._fsp--;

                    adaptor.addChild(root_0, floats210.getTree());

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:580:11: ( ArithmaticOperators floats )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==ArithmaticOperators) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:580:12: ArithmaticOperators floats
                    	    {
                    	    ArithmaticOperators211=(Token)match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_values3657); 
                    	    ArithmaticOperators211_tree = 
                    	    (Object)adaptor.create(ArithmaticOperators211)
                    	    ;
                    	    adaptor.addChild(root_0, ArithmaticOperators211_tree);


                    	    pushFollow(FOLLOW_floats_in_values3659);
                    	    floats212=floats();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, floats212.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:581:3: ( callingFunctions ( comparisonOperators booleanExpressions )? )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:581:3: ( callingFunctions ( comparisonOperators booleanExpressions )? )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:581:4: callingFunctions ( comparisonOperators booleanExpressions )?
                    {
                    pushFollow(FOLLOW_callingFunctions_in_values3670);
                    callingFunctions213=callingFunctions();

                    state._fsp--;

                    adaptor.addChild(root_0, callingFunctions213.getTree());

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:581:21: ( comparisonOperators booleanExpressions )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==66||LA44_0==76||LA44_0==78||(LA44_0 >= 80 && LA44_0 <= 82)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:581:22: comparisonOperators booleanExpressions
                            {
                            pushFollow(FOLLOW_comparisonOperators_in_values3673);
                            comparisonOperators214=comparisonOperators();

                            state._fsp--;

                            adaptor.addChild(root_0, comparisonOperators214.getTree());

                            pushFollow(FOLLOW_booleanExpressions_in_values3675);
                            booleanExpressions215=booleanExpressions();

                            state._fsp--;

                            adaptor.addChild(root_0, booleanExpressions215.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:582:3: StringValue
                    {
                    StringValue216=(Token)match(input,StringValue,FOLLOW_StringValue_in_values3685); 
                    StringValue216_tree = 
                    (Object)adaptor.create(StringValue216)
                    ;
                    adaptor.addChild(root_0, StringValue216_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:583:3: lambdaFunction
                    {
                    pushFollow(FOLLOW_lambdaFunction_in_values3692);
                    lambdaFunction217=lambdaFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, lambdaFunction217.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:584:3: '{' '}'
                    {
                    char_literal218=(Token)match(input,111,FOLLOW_111_in_values3698); 
                    char_literal218_tree = 
                    (Object)adaptor.create(char_literal218)
                    ;
                    adaptor.addChild(root_0, char_literal218_tree);


                    char_literal219=(Token)match(input,112,FOLLOW_112_in_values3700); 
                    char_literal219_tree = 
                    (Object)adaptor.create(char_literal219)
                    ;
                    adaptor.addChild(root_0, char_literal219_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "values"


    public static class assigningWith_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigningWith"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:593:1: assigningWith : assigning ';' -> ^( AssigningWith assigning ';' ) ;
    public final Compiler_ProjectParser.assigningWith_return assigningWith() throws RecognitionException {
        Compiler_ProjectParser.assigningWith_return retval = new Compiler_ProjectParser.assigningWith_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal221=null;
        Compiler_ProjectParser.assigning_return assigning220 =null;


        Object char_literal221_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_assigning=new RewriteRuleSubtreeStream(adaptor,"rule assigning");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:593:14: ( assigning ';' -> ^( AssigningWith assigning ';' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:593:16: assigning ';'
            {
            pushFollow(FOLLOW_assigning_in_assigningWith3747);
            assigning220=assigning();

            state._fsp--;

            stream_assigning.add(assigning220.getTree());

            char_literal221=(Token)match(input,75,FOLLOW_75_in_assigningWith3749);  
            stream_75.add(char_literal221);


            // AST REWRITE
            // elements: assigning, 75
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 593:30: -> ^( AssigningWith assigning ';' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:594:3: ^( AssigningWith assigning ';' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(AssigningWith, "AssigningWith")
                , root_1);

                adaptor.addChild(root_1, stream_assigning.nextTree());

                adaptor.addChild(root_1, 
                stream_75.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "assigningWith"


    public static class assigning_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigning"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:603:1: assigning : ( stringAssigning | booleanAssiging | integerAssigning | floatAssigning ) ^;
    public final Compiler_ProjectParser.assigning_return assigning() throws RecognitionException {
        Compiler_ProjectParser.assigning_return retval = new Compiler_ProjectParser.assigning_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Compiler_ProjectParser.stringAssigning_return stringAssigning222 =null;

        Compiler_ProjectParser.booleanAssiging_return booleanAssiging223 =null;

        Compiler_ProjectParser.integerAssigning_return integerAssigning224 =null;

        Compiler_ProjectParser.floatAssigning_return floatAssigning225 =null;



        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:604:2: ( ( stringAssigning | booleanAssiging | integerAssigning | floatAssigning ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:604:4: ( stringAssigning | booleanAssiging | integerAssigning | floatAssigning ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:604:4: ( stringAssigning | booleanAssiging | integerAssigning | floatAssigning )
            int alt46=4;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==79) ) {
                switch ( input.LA(2) ) {
                case StringValue:
                    {
                    alt46=1;
                    }
                    break;
                case BooleanValue:
                    {
                    alt46=2;
                    }
                    break;
                case FloatValue:
                    {
                    alt46=4;
                    }
                    break;
                case ID:
                case IntValue:
                    {
                    alt46=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:604:5: stringAssigning
                    {
                    pushFollow(FOLLOW_stringAssigning_in_assigning3810);
                    stringAssigning222=stringAssigning();

                    state._fsp--;

                    adaptor.addChild(root_0, stringAssigning222.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:605:3: booleanAssiging
                    {
                    pushFollow(FOLLOW_booleanAssiging_in_assigning3816);
                    booleanAssiging223=booleanAssiging();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanAssiging223.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:606:3: integerAssigning
                    {
                    pushFollow(FOLLOW_integerAssigning_in_assigning3823);
                    integerAssigning224=integerAssigning();

                    state._fsp--;

                    adaptor.addChild(root_0, integerAssigning224.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:607:3: floatAssigning
                    {
                    pushFollow(FOLLOW_floatAssigning_in_assigning3829);
                    floatAssigning225=floatAssigning();

                    state._fsp--;

                    adaptor.addChild(root_0, floatAssigning225.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "assigning"


    public static class stringDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringDecl"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:616:1: stringDecl : 'string' ID ( stringAssigning )? ( ',' ID ( stringAssigning )? )* -> ^( StringDecl 'string' ID ( stringAssigning )? ( ',' ID ( stringAssigning )? )* ) ;
    public final Compiler_ProjectParser.stringDecl_return stringDecl() throws RecognitionException {
        Compiler_ProjectParser.stringDecl_return retval = new Compiler_ProjectParser.stringDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal226=null;
        Token ID227=null;
        Token char_literal229=null;
        Token ID230=null;
        Compiler_ProjectParser.stringAssigning_return stringAssigning228 =null;

        Compiler_ProjectParser.stringAssigning_return stringAssigning231 =null;


        Object string_literal226_tree=null;
        Object ID227_tree=null;
        Object char_literal229_tree=null;
        Object ID230_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_stringAssigning=new RewriteRuleSubtreeStream(adaptor,"rule stringAssigning");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:617:2: ( 'string' ID ( stringAssigning )? ( ',' ID ( stringAssigning )? )* -> ^( StringDecl 'string' ID ( stringAssigning )? ( ',' ID ( stringAssigning )? )* ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:617:4: 'string' ID ( stringAssigning )? ( ',' ID ( stringAssigning )? )*
            {
            string_literal226=(Token)match(input,105,FOLLOW_105_in_stringDecl3882);  
            stream_105.add(string_literal226);


            ID227=(Token)match(input,ID,FOLLOW_ID_in_stringDecl3884);  
            stream_ID.add(ID227);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:617:16: ( stringAssigning )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==79) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:617:16: stringAssigning
                    {
                    pushFollow(FOLLOW_stringAssigning_in_stringDecl3886);
                    stringAssigning228=stringAssigning();

                    state._fsp--;

                    stream_stringAssigning.add(stringAssigning228.getTree());

                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:617:33: ( ',' ID ( stringAssigning )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==71) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==ID) ) {
                        int LA49_3 = input.LA(3);

                        if ( ((LA49_3 >= 70 && LA49_3 <= 71)||(LA49_3 >= 74 && LA49_3 <= 75)||LA49_3==79) ) {
                            alt49=1;
                        }


                    }


                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:617:34: ',' ID ( stringAssigning )?
            	    {
            	    char_literal229=(Token)match(input,71,FOLLOW_71_in_stringDecl3890);  
            	    stream_71.add(char_literal229);


            	    ID230=(Token)match(input,ID,FOLLOW_ID_in_stringDecl3892);  
            	    stream_ID.add(ID230);


            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:617:41: ( stringAssigning )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==79) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:617:41: stringAssigning
            	            {
            	            pushFollow(FOLLOW_stringAssigning_in_stringDecl3894);
            	            stringAssigning231=stringAssigning();

            	            state._fsp--;

            	            stream_stringAssigning.add(stringAssigning231.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            // AST REWRITE
            // elements: 71, ID, stringAssigning, stringAssigning, 105, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 617:60: -> ^( StringDecl 'string' ID ( stringAssigning )? ( ',' ID ( stringAssigning )? )* )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:618:3: ^( StringDecl 'string' ID ( stringAssigning )? ( ',' ID ( stringAssigning )? )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(StringDecl, "StringDecl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_105.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:618:28: ( stringAssigning )?
                if ( stream_stringAssigning.hasNext() ) {
                    adaptor.addChild(root_1, stream_stringAssigning.nextTree());

                }
                stream_stringAssigning.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:618:45: ( ',' ID ( stringAssigning )? )*
                while ( stream_71.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_71.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:618:53: ( stringAssigning )?
                    if ( stream_stringAssigning.hasNext() ) {
                        adaptor.addChild(root_1, stream_stringAssigning.nextTree());

                    }
                    stream_stringAssigning.reset();

                }
                stream_71.reset();
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "stringDecl"


    public static class stringAssigning_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringAssigning"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:627:1: stringAssigning : ( '=' StringValue ) -> ^( StringAssigning '=' StringValue ) ;
    public final Compiler_ProjectParser.stringAssigning_return stringAssigning() throws RecognitionException {
        Compiler_ProjectParser.stringAssigning_return retval = new Compiler_ProjectParser.stringAssigning_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal232=null;
        Token StringValue233=null;

        Object char_literal232_tree=null;
        Object StringValue233_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_StringValue=new RewriteRuleTokenStream(adaptor,"token StringValue");

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:628:2: ( ( '=' StringValue ) -> ^( StringAssigning '=' StringValue ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:628:4: ( '=' StringValue )
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:628:4: ( '=' StringValue )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:628:5: '=' StringValue
            {
            char_literal232=(Token)match(input,79,FOLLOW_79_in_stringAssigning3975);  
            stream_79.add(char_literal232);


            StringValue233=(Token)match(input,StringValue,FOLLOW_StringValue_in_stringAssigning3977);  
            stream_StringValue.add(StringValue233);


            }


            // AST REWRITE
            // elements: StringValue, 79
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 628:22: -> ^( StringAssigning '=' StringValue )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:629:3: ^( StringAssigning '=' StringValue )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(StringAssigning, "StringAssigning")
                , root_1);

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_StringValue.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "stringAssigning"


    public static class integerDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerDecl"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:638:1: integerDecl : 'int' ID ( integerAssigning )? ( ',' ID ( integerAssigning )? )* -> ^( IntegerDecl 'int' ID ( integerAssigning )? ( ',' ID ( integerAssigning )? )* ) ;
    public final Compiler_ProjectParser.integerDecl_return integerDecl() throws RecognitionException {
        Compiler_ProjectParser.integerDecl_return retval = new Compiler_ProjectParser.integerDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal234=null;
        Token ID235=null;
        Token char_literal237=null;
        Token ID238=null;
        Compiler_ProjectParser.integerAssigning_return integerAssigning236 =null;

        Compiler_ProjectParser.integerAssigning_return integerAssigning239 =null;


        Object string_literal234_tree=null;
        Object ID235_tree=null;
        Object char_literal237_tree=null;
        Object ID238_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleSubtreeStream stream_integerAssigning=new RewriteRuleSubtreeStream(adaptor,"rule integerAssigning");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:639:2: ( 'int' ID ( integerAssigning )? ( ',' ID ( integerAssigning )? )* -> ^( IntegerDecl 'int' ID ( integerAssigning )? ( ',' ID ( integerAssigning )? )* ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:639:4: 'int' ID ( integerAssigning )? ( ',' ID ( integerAssigning )? )*
            {
            string_literal234=(Token)match(input,98,FOLLOW_98_in_integerDecl4041);  
            stream_98.add(string_literal234);


            ID235=(Token)match(input,ID,FOLLOW_ID_in_integerDecl4043);  
            stream_ID.add(ID235);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:639:13: ( integerAssigning )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==79) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:639:13: integerAssigning
                    {
                    pushFollow(FOLLOW_integerAssigning_in_integerDecl4045);
                    integerAssigning236=integerAssigning();

                    state._fsp--;

                    stream_integerAssigning.add(integerAssigning236.getTree());

                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:639:31: ( ',' ID ( integerAssigning )? )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==71) ) {
                    int LA52_2 = input.LA(2);

                    if ( (LA52_2==ID) ) {
                        int LA52_3 = input.LA(3);

                        if ( ((LA52_3 >= 70 && LA52_3 <= 71)||(LA52_3 >= 74 && LA52_3 <= 75)||LA52_3==79) ) {
                            alt52=1;
                        }


                    }


                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:639:32: ',' ID ( integerAssigning )?
            	    {
            	    char_literal237=(Token)match(input,71,FOLLOW_71_in_integerDecl4049);  
            	    stream_71.add(char_literal237);


            	    ID238=(Token)match(input,ID,FOLLOW_ID_in_integerDecl4051);  
            	    stream_ID.add(ID238);


            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:639:39: ( integerAssigning )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==79) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:639:39: integerAssigning
            	            {
            	            pushFollow(FOLLOW_integerAssigning_in_integerDecl4053);
            	            integerAssigning239=integerAssigning();

            	            state._fsp--;

            	            stream_integerAssigning.add(integerAssigning239.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            // AST REWRITE
            // elements: ID, 71, ID, 98, integerAssigning, integerAssigning
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 639:59: -> ^( IntegerDecl 'int' ID ( integerAssigning )? ( ',' ID ( integerAssigning )? )* )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:640:3: ^( IntegerDecl 'int' ID ( integerAssigning )? ( ',' ID ( integerAssigning )? )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IntegerDecl, "IntegerDecl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_98.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:640:26: ( integerAssigning )?
                if ( stream_integerAssigning.hasNext() ) {
                    adaptor.addChild(root_1, stream_integerAssigning.nextTree());

                }
                stream_integerAssigning.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:640:44: ( ',' ID ( integerAssigning )? )*
                while ( stream_71.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_71.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:640:52: ( integerAssigning )?
                    if ( stream_integerAssigning.hasNext() ) {
                        adaptor.addChild(root_1, stream_integerAssigning.nextTree());

                    }
                    stream_integerAssigning.reset();

                }
                stream_71.reset();
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "integerDecl"


    public static class integerAssigning_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerAssigning"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:649:1: integerAssigning : '=' integers ( ArithmaticOperators integers )* -> ^( IntegerAssigning '=' integers ( ArithmaticOperators integers )* ) ;
    public final Compiler_ProjectParser.integerAssigning_return integerAssigning() throws RecognitionException {
        Compiler_ProjectParser.integerAssigning_return retval = new Compiler_ProjectParser.integerAssigning_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal240=null;
        Token ArithmaticOperators242=null;
        Compiler_ProjectParser.integers_return integers241 =null;

        Compiler_ProjectParser.integers_return integers243 =null;


        Object char_literal240_tree=null;
        Object ArithmaticOperators242_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_ArithmaticOperators=new RewriteRuleTokenStream(adaptor,"token ArithmaticOperators");
        RewriteRuleSubtreeStream stream_integers=new RewriteRuleSubtreeStream(adaptor,"rule integers");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:650:2: ( '=' integers ( ArithmaticOperators integers )* -> ^( IntegerAssigning '=' integers ( ArithmaticOperators integers )* ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:650:4: '=' integers ( ArithmaticOperators integers )*
            {
            char_literal240=(Token)match(input,79,FOLLOW_79_in_integerAssigning4133);  
            stream_79.add(char_literal240);


            pushFollow(FOLLOW_integers_in_integerAssigning4135);
            integers241=integers();

            state._fsp--;

            stream_integers.add(integers241.getTree());

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:650:17: ( ArithmaticOperators integers )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==ArithmaticOperators) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:650:18: ArithmaticOperators integers
            	    {
            	    ArithmaticOperators242=(Token)match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_integerAssigning4138);  
            	    stream_ArithmaticOperators.add(ArithmaticOperators242);


            	    pushFollow(FOLLOW_integers_in_integerAssigning4140);
            	    integers243=integers();

            	    state._fsp--;

            	    stream_integers.add(integers243.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            // AST REWRITE
            // elements: 79, ArithmaticOperators, integers, integers
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 650:49: -> ^( IntegerAssigning '=' integers ( ArithmaticOperators integers )* )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:651:3: ^( IntegerAssigning '=' integers ( ArithmaticOperators integers )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IntegerAssigning, "IntegerAssigning")
                , root_1);

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_1, stream_integers.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:651:35: ( ArithmaticOperators integers )*
                while ( stream_ArithmaticOperators.hasNext()||stream_integers.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ArithmaticOperators.nextNode()
                    );

                    adaptor.addChild(root_1, stream_integers.nextTree());

                }
                stream_ArithmaticOperators.reset();
                stream_integers.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "integerAssigning"


    public static class integers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integers"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:660:1: integers : ( IntValue | ID ) ^;
    public final Compiler_ProjectParser.integers_return integers() throws RecognitionException {
        Compiler_ProjectParser.integers_return retval = new Compiler_ProjectParser.integers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set244=null;

        Object set244_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:660:9: ( ( IntValue | ID ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:660:11: ( IntValue | ID ) ^
            {
            root_0 = (Object)adaptor.nil();


            set244=(Token)input.LT(1);

            set244=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==IntValue ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set244)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "integers"


    public static class floatDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "floatDecl"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:669:1: floatDecl : 'float' ID ( floatAssigning )? ( ',' ID ( floatAssigning )? )* -> ^( FloatDecl 'float' ID ( floatAssigning )? ( ',' ID ( floatAssigning )? )* ) ;
    public final Compiler_ProjectParser.floatDecl_return floatDecl() throws RecognitionException {
        Compiler_ProjectParser.floatDecl_return retval = new Compiler_ProjectParser.floatDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal245=null;
        Token ID246=null;
        Token char_literal248=null;
        Token ID249=null;
        Compiler_ProjectParser.floatAssigning_return floatAssigning247 =null;

        Compiler_ProjectParser.floatAssigning_return floatAssigning250 =null;


        Object string_literal245_tree=null;
        Object ID246_tree=null;
        Object char_literal248_tree=null;
        Object ID249_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_floatAssigning=new RewriteRuleSubtreeStream(adaptor,"rule floatAssigning");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:670:2: ( 'float' ID ( floatAssigning )? ( ',' ID ( floatAssigning )? )* -> ^( FloatDecl 'float' ID ( floatAssigning )? ( ',' ID ( floatAssigning )? )* ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:670:4: 'float' ID ( floatAssigning )? ( ',' ID ( floatAssigning )? )*
            {
            string_literal245=(Token)match(input,94,FOLLOW_94_in_floatDecl4265);  
            stream_94.add(string_literal245);


            ID246=(Token)match(input,ID,FOLLOW_ID_in_floatDecl4267);  
            stream_ID.add(ID246);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:670:15: ( floatAssigning )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==79) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:670:15: floatAssigning
                    {
                    pushFollow(FOLLOW_floatAssigning_in_floatDecl4269);
                    floatAssigning247=floatAssigning();

                    state._fsp--;

                    stream_floatAssigning.add(floatAssigning247.getTree());

                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:670:31: ( ',' ID ( floatAssigning )? )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==71) ) {
                    int LA56_2 = input.LA(2);

                    if ( (LA56_2==ID) ) {
                        int LA56_3 = input.LA(3);

                        if ( ((LA56_3 >= 70 && LA56_3 <= 71)||(LA56_3 >= 74 && LA56_3 <= 75)||LA56_3==79) ) {
                            alt56=1;
                        }


                    }


                }


                switch (alt56) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:670:32: ',' ID ( floatAssigning )?
            	    {
            	    char_literal248=(Token)match(input,71,FOLLOW_71_in_floatDecl4273);  
            	    stream_71.add(char_literal248);


            	    ID249=(Token)match(input,ID,FOLLOW_ID_in_floatDecl4275);  
            	    stream_ID.add(ID249);


            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:670:39: ( floatAssigning )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==79) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:670:39: floatAssigning
            	            {
            	            pushFollow(FOLLOW_floatAssigning_in_floatDecl4277);
            	            floatAssigning250=floatAssigning();

            	            state._fsp--;

            	            stream_floatAssigning.add(floatAssigning250.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            // AST REWRITE
            // elements: ID, 94, floatAssigning, ID, floatAssigning, 71
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 670:57: -> ^( FloatDecl 'float' ID ( floatAssigning )? ( ',' ID ( floatAssigning )? )* )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:671:3: ^( FloatDecl 'float' ID ( floatAssigning )? ( ',' ID ( floatAssigning )? )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FloatDecl, "FloatDecl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_94.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:671:26: ( floatAssigning )?
                if ( stream_floatAssigning.hasNext() ) {
                    adaptor.addChild(root_1, stream_floatAssigning.nextTree());

                }
                stream_floatAssigning.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:671:42: ( ',' ID ( floatAssigning )? )*
                while ( stream_ID.hasNext()||stream_71.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_71.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:671:50: ( floatAssigning )?
                    if ( stream_floatAssigning.hasNext() ) {
                        adaptor.addChild(root_1, stream_floatAssigning.nextTree());

                    }
                    stream_floatAssigning.reset();

                }
                stream_ID.reset();
                stream_71.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "floatDecl"


    public static class floatAssigning_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "floatAssigning"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:680:1: floatAssigning : '=' FloatValue -> ^( FloatAssigning '=' FloatValue ) ;
    public final Compiler_ProjectParser.floatAssigning_return floatAssigning() throws RecognitionException {
        Compiler_ProjectParser.floatAssigning_return retval = new Compiler_ProjectParser.floatAssigning_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal251=null;
        Token FloatValue252=null;

        Object char_literal251_tree=null;
        Object FloatValue252_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_FloatValue=new RewriteRuleTokenStream(adaptor,"token FloatValue");

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:681:2: ( '=' FloatValue -> ^( FloatAssigning '=' FloatValue ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:681:4: '=' FloatValue
            {
            char_literal251=(Token)match(input,79,FOLLOW_79_in_floatAssigning4357);  
            stream_79.add(char_literal251);


            FloatValue252=(Token)match(input,FloatValue,FOLLOW_FloatValue_in_floatAssigning4359);  
            stream_FloatValue.add(FloatValue252);


            // AST REWRITE
            // elements: FloatValue, 79
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 681:19: -> ^( FloatAssigning '=' FloatValue )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:682:3: ^( FloatAssigning '=' FloatValue )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FloatAssigning, "FloatAssigning")
                , root_1);

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_FloatValue.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "floatAssigning"


    public static class floats_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "floats"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:691:1: floats : ( FloatValue | ID ) ^;
    public final Compiler_ProjectParser.floats_return floats() throws RecognitionException {
        Compiler_ProjectParser.floats_return retval = new Compiler_ProjectParser.floats_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set253=null;

        Object set253_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:691:8: ( ( FloatValue | ID ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:691:10: ( FloatValue | ID ) ^
            {
            root_0 = (Object)adaptor.nil();


            set253=(Token)input.LT(1);

            set253=(Token)input.LT(1);

            if ( input.LA(1)==FloatValue||input.LA(1)==ID ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set253)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "floats"


    public static class booleanDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanDecl"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:700:1: booleanDecl : 'bool' ID ( booleanAssiging )? ( ',' ID ( booleanAssiging )? )* -> ^( BooleanDecl 'bool' ID ( booleanAssiging )? ( ',' ID ( booleanAssiging )? )* ) ;
    public final Compiler_ProjectParser.booleanDecl_return booleanDecl() throws RecognitionException {
        Compiler_ProjectParser.booleanDecl_return retval = new Compiler_ProjectParser.booleanDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal254=null;
        Token ID255=null;
        Token char_literal257=null;
        Token ID258=null;
        Compiler_ProjectParser.booleanAssiging_return booleanAssiging256 =null;

        Compiler_ProjectParser.booleanAssiging_return booleanAssiging259 =null;


        Object string_literal254_tree=null;
        Object ID255_tree=null;
        Object char_literal257_tree=null;
        Object ID258_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_booleanAssiging=new RewriteRuleSubtreeStream(adaptor,"rule booleanAssiging");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:701:2: ( 'bool' ID ( booleanAssiging )? ( ',' ID ( booleanAssiging )? )* -> ^( BooleanDecl 'bool' ID ( booleanAssiging )? ( ',' ID ( booleanAssiging )? )* ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:701:4: 'bool' ID ( booleanAssiging )? ( ',' ID ( booleanAssiging )? )*
            {
            string_literal254=(Token)match(input,87,FOLLOW_87_in_booleanDecl4476);  
            stream_87.add(string_literal254);


            ID255=(Token)match(input,ID,FOLLOW_ID_in_booleanDecl4478);  
            stream_ID.add(ID255);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:701:14: ( booleanAssiging )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==79) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:701:14: booleanAssiging
                    {
                    pushFollow(FOLLOW_booleanAssiging_in_booleanDecl4480);
                    booleanAssiging256=booleanAssiging();

                    state._fsp--;

                    stream_booleanAssiging.add(booleanAssiging256.getTree());

                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:701:31: ( ',' ID ( booleanAssiging )? )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==71) ) {
                    int LA59_2 = input.LA(2);

                    if ( (LA59_2==ID) ) {
                        int LA59_3 = input.LA(3);

                        if ( ((LA59_3 >= 70 && LA59_3 <= 71)||(LA59_3 >= 74 && LA59_3 <= 75)||LA59_3==79) ) {
                            alt59=1;
                        }


                    }


                }


                switch (alt59) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:701:32: ',' ID ( booleanAssiging )?
            	    {
            	    char_literal257=(Token)match(input,71,FOLLOW_71_in_booleanDecl4484);  
            	    stream_71.add(char_literal257);


            	    ID258=(Token)match(input,ID,FOLLOW_ID_in_booleanDecl4486);  
            	    stream_ID.add(ID258);


            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:701:39: ( booleanAssiging )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==79) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:701:39: booleanAssiging
            	            {
            	            pushFollow(FOLLOW_booleanAssiging_in_booleanDecl4488);
            	            booleanAssiging259=booleanAssiging();

            	            state._fsp--;

            	            stream_booleanAssiging.add(booleanAssiging259.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            // AST REWRITE
            // elements: booleanAssiging, ID, 87, booleanAssiging, 71, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 701:58: -> ^( BooleanDecl 'bool' ID ( booleanAssiging )? ( ',' ID ( booleanAssiging )? )* )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:702:3: ^( BooleanDecl 'bool' ID ( booleanAssiging )? ( ',' ID ( booleanAssiging )? )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BooleanDecl, "BooleanDecl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_87.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:702:27: ( booleanAssiging )?
                if ( stream_booleanAssiging.hasNext() ) {
                    adaptor.addChild(root_1, stream_booleanAssiging.nextTree());

                }
                stream_booleanAssiging.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:702:44: ( ',' ID ( booleanAssiging )? )*
                while ( stream_ID.hasNext()||stream_71.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_71.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:702:52: ( booleanAssiging )?
                    if ( stream_booleanAssiging.hasNext() ) {
                        adaptor.addChild(root_1, stream_booleanAssiging.nextTree());

                    }
                    stream_booleanAssiging.reset();

                }
                stream_ID.reset();
                stream_71.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "booleanDecl"


    public static class booleanAssiging_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanAssiging"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:711:1: booleanAssiging : '=' BooleanValue -> ^( BooleanAssiging '=' BooleanValue ) ;
    public final Compiler_ProjectParser.booleanAssiging_return booleanAssiging() throws RecognitionException {
        Compiler_ProjectParser.booleanAssiging_return retval = new Compiler_ProjectParser.booleanAssiging_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal260=null;
        Token BooleanValue261=null;

        Object char_literal260_tree=null;
        Object BooleanValue261_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_BooleanValue=new RewriteRuleTokenStream(adaptor,"token BooleanValue");

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:712:2: ( '=' BooleanValue -> ^( BooleanAssiging '=' BooleanValue ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:712:4: '=' BooleanValue
            {
            char_literal260=(Token)match(input,79,FOLLOW_79_in_booleanAssiging4568);  
            stream_79.add(char_literal260);


            BooleanValue261=(Token)match(input,BooleanValue,FOLLOW_BooleanValue_in_booleanAssiging4570);  
            stream_BooleanValue.add(BooleanValue261);


            // AST REWRITE
            // elements: 79, BooleanValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 712:21: -> ^( BooleanAssiging '=' BooleanValue )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:713:3: ^( BooleanAssiging '=' BooleanValue )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BooleanAssiging, "BooleanAssiging")
                , root_1);

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_BooleanValue.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "booleanAssiging"


    public static class booleanExpressions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanExpressions"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:722:1: booleanExpressions : ( BooleanValue | ID | callingFunctions | ( '!' booleanExpressions ) | IntValue ) ^;
    public final Compiler_ProjectParser.booleanExpressions_return booleanExpressions() throws RecognitionException {
        Compiler_ProjectParser.booleanExpressions_return retval = new Compiler_ProjectParser.booleanExpressions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BooleanValue262=null;
        Token ID263=null;
        Token char_literal265=null;
        Token IntValue267=null;
        Compiler_ProjectParser.callingFunctions_return callingFunctions264 =null;

        Compiler_ProjectParser.booleanExpressions_return booleanExpressions266 =null;


        Object BooleanValue262_tree=null;
        Object ID263_tree=null;
        Object char_literal265_tree=null;
        Object IntValue267_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:723:2: ( ( BooleanValue | ID | callingFunctions | ( '!' booleanExpressions ) | IntValue ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:723:4: ( BooleanValue | ID | callingFunctions | ( '!' booleanExpressions ) | IntValue ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:723:4: ( BooleanValue | ID | callingFunctions | ( '!' booleanExpressions ) | IntValue )
            int alt60=5;
            switch ( input.LA(1) ) {
            case BooleanValue:
                {
                alt60=1;
                }
                break;
            case ID:
                {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==69||LA60_2==73) ) {
                    alt60=3;
                }
                else if ( (LA60_2==66||(LA60_2 >= 70 && LA60_2 <= 71)||(LA60_2 >= 75 && LA60_2 <= 78)||(LA60_2 >= 80 && LA60_2 <= 83)) ) {
                    alt60=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;

                }
                }
                break;
            case 65:
                {
                alt60=4;
                }
                break;
            case IntValue:
                {
                alt60=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:723:5: BooleanValue
                    {
                    BooleanValue262=(Token)match(input,BooleanValue,FOLLOW_BooleanValue_in_booleanExpressions4635); 
                    BooleanValue262_tree = 
                    (Object)adaptor.create(BooleanValue262)
                    ;
                    adaptor.addChild(root_0, BooleanValue262_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:724:3: ID
                    {
                    ID263=(Token)match(input,ID,FOLLOW_ID_in_booleanExpressions4643); 
                    ID263_tree = 
                    (Object)adaptor.create(ID263)
                    ;
                    adaptor.addChild(root_0, ID263_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:725:3: callingFunctions
                    {
                    pushFollow(FOLLOW_callingFunctions_in_booleanExpressions4653);
                    callingFunctions264=callingFunctions();

                    state._fsp--;

                    adaptor.addChild(root_0, callingFunctions264.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:726:3: ( '!' booleanExpressions )
                    {
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:726:3: ( '!' booleanExpressions )
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:726:4: '!' booleanExpressions
                    {
                    char_literal265=(Token)match(input,65,FOLLOW_65_in_booleanExpressions4662); 
                    char_literal265_tree = 
                    (Object)adaptor.create(char_literal265)
                    ;
                    adaptor.addChild(root_0, char_literal265_tree);


                    pushFollow(FOLLOW_booleanExpressions_in_booleanExpressions4664);
                    booleanExpressions266=booleanExpressions();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanExpressions266.getTree());

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:727:3: IntValue
                    {
                    IntValue267=(Token)match(input,IntValue,FOLLOW_IntValue_in_booleanExpressions4671); 
                    IntValue267_tree = 
                    (Object)adaptor.create(IntValue267)
                    ;
                    adaptor.addChild(root_0, IntValue267_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "booleanExpressions"


    public static class booleans_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleans"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:736:1: booleans : booleanExpressions ( comparisonOperators booleanExpressions )? -> ^( Booleans booleanExpressions ( comparisonOperators booleanExpressions )? ) ;
    public final Compiler_ProjectParser.booleans_return booleans() throws RecognitionException {
        Compiler_ProjectParser.booleans_return retval = new Compiler_ProjectParser.booleans_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Compiler_ProjectParser.booleanExpressions_return booleanExpressions268 =null;

        Compiler_ProjectParser.comparisonOperators_return comparisonOperators269 =null;

        Compiler_ProjectParser.booleanExpressions_return booleanExpressions270 =null;


        RewriteRuleSubtreeStream stream_comparisonOperators=new RewriteRuleSubtreeStream(adaptor,"rule comparisonOperators");
        RewriteRuleSubtreeStream stream_booleanExpressions=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpressions");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:737:2: ( booleanExpressions ( comparisonOperators booleanExpressions )? -> ^( Booleans booleanExpressions ( comparisonOperators booleanExpressions )? ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:737:4: booleanExpressions ( comparisonOperators booleanExpressions )?
            {
            pushFollow(FOLLOW_booleanExpressions_in_booleans4726);
            booleanExpressions268=booleanExpressions();

            state._fsp--;

            stream_booleanExpressions.add(booleanExpressions268.getTree());

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:737:23: ( comparisonOperators booleanExpressions )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==66||LA61_0==76||LA61_0==78||(LA61_0 >= 80 && LA61_0 <= 82)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:737:24: comparisonOperators booleanExpressions
                    {
                    pushFollow(FOLLOW_comparisonOperators_in_booleans4729);
                    comparisonOperators269=comparisonOperators();

                    state._fsp--;

                    stream_comparisonOperators.add(comparisonOperators269.getTree());

                    pushFollow(FOLLOW_booleanExpressions_in_booleans4731);
                    booleanExpressions270=booleanExpressions();

                    state._fsp--;

                    stream_booleanExpressions.add(booleanExpressions270.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: booleanExpressions, comparisonOperators, booleanExpressions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 737:65: -> ^( Booleans booleanExpressions ( comparisonOperators booleanExpressions )? )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:738:3: ^( Booleans booleanExpressions ( comparisonOperators booleanExpressions )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Booleans, "Booleans")
                , root_1);

                adaptor.addChild(root_1, stream_booleanExpressions.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:738:33: ( comparisonOperators booleanExpressions )?
                if ( stream_comparisonOperators.hasNext()||stream_booleanExpressions.hasNext() ) {
                    adaptor.addChild(root_1, stream_comparisonOperators.nextTree());

                    adaptor.addChild(root_1, stream_booleanExpressions.nextTree());

                }
                stream_comparisonOperators.reset();
                stream_booleanExpressions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "booleans"


    public static class vectorDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vectorDecl"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:747:1: vectorDecl : 'vector' '<' dataTypes '>' ID -> ^( VectorDecl 'vector' '<' dataTypes '>' ) ;
    public final Compiler_ProjectParser.vectorDecl_return vectorDecl() throws RecognitionException {
        Compiler_ProjectParser.vectorDecl_return retval = new Compiler_ProjectParser.vectorDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal271=null;
        Token char_literal272=null;
        Token char_literal274=null;
        Token ID275=null;
        Compiler_ProjectParser.dataTypes_return dataTypes273 =null;


        Object string_literal271_tree=null;
        Object char_literal272_tree=null;
        Object char_literal274_tree=null;
        Object ID275_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_dataTypes=new RewriteRuleSubtreeStream(adaptor,"rule dataTypes");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:748:2: ( 'vector' '<' dataTypes '>' ID -> ^( VectorDecl 'vector' '<' dataTypes '>' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:748:4: 'vector' '<' dataTypes '>' ID
            {
            string_literal271=(Token)match(input,108,FOLLOW_108_in_vectorDecl4801);  
            stream_108.add(string_literal271);


            char_literal272=(Token)match(input,76,FOLLOW_76_in_vectorDecl4803);  
            stream_76.add(char_literal272);


            pushFollow(FOLLOW_dataTypes_in_vectorDecl4805);
            dataTypes273=dataTypes();

            state._fsp--;

            stream_dataTypes.add(dataTypes273.getTree());

            char_literal274=(Token)match(input,81,FOLLOW_81_in_vectorDecl4807);  
            stream_81.add(char_literal274);


            ID275=(Token)match(input,ID,FOLLOW_ID_in_vectorDecl4809);  
            stream_ID.add(ID275);


            // AST REWRITE
            // elements: 108, 81, dataTypes, 76
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 748:34: -> ^( VectorDecl 'vector' '<' dataTypes '>' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:749:3: ^( VectorDecl 'vector' '<' dataTypes '>' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VectorDecl, "VectorDecl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_108.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_76.nextNode()
                );

                adaptor.addChild(root_1, stream_dataTypes.nextTree());

                adaptor.addChild(root_1, 
                stream_81.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "vectorDecl"


    public static class autoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "autoDecl"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:758:1: autoDecl : 'auto' ID '=' callingFunctions -> ^( AutoDecl 'auto' ID '=' callingFunctions ) ;
    public final Compiler_ProjectParser.autoDecl_return autoDecl() throws RecognitionException {
        Compiler_ProjectParser.autoDecl_return retval = new Compiler_ProjectParser.autoDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal276=null;
        Token ID277=null;
        Token char_literal278=null;
        Compiler_ProjectParser.callingFunctions_return callingFunctions279 =null;


        Object string_literal276_tree=null;
        Object ID277_tree=null;
        Object char_literal278_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_callingFunctions=new RewriteRuleSubtreeStream(adaptor,"rule callingFunctions");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:759:2: ( 'auto' ID '=' callingFunctions -> ^( AutoDecl 'auto' ID '=' callingFunctions ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:759:4: 'auto' ID '=' callingFunctions
            {
            string_literal276=(Token)match(input,86,FOLLOW_86_in_autoDecl4876);  
            stream_86.add(string_literal276);


            ID277=(Token)match(input,ID,FOLLOW_ID_in_autoDecl4878);  
            stream_ID.add(ID277);


            char_literal278=(Token)match(input,79,FOLLOW_79_in_autoDecl4880);  
            stream_79.add(char_literal278);


            pushFollow(FOLLOW_callingFunctions_in_autoDecl4882);
            callingFunctions279=callingFunctions();

            state._fsp--;

            stream_callingFunctions.add(callingFunctions279.getTree());

            // AST REWRITE
            // elements: 79, 86, ID, callingFunctions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 759:35: -> ^( AutoDecl 'auto' ID '=' callingFunctions )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:760:3: ^( AutoDecl 'auto' ID '=' callingFunctions )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(AutoDecl, "AutoDecl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_86.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                adaptor.addChild(root_1, stream_callingFunctions.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "autoDecl"


    public static class objectDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objectDecl"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:769:1: objectDecl : ID ( '&' )? ID ( '(' arguments ')' )? -> ^( ObjectDecl ID ( '&' )? ID ( '(' arguments ')' )? ) ;
    public final Compiler_ProjectParser.objectDecl_return objectDecl() throws RecognitionException {
        Compiler_ProjectParser.objectDecl_return retval = new Compiler_ProjectParser.objectDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID280=null;
        Token char_literal281=null;
        Token ID282=null;
        Token char_literal283=null;
        Token char_literal285=null;
        Compiler_ProjectParser.arguments_return arguments284 =null;


        Object ID280_tree=null;
        Object char_literal281_tree=null;
        Object ID282_tree=null;
        Object char_literal283_tree=null;
        Object char_literal285_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:770:2: ( ID ( '&' )? ID ( '(' arguments ')' )? -> ^( ObjectDecl ID ( '&' )? ID ( '(' arguments ')' )? ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:770:4: ID ( '&' )? ID ( '(' arguments ')' )?
            {
            ID280=(Token)match(input,ID,FOLLOW_ID_in_objectDecl4949);  
            stream_ID.add(ID280);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:770:7: ( '&' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==68) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:770:7: '&'
                    {
                    char_literal281=(Token)match(input,68,FOLLOW_68_in_objectDecl4951);  
                    stream_68.add(char_literal281);


                    }
                    break;

            }


            ID282=(Token)match(input,ID,FOLLOW_ID_in_objectDecl4954);  
            stream_ID.add(ID282);


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:770:15: ( '(' arguments ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==69) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:770:16: '(' arguments ')'
                    {
                    char_literal283=(Token)match(input,69,FOLLOW_69_in_objectDecl4957);  
                    stream_69.add(char_literal283);


                    pushFollow(FOLLOW_arguments_in_objectDecl4959);
                    arguments284=arguments();

                    state._fsp--;

                    stream_arguments.add(arguments284.getTree());

                    char_literal285=(Token)match(input,70,FOLLOW_70_in_objectDecl4961);  
                    stream_70.add(char_literal285);


                    }
                    break;

            }


            // AST REWRITE
            // elements: 70, ID, 68, arguments, ID, 69
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 770:36: -> ^( ObjectDecl ID ( '&' )? ID ( '(' arguments ')' )? )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:771:3: ^( ObjectDecl ID ( '&' )? ID ( '(' arguments ')' )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ObjectDecl, "ObjectDecl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:771:19: ( '&' )?
                if ( stream_68.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_68.nextNode()
                    );

                }
                stream_68.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:771:27: ( '(' arguments ')' )?
                if ( stream_70.hasNext()||stream_arguments.hasNext()||stream_69.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_69.nextNode()
                    );

                    adaptor.addChild(root_1, stream_arguments.nextTree());

                    adaptor.addChild(root_1, 
                    stream_70.nextNode()
                    );

                }
                stream_70.reset();
                stream_arguments.reset();
                stream_69.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "objectDecl"


    public static class callingFunctions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callingFunctions"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:780:1: callingFunctions : ( ID '.' )? ID '(' arguments ')' -> ^( CallingFunctions ( ID '.' )? ID '(' arguments ')' ) ;
    public final Compiler_ProjectParser.callingFunctions_return callingFunctions() throws RecognitionException {
        Compiler_ProjectParser.callingFunctions_return retval = new Compiler_ProjectParser.callingFunctions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID286=null;
        Token char_literal287=null;
        Token ID288=null;
        Token char_literal289=null;
        Token char_literal291=null;
        Compiler_ProjectParser.arguments_return arguments290 =null;


        Object ID286_tree=null;
        Object char_literal287_tree=null;
        Object ID288_tree=null;
        Object char_literal289_tree=null;
        Object char_literal291_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:781:2: ( ( ID '.' )? ID '(' arguments ')' -> ^( CallingFunctions ( ID '.' )? ID '(' arguments ')' ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:781:4: ( ID '.' )? ID '(' arguments ')'
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:781:4: ( ID '.' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==73) ) {
                    alt64=1;
                }
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:781:5: ID '.'
                    {
                    ID286=(Token)match(input,ID,FOLLOW_ID_in_callingFunctions5039);  
                    stream_ID.add(ID286);


                    char_literal287=(Token)match(input,73,FOLLOW_73_in_callingFunctions5041);  
                    stream_73.add(char_literal287);


                    }
                    break;

            }


            ID288=(Token)match(input,ID,FOLLOW_ID_in_callingFunctions5045);  
            stream_ID.add(ID288);


            char_literal289=(Token)match(input,69,FOLLOW_69_in_callingFunctions5047);  
            stream_69.add(char_literal289);


            pushFollow(FOLLOW_arguments_in_callingFunctions5049);
            arguments290=arguments();

            state._fsp--;

            stream_arguments.add(arguments290.getTree());

            char_literal291=(Token)match(input,70,FOLLOW_70_in_callingFunctions5051);  
            stream_70.add(char_literal291);


            // AST REWRITE
            // elements: ID, ID, arguments, 70, 69, 73
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 781:35: -> ^( CallingFunctions ( ID '.' )? ID '(' arguments ')' )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:782:3: ^( CallingFunctions ( ID '.' )? ID '(' arguments ')' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CallingFunctions, "CallingFunctions")
                , root_1);

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:782:22: ( ID '.' )?
                if ( stream_ID.hasNext()||stream_73.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_73.nextNode()
                    );

                }
                stream_ID.reset();
                stream_73.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_69.nextNode()
                );

                adaptor.addChild(root_1, stream_arguments.nextTree());

                adaptor.addChild(root_1, 
                stream_70.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "callingFunctions"


    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:791:1: arguments : ( values )? ( ',' values )* -> ^( Arguments ( values )? ( ',' values )* ) ;
    public final Compiler_ProjectParser.arguments_return arguments() throws RecognitionException {
        Compiler_ProjectParser.arguments_return retval = new Compiler_ProjectParser.arguments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal293=null;
        Compiler_ProjectParser.values_return values292 =null;

        Compiler_ProjectParser.values_return values294 =null;


        Object char_literal293_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"rule values");
        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:792:2: ( ( values )? ( ',' values )* -> ^( Arguments ( values )? ( ',' values )* ) )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:792:4: ( values )? ( ',' values )*
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:792:4: ( values )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==BooleanValue||LA65_0==FloatValue||LA65_0==ID||LA65_0==IntValue||LA65_0==StringValue||LA65_0==84||LA65_0==111) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:792:4: values
                    {
                    pushFollow(FOLLOW_values_in_arguments5125);
                    values292=values();

                    state._fsp--;

                    stream_values.add(values292.getTree());

                    }
                    break;

            }


            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:792:12: ( ',' values )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==71) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:792:13: ',' values
            	    {
            	    char_literal293=(Token)match(input,71,FOLLOW_71_in_arguments5129);  
            	    stream_71.add(char_literal293);


            	    pushFollow(FOLLOW_values_in_arguments5131);
            	    values294=values();

            	    state._fsp--;

            	    stream_values.add(values294.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            // AST REWRITE
            // elements: 71, values, values
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 792:26: -> ^( Arguments ( values )? ( ',' values )* )
            {
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:793:3: ^( Arguments ( values )? ( ',' values )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Arguments, "Arguments")
                , root_1);

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:793:15: ( values )?
                if ( stream_values.hasNext() ) {
                    adaptor.addChild(root_1, stream_values.nextTree());

                }
                stream_values.reset();

                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:793:23: ( ',' values )*
                while ( stream_71.hasNext()||stream_values.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_71.nextNode()
                    );

                    adaptor.addChild(root_1, stream_values.nextTree());

                }
                stream_71.reset();
                stream_values.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class dataTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dataTypes"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:802:1: dataTypes : ( ID | 'int' | 'float' | 'string' | 'bool' ) ^;
    public final Compiler_ProjectParser.dataTypes_return dataTypes() throws RecognitionException {
        Compiler_ProjectParser.dataTypes_return retval = new Compiler_ProjectParser.dataTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set295=null;

        Object set295_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:802:10: ( ( ID | 'int' | 'float' | 'string' | 'bool' ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:802:12: ( ID | 'int' | 'float' | 'string' | 'bool' ) ^
            {
            root_0 = (Object)adaptor.nil();


            set295=(Token)input.LT(1);

            set295=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==87||input.LA(1)==94||input.LA(1)==98||input.LA(1)==105 ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set295)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "dataTypes"


    public static class comparisonOperators_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisonOperators"
    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:811:1: comparisonOperators : ( '==' | '<=' | '>=' | '!=' | '>' | '<' ) ^;
    public final Compiler_ProjectParser.comparisonOperators_return comparisonOperators() throws RecognitionException {
        Compiler_ProjectParser.comparisonOperators_return retval = new Compiler_ProjectParser.comparisonOperators_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set296=null;

        Object set296_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:811:20: ( ( '==' | '<=' | '>=' | '!=' | '>' | '<' ) ^)
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:811:22: ( '==' | '<=' | '>=' | '!=' | '>' | '<' ) ^
            {
            root_0 = (Object)adaptor.nil();


            set296=(Token)input.LT(1);

            set296=(Token)input.LT(1);

            if ( input.LA(1)==66||input.LA(1)==76||input.LA(1)==78||(input.LA(1) >= 80 && input.LA(1) <= 82) ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set296)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "comparisonOperators"

    // Delegated rules


 

    public static final BitSet FOLLOW_includeStmt_in_program172 = new BitSet(new long[]{0x0000000000000000L,0x0000080004000008L});
    public static final BitSet FOLLOW_usingNameSpaceStmt_in_program175 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_classDeclaration_in_program177 = new BitSet(new long[]{0x0000000000000000L,0x0000000404000000L});
    public static final BitSet FOLLOW_mainFunctionDeclaration_in_program180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_mainFunctionDeclaration245 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_mainFunctionDeclaration247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_mainFunctionDeclaration249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_mainFunctionDeclaration251 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_mainFunctionDeclaration253 = new BitSet(new long[]{0x0000000400100000L,0x00015685C8C00000L});
    public static final BitSet FOLLOW_stmts_in_mainFunctionDeclaration255 = new BitSet(new long[]{0x0000000400100000L,0x00015685C8C00000L});
    public static final BitSet FOLLOW_returnStmt_in_mainFunctionDeclaration259 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_mainFunctionDeclaration263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_returnStmt338 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IntValue_in_returnStmt340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_returnStmt342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_classDeclaration401 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_classDeclaration403 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_classDeclaration405 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_classDeclaration407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_classDeclaration409 = new BitSet(new long[]{0x0000000400000000L,0x0000124448C00000L});
    public static final BitSet FOLLOW_declarationWith_in_classDeclaration411 = new BitSet(new long[]{0x0000000400000000L,0x0000124448C00000L});
    public static final BitSet FOLLOW_102_in_classDeclaration414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_classDeclaration416 = new BitSet(new long[]{0x0000000400000000L,0x0001320448C00000L});
    public static final BitSet FOLLOW_publicValues_in_classDeclaration418 = new BitSet(new long[]{0x0000000400000000L,0x0001320448C00000L});
    public static final BitSet FOLLOW_112_in_classDeclaration421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_classDeclaration423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationWith_in_publicValues504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_publicValues511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorDecl_in_publicValues519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_constructorDecl571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_constructorDecl573 = new BitSet(new long[]{0x0000000400000000L,0x0000120448C000C0L});
    public static final BitSet FOLLOW_parameters_in_constructorDecl575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_constructorDecl577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_constructorDecl579 = new BitSet(new long[]{0x0000000400000000L,0x0000800000000080L});
    public static final BitSet FOLLOW_callingFunctions_in_constructorDecl581 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000080L});
    public static final BitSet FOLLOW_71_in_constructorDecl585 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_callingFunctions_in_constructorDecl587 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000080L});
    public static final BitSet FOLLOW_111_in_constructorDecl591 = new BitSet(new long[]{0x0000000000000000L,0x0001000000008000L});
    public static final BitSet FOLLOW_assigningWith_in_constructorDecl593 = new BitSet(new long[]{0x0000000000000000L,0x0001000000008000L});
    public static final BitSet FOLLOW_112_in_constructorDecl596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDataTypes_in_functionDeclaration679 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionParameters_in_functionDeclaration683 = new BitSet(new long[]{0x0000000000000000L,0x0000800008000000L});
    public static final BitSet FOLLOW_91_in_functionDeclaration685 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_functionBody758 = new BitSet(new long[]{0x0000000400100000L,0x00015685C8C00000L});
    public static final BitSet FOLLOW_stmts_in_functionBody760 = new BitSet(new long[]{0x0000000400100000L,0x00015685C8C00000L});
    public static final BitSet FOLLOW_103_in_functionBody764 = new BitSet(new long[]{0x0020008410001000L,0x0000800000100000L});
    public static final BitSet FOLLOW_values_in_functionBody766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_functionBody768 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_functionBody772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_functionParameters844 = new BitSet(new long[]{0x0000000400000000L,0x0000120448C000C0L});
    public static final BitSet FOLLOW_parameters_in_functionParameters846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_functionParameters848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataTypes_in_functionDataTypes911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_functionDataTypes917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputStmt_in_stmts967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputStmt_in_stmts975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStmt_in_stmts984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationWith_in_stmts994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callingFunctions_in_stmts1003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_stmts1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stmts1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_assigningWith_in_stmts1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_stmts1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forLoopStmt_in_stmts1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileLoopStmt_in_stmts1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comment_in_stmts1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointerMemberFunctionCall_in_stmts1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_whileLoopStmt1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_whileLoopCondition_in_whileLoopStmt1118 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_whileLoopBody_in_whileLoopStmt1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_whileLoopBody1181 = new BitSet(new long[]{0x0000000400100000L,0x00015605C8C00000L});
    public static final BitSet FOLLOW_stmts_in_whileLoopBody1183 = new BitSet(new long[]{0x0000000400100000L,0x00015605C8C00000L});
    public static final BitSet FOLLOW_112_in_whileLoopBody1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_whileLoopCondition1250 = new BitSet(new long[]{0x0000008400001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_whileLoopConditionExpr_in_whileLoopCondition1252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_whileLoopCondition1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleans_in_whileLoopConditionExpr1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_whileLoopConditionExpr1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_whileLoopConditionExpr1323 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_whileLoopConditionExpr1325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_95_in_forLoopStmt1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_forLoopStmt1378 = new BitSet(new long[]{0x0000000400000000L,0x0000120448C00000L});
    public static final BitSet FOLLOW_forLoopBrackets_in_forLoopStmt1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_forLoopStmt1382 = new BitSet(new long[]{0x0000000400100000L,0x0000D605C8C00000L});
    public static final BitSet FOLLOW_forBody_in_forLoopStmt1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_forBody1452 = new BitSet(new long[]{0x0000000400100000L,0x00015605C8C00000L});
    public static final BitSet FOLLOW_stmts_in_forBody1454 = new BitSet(new long[]{0x0000000400100000L,0x00015605C8C00000L});
    public static final BitSet FOLLOW_112_in_forBody1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmts_in_forBody1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationWithout_in_forLoopBrackets1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_forLoopBracketsOptions_in_forLoopBrackets1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_forLoopBracketsOptions1583 = new BitSet(new long[]{0x0000008400001000L,0x0000000000000802L});
    public static final BitSet FOLLOW_booleans_in_forLoopBracketsOptions1585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_forLoopBracketsOptions1588 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_changing_in_forLoopBracketsOptions1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_forLoopBracketsOptions1597 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_forLoopBracketsOptions1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changingByVariable_in_changing1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changingByOne_in_changing1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_changingByVariable1707 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AssignmentOperators_in_changingByVariable1709 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_changingRate_in_changingByVariable1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_changingRate1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_changingByOne1828 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AssignmentAutoOperators_in_changingByOne1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_switchStmt1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_switchExpression_in_switchStmt1891 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_switchBody_in_switchStmt1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_switchBody1954 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_switchCase_in_switchBody1962 = new BitSet(new long[]{0x0000000000000000L,0x0001008013000000L});
    public static final BitSet FOLLOW_breakStmt_in_switchBody1964 = new BitSet(new long[]{0x0000000000000000L,0x0001008012000000L});
    public static final BitSet FOLLOW_103_in_switchBody1968 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_switchCaseValues_in_switchBody1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_switchBody1972 = new BitSet(new long[]{0x0000000000000000L,0x0001000012000000L});
    public static final BitSet FOLLOW_switchDefault_in_switchBody1982 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_switchBody1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_switchExpression2081 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_switchExpression2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_switchExpression2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_switchCase2144 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_switchCaseValues_in_switchCase2146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_switchCase2149 = new BitSet(new long[]{0x0000000400000000L,0x0000120448C00000L});
    public static final BitSet FOLLOW_switchInnerStmts_in_switchCase2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_switchDefault2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_switchDefault2219 = new BitSet(new long[]{0x0000000400000000L,0x0000120448C00000L});
    public static final BitSet FOLLOW_switchInnerStmts_in_switchDefault2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_breakStmt2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_breakStmt2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_switchCaseValues2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputStmt_in_switchInnerStmts2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outputStmt_in_switchInnerStmts2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationWith_in_switchInnerStmts2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callingFunctions_in_switchInnerStmts2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_switchInnerStmts2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_switchInnerStmts2447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_assigningWith_in_switchInnerStmts2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBody_in_ifStmt2498 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_elseBody_in_ifStmt2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ifBody2560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_conditionBrackets_in_ifBody2562 = new BitSet(new long[]{0x0000000400100000L,0x0000D605C8C00000L});
    public static final BitSet FOLLOW_bodyExpression_in_ifBody2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_elseBody2623 = new BitSet(new long[]{0x0000000400100000L,0x0000D605C8C00000L});
    public static final BitSet FOLLOW_bodyExpression_in_elseBody2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_bodyExpression2684 = new BitSet(new long[]{0x0000000400100000L,0x00015685C8C00000L});
    public static final BitSet FOLLOW_stmts_in_bodyExpression2686 = new BitSet(new long[]{0x0000000400100000L,0x00015685C8C00000L});
    public static final BitSet FOLLOW_103_in_bodyExpression2690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_bodyExpression2692 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_bodyExpression2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmts_in_bodyExpression2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_conditionBrackets2746 = new BitSet(new long[]{0x0000008400001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_booleans_in_conditionBrackets2748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_conditionBrackets2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_inputStmt2810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_inputStmt2812 = new BitSet(new long[]{0x0020008410001000L,0x0000800000100000L});
    public static final BitSet FOLLOW_values_in_inputStmt2814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_83_in_inputStmt2817 = new BitSet(new long[]{0x0020008410001000L,0x0000800000100000L});
    public static final BitSet FOLLOW_values_in_inputStmt2819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_75_in_inputStmt2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_outputStmt2891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_outputStmt2893 = new BitSet(new long[]{0x0020008410001000L,0x0000800000100000L});
    public static final BitSet FOLLOW_values_in_outputStmt2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_77_in_outputStmt2898 = new BitSet(new long[]{0x0020008410001000L,0x0000800000100000L});
    public static final BitSet FOLLOW_values_in_outputStmt2900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_75_in_outputStmt2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pointerMemberFunctionCall2974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_pointerMemberFunctionCall2976 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_callingFunctions_in_pointerMemberFunctionCall2978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_pointerMemberFunctionCall2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_lambdaFunction3041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200010L});
    public static final BitSet FOLLOW_68_in_lambdaFunction3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_lambdaFunction3046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_lambdaFunction3048 = new BitSet(new long[]{0x0000000400000000L,0x0000120448C000C0L});
    public static final BitSet FOLLOW_parameters_in_lambdaFunction3050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_lambdaFunction3052 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_lambdaFunction3054 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_lambdaFunction3056 = new BitSet(new long[]{0x0020008410001000L,0x0000800000100000L});
    public static final BitSet FOLLOW_values_in_lambdaFunction3058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_lambdaFunction3060 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_lambdaFunction3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationWithout_in_parameters3138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_parameters3142 = new BitSet(new long[]{0x0000000400000000L,0x0000120448C00000L});
    public static final BitSet FOLLOW_declarationWithout_in_parameters3144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_107_in_usingNameSpaceStmt3210 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_usingNameSpaceStmt3212 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_usingNameSpaceStmt3214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_usingNameSpaceStmt3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_includeStmt3284 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_includeStmt3286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_includeStmt3288 = new BitSet(new long[]{0x0000000400000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_possibleLibraries_in_includeStmt3290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_includeStmt3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_possibleLibraries3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationWithout_in_declarationWith3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_declarationWith3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_declarationWithout3470 = new BitSet(new long[]{0x0000000400000000L,0x0000120440C00000L});
    public static final BitSet FOLLOW_declarations_in_declarationWithout3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringDecl_in_declarations3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerDecl_in_declarations3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatDecl_in_declarations3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanDecl_in_declarations3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_autoDecl_in_declarations3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vectorDecl_in_declarations3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectDecl_in_declarations3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BooleanValue_in_values3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integers_in_values3638 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_values3641 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_integers_in_values3643 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_floats_in_values3654 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_values3657 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_floats_in_values3659 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_callingFunctions_in_values3670 = new BitSet(new long[]{0x0000000000000002L,0x0000000000075004L});
    public static final BitSet FOLLOW_comparisonOperators_in_values3673 = new BitSet(new long[]{0x0000008400001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpressions_in_values3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringValue_in_values3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaFunction_in_values3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_values3698 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_values3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigning_in_assigningWith3747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_assigningWith3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringAssigning_in_assigning3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanAssiging_in_assigning3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerAssigning_in_assigning3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatAssigning_in_assigning3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_stringDecl3882 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_stringDecl3884 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008080L});
    public static final BitSet FOLLOW_stringAssigning_in_stringDecl3886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_stringDecl3890 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_stringDecl3892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008080L});
    public static final BitSet FOLLOW_stringAssigning_in_stringDecl3894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_79_in_stringAssigning3975 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_StringValue_in_stringAssigning3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_integerDecl4041 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_integerDecl4043 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008080L});
    public static final BitSet FOLLOW_integerAssigning_in_integerDecl4045 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_integerDecl4049 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_integerDecl4051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008080L});
    public static final BitSet FOLLOW_integerAssigning_in_integerDecl4053 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_79_in_integerAssigning4133 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_integers_in_integerAssigning4135 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_integerAssigning4138 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_integers_in_integerAssigning4140 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_set_in_integers4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_floatDecl4265 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_floatDecl4267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008080L});
    public static final BitSet FOLLOW_floatAssigning_in_floatDecl4269 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_floatDecl4273 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_floatDecl4275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008080L});
    public static final BitSet FOLLOW_floatAssigning_in_floatDecl4277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_79_in_floatAssigning4357 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FloatValue_in_floatAssigning4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_floats4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_booleanDecl4476 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_booleanDecl4478 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008080L});
    public static final BitSet FOLLOW_booleanAssiging_in_booleanDecl4480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_booleanDecl4484 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_booleanDecl4486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008080L});
    public static final BitSet FOLLOW_booleanAssiging_in_booleanDecl4488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_79_in_booleanAssiging4568 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_BooleanValue_in_booleanAssiging4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BooleanValue_in_booleanExpressions4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_booleanExpressions4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callingFunctions_in_booleanExpressions4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_booleanExpressions4662 = new BitSet(new long[]{0x0000008400001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpressions_in_booleanExpressions4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntValue_in_booleanExpressions4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpressions_in_booleans4726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000075004L});
    public static final BitSet FOLLOW_comparisonOperators_in_booleans4729 = new BitSet(new long[]{0x0000008400001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_booleanExpressions_in_booleans4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_vectorDecl4801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_vectorDecl4803 = new BitSet(new long[]{0x0000000400000000L,0x0000020440800000L});
    public static final BitSet FOLLOW_dataTypes_in_vectorDecl4805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_vectorDecl4807 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_vectorDecl4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_autoDecl4876 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_autoDecl4878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_autoDecl4880 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_callingFunctions_in_autoDecl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_objectDecl4949 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_objectDecl4951 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_objectDecl4954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_objectDecl4957 = new BitSet(new long[]{0x0020008410001000L,0x00008000001000C0L});
    public static final BitSet FOLLOW_arguments_in_objectDecl4959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_objectDecl4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callingFunctions5039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_callingFunctions5041 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_callingFunctions5045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_callingFunctions5047 = new BitSet(new long[]{0x0020008410001000L,0x00008000001000C0L});
    public static final BitSet FOLLOW_arguments_in_callingFunctions5049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_callingFunctions5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_values_in_arguments5125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_arguments5129 = new BitSet(new long[]{0x0020008410001000L,0x0000800000100000L});
    public static final BitSet FOLLOW_values_in_arguments5131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_set_in_dataTypes5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparisonOperators5264 = new BitSet(new long[]{0x0000000000000002L});

}