/*Given a English alphabet c, Write a program to check whether a character is a vowel or not.
Example 1:

Input:
c = 'a'
Output:
YES
Explanation:
'a' is a vowel.
 
Example 2:

Input:
c = 'Z'
Output:
NO
Explanation:
'Z' is not a vowel.
 
Your Task:

You don't need to read input or print anything. Your task is to complete the function isVowel() which takes a character c and returns 'YES' or 'NO'.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Note: c is either lowercase or uppercase English alphabetic character

Constraints:

c belongs to English Alphabets.*/

//Code:

class Solution {
    String isVowel(char c) {
        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        for(char vowel : arr) {
            if(c == vowel) {
                return "YES";
            }
        }
        return "NO";
    }
}
