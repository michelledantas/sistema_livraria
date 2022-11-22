package br.com.letscode.domain.model;

import br.com.letscode.domain.enums.GeneroJogos;

import java.io.Serializable;


public class Jogos extends Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String distribuidora;
    private GeneroJogos genero;
    private String estudio;


    public Jogos(Integer idRegistro, String nome, Double preco, String distribuidora, GeneroJogos genero, String estudio) {
        super(idRegistro, nome, preco);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogos{ idRegistro = '" + super.getIdRegistro() +
                ", nome = '" + super.getNome()  + '\'' +
                ", preço = '" + super.getPreco()  + '\'' +
                ", distribuidora = '" + distribuidora + '\'' +
                ", gênero = '" + genero  + '\'' +
                ", estudio = '" + estudio + '\'' +
                '}';
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public GeneroJogos getGenero() {
        return genero;
    }

    public String getEstudio() {
        return estudio;
    }
}
