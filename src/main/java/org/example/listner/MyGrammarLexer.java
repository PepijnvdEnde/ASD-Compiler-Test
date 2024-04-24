// Generated from C:/Users/woute/Documents/GitHub/ASD-Compiler-Test/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example.listner;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INT=13, WS=14, KLEINERDAN=15, GROTERDAN=16, 
		WANNEER=17, MIJN=18, DAN=19, IK=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "INT", "WS", "KLEINERDAN", "GROTERDAN", "WANNEER", 
			"MIJN", "DAN", "IK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hp'", "'def'", "'atk'", "'spd'", "'str'", "'loop'", "'naar '", 
			"'boven'", "'onder'", "'links'", "'rechts'", "'de kist'", null, null, 
			"'kleiner dan'", "'groter dan'", "'wanneer'", "'mijn'", "'dan'", "'ik'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "WS", "KLEINERDAN", "GROTERDAN", "WANNEER", "MIJN", "DAN", 
			"IK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0004\fj\b\f\u000b\f\f\fk\u0001\r\u0004\ro\b\r\u000b"+
		"\r\f\rp\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0002\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000"+
		"\u0000\u00074\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b"+
		"<\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fG\u0001\u0000"+
		"\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000\u0000"+
		"\u0015Y\u0001\u0000\u0000\u0000\u0017`\u0001\u0000\u0000\u0000\u0019i"+
		"\u0001\u0000\u0000\u0000\u001bn\u0001\u0000\u0000\u0000\u001dt\u0001\u0000"+
		"\u0000\u0000\u001f\u0080\u0001\u0000\u0000\u0000!\u008b\u0001\u0000\u0000"+
		"\u0000#\u0093\u0001\u0000\u0000\u0000%\u0098\u0001\u0000\u0000\u0000\'"+
		"\u009c\u0001\u0000\u0000\u0000)*\u0005h\u0000\u0000*+\u0005p\u0000\u0000"+
		"+\u0002\u0001\u0000\u0000\u0000,-\u0005d\u0000\u0000-.\u0005e\u0000\u0000"+
		"./\u0005f\u0000\u0000/\u0004\u0001\u0000\u0000\u000001\u0005a\u0000\u0000"+
		"12\u0005t\u0000\u000023\u0005k\u0000\u00003\u0006\u0001\u0000\u0000\u0000"+
		"45\u0005s\u0000\u000056\u0005p\u0000\u000067\u0005d\u0000\u00007\b\u0001"+
		"\u0000\u0000\u000089\u0005s\u0000\u00009:\u0005t\u0000\u0000:;\u0005r"+
		"\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005l\u0000\u0000=>\u0005o"+
		"\u0000\u0000>?\u0005o\u0000\u0000?@\u0005p\u0000\u0000@\f\u0001\u0000"+
		"\u0000\u0000AB\u0005n\u0000\u0000BC\u0005a\u0000\u0000CD\u0005a\u0000"+
		"\u0000DE\u0005r\u0000\u0000EF\u0005 \u0000\u0000F\u000e\u0001\u0000\u0000"+
		"\u0000GH\u0005b\u0000\u0000HI\u0005o\u0000\u0000IJ\u0005v\u0000\u0000"+
		"JK\u0005e\u0000\u0000KL\u0005n\u0000\u0000L\u0010\u0001\u0000\u0000\u0000"+
		"MN\u0005o\u0000\u0000NO\u0005n\u0000\u0000OP\u0005d\u0000\u0000PQ\u0005"+
		"e\u0000\u0000QR\u0005r\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005"+
		"l\u0000\u0000TU\u0005i\u0000\u0000UV\u0005n\u0000\u0000VW\u0005k\u0000"+
		"\u0000WX\u0005s\u0000\u0000X\u0014\u0001\u0000\u0000\u0000YZ\u0005r\u0000"+
		"\u0000Z[\u0005e\u0000\u0000[\\\u0005c\u0000\u0000\\]\u0005h\u0000\u0000"+
		"]^\u0005t\u0000\u0000^_\u0005s\u0000\u0000_\u0016\u0001\u0000\u0000\u0000"+
		"`a\u0005d\u0000\u0000ab\u0005e\u0000\u0000bc\u0005 \u0000\u0000cd\u0005"+
		"k\u0000\u0000de\u0005i\u0000\u0000ef\u0005s\u0000\u0000fg\u0005t\u0000"+
		"\u0000g\u0018\u0001\u0000\u0000\u0000hj\u0007\u0000\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000l\u001a\u0001\u0000\u0000\u0000mo\u0007\u0001"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0006\r\u0000\u0000s\u001c\u0001\u0000\u0000\u0000tu\u0005k\u0000\u0000"+
		"uv\u0005l\u0000\u0000vw\u0005e\u0000\u0000wx\u0005i\u0000\u0000xy\u0005"+
		"n\u0000\u0000yz\u0005e\u0000\u0000z{\u0005r\u0000\u0000{|\u0005 \u0000"+
		"\u0000|}\u0005d\u0000\u0000}~\u0005a\u0000\u0000~\u007f\u0005n\u0000\u0000"+
		"\u007f\u001e\u0001\u0000\u0000\u0000\u0080\u0081\u0005g\u0000\u0000\u0081"+
		"\u0082\u0005r\u0000\u0000\u0082\u0083\u0005o\u0000\u0000\u0083\u0084\u0005"+
		"t\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005r\u0000"+
		"\u0000\u0086\u0087\u0005 \u0000\u0000\u0087\u0088\u0005d\u0000\u0000\u0088"+
		"\u0089\u0005a\u0000\u0000\u0089\u008a\u0005n\u0000\u0000\u008a \u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005w\u0000\u0000\u008c\u008d\u0005a\u0000"+
		"\u0000\u008d\u008e\u0005n\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f"+
		"\u0090\u0005e\u0000\u0000\u0090\u0091\u0005e\u0000\u0000\u0091\u0092\u0005"+
		"r\u0000\u0000\u0092\"\u0001\u0000\u0000\u0000\u0093\u0094\u0005m\u0000"+
		"\u0000\u0094\u0095\u0005i\u0000\u0000\u0095\u0096\u0005j\u0000\u0000\u0096"+
		"\u0097\u0005n\u0000\u0000\u0097$\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"d\u0000\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u009b\u0005n\u0000"+
		"\u0000\u009b&\u0001\u0000\u0000\u0000\u009c\u009d\u0005i\u0000\u0000\u009d"+
		"\u009e\u0005k\u0000\u0000\u009e(\u0001\u0000\u0000\u0000\u0003\u0000k"+
		"p\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}