/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise21;

import java.util.Scanner;

public class Solution21
{
    public static void main(String[] args)
    {
        int monthNumber;
        String month = null;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        monthNumber = scan.nextInt();

        switch (monthNumber)
        {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
            default: month = "not recognized, try again"; break;
        }

            System.out.println("The name of the month is "+ month + ".");
    }
}
