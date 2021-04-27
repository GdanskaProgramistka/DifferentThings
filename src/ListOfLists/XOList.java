package ListOfLists;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XOList {

    List<List<String>> rows;
    List<String> column;

    public XOList(int size) {
        this.rows = new ArrayList<>();
        this.column = new ArrayList<>();

        column = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                column.add("| |");
                System.out.print(column.get(j));
            }
            rows.add(column);
            column = new ArrayList<>();
            System.out.println();
        }
    }
}
//
//    public boolean set (int position, String symbol) {
//        if (x < 0 || y < 0 || x > rows.size() - 1 || y > rows.size() - 1) {
//            return false;
//        } else {
//            column.set(position, symbol);
//            return true;
//        }
//    }
