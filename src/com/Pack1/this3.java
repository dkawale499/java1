package com.Pack1;

public class this3 
{
	void meth1()
	{
	
		System.out.println("meth1 is called");
		this.meth2(); 
	}
	void meth2()
	{
		System.out.println("meth2 is called");

	}
	this3()
	{
		this(500);
		System.out.println("Default Constructor is Called");
		//new this3(500);
		//new this3(500);
	}
	this3(int a)
	{
		System.out.println("Parameteraid Construtor called "+a);
	}
	public static void main(String[] args)
	{
		this3 aobj=new this3();
		aobj.meth1();
	}
	
}
