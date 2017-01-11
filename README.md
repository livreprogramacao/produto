1 –  (JavaSE) 

Desenvolver um sistema onde são passados os seguintes parâmetros: 
Data, Produto, Ordenação. 

O sistema retornara uma lista ordenada com a Data, Produto, Unidade e quantidade total de produto na unidade.
A ordenação pode ser: por data, por produto.


Obs.: 
Não é necessário criar banco de dados, pode usar vetor do Java mesmo. 

A massa de dados tem que ser criada automaticamente.

Compilar em JAR e para rodar pode ser utilizado java -jar etc, 

O resultado será mostrado na console mesmo linha por linha.


run maven: mvn package

execute: java -jar target/ProdutosOrdenados-1.0-SNAPSHOT.jar 01/01/2017:Banana:Nome 02/01/2017:Café:Data 03/01/2017:Mixirica:Nome 04/01/2017:Ameixa:Data 11/01/2017:Berinjela:Nome 12/01/2017:Castanha:Data 13/01/2017:Abacaxi:Nome 14/01/2017:Melão:Data