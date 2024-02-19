import java.util.Scanner;

public class Task2 {

    public static void solution(Scanner in){
        System.out.print("Задание 2\nНаписать код программы, которая бы переводила числа из десятичной системы счисления в любую другую.\n");

        System.out.print("Введите число для перевода из десятичной СС в нужную СС:\t");
        int number = in.nextInt();
        System.out.print("Нужная СС:\t");
        int to = in.nextInt();

        System.out.printf("Переведённое число:\t %s\n", deqToN(number,to));
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String deqToN(int number, int to){
        String outNumber="";
        char sign = ' ';
        if(number<0) sign = '-';
        number = Math.abs(number);
        while(number>0){
            int digit = number % to;
            if(digit < 10)
                outNumber += Integer.toString(digit);
            else
                outNumber += Character.toString((char) (digit+55));
            number /= to;
        }
        if(outNumber.isEmpty()) return "0";
        return sign + reverseString(outNumber);
    }
}
