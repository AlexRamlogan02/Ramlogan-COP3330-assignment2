package ex32;

import java.util.Random;
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
        int level, numTries = 0, guess, found = 0;
        int answer;
        double difficulty = 10;

        System.out.print("Enter the difficulty level: ");
        level = scan.nextInt();
        difficulty = Math.pow(difficulty, level);
        //get a random number
        int diff = (int)difficulty;
        Random random = new Random();
        answer = random.nextInt(diff) + 1;

        System.out.print("\nI have my number! What's your first guess?");
        guess = scan.nextInt();
        while (found == 0)
        {
            numTries++;
            if (guess < answer) {
                System.out.print("Too low. Guess again: ");
                guess = scan.nextInt();
            }
            else if (guess > answer){
                System.out.print("Too high. Guess again: ");
                guess = scan.nextInt();
            }
            else if (guess == answer){
                System.out.print("You got it in " +numTries +" guesses!! yay!\n");
                found = 1;
            }
        }


    }
}
