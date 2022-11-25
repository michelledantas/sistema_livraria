package br.com.letscode.domain.model;

import br.com.letscode.domain.enums.GeneroMusical;



public class AlbumDeMusica extends Produto{



    private String musicosBanda;
    private GeneroMusical generos;
    private String selos;
    private int anoLancamento;

    public AlbumDeMusica(Integer idRegistro, String nome, Double preco, String musicosBanda, GeneroMusical generos, String selos, int anoLancamento) {
        super(idRegistro, nome, preco);
        this.musicosBanda = musicosBanda;
        this.generos = generos;
        this.selos = selos;
        this.anoLancamento = anoLancamento;
    }

    public String getMusicosBanda() {
        return musicosBanda;
    }

    public void setMusicosBanda(String musicosBanda) {
        this.musicosBanda = musicosBanda;
    }

    public GeneroMusical getGeneros() {
        return generos;
    }

    public void setGeneros(GeneroMusical generos) {
        this.generos = generos;
    }

    public String getSelos() {
        return selos;
    }

    public void setSelos(String selos) {
        this.selos = selos;
    }

    public int getAno() {
        return anoLancamento;
    }

    public void setAno(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "AlbumDeMusica{ idRegistro = '" + super.getIdRegistro() + '\'' +
                ", nome = '" + super.getNome() + '\'' +
                ", preço = '" + super.getPreco() + '\'' +
                ", musicos/banda = '" + musicosBanda + '\'' +
                ", gêneros = '" + generos + '\'' +
                ", selos = '" + selos + '\'' +
                ", ano lançamento = '" + anoLancamento + '\'' +
                '}';
    }
}
