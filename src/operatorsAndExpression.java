public class operatorsAndExpression {
    public static void main(String[] args) {
        // Arthematic Operators + - `* / %
        // Relational Operators < > <= >= == !=
        // Logical Operators && || !
        // increment and decrement operators ++ --
        // assignment operators = += -= *= /= %=
        // Bitwise operators & | ^ ~ << >> >>>
        // conditional operators ? :
        /*
         * --------------------------------
         * x y x&&y x||y !x !y
         * --------------------------------
         * t t t t f f f f
         * --------------------------------
         * t f f t f t
         * ---------------------------------
         * f t f t t f t
         * ---------------------------------
         * f f f f t t t
         * ----------------------------------
         */
        // swap two numbers using third variable
        int a = 10, b = 20, c;
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
