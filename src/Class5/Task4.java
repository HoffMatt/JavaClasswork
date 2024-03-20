package Class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is this statement true or false?");
        System.out.println("I presently possess a credit card");
        boolean card = scanner.nextBoolean();
        if (card){
            System.out.println("What is your credit card balance?");
            double sum = scanner.nextDouble();
            if (sum >= 1000) {
                System.out.println("Kindly pay off your balance immediately");
            } else {
                System.out.println("You can continue to spend");
            }
        } else{
            System.out.println("You are welcome to apply for a card");
        }


    }
}
