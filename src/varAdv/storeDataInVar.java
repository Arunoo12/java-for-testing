package varAdv;

public class storeDataInVar {
    // approach 1 - obj ref approach done previously not repeating
    // approach 2 - multiple methods
    int sid;
    String sname;
    char grad;

    void displaydata() {
        System.out.println(sid + " " + sname + " " + grad + " ");
    }

    void setDataToVar(int id, String name, char gr) {
        sname = name;
        sid = id;
        grad = gr;
    }
}
