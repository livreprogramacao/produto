package com.br.com.plenaperformancerh.produto.produtosordenados.entity.produto;

import com.br.com.plenaperformancerh.produto.produtosordenados.entity.unidade.Unidade;
import java.util.Date;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class Produto {
    
    private String data;
    private String nome;
    private String ordenacao;
    private Integer quantidade;

    public Produto(String _data, String _produtoNome, String _ordenacao) {
        this.data = _data;
        this.nome = _produtoNome;
        this.ordenacao = _ordenacao;
    }
    
}
