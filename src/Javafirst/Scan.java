package Javafirst;
import java.util.Scanner;
public class Scan {
    public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      String name = "";
      int ClaveDep = 0;
      int añosSer = 0;

      System.out.println("What´s your name?");
      name = in.nextLine();
      System.out.println("Insert the department code: ");
      ClaveDep = in.nextInt();
      System.out.println("How many years of work experience, do you have?");
      añosSer = in.nextInt();

       if(ClaveDep==1){
           if(añosSer==1) {
                    System.out.println(name + ", you will have 6 days free ");
                } else if(añosSer>=2 && añosSer<= 6){
                    System.out.println(name + ", you will have 14 days free ");
                } else if(añosSer>=7){
                    System.out.println(name + ", you will have 20 days free");
                } else {
                    System.out.println("You won´t receive vacations");
                }
       } else if(ClaveDep == 2){
            if(añosSer==1) {
                     System.out.println(name + ", you will have 7 days free ");
                } else if(añosSer>=2 && añosSer<= 6){
                     System.out.println(name + ", you will have 15 days free ");
                } else if(añosSer>=7){
                     System.out.println(name + ", you will have 22 days free");
                } else {
                     System.out.println("You won´t receive vacations");
                }
       } else if(ClaveDep == 3){
            if(añosSer==1) {
                    System.out.println(name + ", you will have 10 days free ");
                } else if(añosSer>=2 && añosSer<= 6){
                    System.out.println(name + ", you will have 20 days free ");
                } else if(añosSer>=7){
                    System.out.println(name + ", you will have 30 days free");
                } else {
                    System.out.println("You won´t receive vacations");
               }
       } else{
             System.out.println("The department code does not exit...");
       }
    }
}

