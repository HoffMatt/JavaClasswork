package Class3;

public class TemperatureCheck {
    public static void main(String[] args) {
        double temp=40;
        if(temp<32)
            System.out.println("The water will freeze with temperature "+temp);
        else{
            System.out.println("The water will NOT freeze with temperature "+temp);
        }
    }
}
