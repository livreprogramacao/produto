package com.br.com.plenaperformancerh.produto.produtosordenados.produto;

import java.util.Objects;

/**
 *
 * @author Fabio Santos Almeida livre.programacao at gmail.com
 */
public class Produto {

    private String data;
    private String nome;
    private String ordenacao;
    private String unidade;

    public Produto(String _data, String _produtoNome, String _ordenacao, String _unidade) {
        this.data = _data;
        this.nome = _produtoNome;
        this.ordenacao = _ordenacao;
        this.unidade = _unidade;
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
        return "Produto{" + "data=" + data + ", nome=" + nome + ", ordenacao=" + ordenacao + ", unidade=" + unidade + '}';
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

    public String getUnidade() {
        return this.unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

}
