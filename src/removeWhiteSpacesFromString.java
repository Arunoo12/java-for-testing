public class removeWhiteSpacesFromString {
    public static void main(String[] args) {
        // remove white spaces from String
        String s = "wel come";
        // System.out.println(s.trim());
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(i);
            char ch = s.charAt(i);
            System.out.println(ch);
            if (ch >= 'a' && ch <= 'z') {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
