public class CountWordInString {
    public static void main(String[] args) {
        // count words in a string
        String name = "i am learning java second time";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("count is " + (count + 1));
    }
}
