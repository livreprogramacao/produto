package com.br.com.plenaperformancerh.produto.produtosordenados.produto.controller;

import com.br.com.plenaperformancerh.produto.produtosordenados.produto.Produto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class ProdutoController {

    private List<Produto> produtosCollection = new ArrayList<Produto>();

    public ProdutoController(String[] args) {
        parseParameter(args);
    }

    public void listByData() {
        System.out.println("\n\n<<< ---- Lista ordenada de produtos por data --- >>>.");

        listProdutos();
    }

    public void listByProdutoNome() {
        System.out.println("\n\n<<< ---- Lista ordenada de produtos por nome do produto --- >>>.");
        Collections.sort(produtosCollection, new ProdutoNomeComparator());
        listProdutos();
    }

    private void parseParameter(String[] parametros) {
        Produto produto = null;
        String[] fields;
        String data, nome, ordenacao, unidade;

        for (String p : parametros) {
            //System.out.println("Produto: " + p);

            fields = p.split(DELIMITER);
            
            if (fields.length < 4) {
                System.out.format("\nParâmetro inválido: %s\n", p);
                continue;
            }

            data = fields[0];
            nome = fields[1];
            ordenacao = fields[2];
            unidade = fields[3];

            produto = new Produto(data, nome, ordenacao, unidade);

            //System.out.println(produto);
            produtosCollection.add(produto);
        }

        //System.out.println(produtosCollection.size());
    }
    private static final String DELIMITER = ":";

    private void listProdutos() {
        for (Produto p : produtosCollection) {
            System.out.format("\nData: %5s - Produto: %-20s  - Unidade: %s - Quantidade total %s", p.getData(), p.getNome(), p.getUnidade(), "10");
        }
    }

}
