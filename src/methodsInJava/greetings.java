package methodsInJava;

// import java.util.jar.Attributes.Name;

public class greetings {
    // here we will write only methods
    // 1- no parameter(args) no return value
    void m1() {
        System.out.println("good morning");
    }

    // 2 no parameter return value
    String m2() {
        return ("check return");
    }

    // 3 takes parameters but no return value
    // NOTE : no return value means we can only print something if we wants
    void m3(String name) {
        System.out.println("HELLO MR. " + name);
    }

    // 4 takes parameter and returns value
    String m4(String name) {
        return ("this is the name of client " + name);
    }
}
