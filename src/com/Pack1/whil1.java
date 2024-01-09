package com.Pack1;

public class whil1 
{
	void meth1(int a)
	{
		while(a<=10)
		{		
			//a++;
			System.out.println(a);
		}
	}
	void meth2(int b)
	{
		System.out.println("meth 3 started");
		while(true)
		{
			System.out.println(b);
			b++;
		}
	
	} public static void main(String[] args) 
	{
		whil1 aobj =new whil1();
		aobj.meth2(11);
	}
}
