/*

PROBLEM STATEMENT

Given an array of n numbers, replace all even numbers with 0 and all odd numbers with 1 and print out the contents of the transformed array.

Input Format

The first line is the size of the array.
The succeeding n lines are the elements of the array.

Constraints

1 ≤ n ≤ 100
0 ≤ num ≤ 1000

Output Format

The transformed array elements should be displayed separated by space.

Remember that System.out.println() prints the data on a new line whereas System.out.print() prints the data on the same line.

Sample Input 0

5
1
2
3
4
5

Sample Output 0

1 0 1 0 1

Explanation 0

1, 3, 5 are odd, so they're replaced with 1s. 2 & 4 are even, so they're replaced with 0s.

*/

//SOLUTION
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExploreArray{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[100];
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
            if(a[i]%2==0){
                a[i] = 0;}
            if(a[i]%2!=0){
                a[i] = 1;}
            System.out.print(a[i]+" ");

        }
        System.out.println();
    }
}




