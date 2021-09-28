package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String [] employeeList = {"John Smith" + "Harry Potter" +"Jane Doe" +"Jeremy Goodwin" +"Sally Seashell"};
        int listLength = employeeList.length;
        String [] newEmployeeList = new String[4];
        String victim;

        System.out.print("There are 5 employees:\n");
        for (String s : employeeList) { //idk it was highlighted yellow and my for loop changed to this
            System.out.print(s);
        }
        System.out.print("Enter an employee to remove: ");
        victim = scan.nextLine();

        int arrayNav = 1;
        for (int i = 0; i < employeeList.length; i++) {
            if (!employeeList[i].contains(victim)) //if its not the victim, add it to new list
            {
                newEmployeeList[arrayNav] = employeeList[i];
                arrayNav++;
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(newEmployeeList[i]);
        }
    }
}
