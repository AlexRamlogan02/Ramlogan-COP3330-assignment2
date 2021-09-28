package ex33;

import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int reply = 0;
        String question;
        String option1 = "Yes\n";
        String option2 = "No\n";
        String option3 = "Ask again later\n";
        String option4 = "Maybe\n";

        System.out.print("What is your question?\n> ");
        question = scan.nextLine();
        reply = random.nextInt(4) + 1; //max 4, min 1
        if (reply == 1)
        {
            System.out.print(option1);
        }
        else if (reply == 2)
        {
            System.out.print(option2);
        }
        else if (reply == 3)
        {
            System.out.print(option3);
        }
        else
        {
            System.out.print(option4);
        }



    }
}
