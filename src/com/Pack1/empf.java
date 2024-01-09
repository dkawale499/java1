package com.Pack1;

import java.util.Scanner;

public class empf 
{
	Scanner sc=new Scanner(System.in);

	void meth1()
	{
		System.out.println("enter for niumber");
		for(int i=sc.nextInt();i<=10;i++)
			System.out.println("==>"+i);
	}
	void meth2()
	{
		System.out.println("Enter Age");
		
		if(sc.nextInt() <sc.nextInt())
		{
			System.out.println("Age is Right");
		}
		else
		{
			
		System.out.println("Enter Age is not Right");
		}
	}
	
	public static void main(String[] args) 
	{
		empf eobj =new empf();
		eobj.meth2();
	}
}
