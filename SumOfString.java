import java.util.Scanner;
import java.util.Random;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class SumOfString{
    public static void main(String[] args) {
        //  objects and variables
        Scanner scanner = new Scanner(System.in);
        String strin;
        int sum = 0; 
        
        System.out.println("enter your 3 digit string.");
        strin = scanner.next();
        sum = sumString(strin);
        printResult(strin, sum);
    }// end main
    
    // your methods go here
    public static int sumString(String s){
        int sum = 0;
        
        // could used a loop but not really necessary since
        // the input is going to be 3 digits for sure
        sum = Character.getNumericValue(s.charAt(0));
        sum += Character.getNumericValue(s.charAt(1));
        sum += Character.getNumericValue(s.charAt(2));
        return sum;
    }
    
    public static void printResult(String s, int sum){
        System.out.println("The sum of the string " + s + " = " + sum);
    }
}// end public class
