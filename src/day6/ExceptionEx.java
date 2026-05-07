package day6;

public class ExceptionEx {

	public static void main(String[] args) {
		try
		{
			int result=10/0; //risky code
			System.out.println(result);		
		}
		catch (ArithmeticException e) //handle the exception
		{
			System.out.println("Cannot divide by zero");
		}

	}

}
