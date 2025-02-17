package BATCH22Project1;

public class DublicateArray {
    public static void main(String[] args) {

        int [] original= {1, 2, 3, 4, 5, 6,7};
        int [] duplicate=new int[original.length];
        for (int i=0; i<original.length; i++){

            duplicate[i]=original[i];
            System.out.println(i);
        }

    }
}
