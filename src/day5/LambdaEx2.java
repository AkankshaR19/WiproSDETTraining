package day5;

interface Print
{
	void display();
}

public class LambdaEx2 {
	
	public static void main(String[] args) 
	{
		Print p = () -> System.out.println("Lambda method");
		p.display();
	}


}
