package com.br.com.plenaperformancerh.produto.produtosordenados.main;

import com.br.com.plenaperformancerh.produto.produtosordenados.produto.controller.ProdutoController;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class App {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("\n\n<<< ---- Informe a ordenação da lista de produtos. Pode ser por: data ou produto --- >>> ");
            System.exit(0);
        }
        
        boolean sortByData = "data".equalsIgnoreCase(args[0]);

        ProdutoController c = new ProdutoController(args);
        if (sortByData) {
            c.listByData();
        } else {
            c.listByProdutoNome();
        }

        System.out.println("\n\n<<< ---- Fim. --- >>>");
    }
}
