package com.packoops1;

public class methoverR2 extends methoverR1
{
	protected void meth1()
	{
		System.out.println("ClassB meth2 called");
		
	}
	
	public static void main(String[] args) 
	{
		methoverR1 robj=new methoverR2();
		robj.meth1();
		//methoverR1 mobj=new methoverR1();
		//mobj.meth1();
		
		
	}
}

