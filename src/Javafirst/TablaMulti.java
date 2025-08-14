package Javafirst;
import java.util.Scanner;
public class TablaMulti {
    public static int recogInt (Scanner in){
        while(!in.hasNextInt()){
            System.out.println("Invalid number. Please try again...");
            in.next();
        }
        return in.nextInt();
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number (from 1 to 10) to show you its table of multiplication:");
        int number = recogInt(in);
        if(number>=1 && number<=10){
            String description = number % 2 == 0? "Even number." : "Odd number.";
            System.out.println(description);
            for(int i = 1; i <=12; i++){
                System.out.println(number + " x " + i + " = " + number * i );
            }
        } else{
            System.out.println("Invalid number. Must be between 1 and 10.");
        }
    }
}
