lexer grammar ModelLexer;
import JavaLexer;

//Model keyword
STRING:     'pageTemplateFilePath';
NUMBER:     'number';
DATE:       'dataTime';
CONSKEYWORD: 'constraints';
VALIDATOR: 'validator';

//Model Literals



CONSTRAINTKEY
    :'nullable'
    |'blank'
    |'max'
    ;

CONSTRAINTVALUE :BOOL_LITERAL;


