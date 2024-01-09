package com.Pack1;

public class this2 
{
	this2 meth1()
	{
		System.out.println("meth1 is called");
		return this;
	}
	this2 meth2()
	{
		System.out.println("meth2 is called");
		return new this2();
	}
	void meth3()
	{
		System.out.println("meth3 is Called");
	}
	public static void main(String[] args) 
	{
		new this2().meth1().meth2().meth3();;
	}
}
