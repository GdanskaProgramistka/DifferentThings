package ListOfLists;

import java.sql.SQLOutput;

public class Mian {
    public static void main(String[] args) {
        //AnimalList animalList = new AnimalList(4);
        //System.out.println(animalList);

        XOList board = new XOList(4);
        System.out.println(board);

        //StringBuilder operation:
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());

        for(int j = 5; j < 10; j++) {
            stringBuilder.append(j);
        }
        System.out.println(stringBuilder.toString());

        String greeting = "Cześć";
        greeting = greeting.substring(0,3) + "kaj";
        System.out.println(greeting);
        greeting = greeting.substring(0,6) + "ta";
        System.out.println(greeting);

        System.out.println(6 < 2);

        int liczbaInt = 5;
        double liczbaDouble = liczbaInt;

        System.out.println(liczbaInt);
        System.out.println(liczbaDouble);


    }
}
