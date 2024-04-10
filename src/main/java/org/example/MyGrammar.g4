grammar MyGrammar;

INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;

program: statement+;

statement: loopStatement;
loopStatement: meerdereLoopStatement
                | enkelLoopStatement;
meerdereLoopStatement: 'loop' INT 'keer' 'naar' direction;
enkelLoopStatement: 'loop' 'naar' direction;
direction: 'boven' | 'onder' | 'links' | 'rechts';



