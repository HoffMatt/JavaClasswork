package Class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter person's height in inches");
        double height=scanner.nextDouble();

        if(height<60){
            System.out.println("Manlet detected");
        }else if(height >=60 && height <=72){
            System.out.println("You are normal");
        }else{
            System.out.println("Lanklett detected");
        }
    }
}
