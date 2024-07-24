/*
Example 1:

Input: 
x = 7
m = 2, n = 3
arr = {4, 5, 7, 6, 9, 10, 14}
Output: Ram
Explaination: Ram win against opponents 
having strength 4, 6, 10, 14 and Rohan 
win against opponent having strength 9.
*/
public class varcode2
{
//StartOfMainMethod
public static void main(String[] args)
{
int[] a=
{
4, 5, 7, 6, 9, 10, 14
}
;
int n=3;
int m=2;
myCode(a,n,m);
}
//EndOfMainMethod
public static void myCode(int[] a,int n,int m)
{
int ramwins=0;
int rohanwins =0;
boolean[] defeated = new boolean[a.length];
for(int i=0;i<a.length;i++)
{
if(!defeated[i] && a[i]%m==0)
{
ramwins++;
defeated[i]=true;
}
if(i+1<a.length && !defeated[i+1] && a[i+1] % n==0)
{
rohanwins++;
defeated[i+1]=true;
}
}
if(ramwins > rohanwins)
{
System.out.println("Ram");
}
else if(rohanwins >ramwins)
{
System.out.println("Rohan");
}
else
{
System.out.println("Both");
}
}
}
