package com.packoops2;

public class classA 
{
	private String StudentName;
	private int StudentrollNo;
	
	public String getStudentName() 
	{
		System.out.println("Studentname getter method called");
		return StudentName;
	}
	public void setStudentName(String studentName) 
	{
		System.out.println("Studenname setter method called");

		this.StudentName = studentName;
	}
	public int getStudentrollNo() 
	{
		System.out.println("Studentrollno getter method called");

		return StudentrollNo;
	}
	public void setStudentrollNo(int studentrollNo) 
	{
		System.out.println("Studentrollno setter method called");

		this.StudentrollNo = studentrollNo;
	}
	
}