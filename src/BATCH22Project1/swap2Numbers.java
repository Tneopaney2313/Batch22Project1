package BATCH22Project1;

public class swap2Numbers {

    public static void main(String[] args) {

        int a=11;
        int b =19;
        System.out.println("Before Swap: a = "+ a + ", " + "b = " + b);

        //When Swap
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = "+ a + ", " + "b = " + b);

    }
}
