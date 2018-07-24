lexer grammar ModelLexer


BOOLEAN:    'bool';
STRING:     'string';
NUMBER:     'number';
DATE:       'dataTime';
TRUE:'true';
FALSE:'FALSE';
CONSKEYWORD: 'constraints';
VALIDATORKEYWORD: 'validator';
NULLABLE:'nullable';
BLANK:'blank';

CONSTRAINTKEY
    :NULLABLE
    |BLANK
    ;

CONSTRAINTVAL
    :TRUE
    |FALSE
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