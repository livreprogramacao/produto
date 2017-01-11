package com.br.com.plenaperformancerh.produto.produtosordenados.entity.produto;

import com.br.com.plenaperformancerh.produto.produtosordenados.entity.unidade.Unidade;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "data=" + data + ", nome=" + nome + ", ordenacao=" + ordenacao + ", quantidade=" + quantidade + '}';
    }
    
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(String ordenacao) {
        this.ordenacao = ordenacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
