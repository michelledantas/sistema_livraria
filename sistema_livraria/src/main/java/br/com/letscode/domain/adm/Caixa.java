package br.com.letscode.domain.adm;

import lombok.Data;

import java.io.Serializable;

@Data
public class Caixa implements Serializable {

    private static final long serialVersionUID = 1L;

    private Double dinheiro;

    //lista estática
}
