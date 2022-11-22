package br.com.letscode.domain.enums;

import lombok.Getter;

@Getter
public enum GeneroMusical {
    AXE("Axé"),
    BLUES("Blues"),
    COUNTRY("Country"),
    ELETRONICA("Eletrônica"),
    FORRO("Forró"),
    FUNK("Funk"),
    GOSPEL("Gospel"),
    HIPHOP("Hip Hop"),
    JAZZ("Jazz"),
    MPB("Mpb"),
    CLASSICA("Clássica"),
    PAGODE("Pagode"),
    POP("Pop"),
    POPROCK("Pop rock"),
    RAP("Rap"),
    RAGGAE("Raggae"),
    ROCK("Rock"),
    SAMBA("Samba");

    private final String label;
    GeneroMusical(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
