package com.packoops2;

public class absB extends absA 
{
	void meth1()
	{
		System.out.println("meth1 called");
	}
	public static void main(String[] args) 
	{
		absA aobj=new absB();
		aobj.meth1();
		aobj.meth2();
		//aobj.meth3();
	}
}
