/*Comments are very useful in any language to tell users what is the task of any function or operation. The comments are neglected by the compiler, so whatever you write in the comments won't have any effect on the working of a code.
In Java, comments can be written as mentioned below:
/*This is a comment*/
//This is also a comment
Comment out the line that prints the value of b.

Examples: 

Input: a = 5, b = 6, c = 15
Output:
5
15
Input:a = 5, b = 8, c = 15
Output:
5
15*/

//Code:

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Prints a
        System.out.println(a);
        // Prints b
        //System.out.println(b);
        // Prints c
        System.out.println(c);
    }
}