package Class7;

public class Task7 {
    //form an array of integer elements find the largest number
    public static void main(String[] args) {
        int [] arr={5,10,500,20,30};
        int max = arr[0];

        for (int i=1; i <arr.length; i++){
            if (arr[i]>max){
    max = arr[i];
            }
            }
        System.out.println("The largest number in the array is: "+ max);
    }
    }



