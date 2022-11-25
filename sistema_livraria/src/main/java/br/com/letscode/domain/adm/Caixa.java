package br.com.letscode.domain.adm;

import lombok.Data;

@Data
public class Caixa {

    private Double saldo;

    public Caixa(Double valorCompra) {
    }

    public Double getDinheiro() {
        return saldo;
    }

    public void setDinheiro(Double saldo) {
        this.saldo += saldo;
    }

    public void addSaldo(Double valorCompra){
        this.setDinheiro(valorCompra);
    }
}
