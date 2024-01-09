package com.pack2;
import com.Pack1.axis;
import com.Pack1.hdfc;

public class rbi 
{
	public void meth3()
	{
		//System.out.println("Rbi Has Called");
	}
	
	public static void main(String[] args) 
	{
		
		axis aobj =new axis();
		//aobj.meth3();
		aobj.meth1();
		hdfc hobj =new  hdfc();
		hobj.meth2();
		
	}
}

