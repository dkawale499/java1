package com.Pack1;

public class typec 
{
	void meth1()
	{
		byte b=10;
		int i=b;
		System.err.println("byte value :"+b);
		System.out.println("int value :"+i);
		
		char c='A';
		int x=c;
		System.out.println("Char-:"+c);
		System.out.println("int-:"+x);
		System.out.println("int-:"+(++x));
	}
	public static void main(String[] args) 
	{
	 new typec().meth1();	
	}
}
