package Class5;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
    /*
    Scanner => is a non-primative data type
    scan => just as variable name
    =simply the assignment operator
    new Scanner(System.in) => creates an object of the scanner class.
  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (age > 18) {
            System.out.println("You can vote");

        } else {
            System.out.println("Go play nintendo, kid.");

        }

    }
}
