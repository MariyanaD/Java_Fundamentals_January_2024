package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int numberPeople = 1; numberPeople <= wagonsCount ; numberPeople++) {
            int[] peopleInWagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sum += peopleInWagons[0];

            for (int position = 0; position <= peopleInWagons.length - 1; position++) {
                System.out.print(peopleInWagons[position] + " ");
            }

        }
        System.out.println();
        System.out.println(sum);
    }
}
