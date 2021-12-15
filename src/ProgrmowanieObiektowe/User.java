package ProgrmowanieObiektowe;

public class User {
    public String username;
    public String password;

    //jesli tworzymy drugi konstrukato o tej samej nazwie, to ten domyslny musimy zapisac pusty
    public User() {

    }

    //konstruktor domyslny; bez return; metoda zostanie automatyznie wykonana
    public User(String username, String password) {
        System.out.println("Hello z konstruktora");
        //odwolanie do nowotworzongo obiektu jak nawzy sa takie same
        this.username = username;
        this.password = password;
        //po prostu przypisanie wartosci
       // username = user;
        //password = pass;
    }

    public void sayHello() {
        System.out.println("Hello my name is " + username);
    }

}
