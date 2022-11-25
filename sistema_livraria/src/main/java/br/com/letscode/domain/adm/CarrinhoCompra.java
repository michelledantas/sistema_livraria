package br.com.letscode.domain.adm;

import br.com.letscode.domain.model.Produto;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoCompra<T extends Produto>  {

    private Estoque<T> estoque;

    public CarrinhoCompra(Estoque<T> estoque) {
        this.estoque = estoque;
    }

    public static List<Produto> carrinhoCompra = new ArrayList<>();


    public double totalDoCarrinho(List<Produto> carrinhoCompra){
        double valorTotal = 0;

        for (int i = 0; i < carrinhoCompra.toArray().length; i++) {
            valorTotal += carrinhoCompra.get(i).getPreco();
        }
        return valorTotal;
    }

    public void addProduto(T produto){
        if(!carrinhoCompra.contains(produto)){
            carrinhoCompra.add(produto);
            estoque.removeProduto(produto);
        }
    }

    public void removeProduto(T produto){
        if(!carrinhoCompra.contains(produto)){
            carrinhoCompra.add(produto);
            estoque.addEstoque(produto);
        }
    }




}
