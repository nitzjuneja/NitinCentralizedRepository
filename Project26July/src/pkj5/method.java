package pkj5;

import pkj5.method;

public class method {
	public void method1()
	{
		this.method4();
		System.out.println("Default Method");
	}	
	public void method2()
	{
		this.method1();
		System.out.println("1 parameterized Method");
	}
	public void method3()
	{
		this.method2();
		System.out.println("2 parameterized Method");
	}
	public void method4()
	{
		System.out.println("3 parameterized Method");
	}
	public void method5()
	{
		this.method3();
		System.out.println("4 parameterized Method");
	}
	public static void main(String []args)
	{
	method obj=new method();
	obj.method5();
}
}
