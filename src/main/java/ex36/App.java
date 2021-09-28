package ex36;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
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
        String inputNum;
        int number, numNumbers;
        String complete = "done";
        List<Integer> numbers = new ArrayList<Integer>();
        DecimalFormat format = new DecimalFormat("#.00");
        numNumbers = 0;
        do {
            System.out.print("Enter a number: ");
            inputNum = scan.nextLine();
            if (!inputNum.equals(complete))
            {
                number = Integer.parseInt(inputNum);
                numbers.add(number);
                numNumbers++;
            }
        } while (!inputNum.equals(complete));
        double average = average(numbers, numNumbers);
        double std = std(average, numbers, numNumbers);
        int minimum = min(numbers,numNumbers);
        int maximum = max(numbers,numNumbers);
        System.out.print("Numbers: ");
        for (int i = 0; i < numNumbers; i++) {
            if (i == numNumbers-1)
                System.out.print(numbers.get(i));
            else
                System.out.print(numbers.get(i) + ", ");
        }
        System.out.print("\nThe average is " + average);
        System.out.print("\nThe minimum is " +minimum);
        System.out.print("\nThe maximum is " +maximum);
        System.out.print("\nThe Standard deviation is " +format.format(std));
    }
    public static double std(double average, List<Integer> values, int numValues){
        double solve = 0;
        double solution = 0;
        for (int i = 0; i < numValues; i++) {
            solve = values.get(i) - average;
            solve = Math.pow(solve,2);
            solution += solve;
        }
        solution = solution / numValues;
        solution = Math.sqrt(solution);
        return solution;
    }
    public static int max(List<Integer> values, int numValues){
        int maximum;
        int max = values.get(0);
        for (int i = 0; i < numValues; i++) {
            if (max < values.get(i)) {
                max = values.get(i);
            }
        }
        maximum = max;
        return maximum;
    }

    public static int min(List<Integer> values, int numValues) {
        int minimum;
        int min = values.get(0);
        for (int i = 0; i < numValues; i++) {
            if (values.get(i) < min){
                min = values.get(i);
            }
        }
        minimum = min;
        return minimum;
    }

    public static double average(List<Integer> values, int allValues)
    {
        double sum = 0;
        double average;
        //average equals value[i+1] = value[i] / allvalues
        for (int i = 0; i < allValues; i++) {
            sum += values.get(i);
        }
        average = sum/allValues;

        return average;
    }
}
