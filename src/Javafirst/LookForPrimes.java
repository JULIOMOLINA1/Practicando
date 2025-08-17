package Javafirst;
import java.util.Scanner;
public class LookForPrimes {
    public static int recogInt(Scanner in){
        while (!in.hasNextInt()){
            System.out.println("Invalid number. Please try again...");
            in.next();
        }
        return in.nextInt();
    }
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome. Enter a limit number(up to 2) to look for prime numbers:");
        int number = recogInt(in);
        if(number>=2){
            for(int i = 2; i<=number; i++){
                boolean follow = true;
                for(int j=2 ; j < i; j++){
                    if(i % j == 0){
                        follow = false;
                        break;
                    }
                }
                if(follow){
                    System.out.printf(" %d is prime.%n ",i );
                }
            }
        } else {
            System.out.println("Error. The number must be up to 2:");
        }
        in.close();
    }
}
