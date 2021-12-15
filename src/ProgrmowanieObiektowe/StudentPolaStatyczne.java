// klasy przyklad 2

package ProgrmowanieObiektowe;

public class StudentPolaStatyczne {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";

    public void przedstawSie() {
        System.out.println("Nawyzam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie za pomoca " + nick);
    }

    public void podajNrIndeksu() {
        System.out.println("Moj numer indeksu: " + numerIndeksu);
    }

    public void podajImie() {
        System.out.println("Nazywam sie " + imie);
    }

    public void podajEmail() {
        System.out.println("Moj emil to:  " + email);
    }

}
