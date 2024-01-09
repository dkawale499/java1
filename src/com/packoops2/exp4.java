package com.packoops2;
import java.util.*;

public class exp4 extends Exception
{
	//Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
		try
		{
		
		System.err.println("Enter the Rollno");
		String rNo=sc.nextLine();
		if(rNo.length()!=10)
		{
			throw new exp4();	
		}
		System.out.println("rNo=:"+rNo);
		break;
		}//end of try
		catch(exp4 ep)
		{
			System.out.println("invalid rNo");
		}
	}	}
}
