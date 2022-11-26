package br.com.letscode.domain.enums;

import lombok.Getter;

@Getter
public enum Genero {

    ACAO("Ação"),
    AVENTURA("Aventura"),
    DRAMA("Drama"),
    COMEDIA("Comédia"),
    COMEDIAROMANTICA("Comédia Romântica"),
    TERROR("Terror"),
    INFANTIL("Infantil"),
    EDUCACAO("Educação"),
    ADULTO("Adulto");

    private final String label;
    
    Genero(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
