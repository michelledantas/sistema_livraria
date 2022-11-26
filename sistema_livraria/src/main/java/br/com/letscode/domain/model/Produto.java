package br.com.letscode.domain.model;

import java.util.Objects;


public class Produto {

    private Integer idRegistro;
    private String nome;
    private Double preco;
    private boolean conteudoAdulto;

    public Produto(Integer idRegistro, String nome, Double preco, boolean conteudoAdulto) {
        this.idRegistro = idRegistro;
        this.nome = nome;
        this.preco = preco;
        this.conteudoAdulto = conteudoAdulto;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public boolean isConteudoAdulto() {
        return conteudoAdulto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idRegistro='" + idRegistro +
                ", nome='" + nome + '\'' +
                ", preco=" + preco + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return idRegistro.equals(produto.idRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegistro);
    }
}
