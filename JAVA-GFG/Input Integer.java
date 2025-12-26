/*Given a number n. Take input and add 10 to its value and print it.

Example :

Input: n = 2
Output: 12
Explanation: Input is 2 adding 10 to it makes it 12.
Input: n = 22
Output: 32
Explanation: Input is 22 adding 10 to it makes it 32.
*/

//Code:

import java.util.*;

class GFG {
    public static void main(String args[]) {
        // Implement Scanner Class
        //  Take input
        //  Add 10 and Print
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+10);
    }
}