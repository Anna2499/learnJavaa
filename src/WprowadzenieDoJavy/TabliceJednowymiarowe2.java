package WprowadzenieDoJavy;

public class TabliceJednowymiarowe2 {

    public static void  main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Anka";
        imiona[1] = "Bartek";
        imiona[2] = "Piotr";

/*        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);
*/

     //drugi sposob deklaracji tablicy
        int[] lottoNumbers = new int[] {1, 2, 3, 4, 5, 6};
 /*       System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);
*/
        //dlugosc tablicy
        System.out.println(lottoNumbers.length);

        //wypisanie wartosci za pomoca petli for
        for (int i=0; i< imiona.length; i++) {
            System.out.println(imiona[i]);
        }

    }
}
