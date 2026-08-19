package Inheritance;

// one parent can have multiple child
class parent { // parent

    void displayName() {
        System.out.println("parent");
    }
}

class child extends parent { // child

    void displayName() {
        System.out.println("child");
        // System.out.println(a);
    }
}

class child1 extends parent {

    void displayName2() {
        System.out.println("child1");
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        child1 c1 = new child1();
        child c = new child();
        // what does child has
        // c.displayName(null);
        c.displayName();
        c.displayName();
        c1.displayName();
        c1.displayName2();
    }
}
