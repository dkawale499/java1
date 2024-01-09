package com.Pack1;

public class ifelseblock
{
	String person(int age)
	
	{	
		if(age>=18)
		{	
			return"Elegiblr to vote";	
		}
	else
		{
		return"not elegible to vote";
		}
	}
	void meth1(int a)
	{
		if(!(a>=18 ||a<=75))
		{
			System.out.println("if block executed="+a);
		}
		else
		{
			System.out.println("else block executed");
		}
		
	} 
		public static void main(String[] args) 
		{
			ifelseblock eobj =new ifelseblock();
			eobj.meth1(50);
			System.out.println(eobj.person(67));
		}
}
