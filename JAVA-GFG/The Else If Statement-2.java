/*Given a number a, you have to use if, else if, else conditional statements according to the following:
if number is greater than 100: Print "Big" (without quotes)
else if number is smaller than 10: Print "Small" (without quotes)
else: Print "Number" (without quotes)

Examples:

Input: a = 9
Output: Small
Explanation: Here, the else if condition will work as 9 is smaller than 10.
Input: a = 101
Output: Big
Explanation: 101 is greater than 100, so our if statement works and we print Big.
Input: a = 30
Output: Number
Explanation: 30 is neither greater than 100, nor smaller than 10, so the else statement works here.*/Given a number a, you have to use if, else if, else conditional statements according to the following:
if number is greater than 100: Print "Big" (without quotes)
else if number is smaller than 10: Print "Small" (without quotes)
else: Print "Number" (without quotes)

Examples:

Input: a = 9
Output: Small
Explanation: Here, the else if condition will work as 9 is smaller than 10.
Input: a = 101
Output: Big
Explanation: 101 is greater than 100, so our if statement works and we print Big.
Input: a = 30
Output: Number
Explanation: 30 is neither greater than 100, nor smaller than 10, so the else statement works here.*/

//Code:

import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>100){
            System.out.println("Big");
        }
        else if(n<10){
            System.out.println("Small");
        }else{
            System.out.println("Number");
        }
        
    }
}