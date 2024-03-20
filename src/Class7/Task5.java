package Class7;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {14, 900, 21, 500, 5};
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
            if (num > 30) {
                System.out.println(num);}

        }
    }
}