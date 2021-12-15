// Stworz 3 obiekty klasy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow do tablicy.
// przejdz przez studentow w tabeli i wywolaj wszystkie metody z KlasaStudent

package ProgrmowanieObiektowe;

import java.util.Scanner;

public class ObiektStudent {

    public static void main(String[] args) {

        KlasyStudent ania = new KlasyStudent();
        ania.imie = "Ania";
        ania.nazwisko = "Czek";
        ania.nick = "AniaC";
        ania.numerIndeksu = 11111;
        ania.email = "aniac@gmail.com";

        KlasyStudent piotr = new KlasyStudent();
        piotr.imie = "Piotr";
        piotr.nazwisko = "Piotrowski";
        piotr.nick = "PiotrP";
        piotr.numerIndeksu = 22222;
        piotr.email = "piotrp@wp.com";

        KlasyStudent lena = new KlasyStudent();
        lena.imie = "Lena";
        lena.nazwisko = "Lenkowska";
        lena.nick = "LenaL";
        lena.numerIndeksu = 33333;
        lena.email = "lenal@02.com";

        KlasyStudent[] students = new KlasyStudent[3];
        students[0] = ania;
        students[1] = piotr;
        students[2] = lena;

        for (int i=0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajImie();
            students[i].podajNrIndeksu();
            students[i].podajEmail();
            students[i].zalogujSie();
        }

        /* dodatkowe
        //String to tez klasa; Ctrl + najechac myszka -> przekierowanie do klasy String
        String imie;
        //String imie = "Kasia";
        imie.strip();
        Scanner scanner = new Scanner(System.in);
                 */

    }

}
