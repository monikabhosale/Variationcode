/*
Find sum of modulo K of first N natural number
Given two integer N ans K, the task is to find sum of modulo K of first N natural numbers i.e 1%K + 2%K + ….. + N%K.

Examples : 

Input : N = 10 and K = 2.
Output : 5
Sum = 1%2 + 2%2 + 3%2 + 4%2 + 5%2 + 6%2 +
      7%2 + 8%2 + 9%2 + 10%2
   = 1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 + 1 + 0
   = 5.
*/
public class varcode11 {
//StartOfMainMethod
    public static void main(String[] args) {
        int N = 10, K = 2;
        myCode(N, K);
    }
//EndOfMainMethod

    private static void myCode(int N, int K) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i % K;
        }
        System.out.println(sum);
    }
}
