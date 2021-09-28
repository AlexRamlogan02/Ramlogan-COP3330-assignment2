package ex38;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String scannedIn;
        List<Integer> evenNumbers = new ArrayList<Integer>();
        System.out.print("Enter a list of numbers, separated by spaces: ");
        scannedIn = scan.nextLine(); //scan until new line
        for (int i = 0; i < scannedIn.length(); i++) {
            if (Character.isDigit(scannedIn.charAt(i))) { //if its a digit
                String even = String.valueOf(scannedIn.charAt(i));
                int isEven = Integer.parseInt(even); //convert to an int
                if ((isEven/2)*2 == isEven){ //integers get rounded if they're not even, so they won't be the same as before
                    evenNumbers.add(isEven);
                }
            }
        }
        int length = evenNumbers.toArray().length;
        System.out.print("The even numbers are: ");
        for (int i = 0; i <length; i++) {
            System.out.print(evenNumbers.get(i) + " ");
        }
        System.out.print("\n");
    }
}
