package Class5;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade:");
        char grade = scan.next().toLowerCase().charAt(0);

        switch (grade) {
            case 'a':
                System.out.println("A - Excellent");
                break;
            case 'b':
                System.out.println("B- Good");
                break;
            case 'c':
                System.out.println("C- Average");
                break;
            case 'd':
                System.out.println("D - Bad");
                break;
            case 'f':
                System.out.println("F -Fail");
                break;
            default:
                System.out.println("not a letter grade");

        }
    }
}