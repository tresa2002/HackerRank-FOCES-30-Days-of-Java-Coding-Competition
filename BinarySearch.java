/*
  
PROBLEM STATEMENT

Given an array of length n, find the index (starting from 0) of the given number in the given array using the Binary Search algorithm. If the number is not present, return -1.
It is not guaranteed that the array will always be sorted. In that case, find the index after sorting the array.

Input Format

The first line is the size of the array, n. The second line will contain n numbers, the elements of the array. The third line will contain the number to be found.

Constraints

1 ≤ n ≤ 100 -1000 ≤ num ≤ 1000

Output Format

The output should be either the index of the array or -1 (if the number does not exist).

Sample Input 0

5
2 5 7 10 100
7

Sample Output 0

2

*/
  
//SOLUTION
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt();
        int index=-1,middle,first,last;
        int[] a= new int[100]; 
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();}
        int x = scan.nextInt();
        first  = 0;
        last   = n - 1;
        middle = (first + last)/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int prim=a[j];
                    a[j]=a[j+1];
                    a[j+1]=prim;}
            }
        }
        while(first<=last){
            middle=(first+last)/2;
            if(x==a[middle]){
                index=middle;
                break;}
            else if(x>a[middle])
                first=middle+1;
            else
                last=middle-1;
       }
       System.out.println(index);
   }
}
