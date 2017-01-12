package com.br.com.plenaperformancerh.produto.produtosordenados.produto.controller;

import com.br.com.plenaperformancerh.produto.produtosordenados.produto.Produto;
import com.br.com.plenaperformancerh.produto.produtosordenados.produto.comparator.ProdutoDataComparator;
import com.br.com.plenaperformancerh.produto.produtosordenados.produto.comparator.ProdutoNomeComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class ProdutoController {

    private List<Produto> produtosCollection = new ArrayList<Produto>();
    private Map<String, Integer> unidadesMap = new HashMap<>();

    private static final String DELIMITER = ":";

    public ProdutoController(String[] args) {
        parseParameter(args);
    }

    public void listByData() {
        System.out.println("\n\n<<< ---- Lista ordenada de produtos por data --- >>>.");
        listProdutos(new ProdutoDataComparator());
    }

    public void listByProdutoNome() {
        System.out.println("\n\n<<< ---- Lista ordenada de produtos por nome do produto --- >>>.");
        listProdutos(new ProdutoNomeComparator());
    }

    private void parseParameter(String[] parametros) {
        String[] fields;

        for (String p : parametros) {
            //System.out.println("Produto: " + p);

            fields = p.split(DELIMITER);

            if (fields.length < 4) {
                //System.out.format("\nParâmetro Produto inválido: %s\n", p);
                continue;
            }

            addProduto(fields);
        }

        //System.out.println(produtosCollection.size());
    }

    private void addProduto(String[] fields) {
        String data = fields[0];
        String nome = fields[1];
        String ordenacao = fields[2];
        String unidade = fields[3];

        Produto produto = new Produto(data, nome, ordenacao, unidade);

        //System.out.println(produto);
        produtosCollection.add(produto);

        if (!unidadesMap.containsKey(unidade)) {
            unidadesMap.put(unidade, 1);
        } else {
            Integer value = unidadesMap.get(unidade);
            unidadesMap.put(unidade, ++value);
        }
    }

    private void listProdutos(Comparator orderBy) {

        if (produtosCollection.isEmpty()) {
            System.out.println("Não há produtos na lista!");
        }

        Collections.sort(produtosCollection, orderBy);
        
        for (Produto p : produtosCollection) {
            System.out.format("\nData: %5s - Produto: %-20s  - Unidade: %s - Quantidade total: %s", p.getData(), p.getNome(), p.getUnidade(), unidadesMap.get(p.getUnidade()));
        }
    }

}
