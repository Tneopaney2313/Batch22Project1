package BATCH22Project1;

import java.lang.reflect.Array;

public class secondLargestNumber {
    public static void main(String[] args) {

        int[] num = {12, 92, 17, 68, 23, 30, 37, 79, 7};

        int largest;
        int secondLargest;

        if (num[0]>num[1]) {
            largest = num[0];
            secondLargest=num[1];
        }else{
            largest= num[1];
            secondLargest=num[0];
        }

        for (int i=2; i<num.length; i++) {

            if (num[i]>largest) {
                secondLargest = largest;
                largest = num[i];

            }else if (num[i]>secondLargest){
                secondLargest=num[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}

