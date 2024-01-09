package com.Pack1;

public class variable 
{
	int c=30;
	static int b=20;
	
	void meth1()
	{
		int c=10;
		System.out.println("Instance Variable:="+c);
		System.out.println("Static Variable:="+b);
		System.out.println("Local Variable:="+c);
	}
	public static void main(String[] args) 
	{
		variable aobj=new variable();
		aobj.meth1();
	}
}
