/*
  
//PROBLEM STATEMENT

Given a square matrix of dimension n x n, find the product of the sums of the elements along the two diagonals of the matrix.

image

Input Format

The first line contains n, the size of the square matrix. The succeeding n lines each contain n numbers representing the elements of the matrix.

Constraints

1 ≤ n ≤ 100
0 ≤ num ≤ 1000

Output Format

The single line of output contains the required answer.

Sample Input 0

3
1 2 3
4 5 6
7 8 9

Sample Output 0

225

*/
  
//SOLUTION
import java.io.*;
import java.util.*;

public class Matrix_Diagonal_Elements{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt(); //Taking User Input
        long d1 = 0,d2=0;
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++){ 
            for(int j=0;j<n;j++){ 
                a[i][j] = scan.nextInt();} 
        } 
        for(int i=0;i<n;i++){ 
            d1 += a[i][i];
            d2 += a[i][n-i-1];} 
        System.out.print(d1*d2);
    }
}
