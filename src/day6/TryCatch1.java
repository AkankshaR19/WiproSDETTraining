package day6;

public class TryCatch1 {
	public static void main(String[] args) 
	{
		try
		{
			//int x=10/0; //it will execute this and stop
			int arr[]=new int[3];
		
			arr[5]=10;
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmentic Error");	
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Error");
		}
	}

}
