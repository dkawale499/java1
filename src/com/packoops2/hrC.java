package com.packoops2;

public class hrC extends hrB
{
	public void meth3()
	{
		System.out.println("Class Called");
	}
	public static void main(String[] args)
	{
		hrC hobj=new hrC();
		hobj.meth3();
		hobj.meth1();
		hobj.meth2();
	}
}
