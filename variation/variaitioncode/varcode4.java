/*
A  Krishnamurthy number is a number whose sum of the factorial of 
digits is equal to the number itself. For example 145, sum of factorial of each digits: 
1! + 4! + 5! = 1 + 24 + 120 = 145

Examples: 

Input : 145
Output : YES
Explanation: 1! + 4! + 5! = 
1 + 24 + 120 = 145, which is equal to input,
hence YES.


*/
public class varcode4
{
//StartOfMainMethod
public static void main(String[] args)
{
int n = 145;
myCode(n);
}
//EndOfMainMethod
private static void myCode(int n)
{
int orgNumber=n;
int sum=0;
while(n>0)
{
int digit = n% 10;
sum+=factorial(digit);
n/=10;
}
if(sum == orgNumber)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
private static int factorial(int num)
{
if(num==0 || num == 1)
{
return 1;
}
int fact=1;
for(int i=2;i<=num;i++)
{
fact*=i;
}
return fact;
}
}
