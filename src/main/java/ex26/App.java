package ex26;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //variables
        Scanner scan = new Scanner(System.in);
        double i,b,p;
        double finalSolution;

        //input
        System.out.print("What is your balance? ");
        b = scan.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        i = scan.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        p = scan.nextDouble();

        //solution
        finalSolution = calculateMonthsUntilPaidOff(i,b,p);
        System.out.print("It will take you " + finalSolution + " to pay off this card");
    }
    public static double calculateMonthsUntilPaidOff(double rate, double balance, double payment)
    {
        // n = -(1/30) * log( 1 + (b/p) * ( 1 - (1 + i))^30) ) / (log(1 + i))
        rate = rate/365;
        double solution;
        double multiplyWhole = -(1.0/30.0);

        //numerator
        double numerator;
        //inside the parenthesis
        double multBy = (balance/payment);
        multBy += 1; //1+b/p
        double parenthesis = (1 + rate); //1+i
        parenthesis = Math.pow(parenthesis,30); //(i+i)^30
        parenthesis = 1 - parenthesis; // 1- (1+i)^30
        parenthesis = multBy * payment;
        numerator = Math.log(parenthesis);//log(1+b/p) * (1-(i+i)^30)

        //denominator
        double denominator = 1 + rate;
        denominator = Math.log(denominator);
        //final solution
        solution = numerator / denominator;
        solution = multiplyWhole * solution;
        solution = Math.round(solution);

        return solution;
    }
}
