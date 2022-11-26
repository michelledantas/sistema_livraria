package br.com.letscode.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente extends Pessoa{

    private Integer idCliente;

    public Cliente(int idCliente, String nome, String rg, String cpf, LocalDate dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.idCliente = idCliente;
    }


    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}
