package pkg1;

public class Methodassignment {
	
	public int sum(int a, int b)
	{
		System.out.println("share");
		int c= a+b;
		System.out.println("Sum: "+c);
		return c;
	}
	
	public int sub(int a, int b)
	{
		int c= a-b;
		System.out.println("Sub: "+c);
		return c;
	}
	
	public int mult(int a, int b)
	{
		int c= a*b;
		System.out.println("mult: "+c);
		return c;
	}
	
	public int div(int a, int b)
	{
		int c= a/b;
		System.out.println("Div: "+c);
		return c;
	}
	
	public static void main(String[] args)
	{
		Methodassignment res = new Methodassignment();
		
		//Assignment1 :   ((((10+2)+2)-2)*2)/2)
		
		int sumres = res.sum(10, 2);
		int sumres1 = res.sum(sumres, 2);
		int subres= res.sub(sumres1, 2);
		int mult = res.mult(subres, 2);
		int div = res.div(mult, 2);
		
		
		//Assignment2---(((((10-2)*2)+2)-2)/2)
		
		int subres2 = res.sub(10, 2);
		int mult2 = res.mult(subres2, 2);
		int sum2 = res.sum(mult2, 2);
		int subres3 = res.sub(sum2, 2);
		int div2 = res.div(subres3, 2);
		
	}

}
