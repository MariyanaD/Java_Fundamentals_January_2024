package AdditionalExercise;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double thirdNumber = Double.parseDouble(scanner.nextLine());

        if(firstNumber <= secondNumber && secondNumber <= thirdNumber ){
            System.out.printf("%.0f\n%.0f\n%.0f\n", thirdNumber, secondNumber, firstNumber);
        }else if(secondNumber <= thirdNumber && thirdNumber <= firstNumber){
            System.out.printf("%.0f\n%.0f\n%.0f\n", firstNumber, thirdNumber, secondNumber);
        }else if(thirdNumber <= firstNumber && firstNumber <= secondNumber){
            System.out.printf("%.0f\n%.0f\n%.0f\n", secondNumber, firstNumber, thirdNumber);
        }else if(firstNumber <= thirdNumber && thirdNumber <= secondNumber){
            System.out.printf("%.0f\n%.0f\n%.0f\n", secondNumber, thirdNumber, firstNumber);
        }else if(secondNumber <= firstNumber && firstNumber <= thirdNumber){
            System.out.printf("%.0f\n%.0f\n%.0f\n", thirdNumber, secondNumber, firstNumber);
        }else if(thirdNumber <= secondNumber && secondNumber <= firstNumber){
            System.out.printf("%.0f\n%.0f\n%.0f\n", firstNumber, secondNumber, thirdNumber);
        }
    }
}
