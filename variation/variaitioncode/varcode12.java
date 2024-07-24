/*
Multiples Power 
Calculate the sum of all the multiples of 3 or 7 below the natural number N.

Example 1:

Input: 10
Output: 25
Explanation:
Numbers that are multiple of 3 or 7
are 3, 6, 7, 9 so sum will be 25.
*/

public class varcode12 {
// StartOfMainMethod
    public static void main(String[] args) {
        int N = 10;
        myCode(N);
    }
// EndOfMainMethod

    private static void myCode(int N) {
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
