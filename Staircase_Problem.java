/*
  
PROBLEM STATEMENT 

Vavachi has a number of staircases in his house and he likes to climb each staircase 1, 2, or 3 steps at a time. Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.

Given the respective heights for each of the s staircases in his house, find and print the number of ways he can climb each staircase.

For example, there is s = 1 staircase in the house that is n = 5 steps high. Vavachi can step on the following sequences of steps:

1 1 1 1 1
1 1 1 2
1 1 2 1 
1 2 1 1
2 1 1 1
1 2 2
2 2 1
2 1 2
1 1 3
1 3 1
3 1 1
2 3
3 2
There are 13 possible ways he can take these 5 steps.

Function Description

Complete the stepPerms function in the editor below. It should recursively calculate and return the integer number of ways Vavachi can climb the staircase.

stepPerms has the following parameter(s):

n: an integer, the number of stairs in the staircase
Input Format

The first line contains a single integer, s, the number of staircases in his house. Each of the following s lines contains a single integer, n, the height of staircase i.

Constraints

1 <= s <= 5

1 <= n <= 36

Output Format

For each staircase, return the number of ways Vavachi can climb it as an integer.

Sample Input

3
1
3
7

Sample Output

1
4
44

Explanation

Let's calculate the number of ways of climbing the first two of the Vavachi's s = 3 staircases:

1. The first staircase only has n =1 step, so there is only one way for him to climb it. Thus we print 1 on new line.

2. The second staircase has n = 3 steps and he can climb it in any of the four following ways:

   1 -> 1 -> 1
   1 -> 2
   2 -> 1
   3
Thus we print 4 on a new line.

Sample Input 0

3
1
3
7

Sample Output 0

1
4
44

Explanation 0

Let's calculate the number of ways of climbing the first two of the Vavachi's s = 3 staircases:

1. The first staircase only has n =1 step, so there is only one way for him to climb it. Thus we print 1 on new line.

2. The second staircase has n = 3 steps and he can climb it in any of the four following ways:

   1 -> 1 -> 1
   1 -> 2
   2 -> 1
   3
Thus we print 4 on a new line.

*/
  
//SOLUTION
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase_Problem{
    static int stepPerms(int n) {
        if(n==1 || n==0)
            return 1;
        else if(n==2)
            return 2;
        else
            return (stepPerms(n-1)+ stepPerms(n-2) + stepPerms(n-3));
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int sItr = 0; sItr < s; sItr++){
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            bufferedWriter.write(String.valueOf(stepPerms(n)));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}
