/*
PROBLEM STATEMENT

Create a mini calculator with the operation addition , subtraction ,multiplication and division Input a Variable n for choosing any of the 4 operations . Then choose any of the 4 operation and perform the task. Then input 2 variables to perform the operation. Also check if the number can perform the task.

Input Format

For choice enter n (as int) Enter two values a and b

Constraints

-100 ≤ n ≤100

Output Format

print the value In division please print "Error" if a/b cannot perform the task. Implement a default statement "Option not found"

Sample Input 0

1
1 2

Sample Output 0

3

*/

//SOLUTION
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Switch{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(n>=-100 && n<=100){
            switch(n){
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    if (a==0 || b==0)
                        System.out.println("Error");
                    else
                        System.out.println(a/b);
                    break;
                default:
                    System.out.println("Option not found");
                    break;
            }
        }
    }
}
