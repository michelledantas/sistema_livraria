package br.com.letscode.domain.model;

import br.com.letscode.domain.enums.Genero;

import java.io.Serializable;

public class Filme extends Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String estudio;
    private String diretores;
    private Genero genero;
    private String produtores;
    private int anoLancamento;

    private String oscar;

    public Filme(Integer idRegistro, String nome, Double preco, String estudio, String diretores, Genero genero, String produtores, int anoLancamento, String oscar) {
        super(idRegistro, nome, preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.genero = genero;
        this.produtores = produtores;
        this.anoLancamento = anoLancamento;
        this.oscar = oscar;
    }

    public String getEstudio() {
        return estudio;
    }

    public String getDiretores() {
        return diretores;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getProdutores() {
        return produtores;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getOscar() {
        return oscar;
    }

    @Override
    public String toString() {
        return "Filme{ idRegistro = '" + super.getIdRegistro() + '\'' +
                ", nome = '" + super.getNome() + '\'' +
                ", preço = '" + super.getPreco() + '\'' +
                ", estudio ='" + estudio + '\'' +
                ", diretores = '" + diretores + '\'' +
                ", genero = '" + genero + '\'' +
                ", produtores = '" + produtores + '\'' +
                ", anoLancamento= '" + anoLancamento + '\'' +
                ", oscar = '" + oscar + '\'' +
                '}';
    }
}
