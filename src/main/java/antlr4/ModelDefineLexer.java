package antlr4;
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
		T__0=1, T__1=2, T__2=3, T__3=4, IDENTIFIER=5, WS=6, COMMENT=7, LINE_COMMENT=8, 
		Letter=9, CLASS=10, BOOLEAN=11, STRING=12, NUMBER=13, DATA=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", 
		"Letter", "CLASS", "BOOLEAN", "STRING", "NUMBER", "DATA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", null, null, null, null, null, "'class'", 
		"'bool'", "'string'", "'number'", "'dataTime'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", 
		"Letter", "CLASS", "BOOLEAN", "STRING", "NUMBER", "DATA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\6\6)\n\6\r\6\16\6*\3\7\6\7.\n\7\r\7\16\7/\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\b8\n\b\f\b\16\b;\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tF\n"+
		"\t\f\t\16\tI\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"9\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\3\2\b\5\2\13\f\16\17\"\"\4\2\f\f\17\17\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2y\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13(\3"+
		"\2\2\2\r-\3\2\2\2\17\63\3\2\2\2\21A\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27"+
		"X\3\2\2\2\31]\3\2\2\2\33d\3\2\2\2\35k\3\2\2\2\37 \7}\2\2 \4\3\2\2\2!\""+
		"\7\177\2\2\"\6\3\2\2\2#$\7]\2\2$\b\3\2\2\2%&\7_\2\2&\n\3\2\2\2\')\5\23"+
		"\n\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\f\3\2\2\2,.\t\2\2\2-,\3"+
		"\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\b\7\2\2\62"+
		"\16\3\2\2\2\63\64\7\61\2\2\64\65\7,\2\2\659\3\2\2\2\668\13\2\2\2\67\66"+
		"\3\2\2\28;\3\2\2\29:\3\2\2\29\67\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7,\2\2"+
		"=>\7\61\2\2>?\3\2\2\2?@\b\b\2\2@\20\3\2\2\2AB\7\61\2\2BC\7\61\2\2CG\3"+
		"\2\2\2DF\n\3\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3"+
		"\2\2\2JK\b\t\2\2K\22\3\2\2\2LQ\t\4\2\2MQ\n\5\2\2NO\t\6\2\2OQ\t\7\2\2P"+
		"L\3\2\2\2PM\3\2\2\2PN\3\2\2\2Q\24\3\2\2\2RS\7e\2\2ST\7n\2\2TU\7c\2\2U"+
		"V\7u\2\2VW\7u\2\2W\26\3\2\2\2XY\7d\2\2YZ\7q\2\2Z[\7q\2\2[\\\7n\2\2\\\30"+
		"\3\2\2\2]^\7u\2\2^_\7v\2\2_`\7t\2\2`a\7k\2\2ab\7p\2\2bc\7i\2\2c\32\3\2"+
		"\2\2de\7p\2\2ef\7w\2\2fg\7o\2\2gh\7d\2\2hi\7g\2\2ij\7t\2\2j\34\3\2\2\2"+
		"kl\7f\2\2lm\7c\2\2mn\7v\2\2no\7c\2\2op\7V\2\2pq\7k\2\2qr\7o\2\2rs\7g\2"+
		"\2s\36\3\2\2\2\b\2*/9GP\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}