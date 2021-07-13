## Students
Bernardo de Moraes Santana Júnior (bmsj@cin.ufpe.br)\
Daniel Cândido Cauás (dcc4@cin.ufpe.br)

## About

Addition of matrix type and related functions inside imperative 2 language

## BNF

MATRIX := "[" SCALAR ("," SCALAR)* ("|" SCALAR ("," SCALAR)*)* "]"\
//exemplos: [1], [1,2|3,4|5,6], [1,2,3|4,5,6]

OP := "+" | "-" | "*" | "/" | "<" | "<=" | ">" | ">=" | "=="

FUNCALL := "dim" "(" MATRIX ")"			|\
"crs" "(" MATRIX "," MATRIX ")"  	|\
...

## Language

//VAR DECL  
scalar escalar = 1;\
matrix matrizes = [1];\
matrix matrizes = [1, 2, 3];\
matrix matrizes = [[1, 2], [3, 4]];\
bool bools = true;\
bool bools = x < 3;

//OPERATORS
x = sum(x, x);\
x = mul(y, y);\
x = lt(x, 3);           //x < 3\
x = eq(y, z);			//y == z

x = dim(x);			//dimensao da matriz, retorna vetor 2x1\
x = trp(x);			//transposta\
x = idx(2);			//identidade de dimensao 2\
x = inv(x);			//inversa\
x = dot(x, y);			//produto escalar\
x = crs(x, y);			//produto vetorial\
x = mag(x);			//tamanho de um vetor\
x = red(x);			//escalonar x\



## how to run
// navigate to parser folder inside Imperative2\
java -cp javacc-7.0.10.jar javacc Imperative2.jj\
javac *.java
java Imperative2