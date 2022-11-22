package br.com.letscode.domain.enums;

import lombok.Getter;

@Getter
public enum GeneroJogos {
    ACAO("Ação"),
    AVENTURA("Aventura"),
    ESTRATEGIA("Estratégia"),
    RPG("RPG"),
    ESPORTE("Esporte"),
    TABULEIRO("Tabuleiro"),
    CARTAS("Cartas"),
    QUEBRACABECA("Quebra-cabeça");

    private final String label;
    GeneroJogos(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
