package SUPER_KEYWORD;

class A {

    int x = 10;

    // Parent constructor
    A() {
        System.out.println("A constructor");
    }

    // Parent method
    void m1() {
        System.out.println("Method of A");
    }
}

class B extends A {

    int x = 20;

    // Child constructor
    B() {
        super(); // 1. Calls parent constructor
        System.out.println("B constructor");
    }

    void m1() {

        System.out.println(x); // B's variable
        System.out.println(super.x); // 2. A's variable

        System.out.println("Method of B");

        super.m1(); // 3. Calls A's method
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        B obj = new B();

        obj.m1();
    }
}