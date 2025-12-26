/*You are given a String S, you need to print its characters at even indices(index starts at 0).

Examples:

Input: s = "Geeks"
Output: Ges
Explanation: The even indices characters are printed.
Input: s = "DoctorPhenomenal"
Output: DcoPeoea
Explanation: The even indices characters are printed.
*/

//Code:

class Solution {
    public static void utility(String s) {
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i+=2){
            System.out.print(arr[i]);
        }
        
    }
}