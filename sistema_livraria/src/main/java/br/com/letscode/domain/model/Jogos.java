package br.com.letscode.domain.model;

import br.com.letscode.domain.enums.GeneroJogos;


public class Jogos extends Produto {

    private String distribuidora;
    private GeneroJogos genero;
    private String estudio;


    public Jogos(Integer idRegistro, String nome, Double preco, String distribuidora, GeneroJogos genero, String estudio, boolean conteudoAdulto) {
        super(idRegistro, nome, preco, conteudoAdulto);
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
