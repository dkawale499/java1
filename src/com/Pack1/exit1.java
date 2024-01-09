package com.Pack1;

public class exit1 
{
	static int x= 100;
	
	static
	{
		System.err.println("x-:"+x);
		System.exit(1);
	}
	public static void main(String[] args)
	{
		System.out.println("main method called");
	}
}

