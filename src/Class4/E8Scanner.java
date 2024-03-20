package Class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your Age");
        int age=scan.nextInt();
        System.out.println("Please Enter your salary");
        double salary=scan.nextDouble();
        System.out.println("Please Enter your name");
        String name=scan.next();
        System.out.println("My name is "+name+" My age is "+age+ "and i earn "+salary+" Shekles per year");
    }
}
