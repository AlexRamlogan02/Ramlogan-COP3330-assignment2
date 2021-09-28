package ex35;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        List<String> competitors = new ArrayList<String>();
        String space = " ";
        String competitor;
        Random random = new Random();
        int winner;

        int numCompetitor = 0;
        do {
            System.out.print("Enter a name: ");
            competitor = scan.nextLine();
            if (!competitor.equals(space)) { //if its not space
                competitors.add(competitor);
                numCompetitor++;
            }
        }while(!competitor.equals(space)); //while its not a space
        winner = random.nextInt(numCompetitor) + 1;
        System.out.print("The winner is...."+competitors.get(winner)+"!");

    }
}