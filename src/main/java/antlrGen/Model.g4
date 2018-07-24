grammar Model;

modelDeclare: MODELNAME '=' '{' block '}';

block:(TYPE IDENTIFIER)+;


TYPE
:'int'
|'String'
|'Data'
;

MODELNAME: [a-zA-Z]+;
IDENTIFIER:[a-zA-Z]+;
WS: [ \t\n\r]+ -> skip;