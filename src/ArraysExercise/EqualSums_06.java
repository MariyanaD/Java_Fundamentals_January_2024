package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int currentPosition = 0; currentPosition <= numbers.length -1; currentPosition++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int leftPosition = 0; leftPosition <currentPosition; leftPosition++) {
                leftSum += numbers[leftPosition];
            }
            for (int rightPosition = currentPosition + 1; rightPosition <=numbers.length - 1; rightPosition++) {
                rightSum += numbers[rightPosition];
            }
            if(leftSum == rightSum){
                System.out.print(currentPosition);
                return;
            }
        }
        System.out.println("no");
    }
}
