package com.Pack1;

public class First
{
	void meth1()
	{
		System.out.println("Meth1 is Called");
		First obj=new First();
		obj.meth2();
	}
	void meth2()
	{
		System.out.println("Meth2 Called");
		
	}
	public static void main(String[] args) 
	{
		First aobj=new First();
		aobj.meth1();
		
	}
}
