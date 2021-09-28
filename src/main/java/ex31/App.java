package ex31;

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
        int age, restingPulse;
        System.out.print("Resting pulse: ");
        restingPulse = scan.nextInt();
        System.out.print("Age: ");
        age = scan.nextInt();
        System.out.print("Intensity    | Rate\n" +
                "-------------|------\n");
        for (int i = 55; i < 95; i+= 5) {
            double targetRate = targetHeartRate(age, restingPulse, i/10);
            targetRate = Math.round(targetRate);
            System.out.print( i +"%          |" + targetRate + "     \n");
        }
    }
    public static double targetHeartRate(int age, int rest, int intensity){
        double solution = 0;
        double parenthesis = 220 - age;
        parenthesis = parenthesis - rest;
        parenthesis = parenthesis * intensity;
        solution = parenthesis + rest;

        return solution;
    }

}