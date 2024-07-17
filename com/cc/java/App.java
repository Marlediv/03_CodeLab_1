package com.cc.java;

public class App {

        Konto konto1;
        Konto konto2;
        Konto konto3;
    
        App() {
            this.konto1 = new Konto();
            this.konto2 = new Konto();
            this.konto3 = new Konto();
        }
    
        void kontostaendeAusgeben() {
            System.out.println("Anfangskontostand von konto1: " + konto1.getKontostand());
            System.out.println("Anfangskontostand von konto2: " + konto2.getKontostand());
            System.out.println("Anfangskontostand von konto3: " + konto3.getKontostand());
        }
    
        void kontostaendeVeraendern() {
            konto1.setKontostand(konto1.getKontostand() * 2);
            konto2.setKontostand(konto2.getKontostand() * 3);
            konto3.setKontostand(konto3.getKontostand() * 10);
        }
    
        void aktuelleKontostaendeAusgeben() {
            System.out.println("Aktueller Kontostand von konto1: " + konto1.getKontostand());
            System.out.println("Aktueller Kontostand von konto2: " + konto2.getKontostand());
            System.out.println("Aktueller Kontostand von konto3: " + konto3.getKontostand());
        }
    public static void main(String[] args) {
        App app = new App();
        app.kontostaendeAusgeben();
        app.kontostaendeVeraendern();
        app.aktuelleKontostaendeAusgeben();
    }


    // private static void output(String outputStr) {
    //     System.out.println(outputStr);
    // } 

}