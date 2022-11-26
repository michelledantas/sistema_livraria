package br.com.letscode.domain.adm;

import lombok.Data;

@Data
public class Caixa {

    CarrinhoCompra carrinhoCompra;
    private double saldo;

    public Caixa() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double saldo) {
        this.saldo += saldo;
    }
}
