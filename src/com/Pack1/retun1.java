package com.Pack1;

public class retun1 
{
	public void meth1()
	{
		System.out.println("meth1 called");
		
		
	}
	int meth2()
	{
		System.out.println("meth2 called");
		return 500;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method is called");
		retun1 robj = new retun1();
		robj.meth1();
		robj.meth2();
		System.out.println("==>"+robj.meth2()+"Return value is printd");
		
	}
}
