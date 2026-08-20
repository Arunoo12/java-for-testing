package FINAL_KEYWORD;

class Arun {
    final void m1() {
        System.out.println("class name is A");

    }
}

class Box extends Arun {
    // @Override
    // void m1() {
    // System.out.println("hey its changed"); // now it will not change because of
    // final keyword
}

public class finalMethod {
    public static void main(String[] args) {
        Box obj = new Box();
        obj.m1();
    }
}
