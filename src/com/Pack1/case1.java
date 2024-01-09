package com.Pack1;

public class case1 
{
	void meth1()
	{
		int a=10;
		switch (a)
		{
		case 10:
			System.out.println("case 1 executed");
		break;
		case 20:
			System.out.println("case 2 executed");
		case 30:
		break;
		}
	}public static void main(String[] args) 
	{
		new case1().meth1();
	}
}
