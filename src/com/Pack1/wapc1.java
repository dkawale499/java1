package com.Pack1;

public class wapc1 
{
	void meth1()
	{
	int i=10;
	Integer ival1=new Integer(i);
	Integer ival2=i;
	Integer ival3=Integer.valueOf(i);
	
	System.out.println("PDT"+i);
	System.err.println("WCO Value"+ival1);
	System.out.println("WCO Value"+ival2);
	System.out.println("WCO Value"+ival3);
	}
	public static void main(String[] args) 
	{
		new wapc1().meth1();
	}
}
