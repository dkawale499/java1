package com.Pack1;

import java.util.Scanner;

public class emp1 
{
	Scanner sc=new Scanner(System.in);
	void sum()
	{
		
		
		System.out.println("Enter First Value");
		int a=sc.nextInt();
		System.out.println("Enter Second Value");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Total-:"+c);
		
	}
	int meth1() 
	{
		System.out.println("meth1 is called");
		System.out.println("Enter the number to return");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		emp1 eobj=new emp1();
		eobj.sum();
		System.out.println("-----------------------------");
		eobj.meth1();
		System.out.println("====>"+eobj.meth1());
	}
}
