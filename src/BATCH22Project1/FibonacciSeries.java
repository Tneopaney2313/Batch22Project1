package BATCH22Project1;

public class FibonacciSeries {
    public static void main(String[] args) {

        int num=10;
        int firstNum=0;
        int secondNum=1;
        System.out.println("First 10 Fibonacci numbers: ");
        for (int i=1; i<=num; i++){
            System.out.print(firstNum + " ");
            int next= firstNum + secondNum;
            // now second num act as first num and so on
            firstNum = secondNum;
            secondNum = next;



        }



    }




}
