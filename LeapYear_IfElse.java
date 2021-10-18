/*
  
PROBLEM STATEMENT

An extra day is added to the calendar almost every four years as February 29, and the day is called a leap day. It corrects the calendar for the fact that our planet takes approximately 365.25 days to orbit the sun. A leap year contains a leap day.

In the Gregorian calendar, three conditions are used to identify leap years:

The year can be evenly divided by 4, is a leap year, unless:
The year can be evenly divided by 100, it is NOT a leap year, unless:
The year is also evenly divisible by 400. Then it is a leap year.
This means that in the Gregorian calendar, the years 2000 and 2400 are leap years, while 1800, 1900, 2100, 2200, 2300 and 2500 are NOT leap years.

Input Format

Read year , the year to test.

Constraints

1900 ≤ year ≤ 10^5

Output Format

The program must return a Boolean value (True/False). Output is handled by the provided code stub.

Sample Input 0

1990

Sample Output 0

False

*/

//SOLUTION

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeapYear_IfElse{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if((year>=1900) && (year<=100000)){
            if(year%4==0)
                System.out.println("True");
            else if(year%100==0)
                System.out.println("False");
            else if(year%400==0)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
                
               
