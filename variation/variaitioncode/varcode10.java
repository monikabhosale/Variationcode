/*
Write a program to shift arraay to the left
i/p :int[] a= {1,2,3,4,5,6};
o/p :[2, 3, 4, 5, 6, 1]
*/

public class varcode10 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5,6
		}
		;
		myCode(a);
		for(int i :a)
		{
			System.out.println(i +" ");
		}
	}
	//EndOfMainMethod
	public static void myCode(int[] a) 
	{
		if(a == null || a.length <=1)
		{
			return;
		}
		int firstElement = a[0];
		for(int i=1 ; i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]= firstElement;
	}
}

