package ex24;

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
        String s1, s2;
        int string1 = 0;
        int string2 = 0;
        System.out.print("Enter the first string ");
        s1 = scan.next();
        System.out.print("Enter the second string ");
        s2 = scan.next();

        int solution = compareStrings(s1, s2);
        if (solution == 0)
        {
            System.out.print("\"" +s1 +"\" and \"" + s2 +"\" are not anagrams ");
        }
        else
        {
            System.out.print("\"" +s1 +"\" and \"" + s2 +"\" are anagrams ");
        }
    }
    public static int compareStrings(String s1, String s2){
        int string1 = 0, string2 = 0;

        if (s1.length() != s2.length())
            return 0;
        for (int i = 0; i < s1.length(); i++) {
            char val1, val2;
            val1 = s1.charAt(i);
            val2 = s2.charAt(i);
            string1 += val1;
            string2 += val2;
        }

        if (string1 != string2)
            return 0;

        return 1;
    }
}
