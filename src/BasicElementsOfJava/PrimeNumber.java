package BasicElementsOfJava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę większą od 1. Sprawdzimy czy podana liczba jest liczbą pierwszą.");

        Scanner in = new Scanner(System.in);
        double liczba = in.nextDouble();
        double dzielnik;
        double resztaZDzielenia;

        for (dzielnik = 2; dzielnik > 1 && dzielnik < liczba; dzielnik++) {
            resztaZDzielenia = liczba % dzielnik;

            if (resztaZDzielenia == 0) {
                System.out.println("Podana liczba NIE JEST liczbą pierwszą");
                return;
            }
        }
        System.out.println("Podana liczba JEST liczbą pierwszą");
    }
}
