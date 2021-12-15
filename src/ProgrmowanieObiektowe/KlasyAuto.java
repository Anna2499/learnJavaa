package ProgrmowanieObiektowe;

//wprowadzenie do klasy
// klasa - szablon na podstawie ktorego mozemy tworzyc obiekty (czyli przedstawiciel danej klasy)
// klasa moze zaiweraz jedna lub wiecej metod
// klasa nie musi miec pol

public class KlasyAuto {

    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;


    public void jedz() {
        System.out.println("Jade!");
    }

    public void hamuj() {
        System.out.println("Hamuj!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}
