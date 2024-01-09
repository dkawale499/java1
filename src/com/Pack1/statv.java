package com.Pack1;
public class statv 
{
	int a;
	static int b;
	statv()
	{
		a++;
		b++;
		System.out.println("A value-:"+a);
		System.out.println("B value-:"+b);
		
	}
		public static void main(String[] args) 
		{
			
		
	 new statv();
	 System.out.println("------------");
	 new statv();
	 System.out.println("------------");
	 new statv();
	 
		}
}
