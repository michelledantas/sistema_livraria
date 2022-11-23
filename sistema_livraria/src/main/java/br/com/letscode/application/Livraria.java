package br.com.letscode.application;

import br.com.letscode.domain.adm.Estoque;
import br.com.letscode.domain.enums.Genero;
import br.com.letscode.domain.enums.GeneroJogos;
import br.com.letscode.domain.enums.GeneroMusical;
import br.com.letscode.domain.enums.Tipo;
import br.com.letscode.domain.model.*;

import javax.management.openmbean.OpenDataException;

public class Livraria {

    private static Estoque<Produto> controleEstoque = new Estoque<>();

    public static Estoque<Produto> getControleEstoque() {
        return controleEstoque;
    }

    public static void setControleEstoque(Estoque<Produto> controleEstoque) {
        Livraria.controleEstoque = controleEstoque;
    }

    public static void main(String[] args) throws OpenDataException {

        controleEstoque.addEstoque(new Livros(1,"Código Limpo",  71.90, Genero.EDUCACAO, "Robert C. Martin", "Alta Books"));
        controleEstoque.addEstoque(new Livros(2,"Arquitetura Limpa",  69.34, Genero.EDUCACAO, "Robert C. Martin", "Alta Books"));
        controleEstoque.addEstoque(new Livros(3,"O codificador Limpo",  57.73, Genero.EDUCACAO, "Robert C. Martin", "Alta Books"));

        controleEstoque.addEstoque(new AlbumDeMusica(4, "Reckless",77.00,"Bryan Adams", GeneroMusical.POPROCK,"A&M Records",1984));
        controleEstoque.addEstoque(new AlbumDeMusica(5, "Waking Up the Neighbours",77.00,"Bryan Adams", GeneroMusical.POPROCK,"A&M Records",1991));

        controleEstoque.addEstoque(new Musica(6,"Please Forgive Me",10.00, GeneroMusical.POPROCK, "A&M Records", "Bryan Adams",1993));
        controleEstoque.addEstoque(new Musica(7,"Somebody",10.00, GeneroMusical.POPROCK, "A&M Records", "Bryan Adams",1984));

        controleEstoque.addEstoque(new Brinquedo(8,"Barbie Profissões", 49.99, Tipo.BONECAS));
        controleEstoque.addEstoque(new Brinquedo(9,"Laptop Bilíngue, Barbie, Candide", 82.49, Tipo.EDUCATIVO));

        controleEstoque.addEstoque(new Filme(10,"O Jogo da Imitação",10.00,"Black Bear Pictures","Morten Tyldum", Genero.DRAMA,
                "Nora Grossman * Ido Ostrowsky * Teddy Schwarzman", 2014, "Oscar 2015 - Melhor roteiro adaptado"));
        controleEstoque.addEstoque(new Filme(11,"Persuasão",10.00,"Netflix", "Carrie Cracknell", Genero.COMEDIAROMANTICA,
                "Debra Hayward",2022,"Não possui"));

        controleEstoque.addEstoque(new Jogos(12,"Banco imobiliário", 91.99, "Amazon", GeneroJogos.TABULEIRO, "Estrela"));

        System.out.println("==========================================================================================================================================================================================================================================================================================================");
        System.out.println("Buscando todos os produtos em estoque");
        controleEstoque.imprimirTodosProdutos();

        System.out.println("==========================================================================================================================================================================================================================================================================================================");
        System.out.println("Buscando produto pelo Id");
        System.out.println(controleEstoque.getProduto(1));
        System.out.println("==========================================================================================================================================================================================================================================================================================================");

        System.out.println("Update \nAntes do update");
        System.out.println(controleEstoque.getProduto(9));
        Brinquedo barbie = new Brinquedo(9,"Barbie Bailarina", 90.00, Tipo.BONECAS);
        controleEstoque.updateProduto(barbie);
        System.out.println("Após update");
        System.out.println(controleEstoque.getProduto(9));
        System.out.println("==========================================================================================================================================================================================================================================================================================================");

        System.out.println("Delete");
        controleEstoque.removeProduto(barbie);
        controleEstoque.imprimirTodosProdutos();
        System.out.println("==========================================================================================================================================================================================================================================================================================================");


    }
}
