grammar ModelDefine;
modelDeclaration
    : IDENTIFIER modelBody
    ;
modelBody
    : '{' modelBodyDeclaration '}'
    ;
modelBodyDeclaration
    : fieldDeclaration
    | constraintDeclaration*
    ;


fieldDeclaration
    : (typeType fieldDeclaratorId)*
    ;

typeType
    : (primitiveType|modelType) ('[' ']')*
    ;

modelType
    : IDENTIFIER
    ;

primitiveType
    : BOOLEAN
    | STRING
    | NUMBER
    | DATA

    ;
fieldDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;
constraintDeclaration
    : CONSKEYWORD constraintBody
    ;

constraintBody
    : '{' constraintBodyDeclaration '}'
    ;
constraintBodyDeclaration
    :
    | fieldDeclaratorId (constraint)+
    ;
constraint
     :'nullable'
     ;

IDENTIFIER:(Letter)+;
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);


Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;

// Keywords
CLASS:      'class';
BOOLEAN:    'bool';
STRING:     'string';
NUMBER:     'number';
DATA:       'dataTime';
CONSKEYWORD: 'constraints';