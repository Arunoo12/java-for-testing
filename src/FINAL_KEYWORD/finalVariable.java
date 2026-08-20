package FINAL_KEYWORD;

class a {
     final String s = "final keyword";
}

public class finalVariable {
    public static void main(String[] args) {

        a obj = new a();
        // obj.s = "changed"; // after putting final you cannot change value of variable
        System.out.println(obj.s); // final keyword

    }
}
