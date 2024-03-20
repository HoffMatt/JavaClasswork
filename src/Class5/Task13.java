package Class5;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Calcultron \uD83E\uDD16 ");
        System.out.println("please enter the first digit");
        double num1= scanner.nextDouble();
        System.out.println("please enter the second digit");
        double num2= scanner.nextDouble();
        System.out.println("please enter an Arithmetic operation");
        char operator=scanner.next().charAt(0);
        double result=0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                result = num1 / num2;

                break;

            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);

    }
}
