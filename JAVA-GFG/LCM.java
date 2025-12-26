/*Given two numbers a and b. The task is to find out their LCM.

Examples:

Input: a = 5, b = 10
Output: 10
Explanation: LCM of 5 and 10 is 10
Input: a = 14, b = 8
Output: 56
Explanation: LCM of 14 and 8 is 56
Constraints:
1  <=  a , b  <=  10^3*/

//Code:

// User function Template for Java
class Solution {
    public static int LCM(int a, int b) {
        int gcd = 1;
        int x = Math.abs(a);
        int y = Math.abs(b);
        
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        gcd = x;
        
        return (int) ((long) a * b / gcd);
    }
}
