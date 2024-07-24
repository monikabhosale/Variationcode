/**

Given two array A[0….N-1] and B[0….M-1] of size N and M respectively, representing two
 numbers such that every element of arrays represent a digit. For example, 
 A[] = { 1, 2, 3} and B[] = { 2, 1, 4 } represent 123 and 214 respectively. 
 The task is to find the sum of both the numbers.

Input : A[] = {1, 2}, B[] = {2, 1}
Output : 33
Explanation:
N=2, and A[]={1,2}
M=2, and B[]={2,1}
Number represented by first array is 12.
Number represented by second array is 21
Sum=12+21=33
*/



public class varcode5
{
//StartOfMainMethod
public static void main(String[] args)
{
int[] a=
{
1,2
}
;
int[] b=
{
2,1
}
;
myCode(a,b);
}
//EndOfMainMethod
public static void myCode(int[] a,int[] b)
{
int numA = convertToNumber(a);
int numB = convertToNumber(b);
int sum = numA +numB;
System.out.println(sum);
}
private static int convertToNumber(int[] arr)
{
int number =0;
for(int digit :arr)
{
number = number * 10+digit;
}
return number;
}
}
