package Javafirst;
import java.util.Scanner;
public class SumaAcumulada {
    public static int recogInt(Scanner in){
        while (!in.hasNextInt()){
            System.out.println("Invalid number. Please try again...");
            in.next();
        }
        return in.nextInt();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers what would you like tu add.");
        System.out.println("Enter the number 0 when you would like to stop:");
        int number = 0;
        int sum = 0;
        do{
            number = recogInt(in);
            sum += number;
        } while (number != 0);
        String description = sum >= 0? "positive " : "negative ";
        System.out.println("The result of your add is: "+ sum + " and is a " + description + "number.");
    }
}
