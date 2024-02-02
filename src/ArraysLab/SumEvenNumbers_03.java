package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arrayNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;

        for (int number : arrayNumbers) {
            if (number % 2 == 0){
                evenSum += number;
            }
        }
        System.out.println(evenSum);
    }
}
