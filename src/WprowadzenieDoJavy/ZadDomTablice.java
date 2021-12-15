package WprowadzenieDoJavy;

public class ZadDomTablice {

/*// Wypisz liczby z zakresu 1-100 podzielne przez 3
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Jestem podzielna przez 3: " + i);
            }
        }
    }
 */

    // Odwroc elementy tablicy [1, 3,5] -> [5, 3, 1]
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7, 9};

        for (int i = 0; i < ((numbers.length) / 2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
            //System.out.println(temp);
        }

        for (int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}