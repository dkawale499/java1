package com.Pack1;


public class Defv 
{		
	int i;
	byte b;
	short s;
	long l;
	float f;
	double d;
	char c;
	boolean flag;
	
	void meth1()
	{
		//int a;
		System.out.println("int value i:"+i);
		System.out.println("int value b:"+b);
		System.out.println("int value s:"+s);
		System.out.println("int value l:"+l);
		System.out.println("int value f:"+f);
		System.out.println("int value d:"+d);
		System.out.println("int value c:"+c);
		System.out.println("int value flag:"+flag);






	}
		public static void main(String[] args)
		{
			Defv dobj =new Defv();
			dobj.meth1();
		}
}
