package BATCH22Project1;

public class EvenNum2DArray {
    public static void main(String[] args) {

        int[][] numbers =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}

                };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {

                    System.out.print(numbers[i][j] + " ");

                }
            }
        }
    }
}
