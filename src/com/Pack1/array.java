package com.Pack1;

public class array
{
	void meth1()
	{
		int arr[]= {10,20,30,40,50};
		System.out.println("Data present in index 3 posstion:"+arr[3]);
		for(int i=0;i<5;i++)
		{
			//System.out.println(":"+arr[i]);
		}
	}
		void meth2()
	{
		int arr[]= {10,20,30,40,50};
	
		for(int j=0;j<5;j--)
		{
			System.out.println(arr[j]);
		}
	
	}public static void main(String[] args) 
	{
		new array().meth2();
	}
}
