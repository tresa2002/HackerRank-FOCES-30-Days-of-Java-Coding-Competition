/*

PROBLEM STATEMENT 

Given coefficients of a quadratic equation , you need to print the nature of the roots (real and distinct , real and equal , imaginary).

Input Format

Enter the coefficients a,b,c

Constraints

-

Output Format

Output contains one/two lines.First line contains nature of the roots .The next line contains roots separated by a space if they exist. Use 'float' type to store the value of roots.

Sample output for case 1 -

Real and Distinct
2 1

Sample output for case 2 -

Real and Equal
4 -4

Sample output for case 3-

Imaginary

Sample Input 0

1 -1 -6

Sample Output 0

Real and Distinct
-2 3

*/
  
//SOLUTION
import java.io.*;
import java.util.*;

public class QuadraticEquations_2{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = ((b*b)-(4*a*c));
        int f = Math.abs(d);
        
        
        float e = (float)Math.sqrt(f);
        float root1,root2;
        if(d<0){
            System.out.println("Imaginary");}
        if(d==0){
            System.out.println("Real and Equal");
            float x = (float)(-b+e)/(2*a);
            float y = (float)(-b-e)/(2*a);
            System.out.print((int)Math.min(x,y)+" ");
            System.out.print((int)Math.max(x,y));}
        if(d>0){
            System.out.println("Real and Distinct");
            root1 = (float)(-b+e)/(2*a);
            root2 = (float)(-b-e)/(2*a);
            System.out.print((int)Math.min(root1,root2)+" ");
            System.out.print((int)Math.max(root1,root2));}
   }
}  