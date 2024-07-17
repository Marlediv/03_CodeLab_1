package com.cc.java;

public class Konto {
    private int kontostand;

    Konto() {
        this.kontostand = 10000;
    }

    int getKontostand() {
        return kontostand;
    }

    void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
}