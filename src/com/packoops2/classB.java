package com.packoops2;
import java.util.Scanner;

import com.packoops1.*;

public class classB 
{
	Scanner sc=new Scanner(System.in);
	//classA aobj=new classA();
	void display()
	{
		classA aobj=new classA();
		System.out.println("Please Enter Your Name");
		//String name=sc.nextLine();
		//aobj.StudentName=sc.nextLine();
		aobj.setStudentName(sc.nextLine());
		
		
		System.out.println("Please Enter Your Roll Number");
		//int rollno=sc.nextInt();            C.E Accesing outside of a class
		//aobj.StudentrollNo=sc.nextInt();    C.E acceing private varilbe  
		aobj.setStudentrollNo(sc.nextInt());
		System.out.println("---------------------------------------");
		System.out.println("Name -:"+aobj.getStudentName());
		System.out.println("Roll No -:"+aobj.getStudentrollNo());
		sc.close();
	}
	public static void main(String[] args) 
	{
		new classB().display();
	}
}
