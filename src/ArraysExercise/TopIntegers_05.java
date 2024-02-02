package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int currentPosition = 0; currentPosition <= numbers.length -1 ; currentPosition++) {
            boolean isBiggest = true;
            for (int nextPosition = currentPosition + 1; nextPosition <= numbers.length - 1; nextPosition++) {

                if (numbers[currentPosition] <= numbers[nextPosition]){
                    isBiggest = false;
                    break;
                }
            }
            if (isBiggest){
                System.out.print(numbers[currentPosition]+ " ");
            }
        }
    }
}

