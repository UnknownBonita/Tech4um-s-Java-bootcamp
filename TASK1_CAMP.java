
package task1_camp;
import java.util.Scanner;
/**
 * ID 5
 * @author Ghaid E. Althobaity
 */
public class TASK1_CAMP {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);//create scanner obj
        String text;//text from user
       
        System.out.print("Enter your message: ");//promote
        text = keyboard.nextLine();//scan val
        Cipher(text);//send to method
    }
    /**
     * a method that use Caesar cipher teqneace
     * @param text 
     */
    public static void Cipher (String text) {
        final String ALPHA = "abcdefghijklmnopqrstuvwxyz";//the alphabtes
        final int KEY = 5; // shift by 5
        text = text.toLowerCase(); // convert to lower case
        String crypt = ""; // string will hold encoded text
        int charPosition; // holds position of char in alphabet
        
        for (int i = 0; i < text.length(); i++) {
            //check if space
            if( text.charAt(i) == ' ') {
                crypt += " ";//add space
                continue;//stop iteration 
            } 
            charPosition = ALPHA.indexOf(text.charAt(i)); // will search index no. of char at text[i]
            int indexVal = (KEY + charPosition) % 26; // will add 5 to it and make sure its withen 26 letters 
            char newval = ALPHA.charAt(indexVal); // assign new val from alphabet[ new index val]
            crypt += newval;
        }
        //display
        System.out.println("Coded msg: " +crypt);
    }
}
