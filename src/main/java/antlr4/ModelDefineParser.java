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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CLASS=7, BOOLEAN=8, STRING=9, 
		NUMBER=10, DATA=11, CONSKEYWORD=12, VALIDATORKEYWORD=13, CONSTRAINTKEY=14, 
		CONSTRAINTVAL=15, IDENTIFIER=16, WS=17, COMMENT=18, LINE_COMMENT=19, Letter=20;
	public static final int
		RULE_modelDeclaration = 0, RULE_modelBody = 1, RULE_modelBodyDeclaration = 2, 
		RULE_fieldDeclaration = 3, RULE_typeType = 4, RULE_modelType = 5, RULE_primitiveType = 6, 
		RULE_fieldDeclaratorId = 7, RULE_constraintDeclaration = 8, RULE_constraintBody = 9, 
		RULE_constraintBodyDeclaration = 10, RULE_constraint = 11, RULE_validator = 12, 
		RULE_validatorId = 13;
	public static final String[] ruleNames = {
		"modelDeclaration", "modelBody", "modelBodyDeclaration", "fieldDeclaration", 
		"typeType", "modelType", "primitiveType", "fieldDeclaratorId", "constraintDeclaration", 
		"constraintBody", "constraintBodyDeclaration", "constraint", "validator", 
		"validatorId"
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
			setState(28);
			match(IDENTIFIER);
			setState(29);
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
			setState(31);
			match(T__0);
			setState(32);
			modelBodyDeclaration();
			setState(33);
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
		public List<ConstraintDeclarationContext> constraintDeclaration() {
			return getRuleContexts(ConstraintDeclarationContext.class);
		}
		public ConstraintDeclarationContext constraintDeclaration(int i) {
			return getRuleContext(ConstraintDeclarationContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			fieldDeclaration();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSKEYWORD) {
				{
				{
				setState(36);
				constraintDeclaration();
				}
				}
				setState(41);
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER) | (1L << DATA) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(42);
				typeType();
				setState(43);
				fieldDeclaratorId();
				}
				}
				setState(49);
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case NUMBER:
			case DATA:
				{
				setState(50);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				{
				setState(51);
				modelType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(54);
				match(T__2);
				setState(55);
				match(T__3);
				}
				}
				setState(60);
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
			setState(61);
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
			setState(63);
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
			setState(65);
			match(IDENTIFIER);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(66);
				match(T__2);
				setState(67);
				match(T__3);
				}
				}
				setState(72);
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

	public static class ConstraintDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSKEYWORD() { return getToken(ModelDefineParser.CONSKEYWORD, 0); }
		public ConstraintBodyContext constraintBody() {
			return getRuleContext(ConstraintBodyContext.class,0);
		}
		public ConstraintDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstraintDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstraintDeclaration(this);
		}
	}

	public final ConstraintDeclarationContext constraintDeclaration() throws RecognitionException {
		ConstraintDeclarationContext _localctx = new ConstraintDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constraintDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(CONSKEYWORD);
			setState(74);
			match(T__4);
			setState(75);
			constraintBody();
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

	public static class ConstraintBodyContext extends ParserRuleContext {
		public ConstraintBodyDeclarationContext constraintBodyDeclaration() {
			return getRuleContext(ConstraintBodyDeclarationContext.class,0);
		}
		public ConstraintBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstraintBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstraintBody(this);
		}
	}

	public final ConstraintBodyContext constraintBody() throws RecognitionException {
		ConstraintBodyContext _localctx = new ConstraintBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constraintBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			constraintBodyDeclaration();
			setState(79);
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

	public static class ConstraintBodyDeclarationContext extends ParserRuleContext {
		public FieldDeclaratorIdContext fieldDeclaratorId() {
			return getRuleContext(FieldDeclaratorIdContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<ValidatorContext> validator() {
			return getRuleContexts(ValidatorContext.class);
		}
		public ValidatorContext validator(int i) {
			return getRuleContext(ValidatorContext.class,i);
		}
		public ConstraintBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstraintBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstraintBodyDeclaration(this);
		}
	}

	public final ConstraintBodyDeclarationContext constraintBodyDeclaration() throws RecognitionException {
		ConstraintBodyDeclarationContext _localctx = new ConstraintBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constraintBodyDeclaration);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				fieldDeclaratorId();
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONSTRAINTKEY:
					{
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(83);
						constraint();
						}
						}
						setState(86); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CONSTRAINTKEY );
					}
					break;
				case T__1:
				case VALIDATORKEYWORD:
					{
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VALIDATORKEYWORD) {
						{
						{
						setState(88);
						validator();
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINTKEY() { return getToken(ModelDefineParser.CONSTRAINTKEY, 0); }
		public TerminalNode CONSTRAINTVAL() { return getToken(ModelDefineParser.CONSTRAINTVAL, 0); }
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CONSTRAINTKEY);
			setState(99);
			match(T__5);
			setState(100);
			match(CONSTRAINTVAL);
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

	public static class ValidatorContext extends ParserRuleContext {
		public TerminalNode VALIDATORKEYWORD() { return getToken(ModelDefineParser.VALIDATORKEYWORD, 0); }
		public ValidatorIdContext validatorId() {
			return getRuleContext(ValidatorIdContext.class,0);
		}
		public ValidatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterValidator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitValidator(this);
		}
	}

	public final ValidatorContext validator() throws RecognitionException {
		ValidatorContext _localctx = new ValidatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_validator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(VALIDATORKEYWORD);
			setState(103);
			match(T__5);
			setState(104);
			validatorId();
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

	public static class ValidatorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ModelDefineParser.IDENTIFIER, 0); }
		public ValidatorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validatorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).enterValidatorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelDefineListener ) ((ModelDefineListener)listener).exitValidatorId(this);
		}
	}

	public final ValidatorIdContext validatorId() throws RecognitionException {
		ValidatorIdContext _localctx = new ValidatorIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_validatorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63\13\5\3\6\3"+
		"\6\5\6\67\n\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\7\tG\n\t\f\t\16\tJ\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\6\fW\n\f\r\f\16\fX\3\f\7\f\\\n\f\f\f\16\f_\13\f\5\fa\n\f\5\fc\n"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\3\3\2\n\r\2i\2\36\3\2\2\2\4!\3\2\2\2\6%\3"+
		"\2\2\2\b\61\3\2\2\2\n\66\3\2\2\2\f?\3\2\2\2\16A\3\2\2\2\20C\3\2\2\2\22"+
		"K\3\2\2\2\24O\3\2\2\2\26b\3\2\2\2\30d\3\2\2\2\32h\3\2\2\2\34l\3\2\2\2"+
		"\36\37\7\22\2\2\37 \5\4\3\2 \3\3\2\2\2!\"\7\3\2\2\"#\5\6\4\2#$\7\4\2\2"+
		"$\5\3\2\2\2%)\5\b\5\2&(\5\22\n\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2"+
		"\2\2*\7\3\2\2\2+)\3\2\2\2,-\5\n\6\2-.\5\20\t\2.\60\3\2\2\2/,\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\t\3\2\2\2\63\61\3\2\2\2\64\67"+
		"\5\16\b\2\65\67\5\f\7\2\66\64\3\2\2\2\66\65\3\2\2\2\67<\3\2\2\289\7\5"+
		"\2\29;\7\6\2\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2\2><\3"+
		"\2\2\2?@\7\22\2\2@\r\3\2\2\2AB\t\2\2\2B\17\3\2\2\2CH\7\22\2\2DE\7\5\2"+
		"\2EG\7\6\2\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\21\3\2\2\2JH\3\2"+
		"\2\2KL\7\16\2\2LM\7\7\2\2MN\5\24\13\2N\23\3\2\2\2OP\7\3\2\2PQ\5\26\f\2"+
		"QR\7\4\2\2R\25\3\2\2\2Sc\3\2\2\2T`\5\20\t\2UW\5\30\r\2VU\3\2\2\2WX\3\2"+
		"\2\2XV\3\2\2\2XY\3\2\2\2Ya\3\2\2\2Z\\\5\32\16\2[Z\3\2\2\2\\_\3\2\2\2]"+
		"[\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`V\3\2\2\2`]\3\2\2\2ac\3\2\2\2"+
		"bS\3\2\2\2bT\3\2\2\2c\27\3\2\2\2de\7\20\2\2ef\7\b\2\2fg\7\21\2\2g\31\3"+
		"\2\2\2hi\7\17\2\2ij\7\b\2\2jk\5\34\17\2k\33\3\2\2\2lm\7\22\2\2m\35\3\2"+
		"\2\2\13)\61\66<HX]`b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}