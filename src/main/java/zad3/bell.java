package zad3;

public class bell {

    private boolean isDing;

    public bell() {
        this.isDing = true;
    }

    public void sound() {
        if (isDing) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        isDing = !isDing;
    }
}
