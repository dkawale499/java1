package com.Pack1;

public class floop1 
{
	void meth1()
	{
		System.out.println("------meth1 is called--------");
		for(int i=1;i<=5;i++)
		{
			System.out.println("I Value Is -:" +i);
			i++;
			
		}
		
	}
	void meth2()
	{
		System.out.println("------meth1 is called--------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
		
			System.out.println("*");
		}
	}
	void meth3()
	{
		int i=20;
		for(System.out.println("meth 4 executed");i<=25;i++)
		{
			System.out.println("i value"+i);
			i++;
		}
		
	}
	void meth4(int a,int b,int c )
	{
		
		int i=10;
		for(System.out.println("a value"+a); i<=20;i++)
		{
			System.out.println("b value"+b);
			i++;
			System.out.println(+i);
			b++;
			c=a+b;
			System.out.println("total value"+c);
		}
		
	}	
		int meth5()
		{
			System.out.println("meth5 called");
			return 50;
		}
		void meth6()
		{
			System.out.println("----------------");
		}
		void meth7()
		{
			for(int i=new floop1().meth5();i<=55;new floop1().meth6())
			{
				System.out.println("i value :"+i);
				i++;
			}
		}
	
	public static void main(String[] args) 
	{
		floop1 fobj = new floop1();
		//fobj.meth1();
		//fobj.meth2();
		//fobj.meth3();
		//fobj.meth4(1,1,1);
		fobj.meth7();
	}
}
