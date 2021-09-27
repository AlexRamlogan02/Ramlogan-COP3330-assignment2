package ex25;

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
        String inputPassword;
        System.out.print("What is your password? ");
        inputPassword = scan.next();
        int validity = 0;

        validity = passwordValidator(inputPassword);

        if (validity == 1 && inputPassword.length() < 8) //if the function returns 0, its very weak
            System.out.print("The password \"" +inputPassword +"\" is a very weak password");
        if (validity == 2 && inputPassword.length() < 8) //if the function returns 1, its weak
            System.out.print("The password \"" +inputPassword +"\" is a  weak password");
        if (validity == 3 && inputPassword.length() >= 8) //if the function returns 2, its very strong
            System.out.print("The password \"" +inputPassword +"\" is a strong password");
        if (validity == 4 && inputPassword.length() >= 8) //if the function returns 3, its strong
            System.out.print("The password \"" +inputPassword +"\" is a very strong password");
    }

    public static int findSpecialCharacter(String password) //function to find a special character
    {
        String funCharacters = "!@#$%^&*()_+{}:<>?\"`-=][';,./";
        for (int i = 0; i < password.length(); i++) //for the length of the password
        { //look if the string of special characters has the input character
            if (funCharacters.contains(Character.toString(password.charAt(i)))) //if any of the special characters are found, it returns 1
            {
                return 1;
            }
        }
        return 0; //if a special character isn't found, it will return 0
    }

    public static int passwordValidator(String password)
    {
        int foundNum = 0, foundChar = 0, foundSpecial = 0;
        int solution = 0;
        for (int i = 0; i < password.length(); i++)
        {
            char compare = password.charAt(i);
            if (Character.isDigit(compare) && foundNum == 0)
            {
                solution += 1;
                foundNum = 1;
            }
            //all numbers will return 1
            if (Character.isLetter(compare) && foundChar == 0)
            {
                solution += 2;
                foundChar = 1;
            }
            //all characters will return 2
            //if its both a number and a string, it will return 3
            int lookSpecial = findSpecialCharacter(password); //call the find special function
            if (lookSpecial == 1 && foundSpecial == 0) //if a special function wasn't found yet
            {
                solution += 1;
                foundSpecial = 1;
            }
        }
        return solution;
    }
}