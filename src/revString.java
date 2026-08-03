public class revString {
    public static void main(String[] args) {
        String name = "Toyota";
        String reverseString = ""; // this is empty at first
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i)); // this will show what character is at the current index (i) value
            reverseString = reverseString + name.charAt(i); // this will add characters to a new variable
        }
        System.out.println(reverseString); // shows the final output s
    }
}
