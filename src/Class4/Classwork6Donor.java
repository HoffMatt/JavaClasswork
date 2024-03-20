package Class4;

public class Classwork6Donor {
    public static void main(String[] args) {
        int age=19;
        int weight=111;
        if(age>=18){
            System.out.println("You are old enough to donate blood");
            if(weight>=110){
                System.out.println("and you are a healthy enough weight to do so");
            }
        }else{
            System.out.println("You are ineligible to donate");
        }
    }
}
