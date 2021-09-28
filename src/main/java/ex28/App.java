package ex28;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App
{
    public static void main( String[] args )
    {
        int valid = 0;
        Scanner scan = new Scanner(System.in);
        String input;
        int rateReturn, years;
        while (valid == 0)
        {

            System.out.print("What is the rate of return? ");
            input = scan.nextLine();
            int length = input.length();
            int notLetter = 0;
            for (int i = 0; i < length; i++) {
                if (Character.isLetter(input.charAt(i))) //if a letter was input
                {
                    System.out.print("Sorry, that's not a valid return\n");
                    notLetter = 1;
                    break;
                }
            }

            if (notLetter != 1) {
                rateReturn = Integer.parseInt(input);
                if (rateReturn == 0) {
                    System.out.print("Sorry, that's not a valid return\n");
                } else {
                    years = 72 / rateReturn;
                    valid = 1;
                    System.out.print("It will take " + years + " years to double your initial investment");
                }
            }
        }

    }

}
