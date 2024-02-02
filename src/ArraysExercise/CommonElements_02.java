package ArraysExercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String elements1 : secondArray) {
            for (String elements2 : firstArray) {

            if(elements2.equals(elements1)){
                System.out.print(elements2 + " ");
            }
        }
    }
}
}
