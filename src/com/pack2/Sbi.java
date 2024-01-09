package com.pack2;

import com.Pack1.*;

//import com.pack1.*;
public class Sbi 
{
	void meth4()
	{
		System.out.println("Sbi is called");
	}
	public static void main(String[] args) 
	{
		new Sbi().meth4();
		new abc1().meth1();
		abc2 aobj=new abc2();
		aobj.meth2();
		
	}
}
