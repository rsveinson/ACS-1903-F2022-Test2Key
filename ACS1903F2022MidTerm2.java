import java.util.Scanner;
import java.util.Random;
/** 
 * ACS-1903 F-2022 Mid-term test 2
 * Questions 1-10
 * indicate the output of the following Java class
 * in the space provided on the right hand side of the page.
*/

public class ACS1903F2022MidTerm2{
    public static void main(String[] args) {
        
        // **** constants and variables ***
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int n = 0;
        int sum = 0;
        String st;
        char ch;
        
        // *** Q1 ***
        for(int i = 0; i < 5; i += 2){
            n++;
            sum += n;
        }// end for
        
        System.out.println("q1: " + sum);
        
        // *** Q2 ***
        int total = 0;
        String stQ2 = "one 6 t9";
        
        for(int i = 0; i < stQ2.length(); i++){
            if(Character.isDigit(stQ2.charAt(i))){
                total += Character.getNumericValue(stQ2.charAt(i));
            }// end is a digit
            else if(Character.isLetter(stQ2.charAt(i))){
                total -= i;
            }//end it a letter
            else{
                // nothing to do here
            }// end not a letter or a digit
            //System.out.println(total);
        }// end for
        
        System.out.println("Q2: " + total);
        
        // *** Q3 ***
        n = 127;
        
        switch(n % 4){
            case 1: total =5;
            break;
            case 2:
            case 3: total = 10;
            break;
            case 4: total = 15;
            break;
            default:    total = -1;
        }// end switch
        
        System.out.println("Q3: " + total);
        
        // *** Q4 ***
        sum = 0;
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                sum++;
            }// end inner loop
        }// end outer for
        System.out.println("Q4: " + sum);
        
        // *** Q5 ***
        st = "in veritas carborundum";
        System.out.print( "Q5: ");
        System.out.print(Character.toUpperCase(st.charAt(7)));
        System.out.print(Character.toUpperCase(st.charAt(0)));
        System.out.println(Character.toUpperCase(st.charAt(4)));
        
        // *** Q6 ***
        sum = 0;
        int m = 6;
        n = 14;
        
        sum = ++m * n++;
        sum -= n;
        System.out.println("Q6: " + sum);
        
        // *** Q7 ***
        n = 578;
        n =  n / 10; 
        System.out.print( "Q7: ");
        System.out.println((n < 50) ? "Blue" : "Velvet");
        
        // *** Q8 ***
        int count = 0;
        String t;
        st = "in veritas carborundum";
        
        Scanner scan = new Scanner(st);
        
        while(scan.hasNext()){
            t = scan.next();
            count += t.length();
        }// end while
        
        System.out.println("Q8: " + count);
        
        // *** Q9 ***
        
        n = rnd.nextInt(5);
        System.out.print( "Q9: ");
        if(n >= 5){
            System.out.println("over");
        }// ed >= 5
        else{
            System.out.println("under");
        }//end < 5
        
        // *** Q10 ***
        n = 5;
        st = "";
        do{
            st += n++ + " ";
            
        }// end do while
        while(n < 8);
        System.out.println("Q10: " + st);
        
        // ** closing message ** Comment out if not needed
        System.out.println("end of program");
    }// end main
}// end public class
