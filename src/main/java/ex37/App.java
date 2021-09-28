package ex37;


import java.nio.charset.StandardCharsets;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App
{
    public static void main( String[] args )
    {
        String funCharacters = "!@#$%^&*()_+{}:<>?\"`-=][';,./";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int minLength, numSpecial, numNumbers, numLetters;

        List<String> generatedPassword = new ArrayList<String>();
        System.out.print("What's the minimum length?: ");
        minLength = scan.nextInt();
        System.out.print("How many special characters?: ");
        numSpecial = scan.nextInt();
        System.out.print("How many numbers?: ");
        String[] password = new String[minLength];
        numNumbers = scan.nextInt();
        numLetters = (minLength - numSpecial) - numNumbers;
        int countNum = 0, countLetter = 0, countSpecial = 0, countLength = 0;
        while (countLength < minLength)
        {
            int add = random.nextInt(3) + 1;
            if (add == 1 && countNum < numNumbers){
                int found = findNumber(random);
                String pass= String.valueOf(found);
                password[countLength] = pass;
                countNum++;
            }
            else if (add == 2 && countLetter<numLetters){
                char found = findLetter(random, alphabet);
                String pass = String.valueOf(found);
                password[countLength] = pass;
                countLetter++;
            }
            else if (add == 3 && countSpecial < numSpecial){
                char found = findSpecial(random,funCharacters);
                String pass = String.valueOf(found);
                countSpecial++;
            }
            countLength++;
        }
        for (int i = 0; i < minLength; i++) {
            System.out.print(password[i]);
        }
        System.out.print("\n");
    }
    public static int findNumber(Random random){
        return random.nextInt(10) + 1;
    }
    public static char findSpecial(Random random, String specialChars){
        int size = specialChars.length();
        int find = random.nextInt(size) + 1;
        return specialChars.charAt(find);
    }
    public static char findLetter(Random random, String alphabet){
        int size = alphabet.length();
        int find = random.nextInt(size) + 1;
        return alphabet.charAt(find);
    }
}
