package com.Pack1;

public class statm 
{
	int a=10;
	static int b=20;
	void meth1()
	{
		System.out.println("Instance value:"+a);
		System.out.println("-----------------");
		System.out.println("Static value:"+b);
	}
	static void  meth2()
	{
		System.out.println("       ");
		
		System.out.println("========Static Area=========");
		System.out.println("Instance Value:"+new statm().a);
		System.out.println("-----------------------------");
		System.out.println("Static Value :"+b);
	}
	public static void main(String[] args) 
	{
		 new statm().meth1();
		 new statm().meth2();
	}
}
