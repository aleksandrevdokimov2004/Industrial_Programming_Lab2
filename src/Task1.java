import java.util.Scanner;

public class Task1 {

    public static int[] createArray(int count, Scanner in){
        int[] array = new int[count];
        for(int i = 0; i<count; i++){
            System.out.printf("Введите %d число:\t", i+1);
            array[i] = in.nextInt();
        }
        return array;
    }

    public static void solution(Scanner in){
        System.out.print("Задание 1\nНайти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.\n");
        System.out.print("Введите количество чисел:\t");
        int count = in.nextInt();
        int[] arrayNumbers = createArray(count, in);
        System.out.printf("Первое найденное число, чьи цифры расположены в возрастающем порядке:\t %d\n", FindGrowingNumber(arrayNumbers, count));
    }

    public static int FindGrowingNumber(int[] arrayNumbers, int count) {
        for (int i = 0; i < count; i++) {
            int lastDigit = -1;
            int currentNumber = Math.abs(arrayNumbers[i]);
            boolean isGrowing = true;
            while (isGrowing & currentNumber > 0) {
                if (lastDigit == -1) {
                    lastDigit = currentNumber % 10;
                    currentNumber /= 10;
                }
                else if (currentNumber % 10 > lastDigit)
                    isGrowing = false;
                else {
                    lastDigit = currentNumber % 10;
                    currentNumber /= 10;
                }

            }
            if (isGrowing) {
                return arrayNumbers[i];
            }
        }
        return -1;
    }
}