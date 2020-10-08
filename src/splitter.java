/**
 * Created by farzinadil on 10/8/20.
 */
import java.util.Scanner;
public class splitter {
    public static void main(String [] args){
        System.out.println("Enter String: \n");
        Scanner imput = new Scanner(System.in);
        String text = imput.nextLine();
        String removedComma = "";
        for (int i = 0; i< text.length(); i++){
            if (text.charAt(i) == ','){

            }
            else{
                removedComma += text.charAt(i);
            }
        }

        System.out.println("\n Removed Comea : " + removedComma +"\n");

       // System.out.println("\nEnter Delimiter (one character only)");

        String[] output = removedComma.split("\\s+");
        for (String x: output)
        {
            System.out.println(x);
        }



    }
}
