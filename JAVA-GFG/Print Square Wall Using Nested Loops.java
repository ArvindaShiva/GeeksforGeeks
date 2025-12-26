/*Given an integer S,  write a program to print the square wall of size S using nested loops. Try not to use String multiplication.
Note: Add a single " " after each "*". Add a new line after printing the square.

Examples:

Input: S = 5
Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
Explanation: Its perfect square wall. 
Input: S = 4
Output:
* * * * 
* * * * 
* * * * 
* * * * 
Explanation: Its perfect square wall. */

//Code:

class Solution {
    public static void squareWall(int s) {
        for(int i=1;i<=s;i++){
            for(int j=1;j<=s;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
}