/*
PROBLEM STATEMENT

Write a Java program to get a number from the user and print whether it is positive or negative and do the following task Task 1 : if number is positive then check if the number is divisible by 5. Task 2: if number is not positive then print number is negative

Input Format

A single line containing a positive integer,n.

Constraints

-100 ≤ n ≤100

Output Format

print divisible by 5 if the number is positive and divisible by 5 print negative if the number is negative

Sample Input 0

50

Sample Output 0

divisible by 5

Explanation 0

50 is positive and 50%5 == 0

Sample Input 1

-4

Sample Output 1

negative

*/

//SOLUTION  
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class IfElse_2{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n>=0 && n<=100){
            if(n%5==0)
                System.out.println("divisible by 5");
        }
        if(n<0 && n>=-100)
            System.out.println("negative");
        
    }
}
