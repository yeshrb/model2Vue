grammar ModelDefine;

import ModelLexer;

modelDeclaration
    : IDENTIFIER modelBody
    ;
modelBody
    : LBRACE modelBodyDeclaration RBRACE
    ;
modelBodyDeclaration
    : fieldDeclaration* constraintsDeclaration*
    ;

/**
*属性域(字段)定义规则
*/

fieldDeclaration
    : (typeType fieldDeclaratorId)
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

/**
*约束域定义规则
*/

constraintsDeclaration
    : CONSKEYWORD  constraintsBody
    ;

constraintsBody
    : LBRACE constraintBodyDeclaration RBRACE
    ;
constraintBodyDeclaration
    :fieldConstraintDeclare*
    ;

fieldConstraintDeclare : constaintFiledId (constraintDeclare)+ (validatorDeclare) ;

constaintFiledId
     : IDENTIFIER ('[' ']')*
     ;
constraintDeclare
     : CONSTRAINTKEY ':' CONSTRAINTVALUE
     |constraintDeclare ',' constraintDeclare
     ;
validatorDeclare
    :VALIDATOR ':' validatorMethods;

validatorMethods
     :IDENTIFIER (',' IDENTIFIER)*
     ;
