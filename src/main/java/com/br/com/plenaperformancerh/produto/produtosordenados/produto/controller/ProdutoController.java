package com.br.com.plenaperformancerh.produto.produtosordenados.produto.controller;

import com.br.com.plenaperformancerh.produto.produtosordenados.entity.produto.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<Produto>();
    
    public ProdutoController(String[] produtos) {
        parseParameter(produtos);
    }

    public void listByData() {
        System.out.println("\n\n<<< ---- Lista ordenada de produtos por data --- >>>.");
    }

    public void listByProdutoNome() {
        System.out.println("\n\n<<< ---- Lista ordenada de produtos por nome do produto --- >>>.");
    }

    private void parseParameter(String[] parametros) {
        Produto produto = null;
        
        for (String p : parametros) {
            //System.out.println("Produto: " + p);

            String[] fields = p.split(DELIMITER);

            String data = fields[0];
            String nome = fields[1];
            String ordenacao = fields[2];
            
            produto = new Produto(data, nome, ordenacao);
            
            produtos.add(produto);
        }
    }
    private static final String DELIMITER = ":";

}
