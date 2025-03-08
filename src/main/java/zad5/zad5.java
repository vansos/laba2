package zad5;

public class zad5 {
    public static void main(String[] args) {
        Table table = new Table(3, 4);

        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(0, 3, 4);

        table.setValue(1, 0, 5);
        table.setValue(1, 1, 6);
        table.setValue(1, 2, 7);
        table.setValue(1, 3, 8);

        table.setValue(2, 0, 9);
        table.setValue(2, 1, 10);
        table.setValue(2, 2, 11);
        table.setValue(2, 3, 12);

        System.out.println("Table:");
        System.out.println(table);

        System.out.println("Arithmetic mean: " + table.average());
    }
}
