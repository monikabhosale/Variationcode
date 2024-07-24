/*

An array is a collection of items stored at contiguous memory locations. The idea is to
 store multiple items of the same type together. For simplicity, we can think of an array as
  a fleet of stairs where on each step is placed a value

Given an array, the task is to remove the duplicate elements from the array.

Examples:

Input  : a[] = {1, 1, 2, 2, 2}
Output : a[] = {1,2}
        

Note : if you find element in contineous duplication then only remove otherwise do not remove

here int a[] = { 1, 2,5,6,8,1,2};   element not dulicate in contineously that why not remove any element
*/
public class varcode7
{
//StartOfMainMethod
public static void main(String[] args)
{
int a[] =
{
1, 1, 2, 2, 2
}
;
int n = a.length;
myCode(a,n);
}
//EndOfMainMethod
private static void myCode(int a[],int n)
{
if(n==0)
return;
int[] result =new int[n];
int index=0;
result[index++] = a[0];
for(int i=1;i<n;i++)
{
if(a[i] !=a[i-1])
{
result[index++]=a[i];
}
}
for(int i=0;i<index;i++)
{
System.out.print(result[i]+" ");
}
System.out.println();
}
}
