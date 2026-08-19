package STATIC;

public class staticKeyword {
    static int a = 10;
    int b = 29;

    static void m1() {
        System.out.println("this is m1 static...");
    }

    void m2() {
        System.out.println(a);
        System.out.println(b);
        System.out.println("this is m2 non-static...");
    }

    // public static void main(String[] args) {
    //     // this can acess static method and var without obj because its also static
    //     System.out.println(a);
    //     m1();
    //     // non static method can access everything without any restrictions
    //     staticKeyword s1 = new staticKeyword();
    //     s1.m2();
    // }
}
