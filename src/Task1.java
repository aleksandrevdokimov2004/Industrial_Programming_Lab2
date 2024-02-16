public class Task1 {

    public static int solution(int[] arrayNumbers, int count) {
        for (int i = 0; i < count; i++) {
            int lastDigit = -1;
            int currentNumber = arrayNumbers[i];
            boolean isGroing = true;
            while (isGroing & currentNumber > 0) {
                if (lastDigit == -1) {
                    lastDigit = currentNumber % 10;
                    currentNumber /= 10;
                }
                else if (currentNumber % 10 > lastDigit)
                    isGroing = false;

                else {
                    lastDigit = currentNumber % 10;
                    currentNumber /= 10;
                }

            }
            if (isGroing) {
                return arrayNumbers[i];
            }
        }
        return 0;
    }
}
