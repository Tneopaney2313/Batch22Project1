package BATCH22Project1;

public class MaxAndMinArray {
    public static void main(String[] args) {

        int [] num= {12, 92, 17, 68, 23, 30, 37, 79, 7};
        int max=num[0];
        int min=num[0];

        for (int n:num){
            if (n > max){
                max=n;

            }
            if (n < min){
                min=n;

            }

        }
        System.out.println("Max num: " + max);
        System.out.println("Min Num: " + min);

    }
}
