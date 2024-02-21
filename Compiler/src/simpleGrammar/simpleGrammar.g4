grammar simpleGrammar;

compilationUnit: routine? mainProg;

routine: 'routine' ID '(' ')' ':' type block;

block: 'is' (statement)* 'end';

mainProg: 'routine main():' type block;

statement: variableDeclaration | expressionStatement;

variableDeclaration: 'var' ID ':' type 'is' expression;

expressionStatement: 'var' ID ':' type 'is' expression;

expression: (ID | INTEGER) (operation expression)?;

operation: '+' | '-' | '/' | '*';

type: 'integer' | 'void' | 'boolean';

ID: [a-zA-Z]+;
INTEGER: [0-9]+;

WS: [ \t\r\n]+ -> skip;
