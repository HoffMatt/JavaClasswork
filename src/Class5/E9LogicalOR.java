package Class5;

public class E9LogicalOR {
    public static void main(String[] args) {


        double bankbalance=50000;
        double cash=40000;

        if(bankbalance>30000 ||cash>30000){
            System.out.println("I can go buy Corolla");
        }else{
            System.out.println("I need to save more");
        }
    }
}
