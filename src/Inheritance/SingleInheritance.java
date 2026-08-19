package Inheritance;

class A { // parent
    int a = 100;

    void display() {
        System.out.println(a);
    }
}

class B extends A { // child
    int b = 200;

    void show() {
        System.out.println(b);
        // System.out.println(a);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // because of extends keyword
        obj.show();
    }
}
