public class revStringA2 {
    public static void main(String[] args) {
        String word = "java";
        String rev = "";
        // now convert into a char array
        char a[] = word.toCharArray();
        // System.out.println(a.indexOf('j'));
        for (int i = a.length - 1; i >= 0; i--) {
            rev = rev + a[i];
        }
        System.out.println(rev);
    }
}
