package br.com.letscode.domain.adm;

public class FinalizarCompra {

    private EstoqueDAO estoqueDAO;
    private Caixa caixa;
    private CarrinhoCompra carrinhoCompra;
    private Desconto desconto;



    public FinalizarCompra(EstoqueDAO estoqueDAO, Caixa caixa, Desconto desconto, CarrinhoCompra carrinhoCompra) {
        this.estoqueDAO = estoqueDAO;
        this.caixa = caixa;
        this.desconto = desconto;
        this.carrinhoCompra = carrinhoCompra;
    }

    public void finalizarPedido(CarrinhoCompra carrinhoCompra){
        System.out.println(carrinhoCompra);
        System.out.println("Total sem desconto: " + carrinhoCompra.totalDoCarrinho());
        System.out.println("Desconto: " + desconto.valorDoDesconto(carrinhoCompra.totalDoCarrinho()) );
        System.out.println("Total com desconto: " + desconto.valorComDesconto(carrinhoCompra.totalDoCarrinho()) );
        caixa.addSaldo(desconto.valorComDesconto(carrinhoCompra.totalDoCarrinho()));
    }




}
