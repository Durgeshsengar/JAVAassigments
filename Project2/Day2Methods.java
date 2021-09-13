package pkg1;

public class Day2Methods 
{
	public int sum(int a, int b)
	{

		int c = a+b;
		System.out.println("Sum: "+c);
		return c;
	}
	
	public int sub(int d, int e)
	{
		int f= d-e;
		System.out.println("Sub: "+f);
		return f;
	}
	
	public void mult(int g, int h)
	{
		int i = g*h;
		System.out.println("Expression (10+2)(6-4) result : "+i);
		System.out.println("Method multiplication");
	}
	
	public static void main(String[] args) 
	{
		Day2Methods expr = new Day2Methods();
		
		int sumr = expr.sum(10, 2);
		int subr = expr.sub(6, 4);
		expr.mult(sumr, subr);
		
	}

}
