package pkg1;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class TakeInput 
{
	public int sum(int x1, int x2)
	{
		System.out.println("share");
		int sum = x1+x2;
		return sum;
	}
	
	public int sub(int x1, int x2)
	{
		int sub = x1-x2;
		return sub;
	}
	
	public int mult(int x1, int x2)
	{
		int mult = x1*x2;
		return mult;
	}
	
	public int div(int x1, int x2)
	{
		int div = x1/x2;
		return div;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		TakeInput TI = new TakeInput();
		
		//Assignment1----(((((x1*x2)-x3)+x4)*x5)/x6)
		
		System.out.println("Enter value for X1: ");
		int a = scan.nextInt();
		
		System.out.println("Enter value for X2: ");
		int b = scan.nextInt();
				
		int sum = TI.mult(a, b);

		System.out.println("Enter value for X3: ");
		b = scan.nextInt();
				
		int sub = TI.sub(sum, b);
		
		System.out.println("Enter value for X4: ");
		b = scan.nextInt();
		
		sum = TI.sum(sub, b);
		
		System.out.println("Enter value for X5: ");
		b = scan.nextInt();
		
		sum = TI.mult(sum, b);
		
		System.out.println("Enter value for X6: ");
		b = scan.nextInt();
		
		sum = TI.div(sum, b);
		
		System.out.println("(((((x1*x2)-x3)+x4)*x5)/x6): "+sum);
		
		
		

		
	}

}
