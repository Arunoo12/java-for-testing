public class occuranceOfCharacterInString {
    public static void main(String[] args) {
        // count occurances of a charcater in a string
        String s = "weelcome";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }
            }
            System.out.println("character is " + ch + " and the count is " + count);
        }
    }
}
