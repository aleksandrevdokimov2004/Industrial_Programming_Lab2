import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void printMatrix(int[][] matrix, int size, String header){
        System.out.printf("%s\n", header);

        for(int i =0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int findDeterminant(int[][] arr) {
        int result = 0;
        if (arr.length == 1) {
            result = arr[0][0];
            return result;
        }
        if (arr.length == 2) {
            result = arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
            return result;
        }
        for (int i = 0; i < arr[0].length; i++) {
            int[][] temp = new int[arr.length - 1][arr[0].length - 1];

            for (int j = 1; j < arr.length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    if (k < i) {
                        temp[j - 1][k] = arr[j][k];
                    } else if (k > i) {
                        temp[j - 1][k - 1] = arr[j][k];
                    }
                }
            }
            result += arr[0][i] * (int)Math.pow(-1, i) * findDeterminant(temp);
        }
        return result;
    }

    public static void solution(Scanner in, Random rd){
        System.out.print("Задание 3\nВычислить определитель матрицы.\n");

        System.out.print("Введите размер матрицы:\t");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];
        for(int i =0; i<size; i++)
            for(int j = 0; j<size; j++)
                matrix[i][j] = rd.nextInt(-size, size);

        printMatrix(matrix, size, "Ваша матрица:");

        System.out.printf("Определитель матрицы:\t %s", findDeterminant(matrix));
    }
}