/**
Given a sorted array A[] of size N, delete all the duplicates elements from A[].
Note: Don't use set or HashMap to solve the problem.


Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates 
only one instance of 2 will remain.
Example 2:

Input:
N = 3
Array = {1, 2, 2}
Output: 1 2 
*/

public class varcode6
{
//StartOfMainMethod
public static void main(String[] args)
{
int[] a=
{
1,2,2
}
;
myCode(a);
}
//EndOfMainMethod
public static void myCode(int[] a)
{
int n=a.length;
if(n==0)
return;
int index =0;
for(int i=1;i<n;i++)
{
if(a[i]!=a[index])
{
index++;
a[index] = a[i];
}
}
for(int i=0;i<=index;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
}
}
