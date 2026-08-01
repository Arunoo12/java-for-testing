import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // to define a array
        int[] numbers = { 1, 2, 3, 4, 6 };
        // access elemnt in array (index method)
        System.out.println(numbers[1]);
        // change element in array
        numbers[0] = 80;
        System.out.println("initial value 1 after chnages = " + numbers[0]);
        // new keyword
        // you can use new key word to define a empty array with a specific no. of
        // storage limit
        int[] demoOfNew = new int[] { 1, 2, 3, 4, 5 };
        // demoOfNew = new int[] ;
        // System.out.println(Array.isEmpty(demoOfNew));
        if (demoOfNew.length == 0) {
            System.out.println("array is empty");
        } else {
            System.out.println("not empty" + Arrays.toString(demoOfNew));
        }
    }
}