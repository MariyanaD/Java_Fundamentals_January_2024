package AdditionalExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance  = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();


        double totalSpent = 0;

        while(!gameName.equals("Game Time")){
            double price = 0.00;
            switch (gameName){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    gameName = scanner.nextLine();
                    continue;
            }
            if(currentBalance < price){
                System.out.println("Too Expensive");
            }else{
                System.out.printf("Bought %s\n", gameName);
                totalSpent += price;
                currentBalance -= price;
            }
            if(currentBalance == 0){
                System.out.println("Out of money!");
                return;
            }
            gameName = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
    }
}
