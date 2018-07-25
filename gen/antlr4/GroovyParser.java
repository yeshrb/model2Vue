// Generated from D:/products/model2Vue/src/main/java/antlr4\GroovyParser.g4 by ANTLR 4.7
package antlr4;

    import java.util.Map;
    import org.codehaus.groovy.ast.NodeMetaDataHandler;
    import org.apache.groovy.parser.antlr4.SemanticPredicates;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GroovyParser extends AbstractParser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StringLiteral=1, GStringBegin=2, GStringEnd=3, GStringPart=4, GStringPathPart=5, 
		RollBackOne=6, AS=7, DEF=8, IN=9, TRAIT=10, THREADSAFE=11, BuiltInPrimitiveType=12, 
		ABSTRACT=13, ASSERT=14, BREAK=15, CASE=16, CATCH=17, CLASS=18, CONST=19, 
		CONTINUE=20, DEFAULT=21, DO=22, ELSE=23, ENUM=24, EXTENDS=25, FINAL=26, 
		FINALLY=27, FOR=28, IF=29, GOTO=30, IMPLEMENTS=31, IMPORT=32, INSTANCEOF=33, 
		INTERFACE=34, NATIVE=35, NEW=36, PACKAGE=37, PRIVATE=38, PROTECTED=39, 
		PUBLIC=40, RETURN=41, STATIC=42, STRICTFP=43, SUPER=44, SWITCH=45, SYNCHRONIZED=46, 
		THIS=47, THROW=48, THROWS=49, TRANSIENT=50, TRY=51, VOID=52, VOLATILE=53, 
		WHILE=54, IntegerLiteral=55, FloatingPointLiteral=56, BooleanLiteral=57, 
		NullLiteral=58, RANGE_INCLUSIVE=59, RANGE_EXCLUSIVE=60, SPREAD_DOT=61, 
		SAFE_DOT=62, SAFE_CHAIN_DOT=63, ELVIS=64, METHOD_POINTER=65, METHOD_REFERENCE=66, 
		REGEX_FIND=67, REGEX_MATCH=68, POWER=69, POWER_ASSIGN=70, SPACESHIP=71, 
		IDENTICAL=72, NOT_IDENTICAL=73, ARROW=74, NOT_INSTANCEOF=75, NOT_IN=76, 
		LPAREN=77, RPAREN=78, LBRACE=79, RBRACE=80, LBRACK=81, RBRACK=82, SEMI=83, 
		COMMA=84, DOT=85, ASSIGN=86, GT=87, LT=88, NOT=89, BITNOT=90, QUESTION=91, 
		COLON=92, EQUAL=93, LE=94, GE=95, NOTEQUAL=96, AND=97, OR=98, INC=99, 
		DEC=100, ADD=101, SUB=102, MUL=103, DIV=104, BITAND=105, BITOR=106, XOR=107, 
		MOD=108, ADD_ASSIGN=109, SUB_ASSIGN=110, MUL_ASSIGN=111, DIV_ASSIGN=112, 
		AND_ASSIGN=113, OR_ASSIGN=114, XOR_ASSIGN=115, MOD_ASSIGN=116, LSHIFT_ASSIGN=117, 
		RSHIFT_ASSIGN=118, URSHIFT_ASSIGN=119, ELVIS_ASSIGN=120, CapitalizedIdentifier=121, 
		Identifier=122, AT=123, ELLIPSIS=124, WS=125, NL=126, SH_COMMENT=127, 
		UNEXPECTED_CHAR=128;
	public static final int
		RULE_compilationUnit = 0, RULE_statements = 1, RULE_packageDeclaration = 2, 
		RULE_importDeclaration = 3, RULE_typeDeclaration = 4, RULE_modifier = 5, 
		RULE_modifiersOpt = 6, RULE_modifiers = 7, RULE_classOrInterfaceModifiersOpt = 8, 
		RULE_classOrInterfaceModifiers = 9, RULE_classOrInterfaceModifier = 10, 
		RULE_variableModifier = 11, RULE_variableModifiersOpt = 12, RULE_variableModifiers = 13, 
		RULE_typeParameters = 14, RULE_typeParameter = 15, RULE_typeBound = 16, 
		RULE_typeList = 17, RULE_classDeclaration = 18, RULE_classBody = 19, RULE_enumConstants = 20, 
		RULE_enumConstant = 21, RULE_classBodyDeclaration = 22, RULE_memberDeclaration = 23, 
		RULE_methodDeclaration = 24, RULE_methodName = 25, RULE_returnType = 26, 
		RULE_fieldDeclaration = 27, RULE_variableDeclarators = 28, RULE_variableDeclarator = 29, 
		RULE_variableDeclaratorId = 30, RULE_variableInitializer = 31, RULE_variableInitializers = 32, 
		RULE_dims = 33, RULE_dimsOpt = 34, RULE_standardType = 35, RULE_type = 36, 
		RULE_classOrInterfaceType = 37, RULE_generalClassOrInterfaceType = 38, 
		RULE_standardClassOrInterfaceType = 39, RULE_primitiveType = 40, RULE_typeArguments = 41, 
		RULE_typeArgument = 42, RULE_annotatedQualifiedClassName = 43, RULE_qualifiedClassNameList = 44, 
		RULE_formalParameters = 45, RULE_formalParameterList = 46, RULE_thisFormalParameter = 47, 
		RULE_formalParameter = 48, RULE_methodBody = 49, RULE_qualifiedName = 50, 
		RULE_qualifiedNameElement = 51, RULE_qualifiedNameElements = 52, RULE_qualifiedClassName = 53, 
		RULE_qualifiedStandardClassName = 54, RULE_literal = 55, RULE_gstring = 56, 
		RULE_gstringValue = 57, RULE_gstringPath = 58, RULE_lambdaExpression = 59, 
		RULE_standardLambdaExpression = 60, RULE_lambdaParameters = 61, RULE_standardLambdaParameters = 62, 
		RULE_lambdaBody = 63, RULE_closure = 64, RULE_blockStatementsOpt = 65, 
		RULE_blockStatements = 66, RULE_annotationsOpt = 67, RULE_annotation = 68, 
		RULE_elementValues = 69, RULE_annotationName = 70, RULE_elementValuePairs = 71, 
		RULE_elementValuePair = 72, RULE_elementValuePairName = 73, RULE_elementValue = 74, 
		RULE_elementValueArrayInitializer = 75, RULE_block = 76, RULE_blockStatement = 77, 
		RULE_localVariableDeclaration = 78, RULE_classifiedModifiers = 79, RULE_variableDeclaration = 80, 
		RULE_typeNamePairs = 81, RULE_typeNamePair = 82, RULE_variableNames = 83, 
		RULE_conditionalStatement = 84, RULE_ifElseStatement = 85, RULE_switchStatement = 86, 
		RULE_loopStatement = 87, RULE_continueStatement = 88, RULE_breakStatement = 89, 
		RULE_tryCatchStatement = 90, RULE_assertStatement = 91, RULE_statement = 92, 
		RULE_catchClause = 93, RULE_catchType = 94, RULE_finallyBlock = 95, RULE_resources = 96, 
		RULE_resourceList = 97, RULE_resource = 98, RULE_switchBlockStatementGroup = 99, 
		RULE_switchLabel = 100, RULE_forControl = 101, RULE_enhancedForControl = 102, 
		RULE_classicalForControl = 103, RULE_forInit = 104, RULE_forUpdate = 105, 
		RULE_castParExpression = 106, RULE_parExpression = 107, RULE_expressionInPar = 108, 
		RULE_expressionList = 109, RULE_expressionListElement = 110, RULE_enhancedStatementExpression = 111, 
		RULE_statementExpression = 112, RULE_postfixExpression = 113, RULE_expression = 114, 
		RULE_enhancedExpression = 115, RULE_commandExpression = 116, RULE_commandArgument = 117, 
		RULE_pathExpression = 118, RULE_pathElement = 119, RULE_namePart = 120, 
		RULE_dynamicMemberName = 121, RULE_indexPropertyArgs = 122, RULE_namedPropertyArgs = 123, 
		RULE_primary = 124, RULE_list = 125, RULE_map = 126, RULE_mapEntryList = 127, 
		RULE_mapEntry = 128, RULE_mapEntryLabel = 129, RULE_creator = 130, RULE_arrayInitializer = 131, 
		RULE_anonymousInnerClassDeclaration = 132, RULE_createdName = 133, RULE_nonWildcardTypeArguments = 134, 
		RULE_typeArgumentsOrDiamond = 135, RULE_arguments = 136, RULE_argumentList = 137, 
		RULE_enhancedArgumentList = 138, RULE_argumentListElement = 139, RULE_enhancedArgumentListElement = 140, 
		RULE_stringLiteral = 141, RULE_className = 142, RULE_identifier = 143, 
		RULE_builtInType = 144, RULE_keywords = 145, RULE_rparen = 146, RULE_nls = 147, 
		RULE_sep = 148;
	public static final String[] ruleNames = {
		"compilationUnit", "statements", "packageDeclaration", "importDeclaration", 
		"typeDeclaration", "modifier", "modifiersOpt", "modifiers", "classOrInterfaceModifiersOpt", 
		"classOrInterfaceModifiers", "classOrInterfaceModifier", "variableModifier", 
		"variableModifiersOpt", "variableModifiers", "typeParameters", "typeParameter", 
		"typeBound", "typeList", "classDeclaration", "classBody", "enumConstants", 
		"enumConstant", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
		"methodName", "returnType", "fieldDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "variableInitializers", 
		"dims", "dimsOpt", "standardType", "type", "classOrInterfaceType", "generalClassOrInterfaceType", 
		"standardClassOrInterfaceType", "primitiveType", "typeArguments", "typeArgument", 
		"annotatedQualifiedClassName", "qualifiedClassNameList", "formalParameters", 
		"formalParameterList", "thisFormalParameter", "formalParameter", "methodBody", 
		"qualifiedName", "qualifiedNameElement", "qualifiedNameElements", "qualifiedClassName", 
		"qualifiedStandardClassName", "literal", "gstring", "gstringValue", "gstringPath", 
		"lambdaExpression", "standardLambdaExpression", "lambdaParameters", "standardLambdaParameters", 
		"lambdaBody", "closure", "blockStatementsOpt", "blockStatements", "annotationsOpt", 
		"annotation", "elementValues", "annotationName", "elementValuePairs", 
		"elementValuePair", "elementValuePairName", "elementValue", "elementValueArrayInitializer", 
		"block", "blockStatement", "localVariableDeclaration", "classifiedModifiers", 
		"variableDeclaration", "typeNamePairs", "typeNamePair", "variableNames", 
		"conditionalStatement", "ifElseStatement", "switchStatement", "loopStatement", 
		"continueStatement", "breakStatement", "tryCatchStatement", "assertStatement", 
		"statement", "catchClause", "catchType", "finallyBlock", "resources", 
		"resourceList", "resource", "switchBlockStatementGroup", "switchLabel", 
		"forControl", "enhancedForControl", "classicalForControl", "forInit", 
		"forUpdate", "castParExpression", "parExpression", "expressionInPar", 
		"expressionList", "expressionListElement", "enhancedStatementExpression", 
		"statementExpression", "postfixExpression", "expression", "enhancedExpression", 
		"commandExpression", "commandArgument", "pathExpression", "pathElement", 
		"namePart", "dynamicMemberName", "indexPropertyArgs", "namedPropertyArgs", 
		"primary", "list", "map", "mapEntryList", "mapEntry", "mapEntryLabel", 
		"creator", "arrayInitializer", "anonymousInnerClassDeclaration", "createdName", 
		"nonWildcardTypeArguments", "typeArgumentsOrDiamond", "arguments", "argumentList", 
		"enhancedArgumentList", "argumentListElement", "enhancedArgumentListElement", 
		"stringLiteral", "className", "identifier", "builtInType", "keywords", 
		"rparen", "nls", "sep"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'as'", "'def'", "'in'", "'trait'", 
		"'threadsafe'", null, "'abstract'", "'assert'", "'break'", "'case'", "'catch'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'else'", "'enum'", 
		"'extends'", "'final'", "'finally'", "'for'", "'if'", "'goto'", "'implements'", 
		"'import'", "'instanceof'", "'interface'", "'native'", "'new'", "'package'", 
		"'private'", "'protected'", "'public'", "'return'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, "'null'", "'..'", "'..<'", "'*.'", "'?.'", "'??.'", "'?:'", "'.&'", 
		"'::'", "'=~'", "'==~'", "'**'", "'**='", "'<=>'", "'==='", "'!=='", "'->'", 
		"'!instanceof'", "'!in'", null, null, null, null, null, null, "';'", "','", 
		null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", null, 
		"'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'?='", null, null, "'@'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StringLiteral", "GStringBegin", "GStringEnd", "GStringPart", "GStringPathPart", 
		"RollBackOne", "AS", "DEF", "IN", "TRAIT", "THREADSAFE", "BuiltInPrimitiveType", 
		"ABSTRACT", "ASSERT", "BREAK", "CASE", "CATCH", "CLASS", "CONST", "CONTINUE", 
		"DEFAULT", "DO", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FOR", 
		"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INTERFACE", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "STATIC", 
		"STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
		"TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "NullLiteral", "RANGE_INCLUSIVE", "RANGE_EXCLUSIVE", 
		"SPREAD_DOT", "SAFE_DOT", "SAFE_CHAIN_DOT", "ELVIS", "METHOD_POINTER", 
		"METHOD_REFERENCE", "REGEX_FIND", "REGEX_MATCH", "POWER", "POWER_ASSIGN", 
		"SPACESHIP", "IDENTICAL", "NOT_IDENTICAL", "ARROW", "NOT_INSTANCEOF", 
		"NOT_IN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "NOT", "BITNOT", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "XOR", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ELVIS_ASSIGN", "CapitalizedIdentifier", 
		"Identifier", "AT", "ELLIPSIS", "WS", "NL", "SH_COMMENT", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "GroovyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    public static class GroovyParserRuleContext extends ParserRuleContext implements NodeMetaDataHandler {
	        private Map metaDataMap = null;

	        public GroovyParserRuleContext() {}

	        public GroovyParserRuleContext(ParserRuleContext parent, int invokingStateNumber) {
	            super(parent, invokingStateNumber);
	        }

	        @Override
	        public Map<?, ?> getMetaDataMap() {
	            return this.metaDataMap;
	        }

	        @Override
	        public void setMetaDataMap(Map<?, ?> metaDataMap) {
	            this.metaDataMap = metaDataMap;
	        }
	    }

	    @Override
	    public int getSyntaxErrorSource() {
	        return GroovySyntaxError.PARSER;
	    }

	    @Override
	    public int getErrorLine() {
	        Token token = _input.LT(-1);

	        if (null == token) {
	            return -1;
	        }

	        return token.getLine();
	    }

	    @Override
	    public int getErrorColumn() {
	        Token token = _input.LT(-1);

	        if (null == token) {
	            return -1;
	        }

	        return token.getCharPositionInLine() + 1 + token.getText().length();
	    }

	public GroovyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends GroovyParserRuleContext {
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GroovyParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			nls();
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(299);
				packageDeclaration();
				}
				break;
			}
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(302);
				sep();
				}
				break;
			}
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(305);
				statements();
				}
				break;
			}
			setState(308);
			match(EOF);
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

	public static class StatementsContext extends GroovyParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			statement();
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					sep();
					setState(312);
					statement();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI || _la==NL) {
				{
				setState(319);
				sep();
				}
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

	public static class PackageDeclarationContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public TerminalNode PACKAGE() { return getToken(GroovyParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			annotationsOpt();
			setState(323);
			match(PACKAGE);
			setState(324);
			qualifiedName();
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

	public static class ImportDeclarationContext extends GroovyParserRuleContext {
		public IdentifierContext alias;
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(GroovyParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(GroovyParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(GroovyParser.MUL, 0); }
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			annotationsOpt();
			setState(327);
			match(IMPORT);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(328);
				match(STATIC);
				}
				break;
			}
			setState(331);
			qualifiedName();
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(332);
				match(DOT);
				setState(333);
				match(MUL);
				}
				break;
			case AS:
				{
				setState(334);
				match(AS);
				setState(335);
				((ImportDeclarationContext)_localctx).alias = identifier();
				}
				break;
			case EOF:
			case CASE:
			case DEFAULT:
			case ELSE:
			case WHILE:
			case RBRACE:
			case SEMI:
			case NL:
				break;
			default:
				break;
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

	public static class TypeDeclarationContext extends GroovyParserRuleContext {
		public ClassOrInterfaceModifiersOptContext classOrInterfaceModifiersOpt() {
			return getRuleContext(ClassOrInterfaceModifiersOptContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			classOrInterfaceModifiersOpt();
			setState(339);
			classDeclaration();
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

	public static class ModifierContext extends GroovyParserRuleContext {
		public Token m;
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(GroovyParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(GroovyParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(GroovyParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(GroovyParser.VOLATILE, 0); }
		public TerminalNode DEF() { return getToken(GroovyParser.DEF, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case DEFAULT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				classOrInterfaceModifier();
				}
				break;
			case DEF:
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				((ModifierContext)_localctx).m = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
					((ModifierContext)_localctx).m = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ModifiersOptContext extends GroovyParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ModifiersOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiersOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterModifiersOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitModifiersOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitModifiersOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersOptContext modifiersOpt() throws RecognitionException {
		ModifiersOptContext _localctx = new ModifiersOptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modifiersOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(345);
				modifiers();
				}
				break;
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

	public static class ModifiersContext extends GroovyParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(348);
					modifier();
					setState(349);
					nls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(353); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ClassOrInterfaceModifiersOptContext extends GroovyParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassOrInterfaceModifiersOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiersOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassOrInterfaceModifiersOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassOrInterfaceModifiersOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifiersOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersOptContext classOrInterfaceModifiersOpt() throws RecognitionException {
		ClassOrInterfaceModifiersOptContext _localctx = new ClassOrInterfaceModifiersOptContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classOrInterfaceModifiersOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(355);
				classOrInterfaceModifiers();
				}
				break;
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

	public static class ClassOrInterfaceModifiersContext extends GroovyParserRuleContext {
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassOrInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassOrInterfaceModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(358);
					classOrInterfaceModifier();
					setState(359);
					nls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(363); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ClassOrInterfaceModifierContext extends GroovyParserRuleContext {
		public Token m;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(GroovyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(GroovyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(GroovyParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(GroovyParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(GroovyParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(GroovyParser.STRICTFP, 0); }
		public TerminalNode DEFAULT() { return getToken(GroovyParser.DEFAULT, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				annotation();
				}
				break;
			case ABSTRACT:
			case DEFAULT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				((ClassOrInterfaceModifierContext)_localctx).m = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
					((ClassOrInterfaceModifierContext)_localctx).m = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class VariableModifierContext extends GroovyParserRuleContext {
		public Token m;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(GroovyParser.FINAL, 0); }
		public TerminalNode DEF() { return getToken(GroovyParser.DEF, 0); }
		public TerminalNode PUBLIC() { return getToken(GroovyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(GroovyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(GroovyParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(GroovyParser.ABSTRACT, 0); }
		public TerminalNode STRICTFP() { return getToken(GroovyParser.STRICTFP, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableModifier);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				annotation();
				}
				break;
			case DEF:
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				((VariableModifierContext)_localctx).m = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
					((VariableModifierContext)_localctx).m = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class VariableModifiersOptContext extends GroovyParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public VariableModifiersOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiersOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableModifiersOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableModifiersOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableModifiersOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersOptContext variableModifiersOpt() throws RecognitionException {
		VariableModifiersOptContext _localctx = new VariableModifiersOptContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableModifiersOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(373);
				variableModifiers();
				}
				break;
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

	public static class VariableModifiersContext extends GroovyParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(376);
					variableModifier();
					setState(377);
					nls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(381); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TypeParametersContext extends GroovyParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(LT);
			setState(384);
			nls();
			setState(385);
			typeParameter();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(386);
				match(COMMA);
				setState(387);
				nls();
				setState(388);
				typeParameter();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			nls();
			setState(396);
			match(GT);
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

	public static class TypeParameterContext extends GroovyParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(GroovyParser.EXTENDS, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			className();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(399);
				match(EXTENDS);
				setState(400);
				nls();
				setState(401);
				typeBound();
				}
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

	public static class TypeBoundContext extends GroovyParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(GroovyParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(GroovyParser.BITAND, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			type();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(406);
				match(BITAND);
				setState(407);
				nls();
				setState(408);
				type();
				}
				}
				setState(414);
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

	public static class TypeListContext extends GroovyParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			type();
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					match(COMMA);
					setState(417);
					nls();
					setState(418);
					type();
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ClassDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public TypeListContext scs;
		public TypeContext sc;
		public TypeListContext is;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(GroovyParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(GroovyParser.INTERFACE, 0); }
		public TerminalNode ENUM() { return getToken(GroovyParser.ENUM, 0); }
		public TerminalNode AT() { return getToken(GroovyParser.AT, 0); }
		public TerminalNode TRAIT() { return getToken(GroovyParser.TRAIT, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(GroovyParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(GroovyParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(425);
				match(CLASS);
				 ((ClassDeclarationContext)_localctx).t =  0; 
				}
				break;
			case INTERFACE:
				{
				setState(427);
				match(INTERFACE);
				 ((ClassDeclarationContext)_localctx).t =  1; 
				}
				break;
			case ENUM:
				{
				setState(429);
				match(ENUM);
				 ((ClassDeclarationContext)_localctx).t =  2; 
				}
				break;
			case AT:
				{
				setState(431);
				match(AT);
				setState(432);
				match(INTERFACE);
				 ((ClassDeclarationContext)_localctx).t =  3; 
				}
				break;
			case TRAIT:
				{
				setState(434);
				match(TRAIT);
				 ((ClassDeclarationContext)_localctx).t =  4; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(438);
			identifier();
			setState(439);
			nls();
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(440);
				if (!( 3 != _localctx.t )) throw new FailedPredicateException(this, " 3 != $t ");
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(441);
					typeParameters();
					}
					break;
				}
				setState(444);
				nls();
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(445);
					if (!( 2 != _localctx.t )) throw new FailedPredicateException(this, " 2 != $t ");
					setState(455);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(446);
						match(EXTENDS);
						setState(447);
						nls();
						setState(451);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(448);
							if (!(1 == _localctx.t)) throw new FailedPredicateException(this, "1 == $t");
							setState(449);
							((ClassDeclarationContext)_localctx).scs = typeList();
							}
							break;
						case 2:
							{
							setState(450);
							((ClassDeclarationContext)_localctx).sc = type();
							}
							break;
						}
						setState(453);
						nls();
						}
						break;
					}
					}
					break;
				case 2:
					{
					}
					break;
				}
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(460);
					if (!(1 != _localctx.t)) throw new FailedPredicateException(this, "1 != $t");
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IMPLEMENTS) {
						{
						setState(461);
						match(IMPLEMENTS);
						setState(462);
						nls();
						setState(463);
						((ClassDeclarationContext)_localctx).is = typeList();
						setState(464);
						nls();
						}
					}

					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(474);
			classBody(_localctx.t);
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

	public static class ClassBodyContext extends GroovyParserRuleContext {
		public int t;
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody(int t) throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState(), t);
		enterRule(_localctx, 38, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(LBRACE);
			setState(477);
			nls();
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(478);
				if (!( 2 == _localctx.t )) throw new FailedPredicateException(this, " 2 == $t ");
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(479);
					enumConstants();
					}
					break;
				}
				setState(482);
				nls();
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(486);
				classBodyDeclaration(_localctx.t);
				}
				break;
			}
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(489);
					sep();
					setState(490);
					classBodyDeclaration(_localctx.t);
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI || _la==NL) {
				{
				setState(497);
				sep();
				}
			}

			setState(500);
			match(RBRACE);
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

	public static class EnumConstantsContext extends GroovyParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			enumConstant();
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					nls();
					setState(504);
					match(COMMA);
					setState(505);
					nls();
					setState(506);
					enumConstant();
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(513);
				nls();
				setState(514);
				match(COMMA);
				}
				break;
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

	public static class EnumConstantContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AnonymousInnerClassDeclarationContext anonymousInnerClassDeclaration() {
			return getRuleContext(AnonymousInnerClassDeclarationContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			annotationsOpt();
			setState(519);
			identifier();
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(520);
				arguments();
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(523);
				anonymousInnerClassDeclaration(1);
				}
				break;
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

	public static class ClassBodyDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public TerminalNode SEMI() { return getToken(GroovyParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration(int t) throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState(), t);
		enterRule(_localctx, 44, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(527);
					match(STATIC);
					setState(528);
					nls();
					}
				}

				setState(531);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				memberDeclaration(_localctx.t);
				}
				break;
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

	public static class MemberDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ModifiersOptContext modifiersOpt() {
			return getRuleContext(ModifiersOptContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration(int t) throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState(), t);
		enterRule(_localctx, 46, RULE_memberDeclaration);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				methodDeclaration(0, _localctx.t);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				modifiersOpt();
				setState(538);
				classDeclaration();
				}
				break;
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

	public static class MethodDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public int ct;
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public TerminalNode DEFAULT() { return getToken(GroovyParser.DEFAULT, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ModifiersOptContext modifiersOpt() {
			return getRuleContext(ModifiersOptContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(GroovyParser.THROWS, 0); }
		public QualifiedClassNameListContext qualifiedClassNameList() {
			return getRuleContext(QualifiedClassNameListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState, int t, int ct) {
			super(parent, invokingState);
			this.t = t;
			this.ct = ct;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(int t,int ct) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), t, ct);
		enterRule(_localctx, 48, RULE_methodDeclaration);
		int _la;
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				if (!( 3 == _localctx.ct )) throw new FailedPredicateException(this, " 3 == $ct ");
				setState(543);
				returnType(_localctx.ct);
				setState(544);
				methodName();
				setState(545);
				match(LPAREN);
				setState(546);
				match(RPAREN);
				setState(551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(547);
					match(DEFAULT);
					setState(548);
					nls();
					setState(549);
					elementValue();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				modifiersOpt();
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(554);
					typeParameters();
					}
					break;
				}
				setState(558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(557);
					returnType(_localctx.ct);
					}
					break;
				}
				setState(560);
				methodName();
				setState(561);
				formalParameters();
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(562);
					nls();
					setState(563);
					match(THROWS);
					setState(564);
					nls();
					setState(565);
					qualifiedClassNameList();
					}
					break;
				}
				setState(569);
				nls();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(570);
					methodBody();
					}
				}

				}
				break;
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

	public static class MethodNameContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodName);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				stringLiteral();
				}
				break;
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

	public static class ReturnTypeContext extends GroovyParserRuleContext {
		public int ct;
		public StandardTypeContext standardType() {
			return getRuleContext(StandardTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GroovyParser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState, int ct) {
			super(parent, invokingState);
			this.ct = ct;
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType(int ct) throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState(), ct);
		enterRule(_localctx, 52, RULE_returnType);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				standardType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				if (!( 3 != _localctx.ct )) throw new FailedPredicateException(this, " 3 != $ct ");
				setState(581);
				match(VOID);
				}
				break;
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

	public static class FieldDeclarationContext extends GroovyParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			variableDeclaration(1);
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

	public static class VariableDeclaratorsContext extends GroovyParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			variableDeclarator();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(587);
				match(COMMA);
				setState(588);
				nls();
				setState(589);
				variableDeclarator();
				}
				}
				setState(595);
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

	public static class VariableDeclaratorContext extends GroovyParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			variableDeclaratorId();
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(597);
				nls();
				setState(598);
				match(ASSIGN);
				setState(599);
				nls();
				setState(600);
				variableInitializer();
				}
				break;
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

	public static class VariableDeclaratorIdContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			identifier();
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

	public static class VariableInitializerContext extends GroovyParserRuleContext {
		public EnhancedStatementExpressionContext enhancedStatementExpression() {
			return getRuleContext(EnhancedStatementExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			enhancedStatementExpression();
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

	public static class VariableInitializersContext extends GroovyParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public VariableInitializersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableInitializers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableInitializers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableInitializers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializersContext variableInitializers() throws RecognitionException {
		VariableInitializersContext _localctx = new VariableInitializersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableInitializers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			variableInitializer();
			setState(609);
			nls();
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(610);
					match(COMMA);
					setState(611);
					nls();
					setState(612);
					variableInitializer();
					setState(613);
					nls();
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(620);
			nls();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(621);
				match(COMMA);
				}
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

	public static class DimsContext extends GroovyParserRuleContext {
		public List<AnnotationsOptContext> annotationsOpt() {
			return getRuleContexts(AnnotationsOptContext.class);
		}
		public AnnotationsOptContext annotationsOpt(int i) {
			return getRuleContext(AnnotationsOptContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(GroovyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(GroovyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(GroovyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(GroovyParser.RBRACK, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(624);
					annotationsOpt();
					setState(625);
					match(LBRACK);
					setState(626);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(630); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DimsOptContext extends GroovyParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DimsOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimsOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDimsOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDimsOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDimsOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsOptContext dimsOpt() throws RecognitionException {
		DimsOptContext _localctx = new DimsOptContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dimsOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(632);
				dims();
				}
				break;
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

	public static class StandardTypeContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public DimsOptContext dimsOpt() {
			return getRuleContext(DimsOptContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public StandardClassOrInterfaceTypeContext standardClassOrInterfaceType() {
			return getRuleContext(StandardClassOrInterfaceTypeContext.class,0);
		}
		public StandardTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStandardType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStandardType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStandardType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardTypeContext standardType() throws RecognitionException {
		StandardTypeContext _localctx = new StandardTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_standardType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			annotationsOpt();
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(636);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(637);
				standardClassOrInterfaceType();
				}
				break;
			}
			setState(640);
			dimsOpt();
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

	public static class TypeContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public DimsOptContext dimsOpt() {
			return getRuleContext(DimsOptContext.class,0);
		}
		public GeneralClassOrInterfaceTypeContext generalClassOrInterfaceType() {
			return getRuleContext(GeneralClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GroovyParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			annotationsOpt();
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(646);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BuiltInPrimitiveType:
					{
					setState(643);
					primitiveType();
					}
					break;
				case VOID:
					{
					setState(644);
					match(VOID);
					 require(false, "void is not allowed here", -4); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(648);
				generalClassOrInterfaceType();
				}
				break;
			}
			setState(651);
			dimsOpt();
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

	public static class ClassOrInterfaceTypeContext extends GroovyParserRuleContext {
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public QualifiedStandardClassNameContext qualifiedStandardClassName() {
			return getRuleContext(QualifiedStandardClassNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(653);
				qualifiedClassName();
				}
				break;
			case 2:
				{
				setState(654);
				qualifiedStandardClassName();
				}
				break;
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(657);
				typeArguments();
				}
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

	public static class GeneralClassOrInterfaceTypeContext extends GroovyParserRuleContext {
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public GeneralClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGeneralClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGeneralClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGeneralClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralClassOrInterfaceTypeContext generalClassOrInterfaceType() throws RecognitionException {
		GeneralClassOrInterfaceTypeContext _localctx = new GeneralClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_generalClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			qualifiedClassName();
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(661);
				typeArguments();
				}
				break;
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

	public static class StandardClassOrInterfaceTypeContext extends GroovyParserRuleContext {
		public QualifiedStandardClassNameContext qualifiedStandardClassName() {
			return getRuleContext(QualifiedStandardClassNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public StandardClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStandardClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStandardClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStandardClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardClassOrInterfaceTypeContext standardClassOrInterfaceType() throws RecognitionException {
		StandardClassOrInterfaceTypeContext _localctx = new StandardClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_standardClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			qualifiedStandardClassName();
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(665);
				typeArguments();
				}
				break;
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

	public static class PrimitiveTypeContext extends GroovyParserRuleContext {
		public TerminalNode BuiltInPrimitiveType() { return getToken(GroovyParser.BuiltInPrimitiveType, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(BuiltInPrimitiveType);
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

	public static class TypeArgumentsContext extends GroovyParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(LT);
			setState(671);
			nls();
			setState(672);
			typeArgument();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(673);
				match(COMMA);
				setState(674);
				nls();
				setState(675);
				typeArgument();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
			nls();
			setState(683);
			match(GT);
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

	public static class TypeArgumentContext extends GroovyParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(GroovyParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(GroovyParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArgument);
		int _la;
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				annotationsOpt();
				setState(687);
				match(QUESTION);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(688);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(689);
					nls();
					setState(690);
					type();
					}
				}

				}
				break;
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

	public static class AnnotatedQualifiedClassNameContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public AnnotatedQualifiedClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedQualifiedClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotatedQualifiedClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotatedQualifiedClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotatedQualifiedClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedQualifiedClassNameContext annotatedQualifiedClassName() throws RecognitionException {
		AnnotatedQualifiedClassNameContext _localctx = new AnnotatedQualifiedClassNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_annotatedQualifiedClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			annotationsOpt();
			setState(697);
			qualifiedClassName();
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

	public static class QualifiedClassNameListContext extends GroovyParserRuleContext {
		public List<AnnotatedQualifiedClassNameContext> annotatedQualifiedClassName() {
			return getRuleContexts(AnnotatedQualifiedClassNameContext.class);
		}
		public AnnotatedQualifiedClassNameContext annotatedQualifiedClassName(int i) {
			return getRuleContext(AnnotatedQualifiedClassNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public QualifiedClassNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedClassNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedClassNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedClassNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedClassNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedClassNameListContext qualifiedClassNameList() throws RecognitionException {
		QualifiedClassNameListContext _localctx = new QualifiedClassNameListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedClassNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			annotatedQualifiedClassName();
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(700);
				match(COMMA);
				setState(701);
				nls();
				setState(702);
				annotatedQualifiedClassName();
				}
				}
				setState(708);
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

	public static class FormalParametersContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(LPAREN);
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(710);
				formalParameterList();
				}
				break;
			}
			setState(713);
			match(RPAREN);
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

	public static class FormalParameterListContext extends GroovyParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ThisFormalParameterContext thisFormalParameter() {
			return getRuleContext(ThisFormalParameterContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(715);
				formalParameter();
				}
				break;
			case 2:
				{
				setState(716);
				thisFormalParameter();
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(719);
				match(COMMA);
				setState(720);
				nls();
				setState(721);
				formalParameter();
				}
				}
				setState(727);
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

	public static class ThisFormalParameterContext extends GroovyParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(GroovyParser.THIS, 0); }
		public ThisFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThisFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThisFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThisFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisFormalParameterContext thisFormalParameter() throws RecognitionException {
		ThisFormalParameterContext _localctx = new ThisFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_thisFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			type();
			setState(729);
			match(THIS);
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

	public static class FormalParameterContext extends GroovyParserRuleContext {
		public VariableModifiersOptContext variableModifiersOpt() {
			return getRuleContext(VariableModifiersOptContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(GroovyParser.ELLIPSIS, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			variableModifiersOpt();
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(732);
				type();
				}
				break;
			}
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(735);
				match(ELLIPSIS);
				}
				break;
			}
			setState(738);
			variableDeclaratorId();
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(739);
				nls();
				setState(740);
				match(ASSIGN);
				setState(741);
				nls();
				setState(742);
				expression(0);
				}
				break;
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

	public static class MethodBodyContext extends GroovyParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			block();
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

	public static class QualifiedNameContext extends GroovyParserRuleContext {
		public List<QualifiedNameElementContext> qualifiedNameElement() {
			return getRuleContexts(QualifiedNameElementContext.class);
		}
		public QualifiedNameElementContext qualifiedNameElement(int i) {
			return getRuleContext(QualifiedNameElementContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			qualifiedNameElement();
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(749);
					match(DOT);
					setState(750);
					qualifiedNameElement();
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class QualifiedNameElementContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEF() { return getToken(GroovyParser.DEF, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public TerminalNode TRAIT() { return getToken(GroovyParser.TRAIT, 0); }
		public QualifiedNameElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedNameElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedNameElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedNameElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameElementContext qualifiedNameElement() throws RecognitionException {
		QualifiedNameElementContext _localctx = new QualifiedNameElementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_qualifiedNameElement);
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				match(DEF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				match(IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
				match(AS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(760);
				match(TRAIT);
				}
				break;
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

	public static class QualifiedNameElementsContext extends GroovyParserRuleContext {
		public List<QualifiedNameElementContext> qualifiedNameElement() {
			return getRuleContexts(QualifiedNameElementContext.class);
		}
		public QualifiedNameElementContext qualifiedNameElement(int i) {
			return getRuleContext(QualifiedNameElementContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public QualifiedNameElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedNameElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedNameElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedNameElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameElementsContext qualifiedNameElements() throws RecognitionException {
		QualifiedNameElementsContext _localctx = new QualifiedNameElementsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_qualifiedNameElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(763);
					qualifiedNameElement();
					setState(764);
					match(DOT);
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class QualifiedClassNameContext extends GroovyParserRuleContext {
		public QualifiedNameElementsContext qualifiedNameElements() {
			return getRuleContext(QualifiedNameElementsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedClassNameContext qualifiedClassName() throws RecognitionException {
		QualifiedClassNameContext _localctx = new QualifiedClassNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_qualifiedClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			qualifiedNameElements();
			setState(772);
			identifier();
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

	public static class QualifiedStandardClassNameContext extends GroovyParserRuleContext {
		public QualifiedNameElementsContext qualifiedNameElements() {
			return getRuleContext(QualifiedNameElementsContext.class,0);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public QualifiedStandardClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedStandardClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterQualifiedStandardClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitQualifiedStandardClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitQualifiedStandardClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedStandardClassNameContext qualifiedStandardClassName() throws RecognitionException {
		QualifiedStandardClassNameContext _localctx = new QualifiedStandardClassNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifiedStandardClassName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			qualifiedNameElements();
			setState(775);
			className();
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(776);
					match(DOT);
					setState(777);
					className();
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class LiteralContext extends GroovyParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralAltContext extends LiteralContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStringLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStringLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStringLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralAltContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(GroovyParser.IntegerLiteral, 0); }
		public IntegerLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIntegerLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIntegerLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIntegerLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatingPointLiteralAltContext extends LiteralContext {
		public TerminalNode FloatingPointLiteral() { return getToken(GroovyParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFloatingPointLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFloatingPointLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFloatingPointLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralAltContext extends LiteralContext {
		public TerminalNode NullLiteral() { return getToken(GroovyParser.NullLiteral, 0); }
		public NullLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNullLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNullLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNullLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralAltContext extends LiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(GroovyParser.BooleanLiteral, 0); }
		public BooleanLiteralAltContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBooleanLiteralAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBooleanLiteralAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBooleanLiteralAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		try {
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntegerLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				_localctx = new FloatingPointLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(FloatingPointLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				stringLiteral();
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				match(BooleanLiteral);
				}
				break;
			case NullLiteral:
				_localctx = new NullLiteralAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(787);
				match(NullLiteral);
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

	public static class GstringContext extends GroovyParserRuleContext {
		public TerminalNode GStringBegin() { return getToken(GroovyParser.GStringBegin, 0); }
		public List<GstringValueContext> gstringValue() {
			return getRuleContexts(GstringValueContext.class);
		}
		public GstringValueContext gstringValue(int i) {
			return getRuleContext(GstringValueContext.class,i);
		}
		public TerminalNode GStringEnd() { return getToken(GroovyParser.GStringEnd, 0); }
		public List<TerminalNode> GStringPart() { return getTokens(GroovyParser.GStringPart); }
		public TerminalNode GStringPart(int i) {
			return getToken(GroovyParser.GStringPart, i);
		}
		public GstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringContext gstring() throws RecognitionException {
		GstringContext _localctx = new GstringContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_gstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(GStringBegin);
			setState(791);
			gstringValue();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GStringPart) {
				{
				{
				setState(792);
				match(GStringPart);
				setState(793);
				gstringValue();
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			match(GStringEnd);
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

	public static class GstringValueContext extends GroovyParserRuleContext {
		public GstringPathContext gstringPath() {
			return getRuleContext(GstringPathContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public GstringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringValueContext gstringValue() throws RecognitionException {
		GstringValueContext _localctx = new GstringValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_gstringValue);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				gstringPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(LBRACE);
				setState(804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(803);
					statementExpression();
					}
					break;
				}
				setState(806);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				closure();
				}
				break;
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

	public static class GstringPathContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> GStringPathPart() { return getTokens(GroovyParser.GStringPathPart); }
		public TerminalNode GStringPathPart(int i) {
			return getToken(GroovyParser.GStringPathPart, i);
		}
		public GstringPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstringPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringPathContext gstringPath() throws RecognitionException {
		GstringPathContext _localctx = new GstringPathContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_gstringPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			identifier();
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GStringPathPart) {
				{
				{
				setState(811);
				match(GStringPathPart);
				}
				}
				setState(816);
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

	public static class LambdaExpressionContext extends GroovyParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(GroovyParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			lambdaParameters();
			setState(818);
			nls();
			setState(819);
			match(ARROW);
			setState(820);
			nls();
			setState(821);
			lambdaBody();
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

	public static class StandardLambdaExpressionContext extends GroovyParserRuleContext {
		public StandardLambdaParametersContext standardLambdaParameters() {
			return getRuleContext(StandardLambdaParametersContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(GroovyParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public StandardLambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardLambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStandardLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStandardLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStandardLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardLambdaExpressionContext standardLambdaExpression() throws RecognitionException {
		StandardLambdaExpressionContext _localctx = new StandardLambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_standardLambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			standardLambdaParameters();
			setState(824);
			nls();
			setState(825);
			match(ARROW);
			setState(826);
			nls();
			setState(827);
			lambdaBody();
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

	public static class LambdaParametersContext extends GroovyParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_lambdaParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			formalParameters();
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

	public static class StandardLambdaParametersContext extends GroovyParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StandardLambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardLambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStandardLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStandardLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStandardLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardLambdaParametersContext standardLambdaParameters() throws RecognitionException {
		StandardLambdaParametersContext _localctx = new StandardLambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_standardLambdaParameters);
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				formalParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				variableDeclaratorId();
				}
				break;
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

	public static class LambdaBodyContext extends GroovyParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_lambdaBody);
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				statementExpression();
				}
				break;
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

	public static class ClosureContext extends GroovyParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public BlockStatementsOptContext blockStatementsOpt() {
			return getRuleContext(BlockStatementsOptContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public TerminalNode ARROW() { return getToken(GroovyParser.ARROW, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClosure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClosure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureContext closure() throws RecognitionException {
		ClosureContext _localctx = new ClosureContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(LBRACE);
			setState(840);
			nls();
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(841);
					formalParameterList();
					}
					break;
				}
				setState(844);
				nls();
				setState(845);
				match(ARROW);
				setState(846);
				nls();
				}
				break;
			}
			setState(850);
			blockStatementsOpt();
			setState(851);
			match(RBRACE);
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

	public static class BlockStatementsOptContext extends GroovyParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockStatementsOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatementsOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStatementsOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStatementsOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStatementsOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsOptContext blockStatementsOpt() throws RecognitionException {
		BlockStatementsOptContext _localctx = new BlockStatementsOptContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockStatementsOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(853);
				blockStatements();
				}
				break;
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

	public static class BlockStatementsContext extends GroovyParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_blockStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			blockStatement();
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(857);
					sep();
					setState(858);
					blockStatement();
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(865);
				sep();
				}
				break;
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

	public static class AnnotationsOptContext extends GroovyParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public AnnotationsOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationsOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationsOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationsOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationsOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsOptContext annotationsOpt() throws RecognitionException {
		AnnotationsOptContext _localctx = new AnnotationsOptContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationsOpt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(868);
					annotation();
					setState(869);
					nls();
					}
					} 
				}
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class AnnotationContext extends GroovyParserRuleContext {
		public TerminalNode AT() { return getToken(GroovyParser.AT, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public ElementValuesContext elementValues() {
			return getRuleContext(ElementValuesContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(AT);
			setState(877);
			annotationName();
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(878);
				match(LPAREN);
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(879);
					elementValues();
					}
					break;
				}
				setState(882);
				rparen();
				}
				break;
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

	public static class ElementValuesContext extends GroovyParserRuleContext {
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuesContext elementValues() throws RecognitionException {
		ElementValuesContext _localctx = new ElementValuesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_elementValues);
		try {
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				elementValuePairs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				elementValue();
				}
				break;
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

	public static class AnnotationNameContext extends GroovyParserRuleContext {
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			qualifiedClassName();
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

	public static class ElementValuePairsContext extends GroovyParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_elementValuePairs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			elementValuePair();
			setState(896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(892);
					match(COMMA);
					setState(893);
					elementValuePair();
					}
					} 
				}
				setState(898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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

	public static class ElementValuePairContext extends GroovyParserRuleContext {
		public ElementValuePairNameContext elementValuePairName() {
			return getRuleContext(ElementValuePairNameContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			elementValuePairName();
			setState(900);
			nls();
			setState(901);
			match(ASSIGN);
			setState(902);
			nls();
			setState(903);
			elementValue();
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

	public static class ElementValuePairNameContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public ElementValuePairNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValuePairName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValuePairName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValuePairName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairNameContext elementValuePairName() throws RecognitionException {
		ElementValuePairNameContext _localctx = new ElementValuePairNameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_elementValuePairName);
		try {
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				keywords();
				}
				break;
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

	public static class ElementValueContext extends GroovyParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elementValue);
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				elementValueArrayInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(911);
				expression(0);
				}
				break;
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

	public static class ElementValueArrayInitializerContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(LBRACK);
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(915);
				elementValue();
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(916);
						match(COMMA);
						setState(917);
						elementValue();
						}
						} 
					}
					setState(922);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			}
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(925);
				match(COMMA);
				}
			}

			setState(928);
			match(RBRACK);
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

	public static class BlockContext extends GroovyParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public BlockStatementsOptContext blockStatementsOpt() {
			return getRuleContext(BlockStatementsOptContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(LBRACE);
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(931);
				nls();
				}
				break;
			case 2:
				{
				setState(935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(932);
						sep();
						}
						} 
					}
					setState(937);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			}
			setState(940);
			blockStatementsOpt();
			setState(941);
			match(RBRACE);
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

	public static class BlockStatementContext extends GroovyParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_blockStatement);
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				statement();
				}
				break;
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

	public static class LocalVariableDeclarationContext extends GroovyParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			if (!( !SemanticPredicates.isInvalidLocalVariableDeclaration(_input) )) throw new FailedPredicateException(this, " !SemanticPredicates.isInvalidLocalVariableDeclaration(_input) ");
			setState(948);
			variableDeclaration(0);
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

	public static class ClassifiedModifiersContext extends GroovyParserRuleContext {
		public int t;
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassifiedModifiersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassifiedModifiersContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_classifiedModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassifiedModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassifiedModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassifiedModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassifiedModifiersContext classifiedModifiers(int t) throws RecognitionException {
		ClassifiedModifiersContext _localctx = new ClassifiedModifiersContext(_ctx, getState(), t);
		enterRule(_localctx, 158, RULE_classifiedModifiers);
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				if (!( 0 == _localctx.t )) throw new FailedPredicateException(this, " 0 == $t ");
				setState(951);
				variableModifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				if (!( 1 == _localctx.t )) throw new FailedPredicateException(this, " 1 == $t ");
				setState(953);
				modifiers();
				}
				break;
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

	public static class VariableDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public ClassifiedModifiersContext classifiedModifiers() {
			return getRuleContext(ClassifiedModifiersContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeNamePairsContext typeNamePairs() {
			return getRuleContext(TypeNamePairsContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration(int t) throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState(), t);
		enterRule(_localctx, 160, RULE_variableDeclaration);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				classifiedModifiers(_localctx.t);
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(958);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(957);
						type();
						}
						break;
					}
					setState(960);
					variableDeclarators();
					}
					break;
				case 2:
					{
					setState(961);
					typeNamePairs();
					setState(962);
					nls();
					setState(963);
					match(ASSIGN);
					setState(964);
					nls();
					setState(965);
					variableInitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(969);
					classifiedModifiers(_localctx.t);
					}
					break;
				}
				setState(972);
				type();
				setState(973);
				variableDeclarators();
				}
				break;
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

	public static class TypeNamePairsContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public List<TypeNamePairContext> typeNamePair() {
			return getRuleContexts(TypeNamePairContext.class);
		}
		public TypeNamePairContext typeNamePair(int i) {
			return getRuleContext(TypeNamePairContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public TypeNamePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeNamePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeNamePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeNamePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamePairsContext typeNamePairs() throws RecognitionException {
		TypeNamePairsContext _localctx = new TypeNamePairsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeNamePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(LPAREN);
			setState(978);
			typeNamePair();
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(979);
				match(COMMA);
				setState(980);
				typeNamePair();
				}
				}
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(986);
			match(RPAREN);
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

	public static class TypeNamePairContext extends GroovyParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeNamePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeNamePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeNamePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeNamePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamePairContext typeNamePair() throws RecognitionException {
		TypeNamePairContext _localctx = new TypeNamePairContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeNamePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(988);
				type();
				}
				break;
			}
			setState(991);
			variableDeclaratorId();
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

	public static class VariableNamesContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public List<VariableDeclaratorIdContext> variableDeclaratorId() {
			return getRuleContexts(VariableDeclaratorIdContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId(int i) {
			return getRuleContext(VariableDeclaratorIdContext.class,i);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public VariableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNamesContext variableNames() throws RecognitionException {
		VariableNamesContext _localctx = new VariableNamesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(LPAREN);
			setState(994);
			variableDeclaratorId();
			setState(997); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(995);
				match(COMMA);
				setState(996);
				variableDeclaratorId();
				}
				}
				setState(999); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(1001);
			rparen();
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

	public static class ConditionalStatementContext extends GroovyParserRuleContext {
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_conditionalStatement);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				ifElseStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				switchStatement();
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

	public static class IfElseStatementContext extends GroovyParserRuleContext {
		public StatementContext tb;
		public StatementContext fb;
		public TerminalNode IF() { return getToken(GroovyParser.IF, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GroovyParser.ELSE, 0); }
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(IF);
			setState(1008);
			expressionInPar();
			setState(1009);
			nls();
			setState(1010);
			((IfElseStatementContext)_localctx).tb = statement();
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1011);
					nls();
					}
					break;
				case 2:
					{
					setState(1012);
					sep();
					}
					break;
				}
				setState(1015);
				match(ELSE);
				setState(1016);
				nls();
				setState(1017);
				((IfElseStatementContext)_localctx).fb = statement();
				}
				break;
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

	public static class SwitchStatementContext extends GroovyParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GroovyParser.SWITCH, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(SWITCH);
			setState(1022);
			expressionInPar();
			setState(1023);
			nls();
			setState(1024);
			match(LBRACE);
			setState(1025);
			nls();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1026);
				switchBlockStatementGroup();
				}
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032);
			nls();
			setState(1033);
			match(RBRACE);
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

	public static class LoopStatementContext extends GroovyParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhileStmtAltContext extends LoopStatementContext {
		public TerminalNode DO() { return getToken(GroovyParser.DO, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GroovyParser.WHILE, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public DoWhileStmtAltContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDoWhileStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDoWhileStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDoWhileStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmtAltContext extends LoopStatementContext {
		public TerminalNode FOR() { return getToken(GroovyParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStmtAltContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtAltContext extends LoopStatementContext {
		public TerminalNode WHILE() { return getToken(GroovyParser.WHILE, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtAltContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterWhileStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitWhileStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitWhileStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_loopStatement);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				match(FOR);
				setState(1036);
				match(LPAREN);
				setState(1037);
				forControl();
				setState(1038);
				rparen();
				setState(1039);
				nls();
				setState(1040);
				statement();
				}
				break;
			case WHILE:
				_localctx = new WhileStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				match(WHILE);
				setState(1043);
				expressionInPar();
				setState(1044);
				nls();
				setState(1045);
				statement();
				}
				break;
			case DO:
				_localctx = new DoWhileStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1047);
				match(DO);
				setState(1048);
				nls();
				setState(1049);
				statement();
				setState(1050);
				nls();
				setState(1051);
				match(WHILE);
				setState(1052);
				expressionInPar();
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

	public static class ContinueStatementContext extends GroovyParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GroovyParser.CONTINUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(CONTINUE);
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1057);
				identifier();
				}
				break;
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

	public static class BreakStatementContext extends GroovyParserRuleContext {
		public TerminalNode BREAK() { return getToken(GroovyParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(BREAK);
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1061);
				identifier();
				}
				break;
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

	public static class TryCatchStatementContext extends GroovyParserRuleContext {
		public TerminalNode TRY() { return getToken(GroovyParser.TRY, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_tryCatchStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(TRY);
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1065);
				resources();
				}
			}

			setState(1068);
			nls();
			setState(1069);
			block();
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1070);
					nls();
					setState(1071);
					catchClause();
					}
					} 
				}
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1078);
				nls();
				setState(1079);
				finallyBlock();
				}
				break;
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

	public static class AssertStatementContext extends GroovyParserRuleContext {
		public ExpressionContext ce;
		public ExpressionContext me;
		public TerminalNode ASSERT() { return getToken(GroovyParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(ASSERT);
			setState(1084);
			((AssertStatementContext)_localctx).ce = expression(0);
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1085);
				nls();
				setState(1086);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1087);
				nls();
				setState(1088);
				((AssertStatementContext)_localctx).me = expression(0);
				}
				break;
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

	public static class StatementContext extends GroovyParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalStmtAltContext extends StatementContext {
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public ConditionalStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConditionalStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConditionalStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConditionalStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtAltContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(GroovyParser.SEMI, 0); }
		public EmptyStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEmptyStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEmptyStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEmptyStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtAltContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryCatchStmtAltContext extends StatementContext {
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public TryCatchStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTryCatchStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTryCatchStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTryCatchStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtAltContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBreakStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBreakStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBreakStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportStmtAltContext extends StatementContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public ImportStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterImportStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitImportStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitImportStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtAltContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ContinueStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterContinueStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitContinueStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitContinueStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertStmtAltContext extends StatementContext {
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public AssertStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAssertStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAssertStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAssertStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopStmtAltContext extends StatementContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LoopStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLoopStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLoopStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLoopStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SynchronizedStmtAltContext extends StatementContext {
		public TerminalNode SYNCHRONIZED() { return getToken(GroovyParser.SYNCHRONIZED, 0); }
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSynchronizedStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSynchronizedStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSynchronizedStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStmtAltContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodDeclarationStmtAltContext extends StatementContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodDeclarationStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodDeclarationStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodDeclarationStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodDeclarationStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalVariableDeclarationStmtAltContext extends StatementContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLocalVariableDeclarationStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLocalVariableDeclarationStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDeclarationStmtAltContext extends StatementContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TypeDeclarationStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeDeclarationStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeDeclarationStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeDeclarationStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtAltContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(GroovyParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterReturnStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitReturnStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitReturnStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowStmtAltContext extends StatementContext {
		public TerminalNode THROW() { return getToken(GroovyParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThrowStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThrowStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThrowStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabeledStmtAltContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLabeledStmtAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLabeledStmtAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLabeledStmtAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_statement);
		try {
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				_localctx = new BlockStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				block();
				}
				break;
			case 2:
				_localctx = new ConditionalStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				conditionalStatement();
				}
				break;
			case 3:
				_localctx = new LoopStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				loopStatement();
				}
				break;
			case 4:
				_localctx = new TryCatchStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1095);
				tryCatchStatement();
				}
				break;
			case 5:
				_localctx = new SynchronizedStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1096);
				match(SYNCHRONIZED);
				setState(1097);
				expressionInPar();
				setState(1098);
				nls();
				setState(1099);
				block();
				}
				break;
			case 6:
				_localctx = new ReturnStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1101);
				match(RETURN);
				setState(1103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1102);
					expression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new ThrowStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1105);
				match(THROW);
				setState(1106);
				expression(0);
				}
				break;
			case 8:
				_localctx = new BreakStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1107);
				breakStatement();
				}
				break;
			case 9:
				_localctx = new ContinueStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1108);
				continueStatement();
				}
				break;
			case 10:
				_localctx = new LabeledStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1109);
				identifier();
				setState(1110);
				match(COLON);
				setState(1111);
				nls();
				setState(1112);
				statement();
				}
				break;
			case 11:
				_localctx = new ImportStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1114);
				importDeclaration();
				}
				break;
			case 12:
				_localctx = new AssertStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1115);
				assertStatement();
				}
				break;
			case 13:
				_localctx = new TypeDeclarationStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1116);
				typeDeclaration();
				}
				break;
			case 14:
				_localctx = new LocalVariableDeclarationStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1117);
				localVariableDeclaration();
				}
				break;
			case 15:
				_localctx = new MethodDeclarationStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1118);
				if (!( !SemanticPredicates.isInvalidMethodDeclaration(_input) )) throw new FailedPredicateException(this, " !SemanticPredicates.isInvalidMethodDeclaration(_input) ");
				setState(1119);
				methodDeclaration(3, 9);
				}
				break;
			case 16:
				_localctx = new ExpressionStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1120);
				statementExpression();
				}
				break;
			case 17:
				_localctx = new EmptyStmtAltContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1121);
				match(SEMI);
				}
				break;
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

	public static class CatchClauseContext extends GroovyParserRuleContext {
		public TerminalNode CATCH() { return getToken(GroovyParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public VariableModifiersOptContext variableModifiersOpt() {
			return getRuleContext(VariableModifiersOptContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(CATCH);
			setState(1125);
			match(LPAREN);
			setState(1126);
			variableModifiersOpt();
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1127);
				catchType();
				}
				break;
			}
			setState(1130);
			identifier();
			setState(1131);
			rparen();
			setState(1132);
			nls();
			setState(1133);
			block();
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

	public static class CatchTypeContext extends GroovyParserRuleContext {
		public List<QualifiedClassNameContext> qualifiedClassName() {
			return getRuleContexts(QualifiedClassNameContext.class);
		}
		public QualifiedClassNameContext qualifiedClassName(int i) {
			return getRuleContext(QualifiedClassNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(GroovyParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(GroovyParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_catchType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			qualifiedClassName();
			setState(1140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1136);
					match(BITOR);
					setState(1137);
					qualifiedClassName();
					}
					} 
				}
				setState(1142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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

	public static class FinallyBlockContext extends GroovyParserRuleContext {
		public TerminalNode FINALLY() { return getToken(GroovyParser.FINALLY, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(FINALLY);
			setState(1144);
			nls();
			setState(1145);
			block();
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

	public static class ResourcesContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_resources);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(LPAREN);
			setState(1148);
			nls();
			setState(1149);
			resourceList();
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1150);
				sep();
				}
				break;
			}
			setState(1153);
			rparen();
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

	public static class ResourceListContext extends GroovyParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			resource();
			setState(1161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1156);
					sep();
					setState(1157);
					resource();
					}
					} 
				}
				setState(1163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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

	public static class ResourceContext extends GroovyParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_resource);
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				expression(0);
				}
				break;
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

	public static class SwitchBlockStatementGroupContext extends GroovyParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1171); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1168);
					switchLabel();
					setState(1169);
					nls();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1173); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1175);
			blockStatements();
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

	public static class SwitchLabelContext extends GroovyParserRuleContext {
		public TerminalNode CASE() { return getToken(GroovyParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(GroovyParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_switchLabel);
		try {
			setState(1183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				match(CASE);
				setState(1178);
				expression(0);
				setState(1179);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				match(DEFAULT);
				setState(1182);
				match(COLON);
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

	public static class ForControlContext extends GroovyParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ClassicalForControlContext classicalForControl() {
			return getRuleContext(ClassicalForControlContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_forControl);
		try {
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				classicalForControl();
				}
				break;
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

	public static class EnhancedForControlContext extends GroovyParserRuleContext {
		public VariableModifiersOptContext variableModifiersOpt() {
			return getRuleContext(VariableModifiersOptContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			variableModifiersOpt();
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1190);
				type();
				}
				break;
			}
			setState(1193);
			variableDeclaratorId();
			setState(1194);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1195);
			expression(0);
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

	public static class ClassicalForControlContext extends GroovyParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(GroovyParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GroovyParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ClassicalForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassicalForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassicalForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassicalForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassicalForControlContext classicalForControl() throws RecognitionException {
		ClassicalForControlContext _localctx = new ClassicalForControlContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_classicalForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1197);
				forInit();
				}
				break;
			}
			setState(1200);
			match(SEMI);
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1201);
				expression(0);
				}
				break;
			}
			setState(1204);
			match(SEMI);
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1205);
				forUpdate();
				}
				break;
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

	public static class ForInitContext extends GroovyParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_forInit);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				expressionList(false);
				}
				break;
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

	public static class ForUpdateContext extends GroovyParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			expressionList(false);
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

	public static class CastParExpressionContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public CastParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castParExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCastParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCastParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCastParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastParExpressionContext castParExpression() throws RecognitionException {
		CastParExpressionContext _localctx = new CastParExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_castParExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(LPAREN);
			setState(1215);
			type();
			setState(1216);
			rparen();
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

	public static class ParExpressionContext extends GroovyParserRuleContext {
		public ExpressionInParContext expressionInPar() {
			return getRuleContext(ExpressionInParContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			expressionInPar();
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

	public static class ExpressionInParContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public EnhancedExpressionContext enhancedExpression() {
			return getRuleContext(EnhancedExpressionContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public ExpressionInParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionInPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionInPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionInPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInParContext expressionInPar() throws RecognitionException {
		ExpressionInParContext _localctx = new ExpressionInParContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_expressionInPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(LPAREN);
			setState(1221);
			enhancedExpression();
			setState(1222);
			rparen();
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

	public static class ExpressionListContext extends GroovyParserRuleContext {
		public boolean canSpread;
		public List<ExpressionListElementContext> expressionListElement() {
			return getRuleContexts(ExpressionListElementContext.class);
		}
		public ExpressionListElementContext expressionListElement(int i) {
			return getRuleContext(ExpressionListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionListContext(ParserRuleContext parent, int invokingState, boolean canSpread) {
			super(parent, invokingState);
			this.canSpread = canSpread;
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList(boolean canSpread) throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState(), canSpread);
		enterRule(_localctx, 218, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			expressionListElement(_localctx.canSpread);
			setState(1229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1225);
					match(COMMA);
					setState(1226);
					expressionListElement(_localctx.canSpread);
					}
					} 
				}
				setState(1231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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

	public static class ExpressionListElementContext extends GroovyParserRuleContext {
		public boolean canSpread;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GroovyParser.MUL, 0); }
		public ExpressionListElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionListElementContext(ParserRuleContext parent, int invokingState, boolean canSpread) {
			super(parent, invokingState);
			this.canSpread = canSpread;
		}
		@Override public int getRuleIndex() { return RULE_expressionListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListElementContext expressionListElement(boolean canSpread) throws RecognitionException {
		ExpressionListElementContext _localctx = new ExpressionListElementContext(_ctx, getState(), canSpread);
		enterRule(_localctx, 220, RULE_expressionListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1232);
				match(MUL);
				 require(_localctx.canSpread, "spread operator is not allowed here", -1); 
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(1237);
			expression(0);
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

	public static class EnhancedStatementExpressionContext extends GroovyParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StandardLambdaExpressionContext standardLambdaExpression() {
			return getRuleContext(StandardLambdaExpressionContext.class,0);
		}
		public EnhancedStatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedStatementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedStatementExpressionContext enhancedStatementExpression() throws RecognitionException {
		EnhancedStatementExpressionContext _localctx = new EnhancedStatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_enhancedStatementExpression);
		try {
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				statementExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				standardLambdaExpression();
				}
				break;
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

	public static class StatementExpressionContext extends GroovyParserRuleContext {
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
	 
		public StatementExpressionContext() { }
		public void copyFrom(StatementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalExprAltContext extends StatementExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NormalExprAltContext(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNormalExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNormalExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNormalExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandExprAltContext extends StatementExpressionContext {
		public CommandExpressionContext commandExpression() {
			return getRuleContext(CommandExpressionContext.class,0);
		}
		public CommandExprAltContext(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCommandExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCommandExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCommandExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_statementExpression);
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				_localctx = new NormalExprAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				expression(0);
				}
				break;
			case 2:
				_localctx = new CommandExprAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				commandExpression();
				}
				break;
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

	public static class PostfixExpressionContext extends GroovyParserRuleContext {
		public Token op;
		public PathExpressionContext pathExpression() {
			return getRuleContext(PathExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(GroovyParser.INC, 0); }
		public TerminalNode DEC() { return getToken(GroovyParser.DEC, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			pathExpression();
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1248);
				((PostfixExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((PostfixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class ExpressionContext extends GroovyParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixExprAltContext extends ExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPostfixExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPostfixExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPostfixExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryNotExprAltContext extends ExpressionContext {
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BITNOT() { return getToken(GroovyParser.BITNOT, 0); }
		public TerminalNode NOT() { return getToken(GroovyParser.NOT, 0); }
		public UnaryNotExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterUnaryNotExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitUnaryNotExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitUnaryNotExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token dlOp;
		public Token tgOp;
		public Token dgOp;
		public Token rangeOp;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(GroovyParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(GroovyParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(GroovyParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(GroovyParser.GT, i);
		}
		public TerminalNode RANGE_INCLUSIVE() { return getToken(GroovyParser.RANGE_INCLUSIVE, 0); }
		public TerminalNode RANGE_EXCLUSIVE() { return getToken(GroovyParser.RANGE_EXCLUSIVE, 0); }
		public ShiftExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterShiftExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitShiftExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitShiftExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExprAltContext extends ExpressionContext {
		public CastParExpressionContext castParExpression() {
			return getRuleContext(CastParExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCastExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCastExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCastExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleAssignmentExprAltContext extends ExpressionContext {
		public VariableNamesContext left;
		public Token op;
		public StatementExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public VariableNamesContext variableNames() {
			return getRuleContext(VariableNamesContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public MultipleAssignmentExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMultipleAssignmentExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMultipleAssignmentExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMultipleAssignmentExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExclusiveOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(GroovyParser.XOR, 0); }
		public ExclusiveOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExclusiveOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExclusiveOrExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExclusiveOrExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GroovyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GroovyParser.SUB, 0); }
		public AdditiveExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAdditiveExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAdditiveExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAdditiveExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode REGEX_FIND() { return getToken(GroovyParser.REGEX_FIND, 0); }
		public TerminalNode REGEX_MATCH() { return getToken(GroovyParser.REGEX_MATCH, 0); }
		public RegexExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterRegexExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitRegexExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitRegexExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExprAltContext extends ExpressionContext {
		public ExpressionContext con;
		public ExpressionContext tb;
		public ExpressionContext fb;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode ELVIS() { return getToken(GroovyParser.ELVIS, 0); }
		public ConditionalExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConditionalExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConditionalExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConditionalExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(GroovyParser.POWER, 0); }
		public PowerExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPowerExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPowerExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPowerExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(GroovyParser.LE, 0); }
		public TerminalNode GE() { return getToken(GroovyParser.GE, 0); }
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TerminalNode NOT_IN() { return getToken(GroovyParser.NOT_IN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public TerminalNode INSTANCEOF() { return getToken(GroovyParser.INSTANCEOF, 0); }
		public TerminalNode NOT_INSTANCEOF() { return getToken(GroovyParser.NOT_INSTANCEOF, 0); }
		public RelationalExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterRelationalExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitRelationalExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitRelationalExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(GroovyParser.AND, 0); }
		public LogicalAndExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLogicalAndExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLogicalAndExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLogicalAndExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public EnhancedStatementExpressionContext enhancedStatementExpression() {
			return getRuleContext(EnhancedStatementExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GroovyParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GroovyParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GroovyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GroovyParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GroovyParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GroovyParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GroovyParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(GroovyParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(GroovyParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(GroovyParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GroovyParser.MOD_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(GroovyParser.POWER_ASSIGN, 0); }
		public TerminalNode ELVIS_ASSIGN() { return getToken(GroovyParser.ELVIS_ASSIGN, 0); }
		public AssignmentExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAssignmentExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAssignmentExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAssignmentExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryAddExprAltContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(GroovyParser.INC, 0); }
		public TerminalNode DEC() { return getToken(GroovyParser.DEC, 0); }
		public TerminalNode ADD() { return getToken(GroovyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GroovyParser.SUB, 0); }
		public UnaryAddExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterUnaryAddExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitUnaryAddExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitUnaryAddExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(GroovyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GroovyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GroovyParser.MOD, 0); }
		public MultiplicativeExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMultiplicativeExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMultiplicativeExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMultiplicativeExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InclusiveOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITOR() { return getToken(GroovyParser.BITOR, 0); }
		public InclusiveOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterInclusiveOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitInclusiveOrExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitInclusiveOrExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(GroovyParser.OR, 0); }
		public LogicalOrExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLogicalOrExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLogicalOrExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLogicalOrExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTICAL() { return getToken(GroovyParser.IDENTICAL, 0); }
		public TerminalNode NOT_IDENTICAL() { return getToken(GroovyParser.NOT_IDENTICAL, 0); }
		public TerminalNode EQUAL() { return getToken(GroovyParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(GroovyParser.NOTEQUAL, 0); }
		public TerminalNode SPACESHIP() { return getToken(GroovyParser.SPACESHIP, 0); }
		public EqualityExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEqualityExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEqualityExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEqualityExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprAltContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITAND() { return getToken(GroovyParser.BITAND, 0); }
		public AndExprAltContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAndExprAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAndExprAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAndExprAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				_localctx = new CastExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1252);
				castParExpression();
				setState(1253);
				expression(20);
				}
				break;
			case 2:
				{
				_localctx = new PostfixExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1255);
				postfixExpression();
				}
				break;
			case 3:
				{
				_localctx = new UnaryNotExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1256);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==BITNOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1257);
				nls();
				setState(1258);
				expression(18);
				}
				break;
			case 4:
				{
				_localctx = new UnaryAddExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1260);
				((UnaryAddExprAltContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (INC - 99)) | (1L << (DEC - 99)) | (1L << (ADD - 99)) | (1L << (SUB - 99)))) != 0)) ) {
					((UnaryAddExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1261);
				expression(16);
				}
				break;
			case 5:
				{
				_localctx = new MultipleAssignmentExprAltContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1262);
				((MultipleAssignmentExprAltContext)_localctx).left = variableNames();
				setState(1263);
				nls();
				setState(1264);
				((MultipleAssignmentExprAltContext)_localctx).op = match(ASSIGN);
				setState(1265);
				nls();
				setState(1266);
				((MultipleAssignmentExprAltContext)_localctx).right = statementExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((PowerExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1270);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1271);
						((PowerExprAltContext)_localctx).op = match(POWER);
						setState(1272);
						nls();
						setState(1273);
						((PowerExprAltContext)_localctx).right = expression(18);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1275);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1276);
						nls();
						setState(1277);
						((MultiplicativeExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (MUL - 103)) | (1L << (DIV - 103)) | (1L << (MOD - 103)))) != 0)) ) {
							((MultiplicativeExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1278);
						nls();
						setState(1279);
						((MultiplicativeExprAltContext)_localctx).right = expression(16);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1281);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1282);
						((AdditiveExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AdditiveExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1283);
						nls();
						setState(1284);
						((AdditiveExprAltContext)_localctx).right = expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1286);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1287);
						nls();
						setState(1298);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GT:
						case LT:
							{
							setState(1295);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(1288);
								((ShiftExprAltContext)_localctx).dlOp = match(LT);
								setState(1289);
								match(LT);
								}
								break;
							case 2:
								{
								setState(1290);
								((ShiftExprAltContext)_localctx).tgOp = match(GT);
								setState(1291);
								match(GT);
								setState(1292);
								match(GT);
								}
								break;
							case 3:
								{
								setState(1293);
								((ShiftExprAltContext)_localctx).dgOp = match(GT);
								setState(1294);
								match(GT);
								}
								break;
							}
							}
							break;
						case RANGE_INCLUSIVE:
						case RANGE_EXCLUSIVE:
							{
							setState(1297);
							((ShiftExprAltContext)_localctx).rangeOp = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==RANGE_INCLUSIVE || _la==RANGE_EXCLUSIVE) ) {
								((ShiftExprAltContext)_localctx).rangeOp = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1300);
						nls();
						setState(1301);
						((ShiftExprAltContext)_localctx).right = expression(14);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1303);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1304);
						nls();
						setState(1305);
						((RelationalExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IN || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NOT_IN - 76)) | (1L << (GT - 76)) | (1L << (LT - 76)) | (1L << (LE - 76)) | (1L << (GE - 76)))) != 0)) ) {
							((RelationalExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1306);
						nls();
						setState(1307);
						((RelationalExprAltContext)_localctx).right = expression(12);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1309);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1310);
						nls();
						setState(1311);
						((EqualityExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (SPACESHIP - 71)) | (1L << (IDENTICAL - 71)) | (1L << (NOT_IDENTICAL - 71)) | (1L << (EQUAL - 71)) | (1L << (NOTEQUAL - 71)))) != 0)) ) {
							((EqualityExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1312);
						nls();
						setState(1313);
						((EqualityExprAltContext)_localctx).right = expression(11);
						}
						break;
					case 7:
						{
						_localctx = new RegexExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RegexExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1315);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1316);
						nls();
						setState(1317);
						((RegexExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==REGEX_FIND || _la==REGEX_MATCH) ) {
							((RegexExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1318);
						nls();
						setState(1319);
						((RegexExprAltContext)_localctx).right = expression(10);
						}
						break;
					case 8:
						{
						_localctx = new AndExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((AndExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1321);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1322);
						nls();
						setState(1323);
						((AndExprAltContext)_localctx).op = match(BITAND);
						setState(1324);
						nls();
						setState(1325);
						((AndExprAltContext)_localctx).right = expression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExclusiveOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ExclusiveOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1327);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1328);
						nls();
						setState(1329);
						((ExclusiveOrExprAltContext)_localctx).op = match(XOR);
						setState(1330);
						nls();
						setState(1331);
						((ExclusiveOrExprAltContext)_localctx).right = expression(8);
						}
						break;
					case 10:
						{
						_localctx = new InclusiveOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((InclusiveOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1333);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1334);
						nls();
						setState(1335);
						((InclusiveOrExprAltContext)_localctx).op = match(BITOR);
						setState(1336);
						nls();
						setState(1337);
						((InclusiveOrExprAltContext)_localctx).right = expression(7);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalAndExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1339);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1340);
						nls();
						setState(1341);
						((LogicalAndExprAltContext)_localctx).op = match(AND);
						setState(1342);
						nls();
						setState(1343);
						((LogicalAndExprAltContext)_localctx).right = expression(6);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalOrExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1345);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1346);
						nls();
						setState(1347);
						((LogicalOrExprAltContext)_localctx).op = match(OR);
						setState(1348);
						nls();
						setState(1349);
						((LogicalOrExprAltContext)_localctx).right = expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ConditionalExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExprAltContext)_localctx).con = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1351);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1352);
						nls();
						setState(1362);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case QUESTION:
							{
							setState(1353);
							match(QUESTION);
							setState(1354);
							nls();
							setState(1355);
							((ConditionalExprAltContext)_localctx).tb = expression(0);
							setState(1356);
							nls();
							setState(1357);
							match(COLON);
							setState(1358);
							nls();
							}
							break;
						case ELVIS:
							{
							setState(1360);
							match(ELVIS);
							setState(1361);
							nls();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1364);
						((ConditionalExprAltContext)_localctx).fb = expression(3);
						}
						break;
					case 14:
						{
						_localctx = new RelationalExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1366);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1367);
						nls();
						setState(1368);
						((RelationalExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AS || _la==INSTANCEOF || _la==NOT_INSTANCEOF) ) {
							((RelationalExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1369);
						nls();
						setState(1370);
						type();
						}
						break;
					case 15:
						{
						_localctx = new AssignmentExprAltContext(new ExpressionContext(_parentctx, _parentState));
						((AssignmentExprAltContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1372);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1373);
						nls();
						setState(1374);
						((AssignmentExprAltContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (POWER_ASSIGN - 70)) | (1L << (ASSIGN - 70)) | (1L << (ADD_ASSIGN - 70)) | (1L << (SUB_ASSIGN - 70)) | (1L << (MUL_ASSIGN - 70)) | (1L << (DIV_ASSIGN - 70)) | (1L << (AND_ASSIGN - 70)) | (1L << (OR_ASSIGN - 70)) | (1L << (XOR_ASSIGN - 70)) | (1L << (MOD_ASSIGN - 70)) | (1L << (LSHIFT_ASSIGN - 70)) | (1L << (RSHIFT_ASSIGN - 70)) | (1L << (URSHIFT_ASSIGN - 70)) | (1L << (ELVIS_ASSIGN - 70)))) != 0)) ) {
							((AssignmentExprAltContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1375);
						nls();
						setState(1376);
						enhancedStatementExpression();
						}
						break;
					}
					} 
				}
				setState(1382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnhancedExpressionContext extends GroovyParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandardLambdaExpressionContext standardLambdaExpression() {
			return getRuleContext(StandardLambdaExpressionContext.class,0);
		}
		public EnhancedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedExpressionContext enhancedExpression() throws RecognitionException {
		EnhancedExpressionContext _localctx = new EnhancedExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_enhancedExpression);
		try {
			setState(1385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				standardLambdaExpression();
				}
				break;
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

	public static class CommandExpressionContext extends GroovyParserRuleContext {
		public PathExpressionContext pathExpression;
		public PathExpressionContext pathExpression() {
			return getRuleContext(PathExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<CommandArgumentContext> commandArgument() {
			return getRuleContexts(CommandArgumentContext.class);
		}
		public CommandArgumentContext commandArgument(int i) {
			return getRuleContext(CommandArgumentContext.class,i);
		}
		public CommandExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCommandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCommandExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCommandExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandExpressionContext commandExpression() throws RecognitionException {
		CommandExpressionContext _localctx = new CommandExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_commandExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			((CommandExpressionContext)_localctx).pathExpression = pathExpression();
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1388);
				if (!( SemanticPredicates.isFollowingMethodName(((CommandExpressionContext)_localctx).pathExpression.t) )) throw new FailedPredicateException(this, " SemanticPredicates.isFollowingMethodName($pathExpression.t) ");
				setState(1389);
				argumentList();
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(1396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1393);
					commandArgument();
					}
					} 
				}
				setState(1398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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

	public static class CommandArgumentContext extends GroovyParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public CommandArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCommandArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCommandArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCommandArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandArgumentContext commandArgument() throws RecognitionException {
		CommandArgumentContext _localctx = new CommandArgumentContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_commandArgument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			primary();
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1401); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1400);
						pathElement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1403); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(1405);
				argumentList();
				}
				break;
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

	public static class PathExpressionContext extends GroovyParserRuleContext {
		public int t;
		public PathElementContext pathElement;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public PathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExpressionContext pathExpression() throws RecognitionException {
		PathExpressionContext _localctx = new PathExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_pathExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			primary();
			setState(1414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1409);
					((PathExpressionContext)_localctx).pathElement = pathElement();
					 ((PathExpressionContext)_localctx).t =  ((PathExpressionContext)_localctx).pathElement.t; 
					}
					} 
				}
				setState(1416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	public static class PathElementContext extends GroovyParserRuleContext {
		public int t;
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public NamePartContext namePart() {
			return getRuleContext(NamePartContext.class,0);
		}
		public TerminalNode METHOD_POINTER() { return getToken(GroovyParser.METHOD_POINTER, 0); }
		public TerminalNode METHOD_REFERENCE() { return getToken(GroovyParser.METHOD_REFERENCE, 0); }
		public TerminalNode DOT() { return getToken(GroovyParser.DOT, 0); }
		public TerminalNode SPREAD_DOT() { return getToken(GroovyParser.SPREAD_DOT, 0); }
		public TerminalNode SAFE_DOT() { return getToken(GroovyParser.SAFE_DOT, 0); }
		public TerminalNode SAFE_CHAIN_DOT() { return getToken(GroovyParser.SAFE_CHAIN_DOT, 0); }
		public TerminalNode AT() { return getToken(GroovyParser.AT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public IndexPropertyArgsContext indexPropertyArgs() {
			return getRuleContext(IndexPropertyArgsContext.class,0);
		}
		public NamedPropertyArgsContext namedPropertyArgs() {
			return getRuleContext(NamedPropertyArgsContext.class,0);
		}
		public PathElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPathElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPathElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPathElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathElementContext pathElement() throws RecognitionException {
		PathElementContext _localctx = new PathElementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_pathElement);
		int _la;
		try {
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				nls();
				setState(1428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPREAD_DOT:
				case SAFE_DOT:
				case SAFE_CHAIN_DOT:
				case DOT:
					{
					setState(1418);
					_la = _input.LA(1);
					if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (SPREAD_DOT - 61)) | (1L << (SAFE_DOT - 61)) | (1L << (SAFE_CHAIN_DOT - 61)) | (1L << (DOT - 61)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1419);
					nls();
					setState(1422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
					case 1:
						{
						setState(1420);
						match(AT);
						}
						break;
					case 2:
						{
						setState(1421);
						nonWildcardTypeArguments();
						}
						break;
					}
					}
					break;
				case METHOD_POINTER:
					{
					setState(1424);
					match(METHOD_POINTER);
					setState(1425);
					nls();
					}
					break;
				case METHOD_REFERENCE:
					{
					setState(1426);
					match(METHOD_REFERENCE);
					setState(1427);
					nls();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1430);
				namePart();
				 ((PathElementContext)_localctx).t =  1; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433);
				arguments();
				 ((PathElementContext)_localctx).t =  2; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1436);
				nls();
				setState(1437);
				closure();
				 ((PathElementContext)_localctx).t =  3; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				indexPropertyArgs();
				 ((PathElementContext)_localctx).t =  4; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1443);
				namedPropertyArgs();
				 ((PathElementContext)_localctx).t =  5; 
				}
				break;
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

	public static class NamePartContext extends GroovyParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DynamicMemberNameContext dynamicMemberName() {
			return getRuleContext(DynamicMemberNameContext.class,0);
		}
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public NamePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNamePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNamePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNamePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamePartContext namePart() throws RecognitionException {
		NamePartContext _localctx = new NamePartContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_namePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1448);
				identifier();
				}
				break;
			case 2:
				{
				setState(1449);
				stringLiteral();
				}
				break;
			case 3:
				{
				setState(1450);
				dynamicMemberName();
				}
				break;
			case 4:
				{
				setState(1451);
				keywords();
				}
				break;
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

	public static class DynamicMemberNameContext extends GroovyParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public DynamicMemberNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicMemberName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDynamicMemberName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDynamicMemberName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDynamicMemberName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicMemberNameContext dynamicMemberName() throws RecognitionException {
		DynamicMemberNameContext _localctx = new DynamicMemberNameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_dynamicMemberName);
		try {
			setState(1456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				parExpression();
				}
				break;
			case GStringBegin:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				gstring();
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

	public static class IndexPropertyArgsContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IndexPropertyArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexPropertyArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIndexPropertyArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIndexPropertyArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIndexPropertyArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexPropertyArgsContext indexPropertyArgs() throws RecognitionException {
		IndexPropertyArgsContext _localctx = new IndexPropertyArgsContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_indexPropertyArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1458);
				match(QUESTION);
				}
			}

			setState(1461);
			match(LBRACK);
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1462);
				expressionList(true);
				}
				break;
			}
			setState(1465);
			match(RBRACK);
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

	public static class NamedPropertyArgsContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public MapEntryListContext mapEntryList() {
			return getRuleContext(MapEntryListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public NamedPropertyArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedPropertyArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNamedPropertyArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNamedPropertyArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNamedPropertyArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedPropertyArgsContext namedPropertyArgs() throws RecognitionException {
		NamedPropertyArgsContext _localctx = new NamedPropertyArgsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_namedPropertyArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			match(LBRACK);
			setState(1468);
			mapEntryList();
			setState(1469);
			match(RBRACK);
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

	public static class PrimaryContext extends GroovyParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapPrmrAltContext extends PrimaryContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public MapPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GstringPrmrAltContext extends PrimaryContext {
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public GstringPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListPrmrAltContext extends PrimaryContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterListPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitListPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitListPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypePrmrAltContext extends PrimaryContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public TypePrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypePrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypePrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypePrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewPrmrAltContext extends PrimaryContext {
		public TerminalNode NEW() { return getToken(GroovyParser.NEW, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNewPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNewPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNewPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClosurePrmrAltContext extends PrimaryContext {
		public ClosureContext closure() {
			return getRuleContext(ClosureContext.class,0);
		}
		public ClosurePrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClosurePrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClosurePrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClosurePrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralPrmrAltContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLiteralPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLiteralPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLiteralPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisPrmrAltContext extends PrimaryContext {
		public TerminalNode THIS() { return getToken(GroovyParser.THIS, 0); }
		public ThisPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThisPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThisPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThisPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaPrmrAltContext extends PrimaryContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public LambdaPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLambdaPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLambdaPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLambdaPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierPrmrAltContext extends PrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIdentifierPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIdentifierPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIdentifierPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperPrmrAltContext extends PrimaryContext {
		public TerminalNode SUPER() { return getToken(GroovyParser.SUPER, 0); }
		public SuperPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSuperPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSuperPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSuperPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenPrmrAltContext extends PrimaryContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ParenPrmrAltContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterParenPrmrAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitParenPrmrAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitParenPrmrAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_primary);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new IdentifierPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				identifier();
				}
				break;
			case 2:
				_localctx = new LiteralPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				literal();
				}
				break;
			case 3:
				_localctx = new GstringPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1473);
				gstring();
				}
				break;
			case 4:
				_localctx = new NewPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1474);
				match(NEW);
				setState(1475);
				nls();
				setState(1476);
				creator();
				}
				break;
			case 5:
				_localctx = new ThisPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1478);
				match(THIS);
				}
				break;
			case 6:
				_localctx = new SuperPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1479);
				match(SUPER);
				}
				break;
			case 7:
				_localctx = new ParenPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1480);
				parExpression();
				}
				break;
			case 8:
				_localctx = new ClosurePrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1481);
				closure();
				}
				break;
			case 9:
				_localctx = new LambdaPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1482);
				lambdaExpression();
				}
				break;
			case 10:
				_localctx = new ListPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1483);
				list();
				}
				break;
			case 11:
				_localctx = new MapPrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1484);
				map();
				}
				break;
			case 12:
				_localctx = new TypePrmrAltContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1485);
				builtInType();
				}
				break;
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

	public static class ListContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(LBRACK);
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1489);
				expressionList(true);
				}
				break;
			}
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1492);
				match(COMMA);
				}
			}

			setState(1495);
			match(RBRACK);
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

	public static class MapContext extends GroovyParserRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public MapEntryListContext mapEntryList() {
			return getRuleContext(MapEntryListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(LBRACK);
			setState(1503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1498);
				mapEntryList();
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1499);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				{
				setState(1502);
				match(COLON);
				}
				break;
			}
			setState(1505);
			match(RBRACK);
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

	public static class MapEntryListContext extends GroovyParserRuleContext {
		public List<MapEntryContext> mapEntry() {
			return getRuleContexts(MapEntryContext.class);
		}
		public MapEntryContext mapEntry(int i) {
			return getRuleContext(MapEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public MapEntryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapEntryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapEntryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapEntryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryListContext mapEntryList() throws RecognitionException {
		MapEntryListContext _localctx = new MapEntryListContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_mapEntryList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			mapEntry();
			setState(1512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1508);
					match(COMMA);
					setState(1509);
					mapEntry();
					}
					} 
				}
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
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

	public static class MapEntryContext extends GroovyParserRuleContext {
		public MapEntryLabelContext mapEntryLabel() {
			return getRuleContext(MapEntryLabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GroovyParser.MUL, 0); }
		public MapEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryContext mapEntry() throws RecognitionException {
		MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_mapEntry);
		try {
			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				mapEntryLabel();
				setState(1516);
				match(COLON);
				setState(1517);
				nls();
				setState(1518);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1520);
				match(MUL);
				setState(1521);
				match(COLON);
				setState(1522);
				nls();
				setState(1523);
				expression(0);
				}
				break;
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

	public static class MapEntryLabelContext extends GroovyParserRuleContext {
		public KeywordsContext keywords() {
			return getRuleContext(KeywordsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MapEntryLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntryLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapEntryLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapEntryLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapEntryLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryLabelContext mapEntryLabel() throws RecognitionException {
		MapEntryLabelContext _localctx = new MapEntryLabelContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_mapEntryLabel);
		try {
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527);
				keywords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
				primary();
				}
				break;
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

	public static class CreatorContext extends GroovyParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public NlsContext nls() {
			return getRuleContext(NlsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public DimsOptContext dimsOpt() {
			return getRuleContext(DimsOptContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public AnonymousInnerClassDeclarationContext anonymousInnerClassDeclaration() {
			return getRuleContext(AnonymousInnerClassDeclarationContext.class,0);
		}
		public List<AnnotationsOptContext> annotationsOpt() {
			return getRuleContexts(AnnotationsOptContext.class);
		}
		public AnnotationsOptContext annotationsOpt(int i) {
			return getRuleContext(AnnotationsOptContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(GroovyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(GroovyParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(GroovyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(GroovyParser.RBRACK, i);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_creator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			createdName();
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1532);
				nls();
				setState(1533);
				arguments();
				setState(1535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1534);
					anonymousInnerClassDeclaration(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1542); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1537);
						annotationsOpt();
						setState(1538);
						match(LBRACK);
						setState(1539);
						expression(0);
						setState(1540);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1544); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1546);
				dimsOpt();
				}
				break;
			case 3:
				{
				setState(1548);
				dims();
				setState(1549);
				nls();
				setState(1550);
				arrayInitializer();
				}
				break;
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

	public static class ArrayInitializerContext extends GroovyParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GroovyParser.LBRACE, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(GroovyParser.RBRACE, 0); }
		public VariableInitializersContext variableInitializers() {
			return getRuleContext(VariableInitializersContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_arrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			match(LBRACE);
			setState(1555);
			nls();
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1556);
				variableInitializers();
				}
				break;
			}
			setState(1559);
			nls();
			setState(1560);
			match(RBRACE);
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

	public static class AnonymousInnerClassDeclarationContext extends GroovyParserRuleContext {
		public int t;
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnonymousInnerClassDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnonymousInnerClassDeclarationContext(ParserRuleContext parent, int invokingState, int t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_anonymousInnerClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnonymousInnerClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnonymousInnerClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnonymousInnerClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousInnerClassDeclarationContext anonymousInnerClassDeclaration(int t) throws RecognitionException {
		AnonymousInnerClassDeclarationContext _localctx = new AnonymousInnerClassDeclarationContext(_ctx, getState(), t);
		enterRule(_localctx, 264, RULE_anonymousInnerClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			classBody(0);
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

	public static class CreatedNameContext extends GroovyParserRuleContext {
		public AnnotationsOptContext annotationsOpt() {
			return getRuleContext(AnnotationsOptContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public QualifiedClassNameContext qualifiedClassName() {
			return getRuleContext(QualifiedClassNameContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_createdName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			annotationsOpt();
			setState(1570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1565);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(1566);
				qualifiedClassName();
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1567);
					typeArgumentsOrDiamond();
					}
				}

				}
				break;
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

	public static class NonWildcardTypeArgumentsContext extends GroovyParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			match(LT);
			setState(1573);
			nls();
			setState(1574);
			typeList();
			setState(1575);
			nls();
			setState(1576);
			match(GT);
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

	public static class TypeArgumentsOrDiamondContext extends GroovyParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_typeArgumentsOrDiamond);
		try {
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578);
				match(LT);
				setState(1579);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1580);
				typeArguments();
				}
				break;
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

	public static class ArgumentsContext extends GroovyParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public EnhancedArgumentListContext enhancedArgumentList() {
			return getRuleContext(EnhancedArgumentListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(LPAREN);
			setState(1585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1584);
				enhancedArgumentList();
				}
				break;
			}
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1587);
				match(COMMA);
				}
				break;
			}
			setState(1590);
			rparen();
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

	public static class ArgumentListContext extends GroovyParserRuleContext {
		public List<ArgumentListElementContext> argumentListElement() {
			return getRuleContexts(ArgumentListElementContext.class);
		}
		public ArgumentListElementContext argumentListElement(int i) {
			return getRuleContext(ArgumentListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			argumentListElement();
			setState(1599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1593);
					match(COMMA);
					setState(1594);
					nls();
					setState(1595);
					argumentListElement();
					}
					} 
				}
				setState(1601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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

	public static class EnhancedArgumentListContext extends GroovyParserRuleContext {
		public List<EnhancedArgumentListElementContext> enhancedArgumentListElement() {
			return getRuleContexts(EnhancedArgumentListElementContext.class);
		}
		public EnhancedArgumentListElementContext enhancedArgumentListElement(int i) {
			return getRuleContext(EnhancedArgumentListElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<NlsContext> nls() {
			return getRuleContexts(NlsContext.class);
		}
		public NlsContext nls(int i) {
			return getRuleContext(NlsContext.class,i);
		}
		public EnhancedArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedArgumentListContext enhancedArgumentList() throws RecognitionException {
		EnhancedArgumentListContext _localctx = new EnhancedArgumentListContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_enhancedArgumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			enhancedArgumentListElement();
			setState(1609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1603);
					match(COMMA);
					setState(1604);
					nls();
					setState(1605);
					enhancedArgumentListElement();
					}
					} 
				}
				setState(1611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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

	public static class ArgumentListElementContext extends GroovyParserRuleContext {
		public ExpressionListElementContext expressionListElement() {
			return getRuleContext(ExpressionListElementContext.class,0);
		}
		public MapEntryContext mapEntry() {
			return getRuleContext(MapEntryContext.class,0);
		}
		public ArgumentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgumentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgumentListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgumentListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListElementContext argumentListElement() throws RecognitionException {
		ArgumentListElementContext _localctx = new ArgumentListElementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_argumentListElement);
		try {
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				expressionListElement(true);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				mapEntry();
				}
				break;
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

	public static class EnhancedArgumentListElementContext extends GroovyParserRuleContext {
		public ExpressionListElementContext expressionListElement() {
			return getRuleContext(ExpressionListElementContext.class,0);
		}
		public StandardLambdaExpressionContext standardLambdaExpression() {
			return getRuleContext(StandardLambdaExpressionContext.class,0);
		}
		public MapEntryContext mapEntry() {
			return getRuleContext(MapEntryContext.class,0);
		}
		public EnhancedArgumentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedArgumentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnhancedArgumentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnhancedArgumentListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnhancedArgumentListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedArgumentListElementContext enhancedArgumentListElement() throws RecognitionException {
		EnhancedArgumentListElementContext _localctx = new EnhancedArgumentListElementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_enhancedArgumentListElement);
		try {
			setState(1619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1616);
				expressionListElement(true);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617);
				standardLambdaExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1618);
				mapEntry();
				}
				break;
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

	public static class StringLiteralContext extends GroovyParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GroovyParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			match(StringLiteral);
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

	public static class ClassNameContext extends GroovyParserRuleContext {
		public TerminalNode CapitalizedIdentifier() { return getToken(GroovyParser.CapitalizedIdentifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			match(CapitalizedIdentifier);
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

	public static class IdentifierContext extends GroovyParserRuleContext {
		public TerminalNode Identifier() { return getToken(GroovyParser.Identifier, 0); }
		public TerminalNode CapitalizedIdentifier() { return getToken(GroovyParser.CapitalizedIdentifier, 0); }
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_identifier);
		try {
			setState(1629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
				match(CapitalizedIdentifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1627);
				if (!( DOT == _input.LT(2).getType() )) throw new FailedPredicateException(this, " DOT == _input.LT(2).getType() ");
				setState(1628);
				match(STATIC);
				}
				break;
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

	public static class BuiltInTypeContext extends GroovyParserRuleContext {
		public TerminalNode BuiltInPrimitiveType() { return getToken(GroovyParser.BuiltInPrimitiveType, 0); }
		public TerminalNode VOID() { return getToken(GroovyParser.VOID, 0); }
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBuiltInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBuiltInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBuiltInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_builtInType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_la = _input.LA(1);
			if ( !(_la==BuiltInPrimitiveType || _la==VOID) ) {
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

	public static class KeywordsContext extends GroovyParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(GroovyParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(GroovyParser.AS, 0); }
		public TerminalNode ASSERT() { return getToken(GroovyParser.ASSERT, 0); }
		public TerminalNode BREAK() { return getToken(GroovyParser.BREAK, 0); }
		public TerminalNode CASE() { return getToken(GroovyParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(GroovyParser.CATCH, 0); }
		public TerminalNode CLASS() { return getToken(GroovyParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(GroovyParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(GroovyParser.CONTINUE, 0); }
		public TerminalNode DEF() { return getToken(GroovyParser.DEF, 0); }
		public TerminalNode DEFAULT() { return getToken(GroovyParser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(GroovyParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(GroovyParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(GroovyParser.ENUM, 0); }
		public TerminalNode EXTENDS() { return getToken(GroovyParser.EXTENDS, 0); }
		public TerminalNode FINAL() { return getToken(GroovyParser.FINAL, 0); }
		public TerminalNode FINALLY() { return getToken(GroovyParser.FINALLY, 0); }
		public TerminalNode FOR() { return getToken(GroovyParser.FOR, 0); }
		public TerminalNode GOTO() { return getToken(GroovyParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(GroovyParser.IF, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(GroovyParser.IMPLEMENTS, 0); }
		public TerminalNode IMPORT() { return getToken(GroovyParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(GroovyParser.IN, 0); }
		public TerminalNode INSTANCEOF() { return getToken(GroovyParser.INSTANCEOF, 0); }
		public TerminalNode INTERFACE() { return getToken(GroovyParser.INTERFACE, 0); }
		public TerminalNode NATIVE() { return getToken(GroovyParser.NATIVE, 0); }
		public TerminalNode NEW() { return getToken(GroovyParser.NEW, 0); }
		public TerminalNode PACKAGE() { return getToken(GroovyParser.PACKAGE, 0); }
		public TerminalNode RETURN() { return getToken(GroovyParser.RETURN, 0); }
		public TerminalNode STATIC() { return getToken(GroovyParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(GroovyParser.STRICTFP, 0); }
		public TerminalNode SUPER() { return getToken(GroovyParser.SUPER, 0); }
		public TerminalNode SWITCH() { return getToken(GroovyParser.SWITCH, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(GroovyParser.SYNCHRONIZED, 0); }
		public TerminalNode THIS() { return getToken(GroovyParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(GroovyParser.THROW, 0); }
		public TerminalNode THROWS() { return getToken(GroovyParser.THROWS, 0); }
		public TerminalNode TRANSIENT() { return getToken(GroovyParser.TRANSIENT, 0); }
		public TerminalNode TRAIT() { return getToken(GroovyParser.TRAIT, 0); }
		public TerminalNode THREADSAFE() { return getToken(GroovyParser.THREADSAFE, 0); }
		public TerminalNode TRY() { return getToken(GroovyParser.TRY, 0); }
		public TerminalNode VOLATILE() { return getToken(GroovyParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(GroovyParser.WHILE, 0); }
		public TerminalNode NullLiteral() { return getToken(GroovyParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(GroovyParser.BooleanLiteral, 0); }
		public TerminalNode BuiltInPrimitiveType() { return getToken(GroovyParser.BuiltInPrimitiveType, 0); }
		public TerminalNode VOID() { return getToken(GroovyParser.VOID, 0); }
		public TerminalNode PUBLIC() { return getToken(GroovyParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(GroovyParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(GroovyParser.PRIVATE, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << DEF) | (1L << IN) | (1L << TRAIT) | (1L << THREADSAFE) | (1L << BuiltInPrimitiveType) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << CATCH) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << ELSE) | (1L << ENUM) | (1L << EXTENDS) | (1L << FINAL) | (1L << FINALLY) | (1L << FOR) | (1L << IF) | (1L << GOTO) | (1L << IMPLEMENTS) | (1L << IMPORT) | (1L << INSTANCEOF) | (1L << INTERFACE) | (1L << NATIVE) | (1L << NEW) | (1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << THROWS) | (1L << TRANSIENT) | (1L << TRY) | (1L << VOID) | (1L << VOLATILE) | (1L << WHILE) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class RparenContext extends GroovyParserRuleContext {
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public RparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterRparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitRparen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitRparen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RparenContext rparen() throws RecognitionException {
		RparenContext _localctx = new RparenContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_rparen);
		try {
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 require(false, "Missing ')'"); 
				}
				break;
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

	public static class NlsContext extends GroovyParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public NlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NlsContext nls() throws RecognitionException {
		NlsContext _localctx = new NlsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_nls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1639);
					match(NL);
					}
					} 
				}
				setState(1644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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

	public static class SepContext extends GroovyParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(GroovyParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GroovyParser.SEMI, i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_sep);
		try {
			int _alt;
			setState(1669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(1645);
				match(SEMI);
				setState(1649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1646);
						match(NL);
						}
						} 
					}
					setState(1651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1652);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1655); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1657);
						match(SEMI);
						setState(1661);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1658);
								match(NL);
								}
								} 
							}
							setState(1663);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
						}
						}
						} 
					}
					setState(1668);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return classDeclaration_sempred((ClassDeclarationContext)_localctx, predIndex);
		case 19:
			return classBody_sempred((ClassBodyContext)_localctx, predIndex);
		case 24:
			return methodDeclaration_sempred((MethodDeclarationContext)_localctx, predIndex);
		case 26:
			return returnType_sempred((ReturnTypeContext)_localctx, predIndex);
		case 78:
			return localVariableDeclaration_sempred((LocalVariableDeclarationContext)_localctx, predIndex);
		case 79:
			return classifiedModifiers_sempred((ClassifiedModifiersContext)_localctx, predIndex);
		case 92:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 114:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 116:
			return commandExpression_sempred((CommandExpressionContext)_localctx, predIndex);
		case 143:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean classDeclaration_sempred(ClassDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  3 != _localctx.t ;
		case 1:
			return  2 != _localctx.t ;
		case 2:
			return 1 == _localctx.t;
		case 3:
			return 1 != _localctx.t;
		}
		return true;
	}
	private boolean classBody_sempred(ClassBodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return  2 == _localctx.t ;
		}
		return true;
	}
	private boolean methodDeclaration_sempred(MethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return  3 == _localctx.ct ;
		}
		return true;
	}
	private boolean returnType_sempred(ReturnTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return  3 != _localctx.ct ;
		}
		return true;
	}
	private boolean localVariableDeclaration_sempred(LocalVariableDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return  !SemanticPredicates.isInvalidLocalVariableDeclaration(_input) ;
		}
		return true;
	}
	private boolean classifiedModifiers_sempred(ClassifiedModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return  0 == _localctx.t ;
		case 9:
			return  1 == _localctx.t ;
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return  !SemanticPredicates.isInvalidMethodDeclaration(_input) ;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 17);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		case 14:
			return precpred(_ctx, 13);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 10);
		case 17:
			return precpred(_ctx, 9);
		case 18:
			return precpred(_ctx, 8);
		case 19:
			return precpred(_ctx, 7);
		case 20:
			return precpred(_ctx, 6);
		case 21:
			return precpred(_ctx, 5);
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 12);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean commandExpression_sempred(CommandExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return  SemanticPredicates.isFollowingMethodName(((CommandExpressionContext)_localctx).pathExpression.t) ;
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return  DOT == _input.LT(2).getType() ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u068a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\3\2\3"+
		"\2\5\2\u012f\n\2\3\2\5\2\u0132\n\2\3\2\5\2\u0135\n\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\7\3\u013d\n\3\f\3\16\3\u0140\13\3\3\3\5\3\u0143\n\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\5\5\u014c\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0153\n\5\3\6\3"+
		"\6\3\6\3\7\3\7\5\7\u015a\n\7\3\b\5\b\u015d\n\b\3\t\3\t\3\t\6\t\u0162\n"+
		"\t\r\t\16\t\u0163\3\n\5\n\u0167\n\n\3\13\3\13\3\13\6\13\u016c\n\13\r\13"+
		"\16\13\u016d\3\f\3\f\5\f\u0172\n\f\3\r\3\r\5\r\u0176\n\r\3\16\5\16\u0179"+
		"\n\16\3\17\3\17\3\17\6\17\u017e\n\17\r\17\16\17\u017f\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u0189\n\20\f\20\16\20\u018c\13\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\5\21\u0196\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u019d\n\22\f\22\16\22\u01a0\13\22\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u01a7\n\23\f\23\16\23\u01aa\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u01b7\n\24\3\24\3\24\3\24\3\24\5\24\u01bd\n"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01c6\n\24\3\24\3\24\5\24"+
		"\u01ca\n\24\3\24\5\24\u01cd\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01d5"+
		"\n\24\3\24\5\24\u01d8\n\24\3\24\5\24\u01db\n\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\5\25\u01e3\n\25\3\25\3\25\5\25\u01e7\n\25\3\25\5\25\u01ea\n\25"+
		"\3\25\3\25\3\25\7\25\u01ef\n\25\f\25\16\25\u01f2\13\25\3\25\5\25\u01f5"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01ff\n\26\f\26\16"+
		"\26\u0202\13\26\3\26\3\26\3\26\5\26\u0207\n\26\3\27\3\27\3\27\5\27\u020c"+
		"\n\27\3\27\5\27\u020f\n\27\3\30\3\30\3\30\5\30\u0214\n\30\3\30\3\30\5"+
		"\30\u0218\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u021f\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u022a\n\32\3\32\3\32\5\32\u022e\n"+
		"\32\3\32\5\32\u0231\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u023a"+
		"\n\32\3\32\3\32\5\32\u023e\n\32\5\32\u0240\n\32\3\33\3\33\5\33\u0244\n"+
		"\33\3\34\3\34\3\34\5\34\u0249\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0252\n\36\f\36\16\36\u0255\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u025d\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u026a\n\""+
		"\f\"\16\"\u026d\13\"\3\"\3\"\5\"\u0271\n\"\3#\3#\3#\3#\6#\u0277\n#\r#"+
		"\16#\u0278\3$\5$\u027c\n$\3%\3%\3%\5%\u0281\n%\3%\3%\3&\3&\3&\3&\5&\u0289"+
		"\n&\3&\5&\u028c\n&\3&\3&\3\'\3\'\5\'\u0292\n\'\3\'\5\'\u0295\n\'\3(\3"+
		"(\5(\u0299\n(\3)\3)\5)\u029d\n)\3*\3*\3+\3+\3+\3+\3+\3+\3+\7+\u02a8\n"+
		"+\f+\16+\u02ab\13+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u02b7\n,\5,\u02b9"+
		"\n,\3-\3-\3-\3.\3.\3.\3.\3.\7.\u02c3\n.\f.\16.\u02c6\13.\3/\3/\5/\u02ca"+
		"\n/\3/\3/\3\60\3\60\5\60\u02d0\n\60\3\60\3\60\3\60\3\60\7\60\u02d6\n\60"+
		"\f\60\16\60\u02d9\13\60\3\61\3\61\3\61\3\62\3\62\5\62\u02e0\n\62\3\62"+
		"\5\62\u02e3\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02eb\n\62\3\63\3"+
		"\63\3\64\3\64\3\64\7\64\u02f2\n\64\f\64\16\64\u02f5\13\64\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u02fc\n\65\3\66\3\66\3\66\7\66\u0301\n\66\f\66\16\66"+
		"\u0304\13\66\3\67\3\67\3\67\38\38\38\38\78\u030d\n8\f8\168\u0310\138\3"+
		"9\39\39\39\39\59\u0317\n9\3:\3:\3:\3:\7:\u031d\n:\f:\16:\u0320\13:\3:"+
		"\3:\3;\3;\3;\5;\u0327\n;\3;\3;\5;\u032b\n;\3<\3<\7<\u032f\n<\f<\16<\u0332"+
		"\13<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\5@\u0344\n@\3A\3"+
		"A\5A\u0348\nA\3B\3B\3B\5B\u034d\nB\3B\3B\3B\3B\5B\u0353\nB\3B\3B\3B\3"+
		"C\5C\u0359\nC\3D\3D\3D\3D\7D\u035f\nD\fD\16D\u0362\13D\3D\5D\u0365\nD"+
		"\3E\3E\3E\7E\u036a\nE\fE\16E\u036d\13E\3F\3F\3F\3F\5F\u0373\nF\3F\5F\u0376"+
		"\nF\3G\3G\5G\u037a\nG\3H\3H\3I\3I\3I\7I\u0381\nI\fI\16I\u0384\13I\3J\3"+
		"J\3J\3J\3J\3J\3K\3K\5K\u038e\nK\3L\3L\3L\5L\u0393\nL\3M\3M\3M\3M\7M\u0399"+
		"\nM\fM\16M\u039c\13M\5M\u039e\nM\3M\5M\u03a1\nM\3M\3M\3N\3N\3N\7N\u03a8"+
		"\nN\fN\16N\u03ab\13N\5N\u03ad\nN\3N\3N\3N\3O\3O\5O\u03b4\nO\3P\3P\3P\3"+
		"Q\3Q\3Q\3Q\5Q\u03bd\nQ\3R\3R\5R\u03c1\nR\3R\3R\3R\3R\3R\3R\3R\5R\u03ca"+
		"\nR\3R\5R\u03cd\nR\3R\3R\3R\5R\u03d2\nR\3S\3S\3S\3S\7S\u03d8\nS\fS\16"+
		"S\u03db\13S\3S\3S\3T\5T\u03e0\nT\3T\3T\3U\3U\3U\3U\6U\u03e8\nU\rU\16U"+
		"\u03e9\3U\3U\3V\3V\5V\u03f0\nV\3W\3W\3W\3W\3W\3W\5W\u03f8\nW\3W\3W\3W"+
		"\3W\5W\u03fe\nW\3X\3X\3X\3X\3X\3X\7X\u0406\nX\fX\16X\u0409\13X\3X\3X\3"+
		"X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0421\n"+
		"Y\3Z\3Z\5Z\u0425\nZ\3[\3[\5[\u0429\n[\3\\\3\\\5\\\u042d\n\\\3\\\3\\\3"+
		"\\\3\\\3\\\7\\\u0434\n\\\f\\\16\\\u0437\13\\\3\\\3\\\3\\\5\\\u043c\n\\"+
		"\3]\3]\3]\3]\3]\3]\3]\5]\u0445\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^"+
		"\u0452\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0465"+
		"\n^\3_\3_\3_\3_\5_\u046b\n_\3_\3_\3_\3_\3_\3`\3`\3`\7`\u0475\n`\f`\16"+
		"`\u0478\13`\3a\3a\3a\3a\3b\3b\3b\3b\5b\u0482\nb\3b\3b\3c\3c\3c\3c\7c\u048a"+
		"\nc\fc\16c\u048d\13c\3d\3d\5d\u0491\nd\3e\3e\3e\6e\u0496\ne\re\16e\u0497"+
		"\3e\3e\3f\3f\3f\3f\3f\3f\5f\u04a2\nf\3g\3g\5g\u04a6\ng\3h\3h\5h\u04aa"+
		"\nh\3h\3h\3h\3h\3i\5i\u04b1\ni\3i\3i\5i\u04b5\ni\3i\3i\5i\u04b9\ni\3j"+
		"\3j\5j\u04bd\nj\3k\3k\3l\3l\3l\3l\3m\3m\3n\3n\3n\3n\3o\3o\3o\7o\u04ce"+
		"\no\fo\16o\u04d1\13o\3p\3p\3p\5p\u04d6\np\3p\3p\3q\3q\5q\u04dc\nq\3r\3"+
		"r\5r\u04e0\nr\3s\3s\5s\u04e4\ns\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\5t\u04f7\nt\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u0512\nt\3t\5t\u0515\nt\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u0555\nt\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\3t\7t\u0565\nt\ft\16t\u0568\13t\3u\3u\5u\u056c\nu"+
		"\3v\3v\3v\3v\5v\u0572\nv\3v\7v\u0575\nv\fv\16v\u0578\13v\3w\3w\6w\u057c"+
		"\nw\rw\16w\u057d\3w\5w\u0581\nw\3x\3x\3x\3x\7x\u0587\nx\fx\16x\u058a\13"+
		"x\3y\3y\3y\3y\3y\5y\u0591\ny\3y\3y\3y\3y\5y\u0597\ny\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u05a9\ny\3z\3z\3z\3z\5z\u05af\nz\3"+
		"{\3{\5{\u05b3\n{\3|\5|\u05b6\n|\3|\3|\5|\u05ba\n|\3|\3|\3}\3}\3}\3}\3"+
		"~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u05d1\n~\3\177\3\177\5"+
		"\177\u05d5\n\177\3\177\5\177\u05d8\n\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\5\u0080\u05df\n\u0080\3\u0080\5\u0080\u05e2\n\u0080\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u05e9\n\u0081\f\u0081\16\u0081\u05ec"+
		"\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\5\u0082\u05f8\n\u0082\3\u0083\3\u0083\5\u0083\u05fc\n"+
		"\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0602\n\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\6\u0084\u0609\n\u0084\r\u0084\16\u0084"+
		"\u060a\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0613\n"+
		"\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u0618\n\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0623\n"+
		"\u0087\5\u0087\u0625\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u0630\n\u0089\3\u008a\3\u008a\5"+
		"\u008a\u0634\n\u008a\3\u008a\5\u008a\u0637\n\u008a\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u0640\n\u008b\f\u008b\16\u008b"+
		"\u0643\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u064a"+
		"\n\u008c\f\u008c\16\u008c\u064d\13\u008c\3\u008d\3\u008d\5\u008d\u0651"+
		"\n\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u0656\n\u008e\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0660\n\u0091"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\5\u0094\u0668\n\u0094"+
		"\3\u0095\7\u0095\u066b\n\u0095\f\u0095\16\u0095\u066e\13\u0095\3\u0096"+
		"\3\u0096\7\u0096\u0672\n\u0096\f\u0096\16\u0096\u0675\13\u0096\3\u0096"+
		"\6\u0096\u0678\n\u0096\r\u0096\16\u0096\u0679\3\u0096\3\u0096\7\u0096"+
		"\u067e\n\u0096\f\u0096\16\u0096\u0681\13\u0096\7\u0096\u0683\n\u0096\f"+
		"\u0096\16\u0096\u0686\13\u0096\5\u0096\u0688\n\u0096\3\u0096\2\3\u00e6"+
		"\u0097\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\2\26\7\2\n\n%%\60\60"+
		"\64\64\67\67\7\2\17\17\27\27\34\34(*,-\7\2\n\n\17\17\34\34(*,-\4\2\33"+
		"\33..\4\2VV^^\4\2\13\13^^\3\2ef\3\2[\\\3\2eh\4\2ijnn\3\2gh\3\2=>\6\2\13"+
		"\13NNYZ`a\5\2IK__bb\3\2EF\5\2\t\t##MM\5\2HHXXoz\4\2?AWW\4\2\16\16\66\66"+
		"\4\2\t8;<\2\u06f3\2\u012c\3\2\2\2\4\u0138\3\2\2\2\6\u0144\3\2\2\2\b\u0148"+
		"\3\2\2\2\n\u0154\3\2\2\2\f\u0159\3\2\2\2\16\u015c\3\2\2\2\20\u0161\3\2"+
		"\2\2\22\u0166\3\2\2\2\24\u016b\3\2\2\2\26\u0171\3\2\2\2\30\u0175\3\2\2"+
		"\2\32\u0178\3\2\2\2\34\u017d\3\2\2\2\36\u0181\3\2\2\2 \u0190\3\2\2\2\""+
		"\u0197\3\2\2\2$\u01a1\3\2\2\2&\u01b6\3\2\2\2(\u01de\3\2\2\2*\u01f8\3\2"+
		"\2\2,\u0208\3\2\2\2.\u0217\3\2\2\2\60\u021e\3\2\2\2\62\u023f\3\2\2\2\64"+
		"\u0243\3\2\2\2\66\u0248\3\2\2\28\u024a\3\2\2\2:\u024c\3\2\2\2<\u0256\3"+
		"\2\2\2>\u025e\3\2\2\2@\u0260\3\2\2\2B\u0262\3\2\2\2D\u0276\3\2\2\2F\u027b"+
		"\3\2\2\2H\u027d\3\2\2\2J\u0284\3\2\2\2L\u0291\3\2\2\2N\u0296\3\2\2\2P"+
		"\u029a\3\2\2\2R\u029e\3\2\2\2T\u02a0\3\2\2\2V\u02b8\3\2\2\2X\u02ba\3\2"+
		"\2\2Z\u02bd\3\2\2\2\\\u02c7\3\2\2\2^\u02cf\3\2\2\2`\u02da\3\2\2\2b\u02dd"+
		"\3\2\2\2d\u02ec\3\2\2\2f\u02ee\3\2\2\2h\u02fb\3\2\2\2j\u0302\3\2\2\2l"+
		"\u0305\3\2\2\2n\u0308\3\2\2\2p\u0316\3\2\2\2r\u0318\3\2\2\2t\u032a\3\2"+
		"\2\2v\u032c\3\2\2\2x\u0333\3\2\2\2z\u0339\3\2\2\2|\u033f\3\2\2\2~\u0343"+
		"\3\2\2\2\u0080\u0347\3\2\2\2\u0082\u0349\3\2\2\2\u0084\u0358\3\2\2\2\u0086"+
		"\u035a\3\2\2\2\u0088\u036b\3\2\2\2\u008a\u036e\3\2\2\2\u008c\u0379\3\2"+
		"\2\2\u008e\u037b\3\2\2\2\u0090\u037d\3\2\2\2\u0092\u0385\3\2\2\2\u0094"+
		"\u038d\3\2\2\2\u0096\u0392\3\2\2\2\u0098\u0394\3\2\2\2\u009a\u03a4\3\2"+
		"\2\2\u009c\u03b3\3\2\2\2\u009e\u03b5\3\2\2\2\u00a0\u03bc\3\2\2\2\u00a2"+
		"\u03d1\3\2\2\2\u00a4\u03d3\3\2\2\2\u00a6\u03df\3\2\2\2\u00a8\u03e3\3\2"+
		"\2\2\u00aa\u03ef\3\2\2\2\u00ac\u03f1\3\2\2\2\u00ae\u03ff\3\2\2\2\u00b0"+
		"\u0420\3\2\2\2\u00b2\u0422\3\2\2\2\u00b4\u0426\3\2\2\2\u00b6\u042a\3\2"+
		"\2\2\u00b8\u043d\3\2\2\2\u00ba\u0464\3\2\2\2\u00bc\u0466\3\2\2\2\u00be"+
		"\u0471\3\2\2\2\u00c0\u0479\3\2\2\2\u00c2\u047d\3\2\2\2\u00c4\u0485\3\2"+
		"\2\2\u00c6\u0490\3\2\2\2\u00c8\u0495\3\2\2\2\u00ca\u04a1\3\2\2\2\u00cc"+
		"\u04a5\3\2\2\2\u00ce\u04a7\3\2\2\2\u00d0\u04b0\3\2\2\2\u00d2\u04bc\3\2"+
		"\2\2\u00d4\u04be\3\2\2\2\u00d6\u04c0\3\2\2\2\u00d8\u04c4\3\2\2\2\u00da"+
		"\u04c6\3\2\2\2\u00dc\u04ca\3\2\2\2\u00de\u04d5\3\2\2\2\u00e0\u04db\3\2"+
		"\2\2\u00e2\u04df\3\2\2\2\u00e4\u04e1\3\2\2\2\u00e6\u04f6\3\2\2\2\u00e8"+
		"\u056b\3\2\2\2\u00ea\u056d\3\2\2\2\u00ec\u0579\3\2\2\2\u00ee\u0582\3\2"+
		"\2\2\u00f0\u05a8\3\2\2\2\u00f2\u05ae\3\2\2\2\u00f4\u05b2\3\2\2\2\u00f6"+
		"\u05b5\3\2\2\2\u00f8\u05bd\3\2\2\2\u00fa\u05d0\3\2\2\2\u00fc\u05d2\3\2"+
		"\2\2\u00fe\u05db\3\2\2\2\u0100\u05e5\3\2\2\2\u0102\u05f7\3\2\2\2\u0104"+
		"\u05fb\3\2\2\2\u0106\u05fd\3\2\2\2\u0108\u0614\3\2\2\2\u010a\u061c\3\2"+
		"\2\2\u010c\u061e\3\2\2\2\u010e\u0626\3\2\2\2\u0110\u062f\3\2\2\2\u0112"+
		"\u0631\3\2\2\2\u0114\u063a\3\2\2\2\u0116\u0644\3\2\2\2\u0118\u0650\3\2"+
		"\2\2\u011a\u0655\3\2\2\2\u011c\u0657\3\2\2\2\u011e\u0659\3\2\2\2\u0120"+
		"\u065f\3\2\2\2\u0122\u0661\3\2\2\2\u0124\u0663\3\2\2\2\u0126\u0667\3\2"+
		"\2\2\u0128\u066c\3\2\2\2\u012a\u0687\3\2\2\2\u012c\u012e\5\u0128\u0095"+
		"\2\u012d\u012f\5\6\4\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131"+
		"\3\2\2\2\u0130\u0132\5\u012a\u0096\2\u0131\u0130\3\2\2\2\u0131\u0132\3"+
		"\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\5\4\3\2\u0134\u0133\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\2\2\3\u0137\3\3\2\2\2"+
		"\u0138\u013e\5\u00ba^\2\u0139\u013a\5\u012a\u0096\2\u013a\u013b\5\u00ba"+
		"^\2\u013b\u013d\3\2\2\2\u013c\u0139\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0143\5\u012a\u0096\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2"+
		"\2\u0143\5\3\2\2\2\u0144\u0145\5\u0088E\2\u0145\u0146\7\'\2\2\u0146\u0147"+
		"\5f\64\2\u0147\7\3\2\2\2\u0148\u0149\5\u0088E\2\u0149\u014b\7\"\2\2\u014a"+
		"\u014c\7,\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0152\5f\64\2\u014e\u014f\7W\2\2\u014f\u0153\7i\2\2\u0150\u0151"+
		"\7\t\2\2\u0151\u0153\5\u0120\u0091\2\u0152\u014e\3\2\2\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\t\3\2\2\2\u0154\u0155\5\22\n\2\u0155"+
		"\u0156\5&\24\2\u0156\13\3\2\2\2\u0157\u015a\5\26\f\2\u0158\u015a\t\2\2"+
		"\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\r\3\2\2\2\u015b\u015d"+
		"\5\20\t\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\17\3\2\2\2\u015e"+
		"\u015f\5\f\7\2\u015f\u0160\5\u0128\u0095\2\u0160\u0162\3\2\2\2\u0161\u015e"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\21\3\2\2\2\u0165\u0167\5\24\13\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\23\3\2\2\2\u0168\u0169\5\26\f\2\u0169\u016a\5\u0128\u0095\2"+
		"\u016a\u016c\3\2\2\2\u016b\u0168\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\25\3\2\2\2\u016f\u0172\5\u008aF\2\u0170"+
		"\u0172\t\3\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\27\3\2\2"+
		"\2\u0173\u0176\5\u008aF\2\u0174\u0176\t\4\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\31\3\2\2\2\u0177\u0179\5\34\17\2\u0178\u0177\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\33\3\2\2\2\u017a\u017b\5\30\r\2\u017b\u017c"+
		"\5\u0128\u0095\2\u017c\u017e\3\2\2\2\u017d\u017a\3\2\2\2\u017e\u017f\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\35\3\2\2\2\u0181"+
		"\u0182\7Z\2\2\u0182\u0183\5\u0128\u0095\2\u0183\u018a\5 \21\2\u0184\u0185"+
		"\7V\2\2\u0185\u0186\5\u0128\u0095\2\u0186\u0187\5 \21\2\u0187\u0189\3"+
		"\2\2\2\u0188\u0184\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\5\u0128"+
		"\u0095\2\u018e\u018f\7Y\2\2\u018f\37\3\2\2\2\u0190\u0195\5\u011e\u0090"+
		"\2\u0191\u0192\7\33\2\2\u0192\u0193\5\u0128\u0095\2\u0193\u0194\5\"\22"+
		"\2\u0194\u0196\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0196\3\2\2\2\u0196!"+
		"\3\2\2\2\u0197\u019e\5J&\2\u0198\u0199\7k\2\2\u0199\u019a\5\u0128\u0095"+
		"\2\u019a\u019b\5J&\2\u019b\u019d\3\2\2\2\u019c\u0198\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f#\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a8\5J&\2\u01a2\u01a3\7V\2\2\u01a3\u01a4\5\u0128"+
		"\u0095\2\u01a4\u01a5\5J&\2\u01a5\u01a7\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9%\3\2\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\24\2\2\u01ac\u01b7\b\24\1\2\u01ad\u01ae"+
		"\7$\2\2\u01ae\u01b7\b\24\1\2\u01af\u01b0\7\32\2\2\u01b0\u01b7\b\24\1\2"+
		"\u01b1\u01b2\7}\2\2\u01b2\u01b3\7$\2\2\u01b3\u01b7\b\24\1\2\u01b4\u01b5"+
		"\7\f\2\2\u01b5\u01b7\b\24\1\2\u01b6\u01ab\3\2\2\2\u01b6\u01ad\3\2\2\2"+
		"\u01b6\u01af\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b9\5\u0120\u0091\2\u01b9\u01da\5\u0128\u0095\2\u01ba"+
		"\u01bc\6\24\2\3\u01bb\u01bd\5\36\20\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01cc\5\u0128\u0095\2\u01bf\u01c9\6"+
		"\24\3\3\u01c0\u01c1\7\33\2\2\u01c1\u01c5\5\u0128\u0095\2\u01c2\u01c3\6"+
		"\24\4\3\u01c3\u01c6\5$\23\2\u01c4\u01c6\5J&\2\u01c5\u01c2\3\2\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\5\u0128\u0095\2\u01c8\u01ca"+
		"\3\2\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01cd\3\2\2\2\u01cc\u01bf\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d7\3\2"+
		"\2\2\u01ce\u01d4\6\24\5\3\u01cf\u01d0\7!\2\2\u01d0\u01d1\5\u0128\u0095"+
		"\2\u01d1\u01d2\5$\23\2\u01d2\u01d3\5\u0128\u0095\2\u01d3\u01d5\3\2\2\2"+
		"\u01d4\u01cf\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d8"+
		"\3\2\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01ba\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01dd\5(\25\2\u01dd\'\3\2\2\2\u01de\u01df\7Q\2\2\u01df\u01e6"+
		"\5\u0128\u0095\2\u01e0\u01e2\6\25\6\3\u01e1\u01e3\5*\26\2\u01e2\u01e1"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e7\5\u0128\u0095"+
		"\2\u01e5\u01e7\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01e9"+
		"\3\2\2\2\u01e8\u01ea\5.\30\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01f0\3\2\2\2\u01eb\u01ec\5\u012a\u0096\2\u01ec\u01ed\5.\30\2\u01ed\u01ef"+
		"\3\2\2\2\u01ee\u01eb\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\5\u012a"+
		"\u0096\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\7R\2\2\u01f7)\3\2\2\2\u01f8\u0200\5,\27\2\u01f9\u01fa\5\u0128\u0095"+
		"\2\u01fa\u01fb\7V\2\2\u01fb\u01fc\5\u0128\u0095\2\u01fc\u01fd\5,\27\2"+
		"\u01fd\u01ff\3\2\2\2\u01fe\u01f9\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0206\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0204\5\u0128\u0095\2\u0204\u0205\7V\2\2\u0205\u0207\3\2\2\2\u0206\u0203"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207+\3\2\2\2\u0208\u0209\5\u0088E\2\u0209"+
		"\u020b\5\u0120\u0091\2\u020a\u020c\5\u0112\u008a\2\u020b\u020a\3\2\2\2"+
		"\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020f\5\u010a\u0086\2\u020e"+
		"\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f-\3\2\2\2\u0210\u0218\7U\2\2\u0211"+
		"\u0212\7,\2\2\u0212\u0214\5\u0128\u0095\2\u0213\u0211\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0218\5\u009aN\2\u0216\u0218\5\60\31"+
		"\2\u0217\u0210\3\2\2\2\u0217\u0213\3\2\2\2\u0217\u0216\3\2\2\2\u0218/"+
		"\3\2\2\2\u0219\u021f\5\62\32\2\u021a\u021f\58\35\2\u021b\u021c\5\16\b"+
		"\2\u021c\u021d\5&\24\2\u021d\u021f\3\2\2\2\u021e\u0219\3\2\2\2\u021e\u021a"+
		"\3\2\2\2\u021e\u021b\3\2\2\2\u021f\61\3\2\2\2\u0220\u0221\6\32\7\3\u0221"+
		"\u0222\5\66\34\2\u0222\u0223\5\64\33\2\u0223\u0224\7O\2\2\u0224\u0229"+
		"\7P\2\2\u0225\u0226\7\27\2\2\u0226\u0227\5\u0128\u0095\2\u0227\u0228\5"+
		"\u0096L\2\u0228\u022a\3\2\2\2\u0229\u0225\3\2\2\2\u0229\u022a\3\2\2\2"+
		"\u022a\u0240\3\2\2\2\u022b\u022d\5\16\b\2\u022c\u022e\5\36\20\2\u022d"+
		"\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0231\5\66"+
		"\34\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0233\5\64\33\2\u0233\u0239\5\\/\2\u0234\u0235\5\u0128\u0095\2\u0235"+
		"\u0236\7\63\2\2\u0236\u0237\5\u0128\u0095\2\u0237\u0238\5Z.\2\u0238\u023a"+
		"\3\2\2\2\u0239\u0234\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023d\5\u0128\u0095\2\u023c\u023e\5d\63\2\u023d\u023c\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0220\3\2\2\2\u023f\u022b\3\2\2\2\u0240"+
		"\63\3\2\2\2\u0241\u0244\5\u0120\u0091\2\u0242\u0244\5\u011c\u008f\2\u0243"+
		"\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244\65\3\2\2\2\u0245\u0249\5H%\2"+
		"\u0246\u0247\6\34\b\3\u0247\u0249\7\66\2\2\u0248\u0245\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0249\67\3\2\2\2\u024a\u024b\5\u00a2R\2\u024b9\3\2\2\2\u024c"+
		"\u0253\5<\37\2\u024d\u024e\7V\2\2\u024e\u024f\5\u0128\u0095\2\u024f\u0250"+
		"\5<\37\2\u0250\u0252\3\2\2\2\u0251\u024d\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254;\3\2\2\2\u0255\u0253\3\2\2\2"+
		"\u0256\u025c\5> \2\u0257\u0258\5\u0128\u0095\2\u0258\u0259\7X\2\2\u0259"+
		"\u025a\5\u0128\u0095\2\u025a\u025b\5@!\2\u025b\u025d\3\2\2\2\u025c\u0257"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d=\3\2\2\2\u025e\u025f\5\u0120\u0091"+
		"\2\u025f?\3\2\2\2\u0260\u0261\5\u00e0q\2\u0261A\3\2\2\2\u0262\u0263\5"+
		"@!\2\u0263\u026b\5\u0128\u0095\2\u0264\u0265\7V\2\2\u0265\u0266\5\u0128"+
		"\u0095\2\u0266\u0267\5@!\2\u0267\u0268\5\u0128\u0095\2\u0268\u026a\3\2"+
		"\2\2\u0269\u0264\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0270\5\u0128"+
		"\u0095\2\u026f\u0271\7V\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"C\3\2\2\2\u0272\u0273\5\u0088E\2\u0273\u0274\7S\2\2\u0274\u0275\7T\2\2"+
		"\u0275\u0277\3\2\2\2\u0276\u0272\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0276"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279E\3\2\2\2\u027a\u027c\5D#\2\u027b\u027a"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027cG\3\2\2\2\u027d\u0280\5\u0088E\2\u027e"+
		"\u0281\5R*\2\u027f\u0281\5P)\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2\2\2"+
		"\u0281\u0282\3\2\2\2\u0282\u0283\5F$\2\u0283I\3\2\2\2\u0284\u028b\5\u0088"+
		"E\2\u0285\u0289\5R*\2\u0286\u0287\7\66\2\2\u0287\u0289\b&\1\2\u0288\u0285"+
		"\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u028c\5N(\2\u028b"+
		"\u0288\3\2\2\2\u028b\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\5F"+
		"$\2\u028eK\3\2\2\2\u028f\u0292\5l\67\2\u0290\u0292\5n8\2\u0291\u028f\3"+
		"\2\2\2\u0291\u0290\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0295\5T+\2\u0294"+
		"\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295M\3\2\2\2\u0296\u0298\5l\67\2"+
		"\u0297\u0299\5T+\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299O\3\2"+
		"\2\2\u029a\u029c\5n8\2\u029b\u029d\5T+\2\u029c\u029b\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029dQ\3\2\2\2\u029e\u029f\7\16\2\2\u029fS\3\2\2\2\u02a0\u02a1"+
		"\7Z\2\2\u02a1\u02a2\5\u0128\u0095\2\u02a2\u02a9\5V,\2\u02a3\u02a4\7V\2"+
		"\2\u02a4\u02a5\5\u0128\u0095\2\u02a5\u02a6\5V,\2\u02a6\u02a8\3\2\2\2\u02a7"+
		"\u02a3\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\5\u0128\u0095"+
		"\2\u02ad\u02ae\7Y\2\2\u02aeU\3\2\2\2\u02af\u02b9\5J&\2\u02b0\u02b1\5\u0088"+
		"E\2\u02b1\u02b6\7]\2\2\u02b2\u02b3\t\5\2\2\u02b3\u02b4\5\u0128\u0095\2"+
		"\u02b4\u02b5\5J&\2\u02b5\u02b7\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b6\u02b7"+
		"\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02af\3\2\2\2\u02b8\u02b0\3\2\2\2\u02b9"+
		"W\3\2\2\2\u02ba\u02bb\5\u0088E\2\u02bb\u02bc\5l\67\2\u02bcY\3\2\2\2\u02bd"+
		"\u02c4\5X-\2\u02be\u02bf\7V\2\2\u02bf\u02c0\5\u0128\u0095\2\u02c0\u02c1"+
		"\5X-\2\u02c1\u02c3\3\2\2\2\u02c2\u02be\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5[\3\2\2\2\u02c6\u02c4\3\2\2\2"+
		"\u02c7\u02c9\7O\2\2\u02c8\u02ca\5^\60\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\7P\2\2\u02cc]\3\2\2\2\u02cd\u02d0"+
		"\5b\62\2\u02ce\u02d0\5`\61\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0"+
		"\u02d7\3\2\2\2\u02d1\u02d2\7V\2\2\u02d2\u02d3\5\u0128\u0095\2\u02d3\u02d4"+
		"\5b\62\2\u02d4\u02d6\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8_\3\2\2\2\u02d9\u02d7\3\2\2\2"+
		"\u02da\u02db\5J&\2\u02db\u02dc\7\61\2\2\u02dca\3\2\2\2\u02dd\u02df\5\32"+
		"\16\2\u02de\u02e0\5J&\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e2\3\2\2\2\u02e1\u02e3\7~\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02ea\5> \2\u02e5\u02e6\5\u0128\u0095\2"+
		"\u02e6\u02e7\7X\2\2\u02e7\u02e8\5\u0128\u0095\2\u02e8\u02e9\5\u00e6t\2"+
		"\u02e9\u02eb\3\2\2\2\u02ea\u02e5\3\2\2\2\u02ea\u02eb\3\2\2\2\u02ebc\3"+
		"\2\2\2\u02ec\u02ed\5\u009aN\2\u02ede\3\2\2\2\u02ee\u02f3\5h\65\2\u02ef"+
		"\u02f0\7W\2\2\u02f0\u02f2\5h\65\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5\3\2"+
		"\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4g\3\2\2\2\u02f5\u02f3"+
		"\3\2\2\2\u02f6\u02fc\5\u0120\u0091\2\u02f7\u02fc\7\n\2\2\u02f8\u02fc\7"+
		"\13\2\2\u02f9\u02fc\7\t\2\2\u02fa\u02fc\7\f\2\2\u02fb\u02f6\3\2\2\2\u02fb"+
		"\u02f7\3\2\2\2\u02fb\u02f8\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2"+
		"\2\2\u02fci\3\2\2\2\u02fd\u02fe\5h\65\2\u02fe\u02ff\7W\2\2\u02ff\u0301"+
		"\3\2\2\2\u0300\u02fd\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303k\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0306\5j\66\2"+
		"\u0306\u0307\5\u0120\u0091\2\u0307m\3\2\2\2\u0308\u0309\5j\66\2\u0309"+
		"\u030e\5\u011e\u0090\2\u030a\u030b\7W\2\2\u030b\u030d\5\u011e\u0090\2"+
		"\u030c\u030a\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030fo\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0317\79\2\2\u0312\u0317"+
		"\7:\2\2\u0313\u0317\5\u011c\u008f\2\u0314\u0317\7;\2\2\u0315\u0317\7<"+
		"\2\2\u0316\u0311\3\2\2\2\u0316\u0312\3\2\2\2\u0316\u0313\3\2\2\2\u0316"+
		"\u0314\3\2\2\2\u0316\u0315\3\2\2\2\u0317q\3\2\2\2\u0318\u0319\7\4\2\2"+
		"\u0319\u031e\5t;\2\u031a\u031b\7\6\2\2\u031b\u031d\5t;\2\u031c\u031a\3"+
		"\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7\5\2\2\u0322s\3\2\2\2"+
		"\u0323\u032b\5v<\2\u0324\u0326\7Q\2\2\u0325\u0327\5\u00e2r\2\u0326\u0325"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032b\7R\2\2\u0329"+
		"\u032b\5\u0082B\2\u032a\u0323\3\2\2\2\u032a\u0324\3\2\2\2\u032a\u0329"+
		"\3\2\2\2\u032bu\3\2\2\2\u032c\u0330\5\u0120\u0091\2\u032d\u032f\7\7\2"+
		"\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331"+
		"\3\2\2\2\u0331w\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\5|?\2\u0334\u0335"+
		"\5\u0128\u0095\2\u0335\u0336\7L\2\2\u0336\u0337\5\u0128\u0095\2\u0337"+
		"\u0338\5\u0080A\2\u0338y\3\2\2\2\u0339\u033a\5~@\2\u033a\u033b\5\u0128"+
		"\u0095\2\u033b\u033c\7L\2\2\u033c\u033d\5\u0128\u0095\2\u033d\u033e\5"+
		"\u0080A\2\u033e{\3\2\2\2\u033f\u0340\5\\/\2\u0340}\3\2\2\2\u0341\u0344"+
		"\5\\/\2\u0342\u0344\5> \2\u0343\u0341\3\2\2\2\u0343\u0342\3\2\2\2\u0344"+
		"\177\3\2\2\2\u0345\u0348\5\u009aN\2\u0346\u0348\5\u00e2r\2\u0347\u0345"+
		"\3\2\2\2\u0347\u0346\3\2\2\2\u0348\u0081\3\2\2\2\u0349\u034a\7Q\2\2\u034a"+
		"\u0352\5\u0128\u0095\2\u034b\u034d\5^\60\2\u034c\u034b\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\5\u0128\u0095\2\u034f\u0350\7"+
		"L\2\2\u0350\u0351\5\u0128\u0095\2\u0351\u0353\3\2\2\2\u0352\u034c\3\2"+
		"\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\5\u0084C\2\u0355"+
		"\u0356\7R\2\2\u0356\u0083\3\2\2\2\u0357\u0359\5\u0086D\2\u0358\u0357\3"+
		"\2\2\2\u0358\u0359\3\2\2\2\u0359\u0085\3\2\2\2\u035a\u0360\5\u009cO\2"+
		"\u035b\u035c\5\u012a\u0096\2\u035c\u035d\5\u009cO\2\u035d\u035f\3\2\2"+
		"\2\u035e\u035b\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361"+
		"\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0365\5\u012a\u0096"+
		"\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0087\3\2\2\2\u0366\u0367"+
		"\5\u008aF\2\u0367\u0368\5\u0128\u0095\2\u0368\u036a\3\2\2\2\u0369\u0366"+
		"\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u0089\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u036f\7}\2\2\u036f\u0375\5\u008e"+
		"H\2\u0370\u0372\7O\2\2\u0371\u0373\5\u008cG\2\u0372\u0371\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\5\u0126\u0094\2\u0375\u0370"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u008b\3\2\2\2\u0377\u037a\5\u0090I"+
		"\2\u0378\u037a\5\u0096L\2\u0379\u0377\3\2\2\2\u0379\u0378\3\2\2\2\u037a"+
		"\u008d\3\2\2\2\u037b\u037c\5l\67\2\u037c\u008f\3\2\2\2\u037d\u0382\5\u0092"+
		"J\2\u037e\u037f\7V\2\2\u037f\u0381\5\u0092J\2\u0380\u037e\3\2\2\2\u0381"+
		"\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0091\3\2"+
		"\2\2\u0384\u0382\3\2\2\2\u0385\u0386\5\u0094K\2\u0386\u0387\5\u0128\u0095"+
		"\2\u0387\u0388\7X\2\2\u0388\u0389\5\u0128\u0095\2\u0389\u038a\5\u0096"+
		"L\2\u038a\u0093\3\2\2\2\u038b\u038e\5\u0120\u0091\2\u038c\u038e\5\u0124"+
		"\u0093\2\u038d\u038b\3\2\2\2\u038d\u038c\3\2\2\2\u038e\u0095\3\2\2\2\u038f"+
		"\u0393\5\u0098M\2\u0390\u0393\5\u008aF\2\u0391\u0393\5\u00e6t\2\u0392"+
		"\u038f\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u0097\3\2"+
		"\2\2\u0394\u039d\7S\2\2\u0395\u039a\5\u0096L\2\u0396\u0397\7V\2\2\u0397"+
		"\u0399\5\u0096L\2\u0398\u0396\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398"+
		"\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2\2\2\u039d"+
		"\u0395\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u03a1\7V"+
		"\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a3\7T\2\2\u03a3\u0099\3\2\2\2\u03a4\u03ac\7Q\2\2\u03a5\u03ad\5\u0128"+
		"\u0095\2\u03a6\u03a8\5\u012a\u0096\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3"+
		"\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab"+
		"\u03a9\3\2\2\2\u03ac\u03a5\3\2\2\2\u03ac\u03a9\3\2\2\2\u03ad\u03ae\3\2"+
		"\2\2\u03ae\u03af\5\u0084C\2\u03af\u03b0\7R\2\2\u03b0\u009b\3\2\2\2\u03b1"+
		"\u03b4\5\u009eP\2\u03b2\u03b4\5\u00ba^\2\u03b3\u03b1\3\2\2\2\u03b3\u03b2"+
		"\3\2\2\2\u03b4\u009d\3\2\2\2\u03b5\u03b6\6P\t\2\u03b6\u03b7\5\u00a2R\2"+
		"\u03b7\u009f\3\2\2\2\u03b8\u03b9\6Q\n\3\u03b9\u03bd\5\34\17\2\u03ba\u03bb"+
		"\6Q\13\3\u03bb\u03bd\5\20\t\2\u03bc\u03b8\3\2\2\2\u03bc\u03ba\3\2\2\2"+
		"\u03bd\u00a1\3\2\2\2\u03be\u03c9\5\u00a0Q\2\u03bf\u03c1\5J&\2\u03c0\u03bf"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03ca\5:\36\2\u03c3"+
		"\u03c4\5\u00a4S\2\u03c4\u03c5\5\u0128\u0095\2\u03c5\u03c6\7X\2\2\u03c6"+
		"\u03c7\5\u0128\u0095\2\u03c7\u03c8\5@!\2\u03c8\u03ca\3\2\2\2\u03c9\u03c0"+
		"\3\2\2\2\u03c9\u03c3\3\2\2\2\u03ca\u03d2\3\2\2\2\u03cb\u03cd\5\u00a0Q"+
		"\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf"+
		"\5J&\2\u03cf\u03d0\5:\36\2\u03d0\u03d2\3\2\2\2\u03d1\u03be\3\2\2\2\u03d1"+
		"\u03cc\3\2\2\2\u03d2\u00a3\3\2\2\2\u03d3\u03d4\7O\2\2\u03d4\u03d9\5\u00a6"+
		"T\2\u03d5\u03d6\7V\2\2\u03d6\u03d8\5\u00a6T\2\u03d7\u03d5\3\2\2\2\u03d8"+
		"\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\3\2"+
		"\2\2\u03db\u03d9\3\2\2\2\u03dc\u03dd\7P\2\2\u03dd\u00a5\3\2\2\2\u03de"+
		"\u03e0\5J&\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2"+
		"\2\u03e1\u03e2\5> \2\u03e2\u00a7\3\2\2\2\u03e3\u03e4\7O\2\2\u03e4\u03e7"+
		"\5> \2\u03e5\u03e6\7V\2\2\u03e6\u03e8\5> \2\u03e7\u03e5\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u03ec\5\u0126\u0094\2\u03ec\u00a9\3\2\2\2\u03ed\u03f0\5\u00ac"+
		"W\2\u03ee\u03f0\5\u00aeX\2\u03ef\u03ed\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0"+
		"\u00ab\3\2\2\2\u03f1\u03f2\7\37\2\2\u03f2\u03f3\5\u00dan\2\u03f3\u03f4"+
		"\5\u0128\u0095\2\u03f4\u03fd\5\u00ba^\2\u03f5\u03f8\5\u0128\u0095\2\u03f6"+
		"\u03f8\5\u012a\u0096\2\u03f7\u03f5\3\2\2\2\u03f7\u03f6\3\2\2\2\u03f8\u03f9"+
		"\3\2\2\2\u03f9\u03fa\7\31\2\2\u03fa\u03fb\5\u0128\u0095\2\u03fb\u03fc"+
		"\5\u00ba^\2\u03fc\u03fe\3\2\2\2\u03fd\u03f7\3\2\2\2\u03fd\u03fe\3\2\2"+
		"\2\u03fe\u00ad\3\2\2\2\u03ff\u0400\7/\2\2\u0400\u0401\5\u00dan\2\u0401"+
		"\u0402\5\u0128\u0095\2\u0402\u0403\7Q\2\2\u0403\u0407\5\u0128\u0095\2"+
		"\u0404\u0406\5\u00c8e\2\u0405\u0404\3\2\2\2\u0406\u0409\3\2\2\2\u0407"+
		"\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\3\2\2\2\u0409\u0407\3\2"+
		"\2\2\u040a\u040b\5\u0128\u0095\2\u040b\u040c\7R\2\2\u040c\u00af\3\2\2"+
		"\2\u040d\u040e\7\36\2\2\u040e\u040f\7O\2\2\u040f\u0410\5\u00ccg\2\u0410"+
		"\u0411\5\u0126\u0094\2\u0411\u0412\5\u0128\u0095\2\u0412\u0413\5\u00ba"+
		"^\2\u0413\u0421\3\2\2\2\u0414\u0415\78\2\2\u0415\u0416\5\u00dan\2\u0416"+
		"\u0417\5\u0128\u0095\2\u0417\u0418\5\u00ba^\2\u0418\u0421\3\2\2\2\u0419"+
		"\u041a\7\30\2\2\u041a\u041b\5\u0128\u0095\2\u041b\u041c\5\u00ba^\2\u041c"+
		"\u041d\5\u0128\u0095\2\u041d\u041e\78\2\2\u041e\u041f\5\u00dan\2\u041f"+
		"\u0421\3\2\2\2\u0420\u040d\3\2\2\2\u0420\u0414\3\2\2\2\u0420\u0419\3\2"+
		"\2\2\u0421\u00b1\3\2\2\2\u0422\u0424\7\26\2\2\u0423\u0425\5\u0120\u0091"+
		"\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u00b3\3\2\2\2\u0426\u0428"+
		"\7\21\2\2\u0427\u0429\5\u0120\u0091\2\u0428\u0427\3\2\2\2\u0428\u0429"+
		"\3\2\2\2\u0429\u00b5\3\2\2\2\u042a\u042c\7\65\2\2\u042b\u042d\5\u00c2"+
		"b\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e\3\2\2\2\u042e"+
		"\u042f\5\u0128\u0095\2\u042f\u0435\5\u009aN\2\u0430\u0431\5\u0128\u0095"+
		"\2\u0431\u0432\5\u00bc_\2\u0432\u0434\3\2\2\2\u0433\u0430\3\2\2\2\u0434"+
		"\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u043b\3\2"+
		"\2\2\u0437\u0435\3\2\2\2\u0438\u0439\5\u0128\u0095\2\u0439\u043a\5\u00c0"+
		"a\2\u043a\u043c\3\2\2\2\u043b\u0438\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u00b7\3\2\2\2\u043d\u043e\7\20\2\2\u043e\u0444\5\u00e6t\2\u043f\u0440"+
		"\5\u0128\u0095\2\u0440\u0441\t\6\2\2\u0441\u0442\5\u0128\u0095\2\u0442"+
		"\u0443\5\u00e6t\2\u0443\u0445\3\2\2\2\u0444\u043f\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u00b9\3\2\2\2\u0446\u0465\5\u009aN\2\u0447\u0465\5\u00aa"+
		"V\2\u0448\u0465\5\u00b0Y\2\u0449\u0465\5\u00b6\\\2\u044a\u044b\7\60\2"+
		"\2\u044b\u044c\5\u00dan\2\u044c\u044d\5\u0128\u0095\2\u044d\u044e\5\u009a"+
		"N\2\u044e\u0465\3\2\2\2\u044f\u0451\7+\2\2\u0450\u0452\5\u00e6t\2\u0451"+
		"\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0465\3\2\2\2\u0453\u0454\7\62"+
		"\2\2\u0454\u0465\5\u00e6t\2\u0455\u0465\5\u00b4[\2\u0456\u0465\5\u00b2"+
		"Z\2\u0457\u0458\5\u0120\u0091\2\u0458\u0459\7^\2\2\u0459\u045a\5\u0128"+
		"\u0095\2\u045a\u045b\5\u00ba^\2\u045b\u0465\3\2\2\2\u045c\u0465\5\b\5"+
		"\2\u045d\u0465\5\u00b8]\2\u045e\u0465\5\n\6\2\u045f\u0465\5\u009eP\2\u0460"+
		"\u0461\6^\f\2\u0461\u0465\5\62\32\2\u0462\u0465\5\u00e2r\2\u0463\u0465"+
		"\7U\2\2\u0464\u0446\3\2\2\2\u0464\u0447\3\2\2\2\u0464\u0448\3\2\2\2\u0464"+
		"\u0449\3\2\2\2\u0464\u044a\3\2\2\2\u0464\u044f\3\2\2\2\u0464\u0453\3\2"+
		"\2\2\u0464\u0455\3\2\2\2\u0464\u0456\3\2\2\2\u0464\u0457\3\2\2\2\u0464"+
		"\u045c\3\2\2\2\u0464\u045d\3\2\2\2\u0464\u045e\3\2\2\2\u0464\u045f\3\2"+
		"\2\2\u0464\u0460\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0463\3\2\2\2\u0465"+
		"\u00bb\3\2\2\2\u0466\u0467\7\23\2\2\u0467\u0468\7O\2\2\u0468\u046a\5\32"+
		"\16\2\u0469\u046b\5\u00be`\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046c\u046d\5\u0120\u0091\2\u046d\u046e\5\u0126\u0094\2"+
		"\u046e\u046f\5\u0128\u0095\2\u046f\u0470\5\u009aN\2\u0470\u00bd\3\2\2"+
		"\2\u0471\u0476\5l\67\2\u0472\u0473\7l\2\2\u0473\u0475\5l\67\2\u0474\u0472"+
		"\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u00bf\3\2\2\2\u0478\u0476\3\2\2\2\u0479\u047a\7\35\2\2\u047a\u047b\5"+
		"\u0128\u0095\2\u047b\u047c\5\u009aN\2\u047c\u00c1\3\2\2\2\u047d\u047e"+
		"\7O\2\2\u047e\u047f\5\u0128\u0095\2\u047f\u0481\5\u00c4c\2\u0480\u0482"+
		"\5\u012a\u0096\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\3"+
		"\2\2\2\u0483\u0484\5\u0126\u0094\2\u0484\u00c3\3\2\2\2\u0485\u048b\5\u00c6"+
		"d\2\u0486\u0487\5\u012a\u0096\2\u0487\u0488\5\u00c6d\2\u0488\u048a\3\2"+
		"\2\2\u0489\u0486\3\2\2\2\u048a\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048b"+
		"\u048c\3\2\2\2\u048c\u00c5\3\2\2\2\u048d\u048b\3\2\2\2\u048e\u0491\5\u009e"+
		"P\2\u048f\u0491\5\u00e6t\2\u0490\u048e\3\2\2\2\u0490\u048f\3\2\2\2\u0491"+
		"\u00c7\3\2\2\2\u0492\u0493\5\u00caf\2\u0493\u0494\5\u0128\u0095\2\u0494"+
		"\u0496\3\2\2\2\u0495\u0492\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0495\3\2"+
		"\2\2\u0497\u0498\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\5\u0086D\2\u049a"+
		"\u00c9\3\2\2\2\u049b\u049c\7\22\2\2\u049c\u049d\5\u00e6t\2\u049d\u049e"+
		"\7^\2\2\u049e\u04a2\3\2\2\2\u049f\u04a0\7\27\2\2\u04a0\u04a2\7^\2\2\u04a1"+
		"\u049b\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u00cb\3\2\2\2\u04a3\u04a6\5\u00ce"+
		"h\2\u04a4\u04a6\5\u00d0i\2\u04a5\u04a3\3\2\2\2\u04a5\u04a4\3\2\2\2\u04a6"+
		"\u00cd\3\2\2\2\u04a7\u04a9\5\32\16\2\u04a8\u04aa\5J&\2\u04a9\u04a8\3\2"+
		"\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\5> \2\u04ac\u04ad"+
		"\t\7\2\2\u04ad\u04ae\5\u00e6t\2\u04ae\u00cf\3\2\2\2\u04af\u04b1\5\u00d2"+
		"j\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2"+
		"\u04b4\7U\2\2\u04b3\u04b5\5\u00e6t\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3"+
		"\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\7U\2\2\u04b7\u04b9\5\u00d4k\2\u04b8"+
		"\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u00d1\3\2\2\2\u04ba\u04bd\5\u009e"+
		"P\2\u04bb\u04bd\5\u00dco\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bd"+
		"\u00d3\3\2\2\2\u04be\u04bf\5\u00dco\2\u04bf\u00d5\3\2\2\2\u04c0\u04c1"+
		"\7O\2\2\u04c1\u04c2\5J&\2\u04c2\u04c3\5\u0126\u0094\2\u04c3\u00d7\3\2"+
		"\2\2\u04c4\u04c5\5\u00dan\2\u04c5\u00d9\3\2\2\2\u04c6\u04c7\7O\2\2\u04c7"+
		"\u04c8\5\u00e8u\2\u04c8\u04c9\5\u0126\u0094\2\u04c9\u00db\3\2\2\2\u04ca"+
		"\u04cf\5\u00dep\2\u04cb\u04cc\7V\2\2\u04cc\u04ce\5\u00dep\2\u04cd\u04cb"+
		"\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0"+
		"\u00dd\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04d3\7i\2\2\u04d3\u04d6\bp\1"+
		"\2\u04d4\u04d6\3\2\2\2\u04d5\u04d2\3\2\2\2\u04d5\u04d4\3\2\2\2\u04d6\u04d7"+
		"\3\2\2\2\u04d7\u04d8\5\u00e6t\2\u04d8\u00df\3\2\2\2\u04d9\u04dc\5\u00e2"+
		"r\2\u04da\u04dc\5z>\2\u04db\u04d9\3\2\2\2\u04db\u04da\3\2\2\2\u04dc\u00e1"+
		"\3\2\2\2\u04dd\u04e0\5\u00e6t\2\u04de\u04e0\5\u00eav\2\u04df\u04dd\3\2"+
		"\2\2\u04df\u04de\3\2\2\2\u04e0\u00e3\3\2\2\2\u04e1\u04e3\5\u00eex\2\u04e2"+
		"\u04e4\t\b\2\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u00e5\3\2"+
		"\2\2\u04e5\u04e6\bt\1\2\u04e6\u04e7\5\u00d6l\2\u04e7\u04e8\5\u00e6t\26"+
		"\u04e8\u04f7\3\2\2\2\u04e9\u04f7\5\u00e4s\2\u04ea\u04eb\t\t\2\2\u04eb"+
		"\u04ec\5\u0128\u0095\2\u04ec\u04ed\5\u00e6t\24\u04ed\u04f7\3\2\2\2\u04ee"+
		"\u04ef\t\n\2\2\u04ef\u04f7\5\u00e6t\22\u04f0\u04f1\5\u00a8U\2\u04f1\u04f2"+
		"\5\u0128\u0095\2\u04f2\u04f3\7X\2\2\u04f3\u04f4\5\u0128\u0095\2\u04f4"+
		"\u04f5\5\u00e2r\2\u04f5\u04f7\3\2\2\2\u04f6\u04e5\3\2\2\2\u04f6\u04e9"+
		"\3\2\2\2\u04f6\u04ea\3\2\2\2\u04f6\u04ee\3\2\2\2\u04f6\u04f0\3\2\2\2\u04f7"+
		"\u0566\3\2\2\2\u04f8\u04f9\f\23\2\2\u04f9\u04fa\7G\2\2\u04fa\u04fb\5\u0128"+
		"\u0095\2\u04fb\u04fc\5\u00e6t\24\u04fc\u0565\3\2\2\2\u04fd\u04fe\f\21"+
		"\2\2\u04fe\u04ff\5\u0128\u0095\2\u04ff\u0500\t\13\2\2\u0500\u0501\5\u0128"+
		"\u0095\2\u0501\u0502\5\u00e6t\22\u0502\u0565\3\2\2\2\u0503\u0504\f\20"+
		"\2\2\u0504\u0505\t\f\2\2\u0505\u0506\5\u0128\u0095\2\u0506\u0507\5\u00e6"+
		"t\21\u0507\u0565\3\2\2\2\u0508\u0509\f\17\2\2\u0509\u0514\5\u0128\u0095"+
		"\2\u050a\u050b\7Z\2\2\u050b\u0512\7Z\2\2\u050c\u050d\7Y\2\2\u050d\u050e"+
		"\7Y\2\2\u050e\u0512\7Y\2\2\u050f\u0510\7Y\2\2\u0510\u0512\7Y\2\2\u0511"+
		"\u050a\3\2\2\2\u0511\u050c\3\2\2\2\u0511\u050f\3\2\2\2\u0512\u0515\3\2"+
		"\2\2\u0513\u0515\t\r\2\2\u0514\u0511\3\2\2\2\u0514\u0513\3\2\2\2\u0515"+
		"\u0516\3\2\2\2\u0516\u0517\5\u0128\u0095\2\u0517\u0518\5\u00e6t\20\u0518"+
		"\u0565\3\2\2\2\u0519\u051a\f\r\2\2\u051a\u051b\5\u0128\u0095\2\u051b\u051c"+
		"\t\16\2\2\u051c\u051d\5\u0128\u0095\2\u051d\u051e\5\u00e6t\16\u051e\u0565"+
		"\3\2\2\2\u051f\u0520\f\f\2\2\u0520\u0521\5\u0128\u0095\2\u0521\u0522\t"+
		"\17\2\2\u0522\u0523\5\u0128\u0095\2\u0523\u0524\5\u00e6t\r\u0524\u0565"+
		"\3\2\2\2\u0525\u0526\f\13\2\2\u0526\u0527\5\u0128\u0095\2\u0527\u0528"+
		"\t\20\2\2\u0528\u0529\5\u0128\u0095\2\u0529\u052a\5\u00e6t\f\u052a\u0565"+
		"\3\2\2\2\u052b\u052c\f\n\2\2\u052c\u052d\5\u0128\u0095\2\u052d\u052e\7"+
		"k\2\2\u052e\u052f\5\u0128\u0095\2\u052f\u0530\5\u00e6t\13\u0530\u0565"+
		"\3\2\2\2\u0531\u0532\f\t\2\2\u0532\u0533\5\u0128\u0095\2\u0533\u0534\7"+
		"m\2\2\u0534\u0535\5\u0128\u0095\2\u0535\u0536\5\u00e6t\n\u0536\u0565\3"+
		"\2\2\2\u0537\u0538\f\b\2\2\u0538\u0539\5\u0128\u0095\2\u0539\u053a\7l"+
		"\2\2\u053a\u053b\5\u0128\u0095\2\u053b\u053c\5\u00e6t\t\u053c\u0565\3"+
		"\2\2\2\u053d\u053e\f\7\2\2\u053e\u053f\5\u0128\u0095\2\u053f\u0540\7c"+
		"\2\2\u0540\u0541\5\u0128\u0095\2\u0541\u0542\5\u00e6t\b\u0542\u0565\3"+
		"\2\2\2\u0543\u0544\f\6\2\2\u0544\u0545\5\u0128\u0095\2\u0545\u0546\7d"+
		"\2\2\u0546\u0547\5\u0128\u0095\2\u0547\u0548\5\u00e6t\7\u0548\u0565\3"+
		"\2\2\2\u0549\u054a\f\5\2\2\u054a\u0554\5\u0128\u0095\2\u054b\u054c\7]"+
		"\2\2\u054c\u054d\5\u0128\u0095\2\u054d\u054e\5\u00e6t\2\u054e\u054f\5"+
		"\u0128\u0095\2\u054f\u0550\7^\2\2\u0550\u0551\5\u0128\u0095\2\u0551\u0555"+
		"\3\2\2\2\u0552\u0553\7B\2\2\u0553\u0555\5\u0128\u0095\2\u0554\u054b\3"+
		"\2\2\2\u0554\u0552\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\5\u00e6t\5"+
		"\u0557\u0565\3\2\2\2\u0558\u0559\f\16\2\2\u0559\u055a\5\u0128\u0095\2"+
		"\u055a\u055b\t\21\2\2\u055b\u055c\5\u0128\u0095\2\u055c\u055d\5J&\2\u055d"+
		"\u0565\3\2\2\2\u055e\u055f\f\3\2\2\u055f\u0560\5\u0128\u0095\2\u0560\u0561"+
		"\t\22\2\2\u0561\u0562\5\u0128\u0095\2\u0562\u0563\5\u00e0q\2\u0563\u0565"+
		"\3\2\2\2\u0564\u04f8\3\2\2\2\u0564\u04fd\3\2\2\2\u0564\u0503\3\2\2\2\u0564"+
		"\u0508\3\2\2\2\u0564\u0519\3\2\2\2\u0564\u051f\3\2\2\2\u0564\u0525\3\2"+
		"\2\2\u0564\u052b\3\2\2\2\u0564\u0531\3\2\2\2\u0564\u0537\3\2\2\2\u0564"+
		"\u053d\3\2\2\2\u0564\u0543\3\2\2\2\u0564\u0549\3\2\2\2\u0564\u0558\3\2"+
		"\2\2\u0564\u055e\3\2\2\2\u0565\u0568\3\2\2\2\u0566\u0564\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u00e7\3\2\2\2\u0568\u0566\3\2\2\2\u0569\u056c\5\u00e6"+
		"t\2\u056a\u056c\5z>\2\u056b\u0569\3\2\2\2\u056b\u056a\3\2\2\2\u056c\u00e9"+
		"\3\2\2\2\u056d\u0571\5\u00eex\2\u056e\u056f\6v\34\3\u056f\u0572\5\u0114"+
		"\u008b\2\u0570\u0572\3\2\2\2\u0571\u056e\3\2\2\2\u0571\u0570\3\2\2\2\u0572"+
		"\u0576\3\2\2\2\u0573\u0575\5\u00ecw\2\u0574\u0573\3\2\2\2\u0575\u0578"+
		"\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u00eb\3\2\2\2\u0578"+
		"\u0576\3\2\2\2\u0579\u0580\5\u00fa~\2\u057a\u057c\5\u00f0y\2\u057b\u057a"+
		"\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e"+
		"\u0581\3\2\2\2\u057f\u0581\5\u0114\u008b\2\u0580\u057b\3\2\2\2\u0580\u057f"+
		"\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u00ed\3\2\2\2\u0582\u0588\5\u00fa~"+
		"\2\u0583\u0584\5\u00f0y\2\u0584\u0585\bx\1\2\u0585\u0587\3\2\2\2\u0586"+
		"\u0583\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2"+
		"\2\2\u0589\u00ef\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u0596\5\u0128\u0095"+
		"\2\u058c\u058d\t\23\2\2\u058d\u0590\5\u0128\u0095\2\u058e\u0591\7}\2\2"+
		"\u058f\u0591\5\u010e\u0088\2\u0590\u058e\3\2\2\2\u0590\u058f\3\2\2\2\u0590"+
		"\u0591\3\2\2\2\u0591\u0597\3\2\2\2\u0592\u0593\7C\2\2\u0593\u0597\5\u0128"+
		"\u0095\2\u0594\u0595\7D\2\2\u0595\u0597\5\u0128\u0095\2\u0596\u058c\3"+
		"\2\2\2\u0596\u0592\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\3\2\2\2\u0598"+
		"\u0599\5\u00f2z\2\u0599\u059a\by\1\2\u059a\u05a9\3\2\2\2\u059b\u059c\5"+
		"\u0112\u008a\2\u059c\u059d\by\1\2\u059d\u05a9\3\2\2\2\u059e\u059f\5\u0128"+
		"\u0095\2\u059f\u05a0\5\u0082B\2\u05a0\u05a1\by\1\2\u05a1\u05a9\3\2\2\2"+
		"\u05a2\u05a3\5\u00f6|\2\u05a3\u05a4\by\1\2\u05a4\u05a9\3\2\2\2\u05a5\u05a6"+
		"\5\u00f8}\2\u05a6\u05a7\by\1\2\u05a7\u05a9\3\2\2\2\u05a8\u058b\3\2\2\2"+
		"\u05a8\u059b\3\2\2\2\u05a8\u059e\3\2\2\2\u05a8\u05a2\3\2\2\2\u05a8\u05a5"+
		"\3\2\2\2\u05a9\u00f1\3\2\2\2\u05aa\u05af\5\u0120\u0091\2\u05ab\u05af\5"+
		"\u011c\u008f\2\u05ac\u05af\5\u00f4{\2\u05ad\u05af\5\u0124\u0093\2\u05ae"+
		"\u05aa\3\2\2\2\u05ae\u05ab\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05ad\3\2"+
		"\2\2\u05af\u00f3\3\2\2\2\u05b0\u05b3\5\u00d8m\2\u05b1\u05b3\5r:\2\u05b2"+
		"\u05b0\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3\u00f5\3\2\2\2\u05b4\u05b6\7]"+
		"\2\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7"+
		"\u05b9\7S\2\2\u05b8\u05ba\5\u00dco\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3"+
		"\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\7T\2\2\u05bc\u00f7\3\2\2\2\u05bd"+
		"\u05be\7S\2\2\u05be\u05bf\5\u0100\u0081\2\u05bf\u05c0\7T\2\2\u05c0\u00f9"+
		"\3\2\2\2\u05c1\u05d1\5\u0120\u0091\2\u05c2\u05d1\5p9\2\u05c3\u05d1\5r"+
		":\2\u05c4\u05c5\7&\2\2\u05c5\u05c6\5\u0128\u0095\2\u05c6\u05c7\5\u0106"+
		"\u0084\2\u05c7\u05d1\3\2\2\2\u05c8\u05d1\7\61\2\2\u05c9\u05d1\7.\2\2\u05ca"+
		"\u05d1\5\u00d8m\2\u05cb\u05d1\5\u0082B\2\u05cc\u05d1\5x=\2\u05cd\u05d1"+
		"\5\u00fc\177\2\u05ce\u05d1\5\u00fe\u0080\2\u05cf\u05d1\5\u0122\u0092\2"+
		"\u05d0\u05c1\3\2\2\2\u05d0\u05c2\3\2\2\2\u05d0\u05c3\3\2\2\2\u05d0\u05c4"+
		"\3\2\2\2\u05d0\u05c8\3\2\2\2\u05d0\u05c9\3\2\2\2\u05d0\u05ca\3\2\2\2\u05d0"+
		"\u05cb\3\2\2\2\u05d0\u05cc\3\2\2\2\u05d0\u05cd\3\2\2\2\u05d0\u05ce\3\2"+
		"\2\2\u05d0\u05cf\3\2\2\2\u05d1\u00fb\3\2\2\2\u05d2\u05d4\7S\2\2\u05d3"+
		"\u05d5\5\u00dco\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7"+
		"\3\2\2\2\u05d6\u05d8\7V\2\2\u05d7\u05d6\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8"+
		"\u05d9\3\2\2\2\u05d9\u05da\7T\2\2\u05da\u00fd\3\2\2\2\u05db\u05e1\7S\2"+
		"\2\u05dc\u05de\5\u0100\u0081\2\u05dd\u05df\7V\2\2\u05de\u05dd\3\2\2\2"+
		"\u05de\u05df\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05e2\7^\2\2\u05e1\u05dc"+
		"\3\2\2\2\u05e1\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\7T\2\2\u05e4"+
		"\u00ff\3\2\2\2\u05e5\u05ea\5\u0102\u0082\2\u05e6\u05e7\7V\2\2\u05e7\u05e9"+
		"\5\u0102\u0082\2\u05e8\u05e6\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3"+
		"\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u0101\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed"+
		"\u05ee\5\u0104\u0083\2\u05ee\u05ef\7^\2\2\u05ef\u05f0\5\u0128\u0095\2"+
		"\u05f0\u05f1\5\u00e6t\2\u05f1\u05f8\3\2\2\2\u05f2\u05f3\7i\2\2\u05f3\u05f4"+
		"\7^\2\2\u05f4\u05f5\5\u0128\u0095\2\u05f5\u05f6\5\u00e6t\2\u05f6\u05f8"+
		"\3\2\2\2\u05f7\u05ed\3\2\2\2\u05f7\u05f2\3\2\2\2\u05f8\u0103\3\2\2\2\u05f9"+
		"\u05fc\5\u0124\u0093\2\u05fa\u05fc\5\u00fa~\2\u05fb\u05f9\3\2\2\2\u05fb"+
		"\u05fa\3\2\2\2\u05fc\u0105\3\2\2\2\u05fd\u0612\5\u010c\u0087\2\u05fe\u05ff"+
		"\5\u0128\u0095\2\u05ff\u0601\5\u0112\u008a\2\u0600\u0602\5\u010a\u0086"+
		"\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0613\3\2\2\2\u0603\u0604"+
		"\5\u0088E\2\u0604\u0605\7S\2\2\u0605\u0606\5\u00e6t\2\u0606\u0607\7T\2"+
		"\2\u0607\u0609\3\2\2\2\u0608\u0603\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u0608"+
		"\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\5F$\2\u060d"+
		"\u0613\3\2\2\2\u060e\u060f\5D#\2\u060f\u0610\5\u0128\u0095\2\u0610\u0611"+
		"\5\u0108\u0085\2\u0611\u0613\3\2\2\2\u0612\u05fe\3\2\2\2\u0612\u0608\3"+
		"\2\2\2\u0612\u060e\3\2\2\2\u0613\u0107\3\2\2\2\u0614\u0615\7Q\2\2\u0615"+
		"\u0617\5\u0128\u0095\2\u0616\u0618\5B\"\2\u0617\u0616\3\2\2\2\u0617\u0618"+
		"\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\5\u0128\u0095\2\u061a\u061b\7"+
		"R\2\2\u061b\u0109\3\2\2\2\u061c\u061d\5(\25\2\u061d\u010b\3\2\2\2\u061e"+
		"\u0624\5\u0088E\2\u061f\u0625\5R*\2\u0620\u0622\5l\67\2\u0621\u0623\5"+
		"\u0110\u0089\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625\3\2"+
		"\2\2\u0624\u061f\3\2\2\2\u0624\u0620\3\2\2\2\u0625\u010d\3\2\2\2\u0626"+
		"\u0627\7Z\2\2\u0627\u0628\5\u0128\u0095\2\u0628\u0629\5$\23\2\u0629\u062a"+
		"\5\u0128\u0095\2\u062a\u062b\7Y\2\2\u062b\u010f\3\2\2\2\u062c\u062d\7"+
		"Z\2\2\u062d\u0630\7Y\2\2\u062e\u0630\5T+\2\u062f\u062c\3\2\2\2\u062f\u062e"+
		"\3\2\2\2\u0630\u0111\3\2\2\2\u0631\u0633\7O\2\2\u0632\u0634\5\u0116\u008c"+
		"\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0637"+
		"\7V\2\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638\3\2\2\2\u0638"+
		"\u0639\5\u0126\u0094\2\u0639\u0113\3\2\2\2\u063a\u0641\5\u0118\u008d\2"+
		"\u063b\u063c\7V\2\2\u063c\u063d\5\u0128\u0095\2\u063d\u063e\5\u0118\u008d"+
		"\2\u063e\u0640\3\2\2\2\u063f\u063b\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u063f"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0115\3\2\2\2\u0643\u0641\3\2\2\2\u0644"+
		"\u064b\5\u011a\u008e\2\u0645\u0646\7V\2\2\u0646\u0647\5\u0128\u0095\2"+
		"\u0647\u0648\5\u011a\u008e\2\u0648\u064a\3\2\2\2\u0649\u0645\3\2\2\2\u064a"+
		"\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u0117\3\2"+
		"\2\2\u064d\u064b\3\2\2\2\u064e\u0651\5\u00dep\2\u064f\u0651\5\u0102\u0082"+
		"\2\u0650\u064e\3\2\2\2\u0650\u064f\3\2\2\2\u0651\u0119\3\2\2\2\u0652\u0656"+
		"\5\u00dep\2\u0653\u0656\5z>\2\u0654\u0656\5\u0102\u0082\2\u0655\u0652"+
		"\3\2\2\2\u0655\u0653\3\2\2\2\u0655\u0654\3\2\2\2\u0656\u011b\3\2\2\2\u0657"+
		"\u0658\7\3\2\2\u0658\u011d\3\2\2\2\u0659\u065a\7{\2\2\u065a\u011f\3\2"+
		"\2\2\u065b\u0660\7|\2\2\u065c\u0660\7{\2\2\u065d\u065e\6\u0091\35\2\u065e"+
		"\u0660\7,\2\2\u065f\u065b\3\2\2\2\u065f\u065c\3\2\2\2\u065f\u065d\3\2"+
		"\2\2\u0660\u0121\3\2\2\2\u0661\u0662\t\24\2\2\u0662\u0123\3\2\2\2\u0663"+
		"\u0664\t\25\2\2\u0664\u0125\3\2\2\2\u0665\u0668\7P\2\2\u0666\u0668\b\u0094"+
		"\1\2\u0667\u0665\3\2\2\2\u0667\u0666\3\2\2\2\u0668\u0127\3\2\2\2\u0669"+
		"\u066b\7\u0080\2\2\u066a\u0669\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a"+
		"\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u0129\3\2\2\2\u066e\u066c\3\2\2\2\u066f"+
		"\u0673\7U\2\2\u0670\u0672\7\u0080\2\2\u0671\u0670\3\2\2\2\u0672\u0675"+
		"\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0688\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0676\u0678\7\u0080\2\2\u0677\u0676\3\2\2\2\u0678\u0679"+
		"\3\2\2\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u0684\3\2\2\2\u067b"+
		"\u067f\7U\2\2\u067c\u067e\7\u0080\2\2\u067d\u067c\3\2\2\2\u067e\u0681"+
		"\3\2\2\2\u067f\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0683\3\2\2\2\u0681"+
		"\u067f\3\2\2\2\u0682\u067b\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2"+
		"\2\2\u0684\u0685\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0687"+
		"\u066f\3\2\2\2\u0687\u0677\3\2\2\2\u0688\u012b\3\2\2\2\u00bd\u012e\u0131"+
		"\u0134\u013e\u0142\u014b\u0152\u0159\u015c\u0163\u0166\u016d\u0171\u0175"+
		"\u0178\u017f\u018a\u0195\u019e\u01a8\u01b6\u01bc\u01c5\u01c9\u01cc\u01d4"+
		"\u01d7\u01da\u01e2\u01e6\u01e9\u01f0\u01f4\u0200\u0206\u020b\u020e\u0213"+
		"\u0217\u021e\u0229\u022d\u0230\u0239\u023d\u023f\u0243\u0248\u0253\u025c"+
		"\u026b\u0270\u0278\u027b\u0280\u0288\u028b\u0291\u0294\u0298\u029c\u02a9"+
		"\u02b6\u02b8\u02c4\u02c9\u02cf\u02d7\u02df\u02e2\u02ea\u02f3\u02fb\u0302"+
		"\u030e\u0316\u031e\u0326\u032a\u0330\u0343\u0347\u034c\u0352\u0358\u0360"+
		"\u0364\u036b\u0372\u0375\u0379\u0382\u038d\u0392\u039a\u039d\u03a0\u03a9"+
		"\u03ac\u03b3\u03bc\u03c0\u03c9\u03cc\u03d1\u03d9\u03df\u03e9\u03ef\u03f7"+
		"\u03fd\u0407\u0420\u0424\u0428\u042c\u0435\u043b\u0444\u0451\u0464\u046a"+
		"\u0476\u0481\u048b\u0490\u0497\u04a1\u04a5\u04a9\u04b0\u04b4\u04b8\u04bc"+
		"\u04cf\u04d5\u04db\u04df\u04e3\u04f6\u0511\u0514\u0554\u0564\u0566\u056b"+
		"\u0571\u0576\u057d\u0580\u0588\u0590\u0596\u05a8\u05ae\u05b2\u05b5\u05b9"+
		"\u05d0\u05d4\u05d7\u05de\u05e1\u05ea\u05f7\u05fb\u0601\u060a\u0612\u0617"+
		"\u0622\u0624\u062f\u0633\u0636\u0641\u064b\u0650\u0655\u065f\u0667\u066c"+
		"\u0673\u0679\u067f\u0684\u0687";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}