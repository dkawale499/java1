package com.packoops2;

public abstract class absA 
{
	abstract void meth1();
	
	void meth2()
	{
		System.out.println("meth2 called");
	}
	absA()
	{
		System.out.println("abstract constutor ");
	}
	static void meth3()
	{
		System.out.println("static meth3 called");
	}
	public static void main(String[] args) 
	{
		absA.meth3();
	}
		
}
