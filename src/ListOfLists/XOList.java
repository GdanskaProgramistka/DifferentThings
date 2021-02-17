package ListOfLists;


import java.util.ArrayList;
import java.util.List;

public class XOList {

    List<List<String>> rows;
    List<String> column;

    public XOList(int size) {
        this.rows = new ArrayList<>();
        this.column = new ArrayList<>();

        column = new ArrayList<>();
        column.add("| |");
        rows.add(column);


        for (int i = 0; i < size; i++) {
            rows.add(column);
            for (int j = 0; j < size; j++) {
                column.add("| |");
                System.out.print(rows.get(i).get(j));
            }
            System.out.println();
        }
    }
}
