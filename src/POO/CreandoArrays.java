package POO;

public class CreandoArrays {
    public static void main(String [] args){
        int [] myArray = {1, 2, 3, 4, 5};
        for(int i=0; i< myArray.length; i++){
            String terna = (myArray[i] >= 5) ? " " : ", ";
            System.out.print(myArray[i] + terna);
        }
    }
}
