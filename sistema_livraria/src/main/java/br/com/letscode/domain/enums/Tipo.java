package br.com.letscode.domain.enums;

import lombok.Getter;

@Getter
public enum Tipo {

    ARTES("Artes"),
    ATIVIDADES("Atividades"),
    BLOCOSDEMONTAR("Blocos de Montar"),
    BONECAS("Bonecas"),
    CARRINHOS("Carrinhos"),
    COLECIONAVEIS("Colecionáveis"),
    MINIATURAS("Miniaturas"),
    INSTRUMENTOSMUSICAIS("Instrumentos Músicais"),
    JOGOS("Jogos"),
    PELUCIA("Pelúcia"),
    QUEBRACABECA("Quebra cabeças"),
    EDUCATIVO("Educativo");

    private final String label;
    Tipo(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}