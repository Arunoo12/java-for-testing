public class Condtionals {
    public static void main(String[] args) {
        /*
         * Here we will talk about conditionals in java .
         * there are several conditional statements in java :- if, if else , nested if
         * else , switch case
         */
        // int a = 90;
        // int reminder = a % 2;
        // if (a == 10) {
        // System.out.println("if is working and a=10");
        // }
        // if (a == 10) {
        // System.out.println("a matches a=10 ps: this is if statement"); // working
        // } else {
        // System.out.println("a does not match ps: this is else statement"); // working
        // }
        // System.out.println(a%2);

        // ODD EVEN FINDER
        // if (reminder==0) {
        // System.out.println("the given number "+a+ " is even");
        // } else {
        // System.out.println("the given number " + a+ " is odd");
        // }

        // positive,negative,number identifier
        // if (a > 0) {
        // System.out.println("no. is positive"); // working

        // } else if (a < 0) {
        // System.out.println("no. is negative"); // working
        // } else {
        // System.out.println("no. is zero"); // working
        // }

        // largest no, to find

        // double a = 100.1, b = 100.3, c = 100.12;
        // if (a > b && a > c) {
        // System.out.println("a is the largest no. " + a);
        // } else if (b > a && b > c) {
        // System.out.println("b is the largest no. " + b);
        // } else if (c > a && c > b) {
        // System.out.println("c is the largest no. " + c);
        // }

        // SWITCH CASE
        // String weekno = "arun";
        int weekno = 1;

        switch (weekno) {
            // case "arun":
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid weekno.");

        }

    }

}
