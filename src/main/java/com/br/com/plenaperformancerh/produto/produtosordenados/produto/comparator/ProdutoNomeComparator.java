package com.br.com.plenaperformancerh.produto.produtosordenados.produto.comparator;

import com.br.com.plenaperformancerh.produto.produtosordenados.produto.Produto;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class ProdutoNomeComparator implements  Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }

}
