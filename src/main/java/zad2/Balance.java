package zad2;

public class Balance {
    private int leftWeight;
    private int rightWeight;

    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }

    public void addLeft(int weight) {
        if (weight > 0) {
            leftWeight += weight;
        } else {
            System.out.println("Вес должен быть положительным числом.");
        }
    }

    public void addRight(int weight) {
        if (weight > 0) {
            rightWeight += weight;
        } else {
            System.out.println("Вес должен быть положительным числом.");
        }
    }

    public void result() {
        if (leftWeight == rightWeight) {
            System.out.println("=");
        } else if (leftWeight > rightWeight) {
            System.out.println("L");
        } else {
            System.out.println("R");
        }
    }
}
