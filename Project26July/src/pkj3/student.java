package pkj3;

public class student
{
	int Rollno;
	int Age;
	
	public void method1()
	{
		System.out.println("Welcome all");
	}
	public void method2()
	{
		System.out.println("Automation is easy");
	}
	public static void main(String [] args)
	{
		student deepak=new student();  //object creation
		deepak.method1();				// calling method1
		deepak.method2();				// calling method2
		
	
		deepak.Rollno=10;				// Value assign to Rollno
		deepak.Age=30;					// Value assign to Age
		
		System.out.println("Deepak's Rollno is "+deepak.Rollno);
		System.out.println("Deepak's Age is "+deepak.Age);
	}
	
	
}