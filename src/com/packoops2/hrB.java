package com.packoops2;

public class hrB extends hrA 
{
	public void meth2()
	{
		System.out.println("ClassB Meth2 Called");
	}
	public static void main(String[] args) 
	{
		new hrA().meth1();
	}
}
