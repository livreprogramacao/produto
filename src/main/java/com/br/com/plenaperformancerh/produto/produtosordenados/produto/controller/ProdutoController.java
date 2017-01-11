package com.br.com.plenaperformancerh.produto.produtosordenados.produto.controller;

import com.br.com.plenaperformancerh.produto.produtosordenados.entity.produto.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author user
 */
public class ProdutoController {

    private List<Produto> produtosCollection = new ArrayList<Produto>();
    
    public ProdutoController(String[] args) {
        parseParameter(args);
    }

    public void listByData() {
        System.out.println("\n\n<<< ---- Lista ordenada de produtos por data --- >>>.");
        
        for(Produto p : produtosCollection) {
            //System.out.format("\nData %s Produto %s Ordenação %s", p.getData(), p.getNome(), p.getOrdenacao());
            System.out.println(p.getNome());
        }
    }

    public void listByProdutoNome() {
        System.out.println("\n\n<<< ---- Lista ordenada de produtos por nome do produto --- >>>.");

        for(Produto p : produtosCollection) {
            //System.out.format("\nData %s Produto %s Ordenação %s", p.getData(), p.getNome(), p.getOrdenacao());
            System.out.println(p.getNome());
        }
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
            
            //System.out.println(produto);
            
            produtosCollection.add(produto);
        }
        
        //System.out.println(produtosCollection.size());
    }
    private static final String DELIMITER = ":";

}
