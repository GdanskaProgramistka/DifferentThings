package ListOfLists;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {

    List<List<String>> animal;
    List<String> dog;
    List<String> cat;
    List<String> hamster;

    public AnimalList(int size) {
        this.animal = new ArrayList<>();
        this.dog = new ArrayList<>();
        this.cat = new ArrayList<>();
        this.hamster = new ArrayList<>();

        dog.add("Azor");
        dog.add("Kiel");
        dog.add("Wena");

        cat.add("Puszek");
        cat.add("Brzuszek");
        cat.add("Siersciuch");

        hamster.add("Chrupek");
        hamster.add("Bobek");
        hamster.add("Dyzio");

        animal.add(dog);
        animal.add(cat);
        animal.add(hamster);

        System.out.println(animal);


        /*for (int i = 0; i < animal.size(); i++) {
            for (int j = 0; j < animal.get(i).size(); j++) {
                System.out.print(animal.get(i).get(j));
            }
            System.out.println();
        }*/
    }
}
