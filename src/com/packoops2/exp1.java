package com.packoops2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exp1 
{	
	int a;
	int b=50;
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		while(true)
		{
			try 
			{
				int a=sc.nextInt();
				int c=b/a;
				System.out.println("Output -:"+c);
		break;
			}
			catch(ArithmeticException | InputMismatchException ae)
			{
			System.out.println("Zero can not be devide");
			}	
		//break;
			
		}
	}
	public static void main(String[] args) 
	{
		exp1 eobj=new exp1();
		eobj.meth1();
		
	}
}
