/**Given two numbers a and b find all x such that a % x = b

Examples:  

Input : a = 21, b = 5
Output : 2
The answers of the Modular Equation are
8 and 16 since 21 % 8 =5
 21 % 16 = 5 .

Here 3 cases arises :

If ( a < b ) then there will be no answer .
If ( a = b ) then all the numbers greater than a are the answer so there will be infinite solutions possible.
If ( a > b ) Suppose x is an answer to our equation. Then x divides (a – b). Also since a % x = b then b < x. These 
conditions are necessary and sufficient as well. So the answer is number of divisors of a – b which are strictly greater than b which can be solved in O(sqrt( a-b )). Here only one case arises which we have to deal separately when
 (a-b) is perfect square then we will add its square root two times so we have to subtract one times, if this case arises */
import java.util.*;

public class varcode1 {
    // StartOfMainMethod
    public static void main(String[] args) {
        int a = 21, b = 5;
        myCode(a, b);
    }
    // EndOfMainMethod

    private static void myCode(int a, int b) {
        // Case 1: a < b
        if (a < b) {
            System.out.println("0"); // No answers
            return;
        }
        
        // Case 2: a == b
        if (a == b) {
            System.out.println("Infinite solutions (any x > a)"); // Infinite solutions
            return;
        }
        
        // Case 3: a > b
        int diff = a - b;
        int count = 0;

        // Find divisors of (a - b)
        for (int x = 1; x * x <= diff; x++) {
            if (diff % x == 0) {
                // Check if x is greater than b
                if (x > b) {
                    count++;
                }
                // Check the corresponding divisor
                int otherDivisor = diff / x;
                if (otherDivisor != x && otherDivisor > b) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}