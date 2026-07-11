public class AssignmentLoop {
    public static void main(String[] args) {

        // reverse a no. using % , / input is 12345 output should be 54321
        int input = 12345;
        int rev = 0;
        while (input != 0) {
            int lastDigit = input % 10; // this will take last digit
            rev = rev * 10 + lastDigit; // this will add last digit to a new var
            input = input / 10; // this will remove last digit from input after operation
        }
        System.out.println("input is " + 12345 + " reversed input is " + rev);
    }
}
