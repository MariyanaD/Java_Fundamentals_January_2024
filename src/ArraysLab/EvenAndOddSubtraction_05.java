package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int elements : numbers) {
            if(elements % 2 != 0){
                oddSum += elements;
            }else {
                evenSum += elements;

            }
        }
        int difference = evenSum - oddSum;

        System.out.println(difference);
    }
}
