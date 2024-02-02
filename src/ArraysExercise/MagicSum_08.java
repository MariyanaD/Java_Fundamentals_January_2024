package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arrayNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int currentPosition = 0; currentPosition < arrayNumbers.length-1 ; currentPosition++) {
            int currentElement = arrayNumbers[currentPosition];

            for (int nextPosition = currentPosition + 1; nextPosition <= arrayNumbers.length - 1 ; nextPosition++) {
                int nextElement = arrayNumbers[nextPosition];

                if(currentElement + nextElement == magicNum){
                    System.out.printf("%d %d\n", currentElement, nextElement);
                }
            }
        }
    }
}
