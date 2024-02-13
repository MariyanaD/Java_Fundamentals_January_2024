package ArraysLab;
import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int [] arrayNumbers = new int[number];

        for (int position = 0; position <= arrayNumbers.length - 1; position++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            arrayNumbers[position] = currentNumber;
        }

        for (int position = arrayNumbers.length-1; position >= 0; position--) {
            System.out.print(arrayNumbers[position] + " ");
        }
    }
}
