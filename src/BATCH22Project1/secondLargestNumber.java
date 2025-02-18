package BATCH22Project1;

import java.lang.reflect.Array;

public class secondLargestNumber {
    public static void main(String[] args) {

        int[] num = {12, 92, 17, 68, 23, 30, 37, 79, 7};

        int largest = num[0];
        int secondLargest = num[0];

        for (int n : num) {
            if (n < largest) {
                secondLargest = largest;
                largest = n;

                System.out.println(n);

            }
           /* if (n < min){
                min=n;

            }

        }
        System.out.println("Max num: " + max);
        System.out.println("Min Num: " + min);

            */

        }
    }
}

