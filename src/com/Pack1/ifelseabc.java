package com.Pack1;

public class ifelseabc
{
	void meth1(int a,int b)
	{
		if(a<b)
		{
			System.out.println("A is big as B");
			
		}
		else 
			System.out.println("B is big as A");
		
	}
	public static void main(String[] args) {
		new ifelseabc().meth1(10, 20);
	}
}
