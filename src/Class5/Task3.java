package Class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What city do you live in?");
        String city=scanner.nextLine();
        System.out.println("What is the temperature in Fahrenheit?");
        double temp1=scanner.nextDouble();
        double temp2=(((temp1-32)*5)/9);

        System.out.println("The Current temperature in "+city+" is "+temp2+" celcius.");
    }
}
