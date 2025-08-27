// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g 2025-08-27 15:49:19

import org.antlr.runtime.*;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Quiz2Lexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Quiz2Lexer() {} 
    public Quiz2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Quiz2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:2:7: ( '(' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:2:9: '('
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:3:7: ( ')' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:3:9: ')'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:4:7: ( 'AND' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:4:9: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:5:7: ( 'IMPLIES' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:5:9: 'IMPLIES'
            {
            match("IMPLIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:6:7: ( 'NOT' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:6:9: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:7:7: ( 'OR' )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:7:9: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:65:4: ( ( 'A' .. 'Z' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:65:6: ( 'A' .. 'Z' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:65:6: ( 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:66:4: ( ( '\\n' | '\\t' | ' ' )+ )
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:66:6: ( '\\n' | '\\t' | ' ' )+
            {
            // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:66:6: ( '\\n' | '\\t' | ' ' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)==' ' ) {
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

    public void mTokens() throws RecognitionException {
        // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | WS )
        int alt3=8;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt3=1;
            }
            break;
        case ')':
            {
            alt3=2;
            }
            break;
        case 'A':
            {
            int LA3_3 = input.LA(2);

            if ( (LA3_3=='N') ) {
                int LA3_9 = input.LA(3);

                if ( (LA3_9=='D') ) {
                    int LA3_13 = input.LA(4);

                    if ( ((LA3_13 >= 'A' && LA3_13 <= 'Z')) ) {
                        alt3=7;
                    }
                    else {
                        alt3=3;
                    }
                }
                else {
                    alt3=7;
                }
            }
            else {
                alt3=7;
            }
            }
            break;
        case 'I':
            {
            int LA3_4 = input.LA(2);

            if ( (LA3_4=='M') ) {
                int LA3_10 = input.LA(3);

                if ( (LA3_10=='P') ) {
                    int LA3_14 = input.LA(4);

                    if ( (LA3_14=='L') ) {
                        int LA3_18 = input.LA(5);

                        if ( (LA3_18=='I') ) {
                            int LA3_20 = input.LA(6);

                            if ( (LA3_20=='E') ) {
                                int LA3_21 = input.LA(7);

                                if ( (LA3_21=='S') ) {
                                    int LA3_22 = input.LA(8);

                                    if ( ((LA3_22 >= 'A' && LA3_22 <= 'Z')) ) {
                                        alt3=7;
                                    }
                                    else {
                                        alt3=4;
                                    }
                                }
                                else {
                                    alt3=7;
                                }
                            }
                            else {
                                alt3=7;
                            }
                        }
                        else {
                            alt3=7;
                        }
                    }
                    else {
                        alt3=7;
                    }
                }
                else {
                    alt3=7;
                }
            }
            else {
                alt3=7;
            }
            }
            break;
        case 'N':
            {
            int LA3_5 = input.LA(2);

            if ( (LA3_5=='O') ) {
                int LA3_11 = input.LA(3);

                if ( (LA3_11=='T') ) {
                    int LA3_15 = input.LA(4);

                    if ( ((LA3_15 >= 'A' && LA3_15 <= 'Z')) ) {
                        alt3=7;
                    }
                    else {
                        alt3=5;
                    }
                }
                else {
                    alt3=7;
                }
            }
            else {
                alt3=7;
            }
            }
            break;
        case 'O':
            {
            int LA3_6 = input.LA(2);

            if ( (LA3_6=='R') ) {
                int LA3_12 = input.LA(3);

                if ( ((LA3_12 >= 'A' && LA3_12 <= 'Z')) ) {
                    alt3=7;
                }
                else {
                    alt3=6;
                }
            }
            else {
                alt3=7;
            }
            }
            break;
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt3=7;
            }
            break;
        case '\t':
        case '\n':
        case ' ':
            {
            alt3=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:46: ID
                {
                mID(); 


                }
                break;
            case 8 :
                // C:\\Users\\zizoa\\Desktop\\Compiler\\Lab1\\Lab1\\Programs\\Grammar1\\Quiz2.g:1:49: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}