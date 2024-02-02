package AdditionalExercise;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String reverseText = "";
        for (int position = text.length()-1; position >= 0 ; position--) {
            reverseText += text.charAt(position);
        }
        System.out.printf("%s", reverseText);
    }
}
