/*
//SLBV.5
Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.
	
Example 1:
Input:
N=56
Output:
true
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is true.

Example 2:
Input:
N=98
Output:
false
Explanation:
The digit sum of 98 is 9+8=17.
Since 17 is not a palindrome,thus, answer
is false.

*/
public class varcode9 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int num=9382;
		myCode(num);
	}
	//EndOfMainMethod
	public static void myCode(int num)
	{
		int digitSum = sumOfDigits(num);
		boolean isPalindrome = isPalindrome(digitSum);
		System.out.println(isPalindrome);
	}
	public static int sumOfDigits(int num)
	{
		int sum = 0; 
		while(num>0)
		{
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	public static boolean isPalindrome(int num)
	{
		int reversed = 0, original = num;
		while(num>0)
		{
			reversed= reversed *10+num%10;
			num /= 10;
		}
		return original == reversed;
	}
}

