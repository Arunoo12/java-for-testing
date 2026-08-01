public class loopThroughArray {
    public static void main(String[] args) {
        // itterate loops through array
        // for loop
        String[] demoArray = { "a", "b", "c", "x", "d", "f" };
        String concat = "";
        for (int i = 0; i < demoArray.length; i++) {
            System.out.println(demoArray[i]);
            concat = concat + demoArray[i];
        }
        System.out.println(concat);
        // String some="";
        for (String i : demoArray) {
            System.out.println(i);
        }

/*When should you use each loop?
Task	Use for-each?
Read elements	✅ Yes
Print elements	✅ Yes
Compute sum/max/min	✅ Yes
Search for an element	✅ Yes
Modify array/list elements	❌ No (use an index-based for loop or methods like replaceAll())*/

    }
}
