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

        ArrayList<Double> numArray = new ArrayList<>();


        String[] output = removedComma.split("\\s+");
        double sampleMin = Double.valueOf(output[0]);
        double sampleMax = Double.valueOf(output[0]);
        for (String x: output)
        {
            if (Double.valueOf(x) > sampleMax){
                sampleMax = Double.valueOf(x);
            }
            if (Double.valueOf(x) < sampleMin){
                sampleMin = Double.valueOf(x);
            }
            numArray.add(Double.valueOf(x));
            sum+= Double.valueOf(x);
            System.out.println(x);
        }
        System.out.println("\n sample range : " + sampleMax + " - " + sampleMin + " = " + (sampleMax - sampleMin ));
        System.out.println("\n find sum: " + sum);
        double mean = sum/numArray.size();
        System.out.println("\n find mean: " + sum + " / " + numArray.size() + " = " + mean);
        double stdvar = Math.sqrt((Math.pow(sum-mean, 2) )/ (numArray.size()-1) );
        System.out.println("\n Standard Deviation = sqrt(" + Math.pow(sum-mean,2)  +  " / " +(numArray.size()-1) + " ) = " +  stdvar);
        System.out.println("\n find range: " + numArray.get(numArray.size()-1) + " - " + numArray.get(0) + " = " + (numArray.get(numArray.size()-1 ) - numArray.get(0)));

        double q1 = 0;
        double q3 = 0;
        double iqr = 0;
        for (int i = 0; i< numArray.size(); i++){
            if (numArray.size() % 2 == 0 && (i<(numArray.size()/2))  ){
                q1 += numArray.get(i);

            }
            else if (numArray.size()%2 == 0 && (i>=numArray.size()/2)){
                q3 += numArray.get(i);
            }
            else if (numArray.size() % 2 == 0 && (i<(numArray.size()/2))  ){
                q1 += numArray.get(i);
            }
            else if(numArray.size()%2 == 0 && (i>numArray.size()/2)){
                q3 += numArray.get(i);
            }

        }
        System.out.println("\n sum 1st half  : " + q1 + " / n " + numArray.size()/2 + " = "  + q1/(numArray.size()/2));
        System.out.println("\n sum 2nd half  : " + q3 + " / n " + numArray.size()/2 + " = "  + q3/(numArray.size()/2));
        System.out.println("\n IQR = " + q3/(numArray.size()/2) + q1/(numArray.size()/2));



    }
}
