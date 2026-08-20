package FINAL_KEYWORD;

final class one extends two {
    // sun.font
    int a = 6000;

    void displayValue() {
        System.out.println(a);
        System.out.println(a + b);
    }
}

class two {
    int b = 3000;

}

public class finalClass {
    public static void main(String[] args) {
        // here when i write final before class one then we cannot extend class to any
        // class beacuse its the final one now
        // so if you want to inherit then do it in reverse form inherit another class to
        // one
        one o = new one();
        o.displayValue();
    }
}
