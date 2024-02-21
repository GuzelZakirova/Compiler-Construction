grammar simpleGrammar;

compilationUnit: routine? mainProg;

routine: 'routine' ID '(' ')' ':' type block;

block: 'is' (statement)* end;

mainProg: 'routine main():' type block;

printKeyWord: 'print(' expression? ')';

statement: variableDeclaration | expressionStatement | printKeyWord;

variableDeclaration: 'var' ID ':' type 'is' expression;

expressionStatement: 'var' ID ':' type 'is' expression;

expression: (ID | INTEGER | REAL | BOOLEAN) (operation expression)?;

operation: '+' | '-' | '*' | '/' | 'and' | 'or' | 'xor' | 'not';

primitiveType : 'integer' | 'real' | 'boolean';

type: primitiveType | 'void' ;

end: 'end';

ID: [a-zA-Z]+;
INTEGER: [0-9]+;
REAL: [0-9]* '.' [0-9]+;
BOOLEAN: 'true' | 'false';

WS: [ \t\r\n]+ -> skip;
