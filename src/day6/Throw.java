package day6;

public class Throw {
	public static void main(String[] args) 
	{
		int age=45;
		if (age<18)
		{
			throw new ArithmeticException("Not eligible to vote");
		}
		System.out.println("ELigible");
	}

}
