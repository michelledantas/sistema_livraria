package br.com.letscode.domain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


public class Produto implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer idRegistro;
    private String nome;
    private Double preco;

    public Produto(Integer idRegistro, String nome, Double preco) {
        this.idRegistro = idRegistro;
        this.nome = nome;
        this.preco = preco;
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
