import java.util.Random;

public class ACS1903AlternatingSum{
    public static void main(String[] args) {
        // create objects
        Random r = new Random();
        
        int n = 0;          // random numbers
        int sum = 0;        // the alternating sum of the random numbers
        int i = 0;          // loop counter
        
        // **** constants and variables ***
        
        // *** get input ***
        
        // *** processing ***
        do{
            i++;                // increment i here so the first 
                                // random number will be subtracted
            
            n = r.nextInt(11);  // between 0-10 inclusive
            
            // subtract the first number, add the second and so on
            sum += i % 2 == 0 ? n : (n * -1);
            //System.out.println(n + " " + sum);
        }// end do
        while(n != 0);
        
        // *** output ***
        
        System.out.println("The alternating sum = " + sum);

    }// end main
}// end public class
