# Paradigmas de Linguagens de Programação

Reposótorio para a cadeira PLP(Paradigmas de Linguagens de Programação)

Adicição de um tipo Matriz e funções relacionadas à Linaguem Imperativa2.

## Integrantes

- Bernardo de Moraes (bmsj@cin.ufpe.br)
- Daniel Cauás       (dcc4@cin.ufpe.br)
  


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

Atribuicao ::= <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/Id.java">Id</a> ":=" <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/Expressao.java">Expressao</a>

Expressao ::=  <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/Valor.java">Valor</a> | <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpUnaria.java">ExpUnaria</a> | <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpBinaria.java">ExpBinaria</a> | <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/Id.java">Id</a> | <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpMatriz.java">ExpMatriz</a>

Valor ::= <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ValorConcreto.java">ValorConcreto</a>

ValorConcreto ::= <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ValorInteiro.java">ValorInteiro </a>
             |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ValorBooleano.java">ValorBooleano</a>
             |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ValorString.java">ValorString </a>
             |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ValorMatriz.java">ValorMatriz</a>

ExpUnaria ::= "-" Expressao 
             |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpMenos.java">"not" Expressao </a>
             |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpLength.java">"length" Expressao </a>
             |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpIdentity.java">"identity" Expressao</a>
             |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpTranspose.java">"transpose" Expressao</a>

ExpBinaria ::= <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpSoma.java">Expressao "+" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpSub.java">Expressao "-" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpMulti.java">Expressao "*" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpAnd.java">Expressao "and" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpOr.java">Expressao "or" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpEquals.java">Expressao "==" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpConcat.java">Expressao "++" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpSomaMatriz.java">Expressao "+++" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpSubMatriz.java">Expressao "---" Expressao</a>
          |    <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions2/expression/ExpMultiMatrix.java">Expressao "***" Expressao</a>

ComandoDeclaracao :: = "{" Declaracao ";" Comando "}"

Declaracao ::= DeclaracaoVariavel | DeclaracaoProcedimento | Declaracao "," Declaracao

DeclaracaoVariavel ::= "var" Id "=" Expressao

DeclaracaoProcedimento ::= "proc" Id "(" [ ListaDeclaracaoParametro ] ")" "{" Comando "}"

ListaDeclaracaoParametro ::= Tipo Id | Tipo Id "," ListaDeclaracaoParametro

Tipo ::= "string" | "int" | "boolean" | <a href="https://github.com/bernardomjunior/PLP-Mplay/blob/matriz_funciona/Imperativa2/src/li2/plp/expressions1/util/TipoPrimitivo.java">"matriz"</a>

While ::= "while" Expressao "do" Comando

IfThenElse ::= "if" Expressao "then" Comando "else" Comando

IO ::= "write" "(" Expressao ")" | "read" "(" Id ")"

ChamadaProcedimento ::= "call" Id "(" ListaExpressao ")"
</pre>
