package pkg1;

public class inhritance1
{
	
	/*public inhritance1()
	{
		this(1,2,3);
		System.out.println("inhritance1 default");
	}
	
	public inhritance1(int a)
	{
		this();
		System.out.println("inhritance1 one paramtr");
	}
	
	public inhritance1(int a, int b)
	{
		this(1);
		System.out.println("inhritance1 two paramtr");
	}
	
	public inhritance1(int a, int b, int c)
	{
		System.out.println("inhritance1 three paramtr");
	}
	
	public inhritance1(int a, int b, int c, int d)
	{
		this(1,2);
		System.out.println("inhritance1 four paramtr");
	}
	*/
	
	public void inhritance1method()
	{
		System.out.println("share");
		System.out.println("inhritance1method default");
		
	}
	
	public void inhritance1method(int a)
	{
		this.inhritance1method();
		System.out.println("inhritance1method one paramtr");
	}
	
	public void inhritance1method(int a, int b)
	{
		this.inhritance1method(1, 1, 1);
		System.out.println("inhritance1method two paramtr");
	}
	
	public void inhritance1method(int a, int b, int c)
	{
		this.inhritance1method(1);
		System.out.println("inhritance1method three paramtr");
	}
	
	public void inhritance1method(int a, int b, int c, int d)
	{
		this.inhritance1method(1, 2);
		System.out.println("inhritance1method four paramtr");
	}

	
	
}
