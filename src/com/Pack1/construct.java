package com.Pack1;

public class construct 
{
	 construct()
	{
		System.out.println("Hello");
		System.out.println("Non-Paramiterized Construct Called");
	}
	 construct(String s)
	{
		System.out.println("Hello");
		System.out.println("Paramiterized Construct Called");
		System.out.println("s:-"+s);
	}
	void meth1()
	{
		System.out.println("Meth1 is called");
		new construct().meth2();
	}
	void meth2()
	{
		System.out.println("Meth2 is Called");
	}
	public static void main(String[] args) 
	{
		construct aobj= new construct("java"); 
		aobj.meth1();
	}
}
