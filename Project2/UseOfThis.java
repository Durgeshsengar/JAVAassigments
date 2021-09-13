package pkg1;

public class UseOfThis 
{
	public UseOfThis()
	{
		this(22,9);
		System.out.println("share");
		
		System.out.println("Constructor 1");
	}
	
	public UseOfThis(int a)
	{
		System.out.println("Constructor 2"+a);
	}
	
	public UseOfThis(int b, int c)
	{
		this(10);
		System.out.println("Constructor 3"+b+c);
	}
	
	public void method1()
	{
		this.method3();
		System.out.println("This is method 1");
	}
	
	public void method2()
	{
		this.method4(); //control will move to method3
		//this.method1(); // control will move to method1
		//this.method4();  // control will move to method4
		System.out.println("This is method 2"); // control will come here in the last
	}
	
	public void method3()
	{

		System.out.println("This is method 3");
	}
	
	public void method4()
	{
		this.method1();
		System.out.println("This is method 4");
	}
	
	public static void main(String[] args) 
	{
		UseOfThis obj = new UseOfThis();
		
		obj.method2();
	}

}