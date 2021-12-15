package ProgrmowanieObiektowe;

public class KlasyMetody {

    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzSumeod0do100();
//        int result = metody.policzSumeod0do100v2();
//        int resultt = result *2;
//        System.out.println("Podwojony wynik sumy to: " +resultt);
        metody.policzSumeParam(83);
        metody.policzSumeParam(10);
        metody.policzSumeParam(245);

        metody.add(2, 3);
    }

}
