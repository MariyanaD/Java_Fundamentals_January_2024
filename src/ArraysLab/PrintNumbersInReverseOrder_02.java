package ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[]arrayNumbers = new int[n];

        for (int currentNumber = 0; currentNumber < n; currentNumber++) {
            int number = Integer.parseInt(scanner.nextLine());
            arrayNumbers [currentNumber] = number;
        }
        for (int position = arrayNumbers.length - 1; position >= 0 ; position--) {
            System.out.print(arrayNumbers[position] + " ");
        }
    }
}
