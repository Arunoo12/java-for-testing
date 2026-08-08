public class StringComparison {
    public static void main(String[] args) {
        /*
         * string comparisson
         * 1. == VS equals()
         */

        // summary : the only diff btw these are == this compares the object and
        // equals() this compares the value of object
        // case 1
        String s = "welcome";
        String s1 = "welcome";
        System.out.println(s == s1); // true (bcuz value is same)
        System.out.println(s.equals(s1)); // true (bcuz value is same)
        // note: both are true because these both are simple string not and object and
        // this vcompares vlaues
        // declaration so it will show true
        // case 2
        String s2 = new String("welcome");
        String s3 = new String("welcome");
        System.out.println(s2 == s3); // false (bcuz obj is diff)
        System.out.println(s2.equals(s3)); // true (bcuz value is same)
        // case 3
        System.out.println(s == s3); // false (bcuz obj different)
        System.out.println(s.equals(s3)); // true (bcuz value is same)
        // case 4
        String s4 = "welcome";
        String s5 = new String("welcome");
        String s6 = s5;
        System.out.println(s4 == s6); // false (bcuz obj different)
        System.out.println(s4.equals(s6)); // true (bcuz value is same)

    }
}
