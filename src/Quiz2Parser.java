// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g 2025-08-27 15:49:19

import org.antlr.runtime.*;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Quiz2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "LogicalAnd", "LogicalImplies", "LogicalOr", "Run", "WS", "'('", "')'", "'AND'", "'IMPLIES'", "'NOT'", "'OR'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int ID=4;
    public static final int LogicalAnd=5;
    public static final int LogicalImplies=6;
    public static final int LogicalOr=7;
    public static final int Run=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Quiz2Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Quiz2Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return Quiz2Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g"; }


    String s="";


    public static class run_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "run"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:13:1: run : logicalImplies -> ^( Run logicalImplies ) ;
    public final Quiz2Parser.run_return run() throws RecognitionException {
        Quiz2Parser.run_return retval = new Quiz2Parser.run_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Quiz2Parser.logicalImplies_return logicalImplies1 =null;


        RewriteRuleSubtreeStream stream_logicalImplies=new RewriteRuleSubtreeStream(adaptor,"rule logicalImplies");
        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:13:5: ( logicalImplies -> ^( Run logicalImplies ) )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:13:7: logicalImplies
            {
            pushFollow(FOLLOW_logicalImplies_in_run38);
            logicalImplies1=logicalImplies();

            state._fsp--;

            stream_logicalImplies.add(logicalImplies1.getTree());

            // AST REWRITE
            // elements: logicalImplies
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 13:22: -> ^( Run logicalImplies )
            {
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:13:25: ^( Run logicalImplies )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Run, "Run")
                , root_1);

                adaptor.addChild(root_1, stream_logicalImplies.nextTree());

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
    // $ANTLR end "run"


    public static class logicalImplies_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalImplies"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:22:1: logicalImplies : logicalOr ( 'IMPLIES' logicalImplies )? -> ^( LogicalImplies logicalOr ( 'IMPLIES' logicalImplies )? ) ;
    public final Quiz2Parser.logicalImplies_return logicalImplies() throws RecognitionException {
        Quiz2Parser.logicalImplies_return retval = new Quiz2Parser.logicalImplies_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal3=null;
        Quiz2Parser.logicalOr_return logicalOr2 =null;

        Quiz2Parser.logicalImplies_return logicalImplies4 =null;


        Object string_literal3_tree=null;
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleSubtreeStream stream_logicalImplies=new RewriteRuleSubtreeStream(adaptor,"rule logicalImplies");
        RewriteRuleSubtreeStream stream_logicalOr=new RewriteRuleSubtreeStream(adaptor,"rule logicalOr");
        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:23:2: ( logicalOr ( 'IMPLIES' logicalImplies )? -> ^( LogicalImplies logicalOr ( 'IMPLIES' logicalImplies )? ) )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:23:4: logicalOr ( 'IMPLIES' logicalImplies )?
            {
            pushFollow(FOLLOW_logicalOr_in_logicalImplies93);
            logicalOr2=logicalOr();

            state._fsp--;

            stream_logicalOr.add(logicalOr2.getTree());

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:23:14: ( 'IMPLIES' logicalImplies )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:23:15: 'IMPLIES' logicalImplies
                    {
                    string_literal3=(Token)match(input,13,FOLLOW_13_in_logicalImplies96);  
                    stream_13.add(string_literal3);


                    pushFollow(FOLLOW_logicalImplies_in_logicalImplies98);
                    logicalImplies4=logicalImplies();

                    state._fsp--;

                    stream_logicalImplies.add(logicalImplies4.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: logicalOr, logicalImplies, 13
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 23:42: -> ^( LogicalImplies logicalOr ( 'IMPLIES' logicalImplies )? )
            {
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:24:3: ^( LogicalImplies logicalOr ( 'IMPLIES' logicalImplies )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LogicalImplies, "LogicalImplies")
                , root_1);

                adaptor.addChild(root_1, stream_logicalOr.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:24:30: ( 'IMPLIES' logicalImplies )?
                if ( stream_logicalImplies.hasNext()||stream_13.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_13.nextNode()
                    );

                    adaptor.addChild(root_1, stream_logicalImplies.nextTree());

                }
                stream_logicalImplies.reset();
                stream_13.reset();

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
    // $ANTLR end "logicalImplies"


    public static class logicalOr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalOr"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:33:1: logicalOr : logicalAnd ( 'OR' logicalOr )? -> ^( LogicalOr logicalAnd ( 'OR' logicalOr )? ) ;
    public final Quiz2Parser.logicalOr_return logicalOr() throws RecognitionException {
        Quiz2Parser.logicalOr_return retval = new Quiz2Parser.logicalOr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal6=null;
        Quiz2Parser.logicalAnd_return logicalAnd5 =null;

        Quiz2Parser.logicalOr_return logicalOr7 =null;


        Object string_literal6_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleSubtreeStream stream_logicalAnd=new RewriteRuleSubtreeStream(adaptor,"rule logicalAnd");
        RewriteRuleSubtreeStream stream_logicalOr=new RewriteRuleSubtreeStream(adaptor,"rule logicalOr");
        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:34:2: ( logicalAnd ( 'OR' logicalOr )? -> ^( LogicalOr logicalAnd ( 'OR' logicalOr )? ) )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:34:4: logicalAnd ( 'OR' logicalOr )?
            {
            pushFollow(FOLLOW_logicalAnd_in_logicalOr164);
            logicalAnd5=logicalAnd();

            state._fsp--;

            stream_logicalAnd.add(logicalAnd5.getTree());

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:34:15: ( 'OR' logicalOr )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:34:16: 'OR' logicalOr
                    {
                    string_literal6=(Token)match(input,15,FOLLOW_15_in_logicalOr167);  
                    stream_15.add(string_literal6);


                    pushFollow(FOLLOW_logicalOr_in_logicalOr169);
                    logicalOr7=logicalOr();

                    state._fsp--;

                    stream_logicalOr.add(logicalOr7.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: logicalAnd, logicalOr, 15
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:33: -> ^( LogicalOr logicalAnd ( 'OR' logicalOr )? )
            {
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:35:3: ^( LogicalOr logicalAnd ( 'OR' logicalOr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LogicalOr, "LogicalOr")
                , root_1);

                adaptor.addChild(root_1, stream_logicalAnd.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:35:26: ( 'OR' logicalOr )?
                if ( stream_logicalOr.hasNext()||stream_15.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_15.nextNode()
                    );

                    adaptor.addChild(root_1, stream_logicalOr.nextTree());

                }
                stream_logicalOr.reset();
                stream_15.reset();

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
    // $ANTLR end "logicalOr"


    public static class logicalAnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalAnd"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:44:1: logicalAnd : logicalNot ( 'AND' logicalAnd )? -> ^( LogicalAnd logicalNot ( 'AND' logicalAnd )? ) ;
    public final Quiz2Parser.logicalAnd_return logicalAnd() throws RecognitionException {
        Quiz2Parser.logicalAnd_return retval = new Quiz2Parser.logicalAnd_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal9=null;
        Quiz2Parser.logicalNot_return logicalNot8 =null;

        Quiz2Parser.logicalAnd_return logicalAnd10 =null;


        Object string_literal9_tree=null;
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_logicalNot=new RewriteRuleSubtreeStream(adaptor,"rule logicalNot");
        RewriteRuleSubtreeStream stream_logicalAnd=new RewriteRuleSubtreeStream(adaptor,"rule logicalAnd");
        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:45:2: ( logicalNot ( 'AND' logicalAnd )? -> ^( LogicalAnd logicalNot ( 'AND' logicalAnd )? ) )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:45:4: logicalNot ( 'AND' logicalAnd )?
            {
            pushFollow(FOLLOW_logicalNot_in_logicalAnd236);
            logicalNot8=logicalNot();

            state._fsp--;

            stream_logicalNot.add(logicalNot8.getTree());

            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:45:15: ( 'AND' logicalAnd )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:45:16: 'AND' logicalAnd
                    {
                    string_literal9=(Token)match(input,12,FOLLOW_12_in_logicalAnd239);  
                    stream_12.add(string_literal9);


                    pushFollow(FOLLOW_logicalAnd_in_logicalAnd241);
                    logicalAnd10=logicalAnd();

                    state._fsp--;

                    stream_logicalAnd.add(logicalAnd10.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: logicalNot, logicalAnd, 12
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:35: -> ^( LogicalAnd logicalNot ( 'AND' logicalAnd )? )
            {
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:46:3: ^( LogicalAnd logicalNot ( 'AND' logicalAnd )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LogicalAnd, "LogicalAnd")
                , root_1);

                adaptor.addChild(root_1, stream_logicalNot.nextTree());

                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:46:27: ( 'AND' logicalAnd )?
                if ( stream_logicalAnd.hasNext()||stream_12.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_12.nextNode()
                    );

                    adaptor.addChild(root_1, stream_logicalAnd.nextTree());

                }
                stream_logicalAnd.reset();
                stream_12.reset();

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
    // $ANTLR end "logicalAnd"


    public static class logicalNot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalNot"
    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:55:1: logicalNot : ( 'NOT' ID | ID | '(' logicalImplies ')' ) ^;
    public final Quiz2Parser.logicalNot_return logicalNot() throws RecognitionException {
        Quiz2Parser.logicalNot_return retval = new Quiz2Parser.logicalNot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal11=null;
        Token ID12=null;
        Token ID13=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Quiz2Parser.logicalImplies_return logicalImplies15 =null;


        Object string_literal11_tree=null;
        Object ID12_tree=null;
        Object ID13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;

        try {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:56:2: ( ( 'NOT' ID | ID | '(' logicalImplies ')' ) ^)
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:56:4: ( 'NOT' ID | ID | '(' logicalImplies ')' ) ^
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:56:4: ( 'NOT' ID | ID | '(' logicalImplies ')' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                alt4=2;
                }
                break;
            case 10:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:56:5: 'NOT' ID
                    {
                    string_literal11=(Token)match(input,14,FOLLOW_14_in_logicalNot308); 
                    string_literal11_tree = 
                    (Object)adaptor.create(string_literal11)
                    ;
                    adaptor.addChild(root_0, string_literal11_tree);


                    ID12=(Token)match(input,ID,FOLLOW_ID_in_logicalNot310); 
                    ID12_tree = 
                    (Object)adaptor.create(ID12)
                    ;
                    adaptor.addChild(root_0, ID12_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:56:16: ID
                    {
                    ID13=(Token)match(input,ID,FOLLOW_ID_in_logicalNot314); 
                    ID13_tree = 
                    (Object)adaptor.create(ID13)
                    ;
                    adaptor.addChild(root_0, ID13_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:56:21: '(' logicalImplies ')'
                    {
                    char_literal14=(Token)match(input,10,FOLLOW_10_in_logicalNot318); 
                    char_literal14_tree = 
                    (Object)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);


                    pushFollow(FOLLOW_logicalImplies_in_logicalNot320);
                    logicalImplies15=logicalImplies();

                    state._fsp--;

                    adaptor.addChild(root_0, logicalImplies15.getTree());

                    char_literal16=(Token)match(input,11,FOLLOW_11_in_logicalNot322); 
                    char_literal16_tree = 
                    (Object)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);


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
    // $ANTLR end "logicalNot"

    // Delegated rules


 

    public static final BitSet FOLLOW_logicalImplies_in_run38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_logicalImplies93 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logicalImplies96 = new BitSet(new long[]{0x0000000000004410L});
    public static final BitSet FOLLOW_logicalImplies_in_logicalImplies98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr164 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_logicalOr167 = new BitSet(new long[]{0x0000000000004410L});
    public static final BitSet FOLLOW_logicalOr_in_logicalOr169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalNot_in_logicalAnd236 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_logicalAnd239 = new BitSet(new long[]{0x0000000000004410L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalAnd241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_logicalNot308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_logicalNot310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_logicalNot314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_logicalNot318 = new BitSet(new long[]{0x0000000000004410L});
    public static final BitSet FOLLOW_logicalImplies_in_logicalNot320 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_logicalNot322 = new BitSet(new long[]{0x0000000000000002L});

}