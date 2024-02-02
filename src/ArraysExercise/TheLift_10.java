package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int [] currentState  = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isLiftFull = true;

        for (int position = 0; position <= currentState.length - 1; position++) {
            int availableSpots = 4 - currentState[position];

            if(availableSpots > 0){
                if(availableSpots > people){
                    currentState[position] += people;
                    people = 0;
                    isLiftFull = false;
                }else {
                    currentState [position] = 4;
                    people -= availableSpots;
                }
            }
        }
        if(!isLiftFull){
            System.out.println("The lift has empty spots!");
        }else if (people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
        }
        for (int wagon : currentState) {
            System.out.print(wagon + " ");
        }
    }
}
