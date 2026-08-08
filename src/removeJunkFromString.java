public class removeJunkFromString {
    public static void main(String[] args) {
        // remove junk and special char from a string
        String s = "we@#$%^lcome";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char Character = s.charAt(i);
            if ((Character >= 'a' && Character <= 'z') || (Character >= 'A' && Character <= 'Z')
                    || (Character >= '0' && Character <= '9')) {
                result = result + Character;
            }
        }
        System.out.println(result);
    }
}
