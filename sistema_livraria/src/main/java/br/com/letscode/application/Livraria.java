package br.com.letscode.application;

import br.com.letscode.domain.adm.*;
import br.com.letscode.domain.enums.Genero;
import br.com.letscode.domain.enums.GeneroJogos;
import br.com.letscode.domain.enums.GeneroMusical;
import br.com.letscode.domain.enums.Tipo;
import br.com.letscode.domain.model.*;


import java.time.LocalDate;
import java.util.List;

public class Livraria {

    private static EstoqueDAO controleEstoqueDAO = new EstoqueDAO();
    private static Cliente cliente;
    private static CarrinhoCompra carrinhoCompra = new CarrinhoCompra(controleEstoqueDAO, cliente);
    private static Caixa caixa = new Caixa();
    private static Desconto desconto =  new CalcularDesconto(); //inversao de dependencia
    private static final FinalizarCompra finalizarCompra = new FinalizarCompra(controleEstoqueDAO,caixa,desconto, carrinhoCompra);


    public static void main(String[] args) throws Exception {

        Cliente clienteMaiorIdade = new Cliente(1,"Maria","10.786.907-4","111.111.111-11", LocalDate.of(1992,10,21));
        Cliente clienteMenorIdade = new Cliente(1,"Maria","10.786.907-4","111.111.111-11", LocalDate.of(2012,10,21));

        CarrinhoCompra carrinhoCompra = new CarrinhoCompra(controleEstoqueDAO, cliente);

        controleEstoqueDAO.add(new Livros(1,"Código Limpo",  71.90, Genero.EDUCACAO, "Robert C. Martin", "Alta Books", false));
        controleEstoqueDAO.add(new Livros(2,"Arquitetura Limpa",  69.34, Genero.EDUCACAO, "Robert C. Martin", "Alta Books", false));
        controleEstoqueDAO.add(new Livros(3,"O codificador Limpo",  57.73, Genero.EDUCACAO, "Robert C. Martin", "Alta Books", false));

        controleEstoqueDAO.add(new AlbumDeMusica(4, "Reckless",77.00,"Bryan Adams", GeneroMusical.POPROCK,"A&M Records",1984, false));
        controleEstoqueDAO.add(new AlbumDeMusica(5, "Waking Up the Neighbours",77.00,"Bryan Adams", GeneroMusical.POPROCK,"A&M Records",1991, false));

        controleEstoqueDAO.add(new Musica(6,"Please Forgive Me",10.00, GeneroMusical.POPROCK, "A&M Records", "Bryan Adams",1993, false));
        controleEstoqueDAO.add(new Musica(7,"Somebody",10.00, GeneroMusical.POPROCK, "A&M Records", "Bryan Adams",1984, false));

        controleEstoqueDAO.add(new Brinquedo(8,"Barbie Profissões", 60.00, Tipo.BONECAS, false));
        controleEstoqueDAO.add(new Brinquedo(9,"Laptop Bilíngue, Barbie, Candide", 150.00, Tipo.EDUCATIVO, false));

        controleEstoqueDAO.add(new Filme(10,"O Jogo da Imitação",10.00,"Black Bear Pictures","Morten Tyldum", Genero.DRAMA,
                "Nora Grossman * Ido Ostrowsky * Teddy Schwarzman", 2014, "Oscar 2015 - Melhor roteiro adaptado", false));
        controleEstoqueDAO.add(new Filme(11,"Persuasão",10.00,"Netflix", "Carrie Cracknell", Genero.COMEDIAROMANTICA,
                "Debra Hayward",2022,"Não possui", false));

        controleEstoqueDAO.add(new Jogos(12,"Banco imobiliário", 91.99, "Amazon", GeneroJogos.TABULEIRO, "Estrela", false));

        controleEstoqueDAO.add(new Filme(13,"Filme adulto",15.99,"adulto","adulto", Genero.ADULTO,"adulto",2022,"nenhum",true));

        System.out.println("==========================================================================================================================================================================================================================================================================================================");
        System.out.println("Buscando todos os produtos em estoque");
        controleEstoqueDAO.findAll().forEach(
                System.out::println);

        System.out.println("==========================================================================================================================================================================================================================================================================================================");
        System.out.println("Buscando produto pelo Id");
        System.out.println(controleEstoqueDAO.getProduto(1));
        System.out.println("==========================================================================================================================================================================================================================================================================================================");

        System.out.println("Antes do update da Barbie Bailarina");
        System.out.println(controleEstoqueDAO.getProduto(9));
        Brinquedo barbieBailarina = new Brinquedo(9,"Barbie Bailarina", 90.00, Tipo.BONECAS, false);
        controleEstoqueDAO.update(barbieBailarina);
        System.out.println("Após update");
        System.out.println(controleEstoqueDAO.getProduto(9));
        System.out.println("==========================================================================================================================================================================================================================================================================================================");

        System.out.println("Delete Barbie Bailarina");
        controleEstoqueDAO.delete(barbieBailarina);
        controleEstoqueDAO.findAll().forEach(System.out::println);

        System.out.println("==========================================================================================================================================================================================================================================================================================================");



//        System.out.println("Adicionando no carrinho os produtos: Barbie Profissões e Laptop Bilíngue");
//        carrinhoCompra.addProduto( new Brinquedo(8,"Barbie Profissões", 60.00, Tipo.BONECAS, false), clienteMenorIdade);
//        carrinhoCompra.addProduto( new Brinquedo(9,"Laptop Bilíngue, Barbie, Candide", 150.00, Tipo.EDUCATIVO, false), clienteMenorIdade);

        System.out.println("Adicionando no carrinho produto de conteúdo adulto");
        carrinhoCompra.addProduto( new Filme(13,"Filme adulto",15.99,"adulto","adulto", Genero.ADULTO,"adulto",2022,"nenhum",true), clienteMenorIdade);

        System.out.println("==========================================================================================================================================================================================================================================================================================================");

        System.out.println("Listando carrinho de compras");
        carrinhoCompra.listarCarrinho().forEach(System.out::println);

        System.out.println("==========================================================================================================================================================================================================================================================================================================");
        System.out.println("Listando estoque e visualizando que os produtos foram retirados do estoque");
        controleEstoqueDAO.findAll().forEach(System.out::println);

        System.out.println("==========================================================================================================================================================================================================================================================================================================");
        System.out.println("Itens de um tipo específico existem no estoque.");


        System.out.println("==========================================================================================================================================================================================================================================================================================================");
        System.out.println("Finalizando pedido:");
        finalizarCompra.finalizarPedido(carrinhoCompra);
        System.out.println("Saldo caixa:");
        System.out.println(caixa.getSaldo());

        System.out.println("==========================================================================================================================================================================================================================================================================================================");

    }
}
