package pkj4;

public class student 
{
	public student() 
	{
		this(10,20,30,40);
		System.out.println("Default Constructor");
	}
	public student(int a) 
	{
		this();
		System.out.println("One parameterized Constructor");
	}
	public student(int a, int b) 
	{
		this(10);
		System.out.println("Two parameterized Constructor");
	}
	public student(int a, int b, int c) 
	{
		this(10,20);
		System.out.println("Three parameterized Constructor");
	}
	public student(int a, int b, int c, int d) 
	{
		
		System.out.println("Four parameterized Constructor");
	}
	
	public static void main(String [] args) 
	{
		student s=new student(10,20,30);
	}
}