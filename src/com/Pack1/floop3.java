package com.Pack1;

public class floop3
{
	void meth1(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				 System.out.println("*   ");
			}
			System.out.println();
		}

	} public static void main(String[] args) 
	{
		floop3 fobj=new floop3();
		fobj.meth1(5);
	}
}
