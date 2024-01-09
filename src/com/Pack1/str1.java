package com.Pack1;

public class str1 
{
	void meth1()
	{
		String s1="java"+"python";
		String s2=("java");
		
		char arr[]= {'j','a','v','a'};
		String s3= new String(arr);
		
		String s4=new String(arr,2,2);
		
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println("s3 :"+s3);
		System.out.println("s3 :"+s4);
		System.out.println("s4 :"+s4);
		
		System.out.println("------------------");
		System.out.println("s1 Length:"+s1.length());
		
	}
	void meth2()
	{
		String s1="java";
		System.out.println("s1 Before :"+s1);
		System.out.println("s1 After :"+s1.concat("Is awesome"));
		
		
	}
	
	public static void main(String[] args) 
	{
		new str1().meth1();
		new str1().meth2();
	}
}
