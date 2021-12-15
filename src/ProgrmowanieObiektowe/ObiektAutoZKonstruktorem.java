package ProgrmowanieObiektowe;

public class ObiektAutoZKonstruktorem {

    public static void main(String[] args) {

        KlasaAutoZKonstruktorem mercedes = new KlasaAutoZKonstruktorem("Mercedes", "Klasa 5", 2021, 1000);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        KlasaAutoZKonstruktorem audi = new KlasaAutoZKonstruktorem("Audi", "A6", 2000, 300000);
        audi.jedz();
        audi.hamuj();
        audi.info();

        KlasaAutoZKonstruktorem noName = new KlasaAutoZKonstruktorem();
        noName.jedz();
        noName.hamuj();
        noName.info();
    }
}