/*Given a number n find the prime factorization of the number.

Note: Print the prime factors in non-decreasing order.

Examples:

Input: n = 100
Output: 2 2 5 5
Explanation: 100 = 2 * 2 * 5 * 5
Input: n = 27
Output: 3 3 3
Explanation: 27 = 3 * 3 * 3 
Constraint:
2 <= n <= 200*/

//Code:

class Solution {
    public static void printPrimeFactorization(int n) {
        // Handle 2's first (all even factors)
        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }
        
        // Check odd factors up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        // If n is prime > 2
        if (n > 2) {
            System.out.print(n + " ");
        }
    }
}
