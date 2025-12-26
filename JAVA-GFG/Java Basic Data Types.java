/*Read a value and store it in the appropriate Java Data Type. 


Example 1:

Input: 
18 
abc 
9.9876 
Output:
18 
abc 
9.9876 
Explanation:
The three inputs are stored in approriate 
data types and then printed in order.*/

//Code:

class Solution {

    int javaIntType(Scanner sc) {
        // code here
        return(sc.nextInt());
    }

    String javaStringType(Scanner sc) {
        
        // code here
        return(sc.next());
    }

        
    float javaFloatType(Scanner sc) {
        // code here
        return(sc.nextFloat());
    }
};