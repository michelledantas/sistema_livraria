package br.com.letscode.domain.model;

import br.com.letscode.domain.enums.Tipo;

import java.io.Serializable;


public class Brinquedo extends Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Tipo tipo;

    public Brinquedo(Integer idRegistro, String nome, Double preco, Tipo tipo) {
        super(idRegistro, nome, preco);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo{ idRegistro = '" + super.getIdRegistro() + '\'' +
                ", nome = '" + super.getNome() + '\'' +
                ", preço = '" + super.getPreco() + '\'' +
                ", tipo = '" + tipo + '\'' +
                '}';
    }
}
