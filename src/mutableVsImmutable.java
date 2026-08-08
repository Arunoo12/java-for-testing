import java.util.Arrays;

public class mutableVsImmutable {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 5, 7, 4, 9 };
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        /*
         * note : arays is mutable because the value between sorted array and original
         * array is diff
         */
        String s = "welcome";
        System.out.println(s); // welcome
        s.concat("java");
        System.out.println(s); // welcome
        /*
         * note : its immutable because the value of string does not changed after
         * concat method
         */

        // String Builder
        StringBuilder s1 = new StringBuilder("welcome");
        System.out.println(s1);// welcome
        s1.append("java");
        System.out.println(s1); // welcome java
        /* note : it means string builder is mutable (changable) */

        // String Buffer
        StringBuffer s2 = new StringBuffer("arun");
        System.out.println(s2);// arun
        s2.append("singh");
        System.out.println(s2); // arun singh
        /* note : it means string buffer is mutable (changable) */
    }

}
