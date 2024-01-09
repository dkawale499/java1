package com.Pack1;

import java.util.Scanner;

public class TrueA
{
	Scanner sc=new Scanner(System.in);	
	void meth1()
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a>b);
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		TrueA tobj=new TrueA();
		tobj.meth1();
	}
}
