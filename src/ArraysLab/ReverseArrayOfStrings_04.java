package ArraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputText = scanner.nextLine().split(" ");

        for (int elements = inputText.length-1; elements >= 0; elements--) {
            System.out.print(inputText[elements] + " ");
        }
    }
}
