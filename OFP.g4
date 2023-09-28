grammar OFP;

@header { 
    package generated; 
    }

//it can be start or any word to begin the project/program
// we define the base of the functions 
prog : method* main method*;

// then we define void main for JAVA language
main: 'void' 'main' '(' ')' block ;

// the method can be void followed by function name like:
// " void selectionSort(float[] arr){ " 
method :  'void' ID '(' parameterList? ')' block | type ('['']')? ID '(' parameterList? ')' block ;

// the code in the functions
block: '{' stmt* '}' ;

//where parameterList,ID and type are 
ID  :	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')* ;

//All the parameter
parameterList: parameter (',' parameter)* ;

// a single parameter def
parameter: type ID ;

// the type of the parameters and variables
type :    'int' arrType?
		    | 'float' arrType?
		    | 'string' arrType?
		    | 'char' arrType?
		    | 'bool'
		    ;

// arrays structure
arrType : ID? '[' expr ']' ;

// def expresions * - + == etc....
expr : 	
        | expr MULT expr
        | expr DIV expr
        | expr PLUS expr
        | expr MINUS expr
        | expr SMALL expr
        | expr BIGGER expr
        | expr EQUAL expr
        | 'new' type
        | ID '.length'
        | methodAccess
        | varType
        | arrayList
        | arrType        
     ;

//symbols
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
SMALL: '<' ;
BIGGER: '>';
EQUAL: '==' ;
methodAccess : ID? '(' expr ')';
arrayList : varType (',' varType)* ;

// types of variable
varType : 	  ID
			      | MINUS? INT
			      | MINUS? FLOAT
			      | STR
			      | CHAR
			      ;

// def var types
INT : ('0'..'9')+ ;
FLOAT : ('0'..'9')+'.'('0'..'9')+;
STR: '"' (((SYM|ID)(SYM|ID)*) | ' ')* '"';
CHAR: '\'' (((SYM|ID)(SYM|ID)*) | ' ')* '\'';
SYM: ('0'..'9'|'_'|'!'|'.'|','|'?'|'='|':'|'('|')') ;

// def statements
stmt :    asgnStmt
        | declaration
        | ifStmt
        | whileStmt
        | print
        | returnStmt
        | methodCall
        | localDecl
     ; 

// for asign values to variables like
// p = 2
asgnStmt : ID arrType? '=' expr ';' ;

// for asign values to variables like
// int i = 0;
declaration : type arrType? ID '=' (expr | arrType | array) ';' ;

// def multi variables
array : '{' arrayList+  '}' ;

// def if else where else can be nothing
ifStmt : 'if' '(' condition ')' (stmt|block) elseStmt?;

//condetion structure with operations 
condition : (expr OPR expr) | expr ;

//operations < > ==
OPR: SMALL|BIGGER|EQUAL ; 

// else with continuous
elseStmt : ('else' (stmt|block)) ;

// def while statement
whileStmt : 'while' '(' condition ')' '{' stmt+ '}';

//def print
print : ('println'|'print') '(' (ID arrType?| STR) ')' ';' ;

// def return 
returnStmt: 'return' expr ';' ;

// def functions calls
methodCall : ID '(' varType* ')' ';' ;

// def arrays
localDecl: type arrType? ID ';' ;


// remove empty char and avoid comments
COMMENT :  '#' ~[\r\n]* -> skip ;
WS : [ \t\r\n]+ -> skip ;

