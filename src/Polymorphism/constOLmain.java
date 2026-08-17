package Polymorphism;

public class constOLmain {
    public static void main(String[] args) {
        // create a obj for method
        constOL obj = new constOL();
        System.out.println(obj.volume1());
        constOL obj1 = new constOL(1, 2.4, 4);
        System.out.println(obj1.volume1());
        constOL obj2 = new constOL(2.2, 3.3, 4.4);
        System.out.println(obj2.volume1());

    }
}
