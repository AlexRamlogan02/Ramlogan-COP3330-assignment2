package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App
{
    public static void main( String[] args )
    {
        int answer;
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 12; j++) {
                answer = i * j;
                System.out.print(answer + " ");
            }
            System.out.print("\n");
        }
    }
}