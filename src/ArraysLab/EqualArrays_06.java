package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int index = 0;
        boolean isIdentical = true;

        for (int position = 0; position <= firstArray.length - 1; position++) {
            int firstNumber = firstArray[position];
            int secondNumber = secondArray[position];

            if(firstNumber == secondNumber){
                sum += firstNumber;
            }else{
                index = position;
                isIdentical = false;
                break;
            }
        }
        if(isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
    }
}
