/*Given an integer n find the sum of the first n natural number.

Example :

Input: n = 10
Output: 55
Explanation: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55.
Input: n = 5
Output: 15
Explanation: 1 + 2 + 3 + 4 + 5 = 15.
*/

//Code:

class Solution {
    public static int nSum(int n) {
        // code here
        
        int ans = 0;
        int i=0;
        while(i!=n+1){
            ans+=i;
            i++;
        }
        return ans;
    }
}
