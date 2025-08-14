package Javafirst;
import java.util.Scanner;
public class ConverMoneda {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to your money exchange.");
        System.out.println("Enter your amount in dollars:");
        if(in.hasNextDouble()){
            double amount = in.nextDouble();
            in.nextLine();
            System.out.println("Available options:");
            System.out.println("1 ---> Soles.");
            System.out.println("2 ---> Euros.");
            System.out.println("3 ---> Yenes.");
            System.out.println("Choose an option:");
            final double tasaSoles = 3.53;
            final double tasaEuros = 0.86;
            final double tasaYenes = 148.12;
            if(in.hasNextInt()){
                int option = in.nextInt();
                double result = 0;
                switch(option){
                    case 1: result = amount* tasaSoles;
                    break;
                    case 2: result = amount* tasaEuros;
                    break;
                    case 3: result = amount* tasaYenes;
                    break;
                    default: System.out.println("Invalid option.");
                    return;
                }
                String description1 = amount> 1000? "High amount. Please wait while we process your exchange..."
                        : "Low amount. Processing...";
                System.out.println(description1);
                String description2 = option == 1? "soles" : (option==2? "euros": "yenes");
                System.out.println("Your exchange rate has been applied. "
                        + "You have " + result + " " +  description2  + " now.");
            } else {
                System.out.println("Incorrect option.");
            }
        } else{
            System.out.println("Invalid amount.");
        }
        in.close();
    }
}
