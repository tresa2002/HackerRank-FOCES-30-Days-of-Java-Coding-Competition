/*
  
PROBLEM STATEMENT

Given a binary string of a certain length, your task is to convert the string into the equivalent decimal format. eg: Given 10101, the equivalent decimal number is 21.


You need to use loops to calculate the decimal and not inbuilt Java function, any entry with helper functions will be invalidated.


Explanation: Either follow this link or see a short explanation below:

10101 = 2^4 x 1 + 2^2 x 1 + 2^0 x 1 = 21

You only need to write the code accounting for whole numbers (no fractional strings will be given).
HINT: You will need to convert each of the child strings from the parent string into integer for computing or find another way to do so.

Input Format

The first and only line is the binary string.

Constraints

Input is a string with 1s and 0s only.

Output Format

The program should output the equivalent decimal value of input.

Sample Input 0

11110

Sample Output 0

30

Explanation 0

1 1 1 1 0
2^4 2^3 2^2 2^1 2^0
16 8 4 2 1


(16 x 1) + (8 x 1) + (4 x 1) + (2 x 1) + (1 x 0) = 30

*/

//SOLUTION
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryToDecimal{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String s = scan.nextLine();
        int sum = 0,x=0; 
        int i = s.length()-1;
        while(i>=0 && x<s.length()){ 
            if(s.charAt(x) == '1')
                sum+=(int)Math.pow(2,i);
            i--;
            x++;
        }
        System.out.println(sum);
    }
}



