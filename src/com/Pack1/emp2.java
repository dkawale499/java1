package com.Pack1;

import java.util.Scanner;

public class emp2 
{
	Scanner sc=new Scanner(System.in);
	
	public void meth1()
	{
		System.out.println("---Enter Epm Details---");
		System.out.println("Enter Emp Id");
		int empid=sc.nextInt();
		//System.out.println(empid);
		System.out.println("Enter Emp Name");
		sc.nextLine();
		String ename=sc.nextLine();
		//System.out.println(ename);
		System.out.println("Enter Emp Salary");
		float empsal =sc.nextFloat();
		System.out.println("------Print Details of emp------");
		System.out.println("emp id-->"+empid);
		System.out.println("emp name-->"+ename);
		System.out.println("emp sal-->"+empsal);
	}public static void main(String[] args) 
	{
		new emp2().meth1();
	}
}
