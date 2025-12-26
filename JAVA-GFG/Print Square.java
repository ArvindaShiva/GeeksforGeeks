/*Given an integer s, write a program to print the square of size s using "*" character. 
Note: Make sure to add a " " between two "*". Add a new line after printing the square

Examples :

Input: s = 4
Output:
* * * *
*     *
*     *
* * * *
Explanation: It's a square! Each side contains s = 4 *.
Input: s = 3
Output:
* * * 
*   *
* * *
Explanation: It's a square! Each side contains s = 3 *.
Constraints:
1 ≤ s ≤ 10*/

//Code:

class Solution {
    public static void square(int s) {
        for(int i = 1; i <= s; i++) {
            for(int j = 1; j <= s; j++) {
                if(i==1 || i==s || j==1 || j==s) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }  // Missing closing brace added
            }
            System.out.println();  // Indent properly
        }
    }
}



