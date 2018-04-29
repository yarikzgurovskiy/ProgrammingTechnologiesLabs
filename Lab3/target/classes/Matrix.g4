grammar Matrix;

/*
 * Lexer Rules
 */

// Names

VAR : [A-Za-z];

// Values

NUMBER : '-'?([0-9]+ | [0-9]+'.'[0-9]+);
VECTOR : '['NUMBER(','WHITESPACE* NUMBER)*']' ;
MATRIX : '['VECTOR(','WHITESPACE* VECTOR)*']' ;

// Symbols

EQUAL : '=';
WHITESPACE : [ \n\t\r]+ -> skip;
LB: '(';
RB: ')';
NL: '\n';

// Operation symbols

DIVIDE: '/';
TRANSPOSE: '^T';
RANK: 'rank' ;
DET: 'det' ;

/*
 * Parser Rules
 */

root:
     input EOF # RootRule
;

// Logical

input:
    assignment          # ToSetVariable
    | divide NL? EOF    # ExecuteExpression
;

assignment:
	VAR EQUAL input     # MakeAssignment
;

divide:
    divide DIVIDE det  # MakeDivision
    | det               # ToDet
;

det:
    DET det             # CalcDet
    | rank              # ToRank
;

rank:
    RANK rank           # CalcRank
    | transpose         # ToTranspose
;

transpose:
    transpose TRANSPOSE # MakeTranspose
    | atom              # ToAtom
;

atom:
    NUMBER              # MakeNumber
    | MATRIX            # MakeMatrix
    | VAR               # MakeVariable
    | LB divide RB      # MakeBraces
;