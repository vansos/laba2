package zad4;

public class zad4 {
    public static void main(String[] args) {
        OddEvenSeparator separator = new OddEvenSeparator();

        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);

        separator.even();
        separator.odd();
    }
}

