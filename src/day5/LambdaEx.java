package day5;

interface MyInterface{
	void show();
}

//class Test implements MyInterface
//{
//	public void show()
//	{
//		System.out.println("Hello");
//	}
//}
public class LambdaEx {
	
	public static void main(String[] args) 
	{
		MyInterface obj =() -> System.out.println("Lambda method");
		obj.show();
	}


}
