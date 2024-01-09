package com.Pack1;

public class ifabc 
{
	void meth1(int a, int b, int c)
	{
		if(a>b)
		{
			if(a>c)
				System.out.println(a+"a big");
			else
				System.out.println(c+"C is big");
		}
		else
		{
			if(b>c)
				System.out.println(b+"B is big");
			else
				System.out.println(c+" C is big");
		}
	}
	public static void main(String[] args) {
		new ifabc().meth1(100, 500, 3612);
	}
}
