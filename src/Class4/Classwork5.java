package Class4;

public class Classwork5 {
    public static void main(String[] args) {

        double mRate=3.8;
        double mPrice=100001;
        if(mRate<4.5){
            System.out.println("Will buy a home");
            if (mPrice> 100000){
                System.out.println("I'm taking a loan");
            }else{
                System.out.println("Let's pay with cash");
            }

        }else{
            System.out.println("Guess i'm still renting");
        }
    }
}
