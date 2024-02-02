package BasicsOverview;

import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

//        o	"English" -> if the entered country is "USA" or "England"
//o	"Spanish" -> if the entered country is "Spain" or "Argentina" or "Mexico"
//o	"unknown" -> if the entered country is any other different from countries listed above

//        switch (country){
//            case "USA":
//            case "England":
//                System.out.println("English");
//                break;
//            case "Spain":
//            case "Argentina":
//            case "Mexico":
//                System.out.println("Spanish");
//                break;
//            default:
//                System.out.println("unknown");
//                break;
//        }
        if(country.equals("USA") || country.equals("England")){
            System.out.println("English");
        }else if(country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")){
            System.out.println("Spanish");
        }else{
            System.out.println("unknown");
        }
    }
}
