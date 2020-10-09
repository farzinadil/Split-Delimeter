/**
 * Created by farzinadil on 10/8/20.
 */
import java.util.ArrayList;
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

        double sum = 0;

        ArrayList<Double> numArray = new ArrayList<Double>();

        String[] output = removedComma.split("\\s+");
        for (String x: output)
        {
            numArray.add(Double.valueOf(x));
            sum+= Double.valueOf(x);
            System.out.println(x);
        }
        System.out.println("\n find sum: " + sum);
        System.out.println("\n find range: " + numArray.get(numArray.size()-1) + " - " + numArray.get(0) + " = " + (numArray.get(numArray.size()-1 ) - numArray.get(0)));
        



    }
}
