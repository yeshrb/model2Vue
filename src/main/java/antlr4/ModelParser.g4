parser grammar ModelParser;

options { tokenVocab=ModelLexer; }



modelDeclaration
    : IDENTIFIER modelBody
    ;
modelBody
    : '{' modelBodyDeclaration '}'
    ;
modelBodyDeclaration
    : fieldDeclaration constraintDeclaration*
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
    | DATE

    ;
fieldDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;
constraintDeclaration
    : CONSKEYWORD '=' constraintBody
    ;

constraintBody
    : '{' constraintBodyDeclaration '}'
    ;
constraintBodyDeclaration
    :
    | fieldDeclaratorId (constraintDeclare)*  (validatorDeclare)*
    ;
constraintDeclare
     :CONSTRAINTKEY ':' CONSTRAINTVAL
     ;
validatorDeclare
    :VALIDATORKEYWORD ':' validatorId
    ;
validatorId
    :IDENTIFIER
    ;





