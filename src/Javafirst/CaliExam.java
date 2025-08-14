package Javafirst;
import java.util.Scanner;
public class CaliExam {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("What was your grade?");
        if (in.hasNextInt()){
            int grade = in.nextInt();
            if(grade >= 0 && grade <= 20){
                int range;
                if(grade >=18){
                    range = 1;
                } else if( grade >=14){
                    range = 2;
                } else if( grade>= 11){
                    range = 3;
                } else{
                    range = 4;
                }
                String mention = "";
                switch (range){
                    case 1 : mention = "Excellent.";
                    break;
                    case 2 : mention = "Good.";
                    break;
                    case 3 : mention = "Fair.";
                    break;
                    default : mention = "Failed.";
                }
                System.out.println(mention);
                String description = range <= 3? "You are passing." : "You are failing.";
                System.out.println(description);
            } else{
                System.out.println("Invalid grade.");
            }
        } else{
            System.out.println("Invalid answer.");
        }
    }
}
