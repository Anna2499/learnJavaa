package ProgrmowanieObiektowe;

public class KlasaAutoZKonstruktorem {

    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;

    //stworzenie konstruktora; najlepiej miedzy polami klasy a innymi metodami
    //konstruktor domyslny
    public KlasaAutoZKonstruktorem() {

    }

    //konstruktor niedomyslny
    public KlasaAutoZKonstruktorem(String marka, String model, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void jedz() { System.out.println("Jedz!"); }

    public void hamuj()  { System.out.println("Hamuj!"); }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}
