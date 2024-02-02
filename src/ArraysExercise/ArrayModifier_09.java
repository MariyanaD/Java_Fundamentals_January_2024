package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] integers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            if (input.contains("swap")) {
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);

                int firstIndexNumber = integers[firstIndex];
                int secondIndexNumber = integers[secondIndex];

                integers[firstIndex] = secondIndexNumber;
                integers[secondIndex] = firstIndexNumber;
            } else if (input.contains("multiply")) {
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);

                int firstIndexNumber = integers[firstIndex];
                int secondIndexNumber = integers[secondIndex];

                int product = firstIndexNumber * secondIndexNumber;

                integers[firstIndex] = product;

            } else {
                for (int position = 0; position <= integers.length - 1; position++) {
                    integers[position]--;
                }
            }
            input = scanner.nextLine();
        }

        for (int position = 0; position < integers.length; position++) {

            if (position == integers.length - 1) {
                System.out.print(integers[position]);
            } else {
                System.out.print(integers[position] + ", ");
            }
        }
    }
}
