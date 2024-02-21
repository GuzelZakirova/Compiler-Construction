grammar I;

program: (simpleDeclaration | routineDeclaration)*;

simpleDeclaration: variableDeclaration | typeDeclaration;

routineDeclaration: 'routine' Identifier '(' parameters? ')' (':' Type)? 'is' body 'end';

parameters: parameter (',' parameter)*;

parameter: Identifier ':' Type;

body: (simpleDeclaration | statement)*;

variableDeclaration: 'var' Identifier ':' Type ( 'is' expression )? | 'var' Identifier 'is' expression;

typeDeclaration: 'type' Identifier 'is' Type;

statement: assignmentStatement | routineCall | whileLoop | forLoop | ifStatement;

assignmentStatement: modifiablePrimary ':=' expression;

expression: relation (('and' | 'or' | 'xor') relation)*;

relation: simple (('<' | '<=' | '>' | '>=' | '=' | '/=') simple)?;

simple: factor (('*' | '/' | '%') factor)?;

factor: summand (('+' | '-') summand)?;

summand: primary;

primary: (sign? IntegerLiteral | sign? RealLiteral | 'true' | 'false' | modifiablePrimary | '(' expression ')');

modifiablePrimary: Identifier ('.' Identifier | '[' expression ']')?;

sign: '+' | '-';

routineCall: Identifier '(' (expression (',' expression)*)? ')';

whileLoop: 'while' expression 'loop' body 'end';

forLoop: 'for' Identifier 'in' (expression '..' expression | 'reverse' expression '..' expression) 'loop' body 'end';

ifStatement: 'if' expression 'then' body ('else' body)? 'end';

Type: primitiveType | arrayType | recordType | Identifier;

primitiveType: 'integer' | 'real' | 'boolean';

recordType: 'record' '{' variableDeclaration* '}' 'end';

arrayType: 'array' '[' expression? ']' Type;

IntegerLiteral: [0-9]+;
RealLiteral: [0-9]* '.' [0-9]+;

Identifier: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;
