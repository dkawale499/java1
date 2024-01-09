package com.pack2;

import java.util.ArrayList;
import java.util.List;

public class arr1 
{
	void meth1()
	{
		
		List l=new ArrayList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(11);
		System.out.println(l);
		System.out.println("-------Facing array datya------");
		System.out.println(l.get(1));
				
	}
	public static void main(String[] args) 
	{
		new arr1().meth1();
	}
}
