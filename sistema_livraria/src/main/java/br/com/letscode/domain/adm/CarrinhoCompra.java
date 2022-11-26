package br.com.letscode.domain.adm;

import br.com.letscode.domain.model.Cliente;
import br.com.letscode.domain.model.Produto;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoCompra<T extends Produto>{

    private EstoqueDAO estoqueDAO;
    private Cliente cliente;

    public CarrinhoCompra(EstoqueDAO estoqueDAO, Cliente cliente) {
        this.estoqueDAO = estoqueDAO;
        this.cliente = cliente;
    }


    public static List<Produto> carrinhoCompra = new ArrayList<>();


    public double totalDoCarrinho(){
        double valorTotal = 0;

        for (int i = 0; i < carrinhoCompra.toArray().length; i++) {
            valorTotal += carrinhoCompra.get(i).getPreco();
        }
        return valorTotal;
    }

    public void addProduto(Produto produto, Cliente cliente) throws Exception {
        if(!carrinhoCompra.contains(produto)){
            if (produto.isConteudoAdulto() && !cliente.maiorDeIdade()){
                throw new Exception("Compra bloqueada! Cliente menor de idade");
            }
            carrinhoCompra.add(produto);
            estoqueDAO.delete(produto);
        }
    }

    public void removeProduto(Produto produto){
        if(!carrinhoCompra.contains(produto)){
            carrinhoCompra.add(produto);
            estoqueDAO.add(produto);
        }
    }

    public void cancelarCarrinho(Produto produto){
        for (Produto p: carrinhoCompra) {
            estoqueDAO.add(produto);
        }
    }

    public Produto getProduto(Integer idRegistro){
        for (Produto t : carrinhoCompra){
            if (t.getIdRegistro().equals(idRegistro)){
                return t;
            }
        }
        return null;
    }

    public List<Produto> listarCarrinho() {
        return carrinhoCompra;
    }

    public List<Produto> findAll() {
        return carrinhoCompra;
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "estoque=" + estoqueDAO +
                ", cliente=" + cliente +
                '}';
    }
}
