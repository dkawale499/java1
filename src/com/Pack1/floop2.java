package com.Pack1;

public class floop2 
{
	void meth1(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
	public static void main(String[] args) 
	{
		floop2 fobj=new floop2();
		fobj.meth1(2);
		
	}
}
