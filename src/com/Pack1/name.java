package com.Pack1;

public class name 
{
	name() { System.out.println("Name Programing");
	}
	name(String s)
	{
		System.out.println("Name String s Called:-"+s);
	}
	void meth1()
	{
		System.out.println("meth1 called");
	}
	public static void main(String[] args) 
	{
		new name();
		new name("java");
	}
}
