package day5;
interface vehicle
{
	default void start()
	{
		System.out.println("Vehicle is starting.....");
	}
}
class car implements vehicle{
	
}
public class Default {

	public static void main(String[] args) {
		car c = new car();
		c.start();
		

	}

}
