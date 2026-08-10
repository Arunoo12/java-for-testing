package methodsInJava;

public class greetingsMain {
    // here we will execute the methods
    public static void main(String[] args) {
        // create a obj first
        greetings msg = new greetings();
        // 1
        msg.m1();
        // 2
        // msg.m2();
        // so when we need to see the return value of any method we need to store it in
        // a variable
        String s = msg.m2();
        System.out.println(s);
        // 3
        msg.m3("arun");
        // 4
        String s1 = msg.m4("anonymus");
        System.out.println(s1);

    }
}
