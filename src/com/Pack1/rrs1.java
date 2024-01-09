package com.Pack1;

public class rrs1 
{
	  int meth1( int a,int b)
	{
		return a+b;
		//System.out.println();
	}
	  
	  int meth2(int a,int b,int c)
	  {
		  return a+b+c;
	  }
	
	public static void main(String[] args) 
	{
		rrs1 robj= new rrs1();
		robj.meth1(11, 11);
		robj.meth2(11, 11, 11);
		//System.out.printl(meth1);
	}
}
