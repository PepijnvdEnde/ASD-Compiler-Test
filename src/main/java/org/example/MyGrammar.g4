grammar MyGrammar;

INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;


KLEINERDAN: 'kleiner dan';
GROTERDAN: 'groter dan';
WANNEER: 'wanneer';
MIJN: 'mijn';
DAN: 'dan';
IK: 'ik';

agent: rule+ | EOF;

rule: spelerssituatie | omgevingssituatie;
omgevingssituatie: WANNEER;
spelerssituatie: WANNEER MIJN attribuut operator INT DAN actie;
actie: loop;
loop: handeling IK parameter;
parameter: richting;
operator: KLEINERDAN | GROTERDAN;
attribuut: 'hp' | 'def' | 'atk' | 'spd' | 'str';
handeling: 'loop';
richting:'naar ' ('boven' | 'onder' | 'links' | 'rechts' | 'de kist');


