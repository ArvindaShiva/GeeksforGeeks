/*Given an integer n check if n is prime or not.

A prime number is a number that is divisible by 1 and itself only.

Examples:

Input: n = 17
Output: True 
Explanation: 17 is  divisible by only 1 and 17. So it's a prime number.
Input: n = 56
Output: False
Explanation: 56 is divisible by 2, 4, 7.....etc. So its not a prime number.
Contraints:
1 <= n <= 10^4*/

//Code:

import java.lang.Math;
class Solution {
    public static boolean prime(int n) {
        if(n<=1){
            return false;
        }
        int flag=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=1;
                return false;
            }
        }
        if(flag==0){
            return true;
        }
        return true;  
    }
}