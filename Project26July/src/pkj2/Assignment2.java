package pkj2;

public class Assignment2 {
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Sub is " +c);
		return c;
	}
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is " +c);
		return c;
	}
	public int Mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Mul is " +c);
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("After division the value is " +c);
	}
	public static void main(String[] args)
	{
		Assignment2 object=new Assignment2();
		int sub1=object.sub(10,2);
		int sum1=object.sum(sub1, 2);
		int sub2=object.sub(sum1, 2);
		int Mul1=object.Mul(sub2, 2);
		object.div(Mul1,2);
	}
}