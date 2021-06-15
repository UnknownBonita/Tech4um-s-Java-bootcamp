
package task2_camp;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 154
 * @author Ghaid E. Althobaity
 */
public class TASK2_CAMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; //holds number
        int length;//holds length
        char ans; //hold user answer
        
        //create scanner obj
        Scanner input = new Scanner (System.in);
        
        
        do {
            //promote and scan
            System.out.print("-------------------------------------------------"
                    + "\nEnter the number you want the multiples of: ");
            num = input.nextInt();

            System.out.print("Enter wanted length: ");
            length = input.nextInt();

            arrayOfMultiples(num,length);

            System.out.println("Would you like to try again?  ");
            ans = input.next().charAt(0);

        }while(ans != 'N'&& ans!= 'n');
        
        System.out.println("Exiting....");
        System.exit(0);
    }
    /**
     * A method that return an int array of multiples of a number chosen by user
     * @param number
     * @param length 
     */
    public static void arrayOfMultiples(int number, int length) {
        int[] arr = new int [length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number *(i+1);
        }
        System.out.println("ArrayOfMultiples("+number+", "+length+") -> "+Arrays.toString(arr));
    }
}
