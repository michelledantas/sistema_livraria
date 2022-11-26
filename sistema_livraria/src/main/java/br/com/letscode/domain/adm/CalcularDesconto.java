package br.com.letscode.domain.adm;


public class CalcularDesconto implements Desconto{


    @Override
    public double valorComDesconto(double valor) {
        return valor>=200?(valor*0.85):valor;
    }

    @Override
    public double valorDoDesconto(double valor) {
        return valor>=200?(valor*0.15):0;
    }


}
