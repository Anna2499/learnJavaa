// blok ktory zawiera jakies instrukcje
// moze byc uruchomiaiona (wywolana) poprzez odwolanie sie do nazwy()

//zdefiniowanie metody
// Dodaje liczby od 0 do 100

package ProgrmowanieObiektowe;

    public class Metody {

        public void policzSumeod0do100() {
            int result = 0;
            for (int i = 0; i < 100; i++) {
                result = result + i;
            }
            System.out.println("Wartosc to: " + result);
        }


        public int policzSumeod0do100v2() {
            int result = 0;
            for (int i = 0; i < 100; i++) {
                result = result + i;
            }
            System.out.println("Wartosc to: " + result);
            return result;
        }


        public void policzSumeParam(int number) {
            System.out.println("Number ma wartosc: " + number);
            int result = 0;
            for (int i = 0; i < number; i++) {
                result = result + i;
            }
            System.out.println("Wartosc to: " + result);
        }

        public void add(int firstNumber, int secondNumber) {
            System.out.println("Suma to: " + (firstNumber + secondNumber));
        }
    }


