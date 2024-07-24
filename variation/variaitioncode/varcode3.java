/*
Maximum money 
Given a street of N houses
 (a row of houses), each house having K amount of money kept inside;
  now there is a thief who is going to steal this money but he has a constraint/rule that 
  he cannot steal/rob two adjacent houses. Find the maximum money he can rob.

Example 1:

Input:
N = 5 , K = 10
Output:
30
Explanation:
The Robber can rob from the first, third
and fifth houses which will result in 30.
*/
public class varcode3
{
//StartOfMainMethod
public static void main(String[] args)
{
int N = 5 , K = 10;
myCode(N,K);
}
//EndOfMainMethod
public static void myCode(int n,int k)
{
int maxMoney=k*((n+1)/2);
System.out.println(maxMoney);
}
}
