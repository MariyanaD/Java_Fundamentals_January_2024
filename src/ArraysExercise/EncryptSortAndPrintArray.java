package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = Integer.parseInt(scanner.nextLine());
        int [] encryptedValues = new int[inputs];

        for (int currentInput = 0; currentInput < inputs ; currentInput++) {
            String text = scanner.nextLine();
            int total = 0;

            for (int symbol = 0; symbol < text.length() ; symbol++) {
                char currentText = text.charAt(symbol);

                if("aoeiuAOEIU".indexOf(currentText)!= -1){
                    total += currentText * text.length();
                }else{
                   total += currentText / text.length();
                }
            }
                encryptedValues[currentInput] = total;
            }
            Arrays.sort(encryptedValues);

        for (int value : encryptedValues) {
            System.out.println(value);
        }
    }
}
