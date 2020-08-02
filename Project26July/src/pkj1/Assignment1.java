package pkj1;

public class Assignment1{
	public int sum(int a, int b)
	{
	int c;
	c=a+b;
	System.out.println("Sum is " +c);
	return c;
}
	public int sub(int a, int b)
	{
	int c;
	c=a-b;
	System.out.println("Sub is " +c);
	return c;
 }
	public int mul(int a, int b)
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
	 System.out.println("After divison the value is is " +c);
 }
 public static void main (String[] args)
 {
	Assignment1 obj=new Assignment1();
	int Add1=obj.sum(10,2);
	int Add2=obj.sum(Add1,2);
	int Sub1=obj.sub(Add2,2);
	int Mul1=obj.mul(Sub1,2);
	obj.div(Mul1,2);
 }
}