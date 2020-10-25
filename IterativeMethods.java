/*

PROBLEM STATEMENT

Iteration is a fundamental part of any programming language and it is no different in Java which offers 3 methods to iterate until a given condition is satisfied/not satisfied. The 3 methods are:
1. for
2. while
3. do while

The for loop is used when you know how many iterations to go through to find the solution, the while and do while loops are used when you only know when (under what condition) you should end the loop.
The difference b/w while and do while loops is that while is an entry-controlled loop, on the other hand, do while is an exit-controlled loop.

Given n numbers, your task is to find the average of these numbers using any one of the iterative methods given above.

Input Format

The first line will be the number n, The succeeding n lines will contain the n numbers to find the average of.

Constraints

1 ≤ n ≤ 100
0 ≤ num ≤ 1000

Output Format

Output must be the average of the given n numbers.

Sample Input 0

3
7
5
3

Sample Output 0

5.0

Explanation 0

7 + 5 + 3 = 15
15 / 3 = 5

Sample Input 1

2
40
40

Sample Output 1

40.0

Explanation 1

40 + 40 = 80
80 / 2 = 40

*/
  
//SOLUTION
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IterativeMethods{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum=0;
        int[] num = new int[20];
        for(int i=0;i<n;i++){
            int el = scan.nextInt();
            sum+=el;}
        System.out.println((double)sum/n);
    }
}