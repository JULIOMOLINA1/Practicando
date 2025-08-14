package Javafirst;
import java.util.Scanner;
public class MenuInterac {
    public static int recogInt(Scanner in){
        while(!in.hasNextInt()){
            System.out.println("Invalid number. Please try again...");
            in.next();
        }
        return in.nextInt();
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("!Welcome to your menu of interactive options¡");
        boolean follow = true;
        int option = 0;
        while(follow){
            System.out.println(" *****Menu***** ");
            System.out.println(" 1. Saludar.");
            System.out.println(" 2. Mostrar fecha actual.");
            System.out.println(" 3. Calcular el area de un circulo.");
            System.out.println(" 4. Salir.");
            System.out.println("Enter an option:");
            option = recogInt(in);
            in.nextLine();
            switch(option){
                case 1:
                    System.out.println("What is your name?");
                    String name = in.nextLine();
                    System.out.println("Hola.....)

            }
        }
    }
}
