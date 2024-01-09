package com.packoops2;

public class suA 
{
	void meth1()
	{
		System.out.println("ClassA Meth1 is Called");
	}
	suA()
	{
		System.out.println("ClassA construtor called");
	}
	suA(int a)
	{
		this();
		System.out.println("ClassA Parametarized constru called"+a);
	}
}
