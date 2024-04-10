grammar MyGrammar;

INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;

KLEINERDAN: 'kleiner dan';
GROTERDAN: 'groter dan';

program: conditionalLoopStatement+ | EOF;

statement: loopStatement;
conditionalLoopStatement: 'als' 'mijn' attribuut operator INT 'dan' loopStatement;
loopStatement: meerdereLoopStatement
                | enkelLoopStatement;
meerdereLoopStatement: 'loop' INT 'keer' 'naar ' direction;
enkelLoopStatement: 'loop naar ' direction;
direction: 'boven' | 'onder' | 'links' | 'rechts';
attribuut: 'hp'
            | 'def'
            | 'atk'
            | 'spd'
            | 'str';

operator: KLEINERDAN | GROTERDAN;