package com.br.com.plenaperformancerh.produto.produtosordenados.main;

import com.br.com.plenaperformancerh.produto.produtosordenados.produto.controller.ProdutoController;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("\n\n<<< ---- Informe os produtos! --- >>> ");
            System.exit(0);
        }
        
        
        System.out.println("\n\n<<< ---- Lista ordenada com a Data, Produto, Unidade e quantidade total de produto na unidade. --- >>>");
        
        ProdutoController c = new ProdutoController(args);
        c.listByData();
        c.listByProdutoNome();
    }
}
