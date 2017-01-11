package com.br.com.plenaperformancerh.produto.produtosordenados.main;

import com.br.com.plenaperformancerh.produto.produtosordenados.produto.controller.ProdutoController;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class App {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("\n\n<<< ---- Informe os produtos! --- >>> ");
            System.exit(0);
        }


        ProdutoController c = new ProdutoController(args);
        c.listByData();
        c.listByProdutoNome();
        
        
        System.out.println("\n\n<<< ---- Fim. --- >>>");
    }
}
