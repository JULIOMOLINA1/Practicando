package POO;
import java.util.Scanner;
public class SumaArray {
    public static int recogInt(Scanner in){
        while(!in.hasNextInt()){
            System.out.println("Invalid number. Please try again...");
            in.next();
        }
        return in.nextInt();
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers to show you the average and sum.");
        int[] mYArray = new int[5];
        for(int i = 0; i< mYArray.length; i ++){
            System.out.println("Enter the number" + (i +1) + ":");
            mYArray[i] = recogInt(in);
        }
        System.out.println("The entered numbers were: ");
        for(int i = 0; i < mYArray.length;i++ ){
            String ternario = ( i >= 4)? ".": ", ";
            System.out.print(mYArray[i] + ternario);
        }
        System.out.println(" ");
        int suma = 0;
        for(int number : mYArray ){
            suma += number;
        }
        double average = (double) suma/5;
        System.out.println("The sum of the numbers is: " + suma);
        System.out.println("The average is: " + average);
        in.close();
    }
}
