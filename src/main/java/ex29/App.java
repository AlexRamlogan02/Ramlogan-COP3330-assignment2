package ex29;
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
        int solution = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            solution += scan.nextInt();
        }
        System.out.print("The total is " +solution);
    }
}
