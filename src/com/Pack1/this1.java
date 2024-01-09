package com.Pack1;

public class this1 
{
	void meth1()
	{
		System.out.println("meth1 is called");
		meth2();
	}
	void meth2()
	{
		System.out.println("meth2 is called");
		this.meth3();
	}
	void meth3()
	{
		System.out.println("meth3 is called");
		//meth2();
	}
	public static void main(String[] args) 
	{
		//new this1().meth1();
		
	}
}
