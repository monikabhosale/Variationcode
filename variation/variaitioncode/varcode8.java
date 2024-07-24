/*
Given a number n, print all primes smaller than or equal to n.
Examples: 
 

Input:  n = 10
Output: 2, 3, 5, 7

Input:  n = 20
Output: 2, 3, 5, 7, 11, 13, 17, 19

*/

public class varcode8 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 20;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		boolean[] prime =new boolean[n+1];
		for(int i=0; i<=n;i++)
		{
			prime[i]=true;
		}
		for(int p=2;p*p<=n;p++)
		{
			if(prime[p])
			{
				for(int i=p*p;i<=n;i+=p)
				{
					prime[i]=false;
				}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i])
			{
				System.out.print(i+" ");
			}
		}
	}
}