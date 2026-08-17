package Polymorphism;

public class constOL {
    // basics of constructor is it should not return anything it is only for
    // initialization
    // name of const should be same as class
    double w, h, d;

    constOL() {
        w = 0;
        h = 0;
        d = 0;
    }

    constOL(double x, double y, double z) {
        w = x;
        h = y;
        d = z;
    }

    constOL(int x, double y, int z) {
        w = x;
        h = y;
        d = z;
    }

    double volume1() {
        return (w * h * d);
    }

}
