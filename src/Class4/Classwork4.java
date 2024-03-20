package Class4;

import javax.sound.midi.Soundbank;

public class Classwork4 {


    public static void main(String[] args) {

        boolean degree = true;
        double gpa = 3.5;
        if (degree) {
            System.out.println("congrats");
            if (gpa >= 3.5) {
                System.out.println("You are eligible for a scholarship");
            } else {
                System.out.println("You should have studied harder");
            }

        }else{
            System.out.println("you should get a degree");
        }
    }
}