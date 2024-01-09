package com.packoops2;

public class inhB extends inhA
{
	void meth2()
	{
		System.out.println("meth2 ClassB called");
	}
	public static void main(String[] args) 
	{
		inhA aobj=new inhA();
		aobj.meth1();		// Has A Relation
		
		inhA cobj=new inhB();
		cobj.meth1();
		inhB bobj =new inhB();
		bobj.meth1();		// Is A Re	lation
		bobj.meth2();
	}
}
