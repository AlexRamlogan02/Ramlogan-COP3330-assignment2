package ex29;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexandra Ramlogan
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
