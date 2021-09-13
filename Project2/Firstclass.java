package pkg1;

public class Firstclass 
{
	int a;
	
	public void display()
	{
		System.out.println("Welcome");
		System.out.println("share");
	}
	
	public static void main(String[] args) 
	{
		Firstclass durgesh = new Firstclass();
		durgesh.display();
		durgesh.a=921084943;
		System.out.println(durgesh.a);
		
	}

}
