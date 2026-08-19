package THIS;
public class thisKeyword {
    // this is used to differentitate btw local variable and class variable
    int x, y;

    // constuctor
    thisKeyword(int x, int y) {
        /*
         * here the difference btw the x which is parameter of constructor and x which
         * is variable of the class is this
         * this .x stats that this is the varibale whcih is pointing at class var and
         * the normal x pointing at the parameter
         */
        this.x = x;
        this.y = y;

    }

    // method
    void display() {
        System.out.println("x :- " + x);
        System.out.println("y :- " + y);
    }

    public static void main(String[] args) {
        // create a obj
        thisKeyword thisExample = new thisKeyword(100, 50);
        // use method to show output
        thisExample.display(); // 100 and 50
    }
}
