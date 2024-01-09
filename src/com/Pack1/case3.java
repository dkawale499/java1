package com.Pack1;

public class case3 
{
	void meth1(int a)
	{
		switch (a)
		{
		case 4:
			System.out.println("Case 4 Is Selected");
			//break;
		
		case 1:
			System.out.println("Case 1 Is Selected");
			//break;
		case 2:
			System.out.println("Case 2 Is Selected");
			//break;
		case 3:
			System.out.println("Case 3 Is Selected");
			//break;
			System.out.println("=========Serilized============");
			//break;
		case 5:
			System.out.println("Case 5 Is Selected");
			break;
		case 6:
			System.out.println("Case 6 Is Selected");
			break;
		case 7:
			System.out.println("Case 7 Is Selected");
			break;
		case 8:
			System.out.println("Case 8 Is Selected");
			break;
		case 9:
			System.out.println("Case 9 Is Selected");
			break;
		case 10:
			System.out.println("Case 10 Is Selected");
			break;
			default:
				System.out.println("No Case Is Matched");
		}
		System.out.println("Key Is Out Of Switch ");
	}
	public static void main(String[] args) 
	{
		new case3().meth1(4);
		
	}
}
