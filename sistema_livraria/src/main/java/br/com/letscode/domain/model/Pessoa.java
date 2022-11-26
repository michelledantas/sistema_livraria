package br.com.letscode.domain.model;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String rg, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public boolean maiorDeIdade(){
        LocalDate anoAtual = LocalDate.now();
        return anoAtual.getYear() - dataNascimento.getYear() >= 18;
    }
}
