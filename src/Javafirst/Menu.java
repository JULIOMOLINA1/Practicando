package Javafirst;
import java.util.Scanner;
public class Menu {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        if(in.hasNextInt()){
            int age = in.nextInt();
            in.nextLine();
            if(age >0 && age< 50){
                System.out.println("You have an invitation? (true/false):");
                String answer = in.nextLine();
                String description = age >= 21 || answer.trim().equalsIgnoreCase("true")?
                        "Access successful." : "You don´t have access.";
                System.out.println(description);
                if( description.equals("Access successful.")){
                    System.out.println("What type of ticket do you have?(1, 2 o 3).");
                    if(in.hasNextInt()){
                        int number = in.nextInt();
                        in.nextLine();
                        String type="";
                        switch(number){
                            case 1 : type = "General.";
                            break;
                            case 2 : type = "VIP.";
                            break;
                            case 3 : type = "Backstage.";
                            break;
                            default: System.out.println("Invalid number.");
                            return;
                        }
                        System.out.println(type);
                        String benefits = number == 2 || number== 3? "You have a free drink."
                                : "You don´t have benefits.";
                        System.out.println(benefits);
                    } else{
                        System.out.println("Invalid data.");
                    }
                } else{
                    return;
                }
            } else {
                System.out.println("Invalid age. You don´t have access.");
            }
        } else{
            System.out.println("Invalid input.");
        }
        in.close();
    }
}
