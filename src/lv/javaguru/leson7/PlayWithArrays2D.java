package lv.javaguru.leson7;

public class PlayWithArrays2D {

    public static void main(String[] args) {

        int[][] array2D = new int[][]{
                {1, 5, 4},
                {3, 6, 9, 0, 1},
                {2, 8, 3, 5}
        };

        print(array2D);

        System.out.println();

        printWithForEach(array2D);
    }

    private static void printWithForEach(int[][] array2D) {
        for (int[] intArr : array2D){
            for (int number : intArr){
                System.out.print(number + ", " );
            }
            System.out.println();
        }
    }

    private static void print(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                System.out.print(array2D[i][j] + ", " );
            }
            System.out.println();
        }
    }
}
