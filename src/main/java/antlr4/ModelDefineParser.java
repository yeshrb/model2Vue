package antlr4;
// Generated from ModelDefine.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelDefineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IDENTIFIER=5, WS=6, COMMENT=7, LINE_COMMENT=8, 
		Letter=9, CLASS=10, BOOLEAN=11, STRING=12, NUMBER=13, DATA=14;
	public static final int
		RULE_modelDeclaration = 0, RULE_modelBody = 1, RULE_modelBodyDeclaration = 2, 
		RULE_fieldDeclaration = 3, RULE_typeType = 4, RULE_modelType = 5, RULE_primitiveType = 6, 
		RULE_fieldDeclaratorId = 7;
	public static final String[] ruleNames = {
		"modelDeclaration", "modelBody", "modelBodyDeclaration", "fieldDeclaration", 
		"typeType", "modelType", "primitiveType", "fieldDeclaratorId"
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

	@Override
	public String getGrammarFileName() { return "ModelDefine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModelDefineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ModelDefineParser.IDENTIFIER, 0); }
		public ModelBodyContext modelBody() {
			return getRuleContext(ModelBodyContext.class,0);
		}
		public ModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterModelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitModelDeclaration(this);
		}
	}

	public final ModelDeclarationContext modelDeclaration() throws RecognitionException {
		ModelDeclarationContext _localctx = new ModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_modelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(IDENTIFIER);
			setState(17);
			modelBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelBodyContext extends ParserRuleContext {
		public ModelBodyDeclarationContext modelBodyDeclaration() {
			return getRuleContext(ModelBodyDeclarationContext.class,0);
		}
		public ModelBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterModelBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitModelBody(this);
		}
	}

	public final ModelBodyContext modelBody() throws RecognitionException {
		ModelBodyContext _localctx = new ModelBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modelBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			modelBodyDeclaration();
			setState(21);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelBodyDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ModelBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterModelBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitModelBodyDeclaration(this);
		}
	}

	public final ModelBodyDeclarationContext modelBodyDeclaration() throws RecognitionException {
		ModelBodyDeclarationContext _localctx = new ModelBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelBodyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			fieldDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<FieldDeclaratorIdContext> fieldDeclaratorId() {
			return getRuleContexts(FieldDeclaratorIdContext.class);
		}
		public FieldDeclaratorIdContext fieldDeclaratorId(int i) {
			return getRuleContext(FieldDeclaratorIdContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER) | (1L << DATA))) != 0)) {
				{
				{
				setState(25);
				typeType();
				setState(26);
				fieldDeclaratorId();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ModelTypeContext modelType() {
			return getRuleContext(ModelTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case NUMBER:
			case DATA:
				{
				setState(33);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				{
				setState(34);
				modelType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(37);
				match(T__2);
				setState(38);
				match(T__3);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ModelDefineParser.IDENTIFIER, 0); }
		public ModelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterModelType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitModelType(this);
		}
	}

	public final ModelTypeContext modelType() throws RecognitionException {
		ModelTypeContext _localctx = new ModelTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ModelDefineParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(ModelDefineParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ModelDefineParser.NUMBER, 0); }
		public TerminalNode DATA() { return getToken(ModelDefineParser.DATA, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER) | (1L << DATA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ModelDefineParser.IDENTIFIER, 0); }
		public FieldDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterFieldDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitFieldDeclaratorId(this);
		}
	}

	public final FieldDeclaratorIdContext fieldDeclaratorId() throws RecognitionException {
		FieldDeclaratorIdContext _localctx = new FieldDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(IDENTIFIER);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(49);
				match(T__2);
				setState(50);
				match(T__3);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5\37\n\5\f\5\16\5\"\13\5\3\6\3\6\5\6&\n"+
		"\6\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t\66"+
		"\n\t\f\t\16\t9\13\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\r\20\2\66\2\22"+
		"\3\2\2\2\4\25\3\2\2\2\6\31\3\2\2\2\b \3\2\2\2\n%\3\2\2\2\f.\3\2\2\2\16"+
		"\60\3\2\2\2\20\62\3\2\2\2\22\23\7\7\2\2\23\24\5\4\3\2\24\3\3\2\2\2\25"+
		"\26\7\3\2\2\26\27\5\6\4\2\27\30\7\4\2\2\30\5\3\2\2\2\31\32\5\b\5\2\32"+
		"\7\3\2\2\2\33\34\5\n\6\2\34\35\5\20\t\2\35\37\3\2\2\2\36\33\3\2\2\2\37"+
		"\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\t\3\2\2\2\" \3\2\2\2#&\5\16\b\2$&\5"+
		"\f\7\2%#\3\2\2\2%$\3\2\2\2&+\3\2\2\2\'(\7\5\2\2(*\7\6\2\2)\'\3\2\2\2*"+
		"-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\13\3\2\2\2-+\3\2\2\2./\7\7\2\2/\r\3\2\2"+
		"\2\60\61\t\2\2\2\61\17\3\2\2\2\62\67\7\7\2\2\63\64\7\5\2\2\64\66\7\6\2"+
		"\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\21\3\2\2\29\67"+
		"\3\2\2\2\6 %+\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}