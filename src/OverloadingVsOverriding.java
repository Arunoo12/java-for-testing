class ABC {
    void m1(int a) {
        System.out.println(a);
    }

    void m2(int b) {
        System.out.println(b);
    }
}

class XYZ extends ABC {
    @Override
    void m1(int a) {
        System.out.println(a * a); // overriding
    }

    void m2(double c) {
        System.out.println(c); // overloading
    }
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        XYZ xyzobj = new XYZ();
        xyzobj.m1(109); // overrided obj
        xyzobj.m2(200); // overloaded obj
        xyzobj.m2(20.5); // overloaded obj


    }
}
