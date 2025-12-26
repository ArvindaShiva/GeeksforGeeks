/*Given three numbers a, b, and c. You need to find which is the greatest of them all.

Examples:

Input: a = 1, b = 2, c = 3
Output: 3
Explanation: Clearly, c = 3 is the greatest of (1, 2, 3)
Input: a = 2, b = 2, c = 5
Output: 5
Explanation: Out of (2, 2, 5) 5 is the greatest.
Constraints:
1 <= a, b, c <= 10^3

*/

//Code:

//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print(a);
        }else if(b>a && b>c){
            System.out.print(b);
        }else{
            System.out.print(c);
        }
        
    }
}

