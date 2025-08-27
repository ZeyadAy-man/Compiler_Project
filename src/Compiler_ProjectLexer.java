// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g 2025-08-26 15:34:14

import org.antlr.runtime.*;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Compiler_ProjectLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Compiler_ProjectLexer() {} 
    public Compiler_ProjectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Compiler_ProjectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g"; }

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:2:7: ( '!' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:3:7: ( '!=' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:3:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:4:7: ( '#' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:4:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:5:7: ( '&' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:5:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:6:7: ( '(' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:7:7: ( ')' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:8:7: ( ',' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:9:7: ( '->' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:9:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:10:7: ( '.' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:10:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:11:7: ( ':' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:12:7: ( ';' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:13:7: ( '<' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:13:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:14:7: ( '<<' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:14:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:15:7: ( '<=' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:15:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:16:7: ( '=' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:17:7: ( '==' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:17:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:18:7: ( '>' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:19:7: ( '>=' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:19:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:20:7: ( '>>' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:20:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:21:7: ( '[' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:22:7: ( ']' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:23:7: ( 'auto' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:23:9: 'auto'
            {
            match("auto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:24:7: ( 'bool' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:24:9: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:25:7: ( 'break' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:25:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:26:7: ( 'case' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:26:9: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:27:7: ( 'class' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:27:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:28:7: ( 'const' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:28:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:29:7: ( 'default' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:29:9: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:30:7: ( 'else' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:30:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:31:7: ( 'float' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:31:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:32:7: ( 'for' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:32:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:33:7: ( 'if' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:33:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:34:7: ( 'include' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:34:9: 'include'
            {
            match("include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:35:7: ( 'int' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:35:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:36:7: ( 'main' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:36:9: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:37:8: ( 'namespace' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:37:10: 'namespace'
            {
            match("namespace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:38:8: ( 'private' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:38:10: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:39:8: ( 'public' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:39:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:40:8: ( 'return' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:40:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:41:8: ( 'std' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:41:10: 'std'
            {
            match("std"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:42:8: ( 'string' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:42:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:43:8: ( 'switch' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:43:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:44:8: ( 'using' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:44:10: 'using'
            {
            match("using"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:45:8: ( 'vector' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:45:10: 'vector'
            {
            match("vector"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:46:8: ( 'void' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:46:10: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:47:8: ( 'while' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:47:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:48:8: ( '{' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:48:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:49:8: ( '}' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:49:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "BooleanValue"
    public final void mBooleanValue() throws RecognitionException {
        try {
            int _type = BooleanValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:821:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:821:15: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:821:24: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BooleanValue"

    // $ANTLR start "IntValue"
    public final void mIntValue() throws RecognitionException {
        try {
            int _type = IntValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:822:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:822:11: ( '0' .. '9' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:822:11: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntValue"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:823:3: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+ )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:823:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:823:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )* )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:823:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( '0' .. '9' )*
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:823:33: ( '0' .. '9' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "FloatValue"
    public final void mFloatValue() throws RecognitionException {
        try {
            int _type = FloatValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:824:11: ( IntValue '.' IntValue )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:824:13: IntValue '.' IntValue
            {
            mIntValue(); 


            match('.'); 

            mIntValue(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FloatValue"

    // $ANTLR start "StringValue"
    public final void mStringValue() throws RecognitionException {
        try {
            int _type = StringValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:825:12: ( '\\\"' ( . )* '\\\"' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:825:14: '\\\"' ( . )* '\\\"'
            {
            match('\"'); 

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:825:18: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    alt5=2;
                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:825:18: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringValue"

    // $ANTLR start "CharValue"
    public final void mCharValue() throws RecognitionException {
        try {
            int _type = CharValue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:826:10: ( '\\'' ( . )? '\\'' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:826:12: '\\'' ( . )? '\\''
            {
            match('\''); 

            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:826:16: ( . )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\'') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='\'') ) {
                    alt6=1;
                }
            }
            else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '\uFFFF')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:826:16: .
                    {
                    matchAny(); 

                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharValue"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:827:9: ( '//' ( options {greedy=false; } : . )* '\\n' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:827:11: '//' ( options {greedy=false; } : . )* '\\n'
            {
            match("//"); 



            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:827:16: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\n') ) {
                    alt7=2;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:827:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comment"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:829:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:829:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:829:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ArithmaticOperators"
    public final void mArithmaticOperators() throws RecognitionException {
        try {
            int _type = ArithmaticOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:830:20: ( '+' | '-' | '*' | '/' | '%' )
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:
            {
            if ( input.LA(1)=='%'||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ArithmaticOperators"

    // $ANTLR start "LogicalOperators"
    public final void mLogicalOperators() throws RecognitionException {
        try {
            int _type = LogicalOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:831:17: ( '&&' | '||' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='&') ) {
                alt9=1;
            }
            else if ( (LA9_0=='|') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:831:19: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:831:26: '||'
                    {
                    match("||"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LogicalOperators"

    // $ANTLR start "AssignmentOperators"
    public final void mAssignmentOperators() throws RecognitionException {
        try {
            int _type = AssignmentOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:832:20: ( '+=' | '-=' | '*=' | '/=' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt10=1;
                }
                break;
            case '-':
                {
                alt10=2;
                }
                break;
            case '*':
                {
                alt10=3;
                }
                break;
            case '/':
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:832:22: '+='
                    {
                    match("+="); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:832:29: '-='
                    {
                    match("-="); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:832:36: '*='
                    {
                    match("*="); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:832:43: '/='
                    {
                    match("/="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AssignmentOperators"

    // $ANTLR start "AssignmentAutoOperators"
    public final void mAssignmentAutoOperators() throws RecognitionException {
        try {
            int _type = AssignmentAutoOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:833:24: ( '--' | '++' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='-') ) {
                alt11=1;
            }
            else if ( (LA11_0=='+') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:833:26: '--'
                    {
                    match("--"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:833:33: '++'
                    {
                    match("++"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AssignmentAutoOperators"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | BooleanValue | IntValue | ID | FloatValue | StringValue | CharValue | Comment | WS | ArithmaticOperators | LogicalOperators | AssignmentOperators | AssignmentAutoOperators )
        int alt12=60;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:10: T__65
                {
                mT__65(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:16: T__66
                {
                mT__66(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:22: T__67
                {
                mT__67(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:28: T__68
                {
                mT__68(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:34: T__69
                {
                mT__69(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:40: T__70
                {
                mT__70(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:46: T__71
                {
                mT__71(); 


                }
                break;
            case 8 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:52: T__72
                {
                mT__72(); 


                }
                break;
            case 9 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:58: T__73
                {
                mT__73(); 


                }
                break;
            case 10 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:64: T__74
                {
                mT__74(); 


                }
                break;
            case 11 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:70: T__75
                {
                mT__75(); 


                }
                break;
            case 12 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:76: T__76
                {
                mT__76(); 


                }
                break;
            case 13 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:82: T__77
                {
                mT__77(); 


                }
                break;
            case 14 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:88: T__78
                {
                mT__78(); 


                }
                break;
            case 15 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:94: T__79
                {
                mT__79(); 


                }
                break;
            case 16 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:100: T__80
                {
                mT__80(); 


                }
                break;
            case 17 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:106: T__81
                {
                mT__81(); 


                }
                break;
            case 18 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:112: T__82
                {
                mT__82(); 


                }
                break;
            case 19 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:118: T__83
                {
                mT__83(); 


                }
                break;
            case 20 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:124: T__84
                {
                mT__84(); 


                }
                break;
            case 21 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:130: T__85
                {
                mT__85(); 


                }
                break;
            case 22 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:136: T__86
                {
                mT__86(); 


                }
                break;
            case 23 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:142: T__87
                {
                mT__87(); 


                }
                break;
            case 24 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:148: T__88
                {
                mT__88(); 


                }
                break;
            case 25 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:154: T__89
                {
                mT__89(); 


                }
                break;
            case 26 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:160: T__90
                {
                mT__90(); 


                }
                break;
            case 27 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:166: T__91
                {
                mT__91(); 


                }
                break;
            case 28 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:172: T__92
                {
                mT__92(); 


                }
                break;
            case 29 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:178: T__93
                {
                mT__93(); 


                }
                break;
            case 30 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:184: T__94
                {
                mT__94(); 


                }
                break;
            case 31 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:190: T__95
                {
                mT__95(); 


                }
                break;
            case 32 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:196: T__96
                {
                mT__96(); 


                }
                break;
            case 33 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:202: T__97
                {
                mT__97(); 


                }
                break;
            case 34 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:208: T__98
                {
                mT__98(); 


                }
                break;
            case 35 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:214: T__99
                {
                mT__99(); 


                }
                break;
            case 36 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:220: T__100
                {
                mT__100(); 


                }
                break;
            case 37 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:227: T__101
                {
                mT__101(); 


                }
                break;
            case 38 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:234: T__102
                {
                mT__102(); 


                }
                break;
            case 39 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:241: T__103
                {
                mT__103(); 


                }
                break;
            case 40 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:248: T__104
                {
                mT__104(); 


                }
                break;
            case 41 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:255: T__105
                {
                mT__105(); 


                }
                break;
            case 42 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:262: T__106
                {
                mT__106(); 


                }
                break;
            case 43 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:269: T__107
                {
                mT__107(); 


                }
                break;
            case 44 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:276: T__108
                {
                mT__108(); 


                }
                break;
            case 45 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:283: T__109
                {
                mT__109(); 


                }
                break;
            case 46 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:290: T__110
                {
                mT__110(); 


                }
                break;
            case 47 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:297: T__111
                {
                mT__111(); 


                }
                break;
            case 48 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:304: T__112
                {
                mT__112(); 


                }
                break;
            case 49 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:311: BooleanValue
                {
                mBooleanValue(); 


                }
                break;
            case 50 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:324: IntValue
                {
                mIntValue(); 


                }
                break;
            case 51 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:333: ID
                {
                mID(); 


                }
                break;
            case 52 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:336: FloatValue
                {
                mFloatValue(); 


                }
                break;
            case 53 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:347: StringValue
                {
                mStringValue(); 


                }
                break;
            case 54 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:359: CharValue
                {
                mCharValue(); 


                }
                break;
            case 55 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:369: Comment
                {
                mComment(); 


                }
                break;
            case 56 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:377: WS
                {
                mWS(); 


                }
                break;
            case 57 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:380: ArithmaticOperators
                {
                mArithmaticOperators(); 


                }
                break;
            case 58 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:400: LogicalOperators
                {
                mLogicalOperators(); 


                }
                break;
            case 59 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:417: AssignmentOperators
                {
                mAssignmentOperators(); 


                }
                break;
            case 60 :
                // C:\\Users\\zizoa\\Desktop\\Programs\\Compiler_Project\\Compiler_Project.g:1:437: AssignmentAutoOperators
                {
                mAssignmentAutoOperators(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\55\1\uffff\1\56\3\uffff\1\53\3\uffff\1\64\1\66\1\71\2"+
        "\uffff\17\43\2\uffff\1\43\1\123\3\uffff\1\53\1\uffff\1\53\1\uffff"+
        "\1\53\17\uffff\13\43\1\141\15\43\3\uffff\11\43\1\172\1\43\1\uffff"+
        "\1\43\1\175\5\43\1\u0083\7\43\1\u008b\1\u008c\1\43\1\u008e\3\43"+
        "\1\u0092\1\43\1\uffff\2\43\1\uffff\1\u0096\4\43\1\uffff\4\43\1\u009f"+
        "\1\43\1\u00a1\2\uffff\1\u00a2\1\uffff\1\u00a3\1\u00a4\1\43\1\uffff"+
        "\1\u00a6\1\u00a1\1\43\1\uffff\6\43\1\u00ae\1\43\1\uffff\1\u00b0"+
        "\4\uffff\1\43\1\uffff\3\43\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\uffff"+
        "\1\u00b9\1\uffff\1\u00ba\1\u00bb\1\43\1\u00bd\7\uffff\1\43\1\uffff"+
        "\1\u00bf\1\uffff";
    static final String DFA12_eofS =
        "\u00c0\uffff";
    static final String DFA12_minS =
        "\1\11\1\75\1\uffff\1\46\3\uffff\1\55\3\uffff\1\74\2\75\2\uffff\1"+
        "\165\1\157\1\141\1\145\1\154\1\141\1\146\2\141\1\162\1\145\1\164"+
        "\1\163\1\145\1\150\2\uffff\1\162\1\56\3\uffff\1\57\1\uffff\1\53"+
        "\1\uffff\1\75\17\uffff\1\164\1\157\1\145\1\163\1\141\1\156\1\146"+
        "\1\163\1\157\1\162\1\154\1\44\1\143\1\151\1\155\1\151\1\142\1\164"+
        "\1\144\2\151\1\143\2\151\1\165\3\uffff\1\157\1\154\1\141\1\145\2"+
        "\163\1\141\1\145\1\141\1\44\1\163\1\uffff\1\154\1\44\1\156\1\145"+
        "\1\166\1\154\1\165\1\44\1\151\1\164\1\156\1\164\1\144\1\154\1\145"+
        "\2\44\1\153\1\44\1\163\1\164\1\165\1\44\1\164\1\uffff\1\145\1\165"+
        "\1\uffff\1\44\1\163\1\141\1\151\1\162\1\uffff\1\156\1\143\1\147"+
        "\1\157\1\44\1\145\1\44\2\uffff\1\44\1\uffff\2\44\1\154\1\uffff\2"+
        "\44\1\144\1\uffff\1\160\1\164\1\143\1\156\1\147\1\150\1\44\1\162"+
        "\1\uffff\1\44\4\uffff\1\164\1\uffff\1\145\1\141\1\145\4\44\1\uffff"+
        "\1\44\1\uffff\2\44\1\143\1\44\7\uffff\1\145\1\uffff\1\44\1\uffff";
    static final String DFA12_maxS =
        "\1\175\1\75\1\uffff\1\46\3\uffff\1\76\3\uffff\2\75\1\76\2\uffff"+
        "\1\165\1\162\1\157\1\145\1\154\1\157\1\156\2\141\1\165\1\145\1\167"+
        "\1\163\1\157\1\150\2\uffff\1\162\1\71\3\uffff\1\75\1\uffff\1\75"+
        "\1\uffff\1\75\17\uffff\1\164\1\157\1\145\1\163\1\141\1\156\1\146"+
        "\1\163\1\157\1\162\1\154\1\172\1\164\1\151\1\155\1\151\1\142\1\164"+
        "\1\162\2\151\1\143\2\151\1\165\3\uffff\1\157\1\154\1\141\1\145\2"+
        "\163\1\141\1\145\1\141\1\172\1\163\1\uffff\1\154\1\172\1\156\1\145"+
        "\1\166\1\154\1\165\1\172\1\151\1\164\1\156\1\164\1\144\1\154\1\145"+
        "\2\172\1\153\1\172\1\163\1\164\1\165\1\172\1\164\1\uffff\1\145\1"+
        "\165\1\uffff\1\172\1\163\1\141\1\151\1\162\1\uffff\1\156\1\143\1"+
        "\147\1\157\1\172\1\145\1\172\2\uffff\1\172\1\uffff\2\172\1\154\1"+
        "\uffff\2\172\1\144\1\uffff\1\160\1\164\1\143\1\156\1\147\1\150\1"+
        "\172\1\162\1\uffff\1\172\4\uffff\1\164\1\uffff\1\145\1\141\1\145"+
        "\4\172\1\uffff\1\172\1\uffff\2\172\1\143\1\172\7\uffff\1\145\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\3\1\uffff\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\3\uffff"+
        "\1\24\1\25\17\uffff\1\57\1\60\2\uffff\1\63\1\65\1\66\1\uffff\1\70"+
        "\1\uffff\1\72\1\uffff\1\71\1\2\1\1\1\4\1\10\1\73\1\74\1\15\1\16"+
        "\1\14\1\20\1\17\1\22\1\23\1\21\31\uffff\1\62\1\64\1\67\13\uffff"+
        "\1\40\30\uffff\1\37\2\uffff\1\42\5\uffff\1\50\7\uffff\1\26\1\27"+
        "\1\uffff\1\31\3\uffff\1\35\3\uffff\1\43\10\uffff\1\55\1\uffff\1"+
        "\61\1\30\1\32\1\33\1\uffff\1\36\7\uffff\1\53\1\uffff\1\56\4\uffff"+
        "\1\46\1\47\1\51\1\52\1\54\1\34\1\41\1\uffff\1\45\1\uffff\1\44";
    static final String DFA12_specialS =
        "\u00c0\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\1\1\1\44\1\2\1\43\1\53\1\3"+
            "\1\45\1\4\1\5\1\52\1\50\1\6\1\7\1\10\1\46\12\42\1\11\1\12\1"+
            "\13\1\14\1\15\2\uffff\32\43\1\16\1\uffff\1\17\1\uffff\1\43\1"+
            "\uffff\1\20\1\21\1\22\1\23\1\24\1\25\2\43\1\26\3\43\1\27\1\30"+
            "\1\43\1\31\1\43\1\32\1\33\1\41\1\34\1\35\1\36\3\43\1\37\1\51"+
            "\1\40",
            "\1\54",
            "",
            "\1\51",
            "",
            "",
            "",
            "\1\61\17\uffff\1\60\1\57",
            "",
            "",
            "",
            "\1\62\1\63",
            "\1\65",
            "\1\67\1\70",
            "",
            "",
            "\1\72",
            "\1\73\2\uffff\1\74",
            "\1\75\12\uffff\1\76\2\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\104\12\uffff\1\102\2\uffff\1\103",
            "\1\105\7\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111\2\uffff\1\112",
            "\1\113",
            "\1\114\2\uffff\1\115",
            "\1\116",
            "\1\117\11\uffff\1\120",
            "\1\121",
            "",
            "",
            "\1\122",
            "\1\124\1\uffff\12\42",
            "",
            "",
            "",
            "\1\125\15\uffff\1\60",
            "",
            "\1\61\21\uffff\1\60",
            "",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\142\20\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151\15\uffff\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\173",
            "",
            "\1\174",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u008d",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u00a0",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u00a5",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u00af",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "",
            "",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\1\u00bc",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "",
            "\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | BooleanValue | IntValue | ID | FloatValue | StringValue | CharValue | Comment | WS | ArithmaticOperators | LogicalOperators | AssignmentOperators | AssignmentAutoOperators );";
        }
    }
 

}