//Twozrzenie obiektu do klasy KlasaAuto

package ProgrmowanieObiektowe;

public class ObiektAuto {

    public static void main(String[] args) {

        KlasyAuto mercedes = new KlasyAuto();
        //zdefiniowanie pol
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa 5";
        mercedes.rokProdukcji = 2021;
        mercedes.przebieg = 1000;

        //wywolanie metod wewnatrz kalsy KlasaAuto
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();


        KlasyAuto audi = new KlasyAuto();
        audi.marka = "Audi";
        audi.model = "A6";
        audi.rokProdukcji = 2000;
        audi.przebieg = 300000;

        audi.jedz();
        audi.hamuj();
        audi.info();


        KlasyAuto noName = new KlasyAuto();
        //marka, model, rok produkcji, przebieg maja null, bo jest to domysla wartosc dla String oraz int
        noName.jedz();
        noName.hamuj();
        noName.info();
    }
}