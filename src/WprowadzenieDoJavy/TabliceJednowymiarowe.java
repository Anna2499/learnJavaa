package WprowadzenieDoJavy;

//przyklad
//struktory, ktore potrzebuja gromadzic wieksza ilosc danych
public class TabliceJednowymiarowe {

    public static void  main(String[] args) {
        String[] winterMonths = new String[3];
        winterMonths[0] = "grudzien";
        winterMonths[1] = "styczen";
        winterMonths[2] = "luty";

        //inny sposob definiowania tablicy
        int[] numbers = new int[] {1, 4, 6};

        //odwoluwanie sie do konkretnych elementow
        System.out.println(winterMonths[0]);
        System.out.println(winterMonths[1]);
        System.out.println(winterMonths[2]);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //mierzenie dlugosci tablicy
        System.out.println(winterMonths.length);

        winterMonths[2] = "marzec";

        //iterowanie tablicy
        for (int i=0; i < winterMonths.length;i++)
        {
            System.out.println(winterMonths[i]);
        }
        winterMonths[4] = "marzec";

    }

}
