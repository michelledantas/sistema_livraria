package br.com.letscode.domain.adm;

public class FinalizarCompra {

    private Estoque estoque;
    private Caixa caixa;
    private CarrinhoCompra carrinhoCompra;



    public FinalizarCompra(Estoque estoque, Caixa caixa, CarrinhoCompra carrinhoCompra) {
        this.estoque = estoque;
        this.caixa = caixa;
        this.carrinhoCompra = carrinhoCompra;
    }

//    public void finalizarPedido(CarrinhoCompra carrinhoCompra){
//        caixa.addSaldo(carrinhoCompra.totalDoCarrinho());
//    }




}
