import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        Task1.solution(in);
        Task2.solution(in);
        Task3.solution(in, rd);

        in.close();
    }
}