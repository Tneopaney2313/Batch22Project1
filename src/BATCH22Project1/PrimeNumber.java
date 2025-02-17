package BATCH22Project1;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        boolean input=false;

        if (num == 0 || num == 1) {
            input = true;
        }

        for (int i = 2; i <= num / 2; ++i) {

            // condition for nonprime number
            if (num % i == 0) {
                input = true;
                break;
            }
        }

        if (!input)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        scan.close();
        }


    }



