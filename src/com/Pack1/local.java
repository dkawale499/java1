package com.Pack1;

public class local 
{
	int i=100;
	static int x=30;
	
	void meth1()
	{
		int a=50;
		System.out.println("Instance-:"+this.i);
		System.out.println("Static "+local.x);  //Recommended
		System.out.println("Local-:"+a);
	}
	public static void main(String[] args)
	{
		new local().meth1();
	}
}
