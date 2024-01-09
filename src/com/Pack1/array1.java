package com.Pack1;

public class array1 
{
	
	void meth1()
	{
		int arr[]={10,20,30,40,50};
		System.out.println(arr);
		arr[2]=30;
		System.out.println(arr[1]);
		
		for(int i=1;i<=4;i++)
		{
			System.out.println(arr[i]+"");
		}
	}
	public static void main(String[] args) 
	{
		new array1().meth1();
	}
}
