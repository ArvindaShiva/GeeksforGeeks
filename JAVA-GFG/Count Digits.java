/*Given a natural number n. You have to find the number of digits in it and return it.

Examples:

Input: n = 12
Output: 2
Explanation: 12 has 2 digits
Input: n = 456
Output: 3
Explanation: 456 has 3 digits
Constraints:
1 ≤ n ≤ 10^5*/

//Code:

class Solution {
    public int countDigits(int n) {
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return(count);
    }
}

