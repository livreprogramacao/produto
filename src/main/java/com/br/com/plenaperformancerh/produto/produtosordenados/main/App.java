/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.com.plenaperformancerh.produto.produtosordenados.main;

import com.br.com.plenaperformancerh.produto.produtosordenados.produto.controller.ProdutoController;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n\n<<< ---- Lista ordenada com a Data, Produto, Unidade e quantidade total de produto na unidade --- >>>.");
        
        ProdutoController c = new ProdutoController();
        c.listByData();
        c.listByProdutoNome();
    }
}
