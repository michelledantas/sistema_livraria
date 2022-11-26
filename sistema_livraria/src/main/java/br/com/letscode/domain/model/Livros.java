package br.com.letscode.domain.model;

import br.com.letscode.domain.enums.Genero;

public class Livros extends Produto {

    private Genero genero;
    private String escritor;
    private String editora;

    public Livros(Integer idRegistro, String nome, Double preco, Genero genero, String escritor, String editora, boolean conteudoAdulto) {
        super(idRegistro, nome, preco, conteudoAdulto);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livros{ idRegistro = '" + super.getIdRegistro() + '\'' +
                ", nome = '" + super.getNome() + '\'' +
                ", preço = '" + super.getPreco() + '\'' +
                ", gênero = '" + genero  + '\'' +
                ", escritor = '" + escritor  + '\'' +
                ", editora = '" + editora + '\'' +
                '}';
    }
    public Genero getGenero() {
        return genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
