package BasicElementsOfJava;

//import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.pow;

public class Main {
    public static void main(String[] args) {


    // TYPY:
        // konwersja typów numerycznych:
        int liczbaInt = 5;
        double liczbaDouble = liczbaInt;

        System.out.println(liczbaInt);
        System.out.println(liczbaDouble);

        //rzutowanie:
        liczbaDouble = 3.999;
        //liczbaInt = liczbaDouble; - błędny zapis (należy podać typ na który chcemy rzutować w nawiasach przed nazwą zmiennej)
        liczbaInt = (int) liczbaDouble;
        System.out.println(liczbaInt);

        liczbaInt = 300;
        byte liczbaByte = (byte) liczbaInt;
        System.out.println(liczbaByte);


        System.out.println("------------------");

    //ŁAŃCUCHY:
        //współrzędne kodowe znaków:
        String greetings = "Cześć!";
        int n = greetings.length();
//        int index = greetings.offsetByCodePoints(0, 3);
//        int cp = greetings.codePointAt(index);
//        System.out.println(cp);


        // substring/podłańcuchy:
        String czesc = "Cześć Aniu!";
        String substring = czesc.substring(5); //podłańcuch zaczynający się od 5 pozycji, z 5 łącznie - w tym przypadku spacją (też liczona jako znak)
        System.out.println(substring);

        String s = czesc.substring(0, 3);  //podłanczuc od indexu 0 do 3, nie wliczając 3 -> "Cze"
        System.out.println(s);


        //  klasa StringBuilder:
        StringBuilder builder = new StringBuilder();
        char letter = 'A';
        String word = "nianiasek";
        builder.append(letter);
        builder.append(word);
        String completedString = builder.toString();
        System.out.println(completedString);

        System.out.println("---------");

    //PĘTLA FOR:
        List<String> slowa = new ArrayList<>();
        slowa.add("siema");
        slowa.add("no elo");
        slowa.add("czesc");

        for (String nazwa : slowa) {
            System.out.println(nazwa);
        }

        for (int k = 0; slowa.size() > 0 ;) {
            String st = slowa.get(k);
            System.out.println(s);
            slowa.remove(k);
        }

        //switch:
        int number = 7;

        switch (number) {
            case 1:
                System.out.println("Jestem w 1");
                break;
            case 2:
                System.out.println("Jestem w 2");
                break;
            case 3:
                System.out.println("Jestem w 3");
                break;
            default:
                System.out.println("Jakaś dziwna ta liczba");
        }

        //break:
        int liczba1 = 0;
        int liczba2 = 0;

        while (liczba1 < 5) {
            while (liczba2 < 5) {
                if (liczba2 == 3) break;
                System.out.println(liczba2);
                liczba2++;
            }
            System.out.println(liczba1);
            liczba1++;
        }

        //continue:
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;
            System.out.println("i: " + i);
        }

        int[] a = new int[10];

        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        a[6] = 6;
        a[7] = 7;
        a[8] = 8;
        a[9] = 9;
        a[10] = 10;

        for (int element : a) {
            System.out.println(element);
        }

        //double pow = Math.pow(2,2);
        double pow = pow(2,2);
    }

}
