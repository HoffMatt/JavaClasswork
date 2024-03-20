package Class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("We can issue you your driver's license today");
        } else {
            System.out.println("We can only issue you a permit today");

        }

    }
}
