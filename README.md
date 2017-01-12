1 –  (JavaSE) 

Desenvolver um sistema onde são passados os seguintes parâmetros: 
1) Ordenação. A ordenação pode ser: por data, por produto.
2) Produtos. Umas lista de produtos separados por espaços. Os produtos são separados por ":". Exemplo: 2017-01-01:Banana:Nome:ToletoSkull

O sistema retornara uma lista ordenada com a Data, Produto, Unidade e quantidade total de produto na unidade.
A ordenação pode ser: por data, por produto.


Obs.: 
Não é necessário criar banco de dados, pode usar vetor do Java mesmo. 

A massa de dados tem que ser criada automaticamente.

Compilar em JAR e para rodar pode ser utilizado java -jar etc, 

O resultado será mostrado na console mesmo linha por linha.


run with maven: 

mvn package && java -jar target/ProdutosOrdenados-1.0-SNAPSHOT.jar data 2017-01-01:Banana:Nome:ToletoSkull 2017-01-02:Café:Data:ToletoSkull 2017-01-03:Mixirica:Nome:ToletoFugito 2017-01-05:Ameixa:Data:ToletoFugito 2017-12-04:Berinjela:Nome:ToletoFugito 2017-11-00:Castanha:Data:Guarani 2017-07-01:Abacaxi:Nome:Guarani 2017-02-23:Melão:Data:Guarani 2017-02-25:Melão:Data:Carajas@debian:produtos-ordenados