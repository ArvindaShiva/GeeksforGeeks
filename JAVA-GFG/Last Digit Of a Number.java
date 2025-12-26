/*Given an integer n. Write a program to find last digit of the number.

Examples:

Input: n = 10
Output: 0
Input: n = 9768
Output: 8*/

//Code:

class Solution:
    def utility(self, n):
        # code here 
        ans = n%10;
        # Print ans
        print(ans)