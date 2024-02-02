package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());


        for (int rotations = 1; rotations <= n ; rotations++) {
            int firstElement = numbers[0];

            for (int positions = 0; positions < numbers.length - 1 ; positions++) {
               numbers[positions] = numbers[positions + 1];
            }
            numbers[numbers.length-1] = firstElement;
        }
        for (int elements : numbers) {
            System.out.print(elements + " ");
    }
    }
}
