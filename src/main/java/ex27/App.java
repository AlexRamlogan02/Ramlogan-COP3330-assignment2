package ex27;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fName, lName, ID, ZIP;
        int validFName, validLName, validID, validZIP;

        System.out.print("Enter the first name: ");
        fName = scan.nextLine();
        System.out.print("Enter the last name: ");
        lName = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        ZIP = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        ID = scan.nextLine();

        validFName = validateName(fName);
        validLName = validateName(lName);
        validID = validateID(ID);
        validZIP = validateZIP(ZIP);

        if (validFName == 3&& validLName == 3&& validID==1&& validZIP==1){
            System.out.print("There are no errors\n");
        }
        if (validFName==1){
            System.out.print("The first name must be at least 2 characters long\n");
        }
        else if (validFName==2){
            System.out.print("the first name must be filled in\n");
        }
        if (validLName==1){
            System.out.print("The last name must be at least 2 characters long\n");
        }
        else if (validLName==2){
            System.out.print("the last name must be filled in\n");
        }
        if (validID==0){
            System.out.print("The employee ID must be in the format of AA_1234");
        }
        if (validZIP==0){
            System.out.print("The Zip Code must be a 5 digit number");
        }

    }
    public static int validateName (String name){
        int valid;
        int nameLength = name.length();
        if (nameLength < 2){
            valid = 1;
        }
        if (name.isEmpty())
        {
            valid = 2;
        }
        else
            valid = 3;

        return valid;
    }
    public static int validateID (String Id){
        int valid;
        String hyphen = "-";
        if (!Character.isLetter(Id.charAt(0)) || !Character.isLetter(Id.charAt(1)))
            return 0;
        else if (!Id.contains(hyphen))
            return 0;
        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(Id.charAt(i))){
                return 0;
            }
        }

        return 1;
    }
    public static int validateZIP (String ZIP){
        if (ZIP.length() < 5)
            return 0;
        for (int i = 0; i < 5; i++) {
            if (!Character.isDigit(ZIP.charAt(i))){
                return 0;
            }
        }
        return 1;
    }
}
