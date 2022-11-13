import java.util.Scanner;
import java.util.Random;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class ACS1903AlphabetSoup{
    public static void main(String[] args) {
        //  objects and variables
        Scanner scanner = new Scanner(System.in);
        String strin;
        char ch;                // char extracted from the inpput string
        
        // counting the letters in the message
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int invalidCount = 0;
                
        // *** get input ***
        System.out.println("enter your message in the abc alphabet.");
        strin = scanner.next();
        
        // *** processing ***
        
        for(int i = 0; i < strin.length();i++){
            ch = strin.charAt(i);               // extract the current char
            ch = Character.toLowerCase(ch);     // convert to lowercase
            //System.out.println(ch);
            
            // count each character in the alphabet and invalid characters
            switch(ch){
                case 'a':   aCount++;
                break;
                case 'b':   bCount++;
                break;
                case 'c':   cCount++;
                break;
                default:    invalidCount++;                
            }//end switch
        }// end for
        
        // *** output ***
        System.out.println("a's: " + aCount);
        System.out.println("b's: " + bCount);
        System.out.println("c's: " + cCount);
        System.out.println("invalid characters: " + invalidCount);
        
        // ** closing message ** Comment out if not needed
        System.out.println("end of program");
    }// end main
}// end public class
