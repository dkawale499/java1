package com.packoops1;

public class methover1 
{
	void meth1()
	{
		System.out.println(10);
	}
	void meth1(int a)
	{
		System.out.println(a);
	}
	void meth1(String s,int a)
	{
		System.out.println(a);
	}
	void meth1(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		methover1 mobj=new methover1();
		mobj.meth1();
		mobj.meth1(10);
		mobj.meth1("java");
		mobj.meth1("puthon", 499);
		mobj.meth1("e", 10);
	}
}
