# Paradigmas de Linguagens de Programação


## Execução

* Local

```bash
cd <Linguagem>
mvn clean generate-sources compile exec:java
```

* Applet

```bash
mvn package
# Jar será gerado em ./Applet/target/
```




# BNF #



<pre>
Programa ::= Comando



Comando ::= Atribuicao 
       |    ComandoDeclaracao
       |    While 
       |    IfThenElse 
       |    IO 
       |    Comando ";" Comando 
       |    Skip 
       |    ChamadaProcedimento

Skip ::=

Atribuicao ::= Id ":=" Expressao

Expressao ::=  Valor | ExpUnaria | ExpBinaria | Id

Valor ::= ValorConcreto

ValorConcreto ::= ValorInteiro 
             |    ValorBooleano
             |    ValorString 
             |    ValorMatriz

ExpUnaria ::= "-" Expressao 
             |    "not" Expressao 
             |    "length" Expressao 
             |    <a href="">"identity" Expressao</a>
             |    <a href="">"transpose" Expressao</a>

ExpBinaria ::= Expressao "+" Expressao
          |    Expressao "-" Expressao
          |    <a href="">Expressao "*" Expressao</a>
          |    Expressao "and" Expressao
          |    Expressao "or" Expressao
          |    Expressao "==" Expressao
          |    Expressao "++" Expressao
          |    <a href="">Expressao "+++" Expressao</a>
          |    <a href="">Expressao "---" Expressao</a>
          |    <a href="">Expressao "***" Expressao</a>

ComandoDeclaracao :: = "{" Declaracao ";" Comando "}"

Declaracao ::= DeclaracaoVariavel | DeclaracaoProcedimento | Declaracao "," Declaracao

DeclaracaoVariavel ::= "var" Id "=" Expressao

DeclaracaoProcedimento ::= "proc" Id "(" [ ListaDeclaracaoParametro ] ")" "{" Comando "}"

ListaDeclaracaoParametro ::= Tipo Id | Tipo Id "," ListaDeclaracaoParametro

Tipo ::= "string" | "int" | "boolean" | <a href="">"matriz"</a>

While ::= "while" Expressao "do" Comando

IfThenElse ::= "if" Expressao "then" Comando "else" Comando

IO ::= "write" "(" Expressao ")" | "read" "(" Id ")"

ChamadaProcedimento ::= "call" Id "(" ListaExpressao ")"
</pre>
