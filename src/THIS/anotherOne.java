package THIS;

public class anotherOne {
    int x, y;
    // method

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void display() {
        System.out.println("x :- " + x);
        System.out.println("y :- " + y);
    }

    public static void main(String[] args) {
        // obj
        anotherOne values = new anotherOne();
        values.setX(89);
        values.setY(69);
        values.display();
    }
}
