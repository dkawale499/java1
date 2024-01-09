package com.packoops2;

public class suB extends suA
{
	void meth2()
	{
		super.meth1();
		System.out.println("ClaasB meth2 Called");
	}
	suB()
	{
		this("java");
		//super(100);
		System.out.println("ClassB constructor called");
	}
	suB(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	
	{
		
		suB sobj=new suB();
		sobj.meth2();
	}
}
