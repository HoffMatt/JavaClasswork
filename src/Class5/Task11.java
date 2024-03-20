package Class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the name of your country");
        String country=scanner.nextLine();

        switch (country){
            case "USA":
                System.out.println("We speak English");
                break;
            case "Spain":
                System.out.println("We speak Spanish");
                break;
            case "Russia":
                System.out.println("We speak Russian");
                break;
            case "Egypt":
                System.out.println("We speak Arabic");
                break;
            case "Brazil":
                System.out.println("We speak portuguese");
                break;
            default:
                System.out.println("Country not supported");




        }
    }
}
