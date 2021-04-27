package BasicElementsOfJava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę większą od 1. Sprawdzimy czy podana liczba jest liczbą pierwszą.");

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double liczba;
        double dzielnik = 2;
        double resztaZDzielenia;

        for (liczba = x; dzielnik > 1 && dzielnik < x; dzielnik++) {
            resztaZDzielenia = liczba % dzielnik;

            if (resztaZDzielenia == 0) {
                System.out.println("Podana liczba NIE JEST liczbą pierwszą");
                return;
            }
        }
        System.out.println("Podana liczba JEST liczbą pierwszą");
    }
}
