/*
  
PROBLEM STATEMENT

Given a matrix of dimension m x n, find the transpose of that matrix.

Input Format

The first line will contain the dimension of the matrix, r c (row column). The succeeding r lines each will contain c numbers representing the elements of the matrix.

Constraints

1 ≤ r ≤ 100
1 ≤ c ≤ 100
1 ≤ num ≤ 1000

Output Format

The correct output will be c lines each with r numbers representing the elements of the transposed matrix.

Sample Input 0

3 3
1 2 3
4 5 6
7 8 9

Sample Output 0

1 4 7
2 5 8
3 6 9

Sample Input 1

2 3
1 3 5
1 2 3

Sample Output 1

1 1
3 2
5 3

*/
  
//SOLUTION
import java.io.*;
import java.util.*;

public class Matrix_Transpose{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int r = scan.nextInt(); 
        int c = scan.nextInt(); 
        int[][] a = new int[r][c]; 
        int[][] b = new int[c][r];
        for(int i=0;i<r;i++){ 
            for(int j=0;j<c;j++){ 
                a[i][j] = scan.nextInt();} 
        }  
        for(int i=0;i<c;i++){ 
            for(int j=0;j<r;j++){ 
                b[i][j] = a[j][i];} 
        } 
        for(int i=0;i<c;i++){ 
            for(int j=0;j<r;j++){
                System.out.print(b[i][j]+" ");} 
            System.out.println(); 
        }
    }
}