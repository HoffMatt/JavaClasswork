package Class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();
        System.out.println("please enter your full name");
        scanner.nextLine();
        String fullName=scanner.nextLine();
        System.out.println("Your name is "+fullName+" and you are "+age+" years old");

    }
}
