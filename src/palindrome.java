public class palindrome {
    public static void main(String args[]) {
        // check string is palindrome or not
        String s = "MADAM";
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            // System.out.println(s.charAt(i));
            s1 = s1 + s.charAt(i);
        }
        // System.out.println(s1);
        if (s.equals(s1)) {
            System.out.println("The String is a Palindrome");
            // System.out.println(s.equals(s1));
            // System.out.println(s1 == s);
            // System.out.println(s.getClass().getSimpleName()); // to get the type of
            // variable
            // System.out.println(s1.getClass().getSimpleName());
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
