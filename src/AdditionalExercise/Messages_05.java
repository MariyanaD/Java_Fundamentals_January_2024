package AdditionalExercise;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String input = scanner.nextLine();
        for (int currentInput = 1; currentInput <= number; currentInput++) {
            for (int position = 0; position <= input.length() - 1; position++) {
                int digit = Integer.parseInt(input.charAt(position) + "");

            }
        }
    }
}

