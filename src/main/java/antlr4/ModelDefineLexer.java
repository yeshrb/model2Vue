// Generated from ModelDefine.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelDefineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CLASS=7, BOOLEAN=8, STRING=9, 
		NUMBER=10, DATA=11, CONSKEYWORD=12, VALIDATORKEYWORD=13, CONSTRAINTKEY=14, 
		CONSTRAINTVAL=15, IDENTIFIER=16, WS=17, COMMENT=18, LINE_COMMENT=19, Letter=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CLASS", "BOOLEAN", "STRING", 
		"NUMBER", "DATA", "CONSKEYWORD", "VALIDATORKEYWORD", "CONSTRAINTKEY", 
		"CONSTRAINTVAL", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", "Letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'='", "':'", "'class'", "'bool'", "'string'", 
		"'number'", "'dataTime'", "'constraints'", "'validator'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "CLASS", "BOOLEAN", "STRING", 
		"NUMBER", "DATA", "CONSKEYWORD", "VALIDATORKEYWORD", "CONSTRAINTKEY", 
		"CONSTRAINTVAL", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", "Letter"
	};
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


	public ModelDefineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ModelDefine.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17z\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0085\n\20\3\21\6\21\u0088\n\21\r\21\16\21\u0089\3\22"+
		"\6\22\u008d\n\22\r\22\16\22\u008e\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0097"+
		"\n\23\f\23\16\23\u009a\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\7\24\u00a5\n\24\f\24\16\24\u00a8\13\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\5\25\u00b0\n\25\3\u0098\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\b\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3"+
		"+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2"+
		"\2\17\67\3\2\2\2\21=\3\2\2\2\23B\3\2\2\2\25I\3\2\2\2\27P\3\2\2\2\31Y\3"+
		"\2\2\2\33e\3\2\2\2\35y\3\2\2\2\37\u0084\3\2\2\2!\u0087\3\2\2\2#\u008c"+
		"\3\2\2\2%\u0092\3\2\2\2\'\u00a0\3\2\2\2)\u00af\3\2\2\2+,\7}\2\2,\4\3\2"+
		"\2\2-.\7\177\2\2.\6\3\2\2\2/\60\7]\2\2\60\b\3\2\2\2\61\62\7_\2\2\62\n"+
		"\3\2\2\2\63\64\7?\2\2\64\f\3\2\2\2\65\66\7<\2\2\66\16\3\2\2\2\678\7e\2"+
		"\289\7n\2\29:\7c\2\2:;\7u\2\2;<\7u\2\2<\20\3\2\2\2=>\7d\2\2>?\7q\2\2?"+
		"@\7q\2\2@A\7n\2\2A\22\3\2\2\2BC\7u\2\2CD\7v\2\2DE\7t\2\2EF\7k\2\2FG\7"+
		"p\2\2GH\7i\2\2H\24\3\2\2\2IJ\7p\2\2JK\7w\2\2KL\7o\2\2LM\7d\2\2MN\7g\2"+
		"\2NO\7t\2\2O\26\3\2\2\2PQ\7f\2\2QR\7c\2\2RS\7v\2\2ST\7c\2\2TU\7V\2\2U"+
		"V\7k\2\2VW\7o\2\2WX\7g\2\2X\30\3\2\2\2YZ\7e\2\2Z[\7q\2\2[\\\7p\2\2\\]"+
		"\7u\2\2]^\7v\2\2^_\7t\2\2_`\7c\2\2`a\7k\2\2ab\7p\2\2bc\7v\2\2cd\7u\2\2"+
		"d\32\3\2\2\2ef\7x\2\2fg\7c\2\2gh\7n\2\2hi\7k\2\2ij\7f\2\2jk\7c\2\2kl\7"+
		"v\2\2lm\7q\2\2mn\7t\2\2n\34\3\2\2\2op\7p\2\2pq\7w\2\2qr\7n\2\2rs\7n\2"+
		"\2st\7c\2\2tu\7d\2\2uv\7n\2\2vz\7g\2\2wx\7d\2\2xz\7d\2\2yo\3\2\2\2yw\3"+
		"\2\2\2z\36\3\2\2\2{|\7v\2\2|}\7t\2\2}~\7w\2\2~\u0085\7g\2\2\177\u0080"+
		"\7h\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0085\7g\2\2\u0084{\3\2\2\2\u0084\177\3\2\2\2\u0085 \3\2\2\2\u0086\u0088"+
		"\5)\25\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\"\3\2\2\2\u008b\u008d\t\2\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\b\22\2\2\u0091$\3\2\2\2\u0092\u0093\7\61\2\2\u0093"+
		"\u0094\7,\2\2\u0094\u0098\3\2\2\2\u0095\u0097\13\2\2\2\u0096\u0095\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7,\2\2\u009c\u009d\7\61"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\23\2\2\u009f&\3\2\2\2\u00a0\u00a1"+
		"\7\61\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\n\3\2\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\b\24\2\2"+
		"\u00aa(\3\2\2\2\u00ab\u00b0\t\4\2\2\u00ac\u00b0\n\5\2\2\u00ad\u00ae\t"+
		"\6\2\2\u00ae\u00b0\t\7\2\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0*\3\2\2\2\n\2y\u0084\u0089\u008e\u0098\u00a6\u00af"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}