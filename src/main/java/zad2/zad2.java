package zad2;

public class zad2 {
    public static void main(String[] args) {
        Balance balance = new Balance();

        balance.addLeft(5);
        balance.addRight(3);

        balance.result();

        balance.addRight(2);

        balance.result();

        balance.addLeft(4);

        balance.result();

        balance.addRight(5);

        balance.result();
    }
}
