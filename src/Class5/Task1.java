package Class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the loan amount you would like to borrow:");
        double loan=scanner.nextDouble();
        if(loan <= 200000){
            ;
            System.out.println("we can lend you this amount");
        }else{
            System.out.println(" we cannot lend you this amount");
        }
    }
}
