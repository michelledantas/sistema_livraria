package br.com.letscode.domain.model;

import br.com.letscode.domain.enums.GeneroMusical;

import java.io.Serializable;


public class Musica extends Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    private GeneroMusical genero;
    private String selo;
    private String banda;
    private int anoLancamento;

    public Musica(Integer idRegistro, String nome, Double preco, GeneroMusical genero, String selo, String banda, int anoLancamento) {
        super(idRegistro, nome, preco);
        this.genero = genero;
        this.selo = selo;
        this.banda = banda;
        this.anoLancamento = anoLancamento;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Musica{ idRegistro = '" + super.getIdRegistro() + '\'' +
                ", nome = '" + super.getNome() + '\'' +
                ", preço = '" + super.getPreco() + '\'' +
                ", gênero = '" + genero + '\'' +
                ", selo = '" + selo + '\'' +
                ", banda = '" + banda + '\'' +
                ", ano lancamento = '" + anoLancamento + '\'' +
                '}';
    }
}