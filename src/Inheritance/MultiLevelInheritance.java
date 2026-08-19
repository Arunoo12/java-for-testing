package Inheritance;

class C { // parent
    int c;

    void display() {
        System.out.println(c);
    }
}

class D extends C { // child
    int d;

    void show() {
        System.out.println( d);
        // System.out.println(a);
    }
}

class E extends D {
    int e;

    void print() {
        System.out.println(e);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        E obj = new E();
        // assigning values to variables
        obj.c = 100;
        obj.d = 200;
        obj.e = 300;
        obj.show();
        obj.display();
        obj.print();
    }
}
