public class constructorInJava {
    // const is just meant to var initialization only
    int no;
    String name;

    void display() {
        System.out.println(no + " " + name + " ");
    }

    // here the constructor enters
    // same name as class
    constructorInJava(int noo, String name1) {
        no = noo;
        name = name1;
    }
}
