import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        System.out.printf("Задание 1\nНайти число, цифры в котором идут в строгом порядке" +
                "возрастания. Если таких чисел несколько, найти первое из них.\n");
        System.out.printf("Введите количество чисел:\t");
        int count = in.nextInt();

        int[] arrayNumbers = new int[count];
        for(int i = 0; i<count; i++){
            System.out.printf("Введите %d число:\t", i+1);
            arrayNumbers[i] = in.nextInt();
        }


        System.out.printf("Первое найденное число, чьи цифры расположены в возрастающем порядке:\t %d\n", Task1.solution(arrayNumbers, count));

        System.out.printf("Задание 2\nНаписать код программы, которая бы переводила числа из" +
                "десятичной системы счисления в любую другую.\n");

        System.out.printf("Введите число для перевода из десятичной СС в нужную СС:\t");
        int number = in.nextInt();
        System.out.printf("Нужная СС:\t");
        int to = in.nextInt();

        System.out.printf("Переведённое число:\t %s\n", Task2.deqToN(number,to));

        System.out.printf("Задание 3\nВычислить определитель матрицы.\n");

        System.out.printf("Введите размер матрицы:\t");
        int size = in.nextInt();

        double[][] matrix = new double[size][size];

        for(int i =0; i<size; i++)
            for(int j = 0; j<size; j++){
                matrix[i][j] = rd.nextInt(0, 10);
            }

        System.out.printf("Ваша матрица:\n");

        for(int i =0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.printf("%.1f\t", matrix[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nОпределитель матрицы:\t %s", Task3.determinant(matrix));
        in.close();
    }
}