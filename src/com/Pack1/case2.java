package com.Pack1;

public class case2 
{
	void meth1(String s)
	{
		switch (s)
		{
		case "a":
			System.out.println("First Sting Printed");
			break;
		case "b":
			System.out.println("Second String Printed");
			break;
			
			default:
				System.out.println("No Case Match Or Found: Error");
		}
		System.out.println("Out of switch ");
	}
	public static void main(String[] args) 
	{
		new case2().meth1("e");
	}
}
