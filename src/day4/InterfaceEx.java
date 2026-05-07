package day4;
interface myinterface 

{
    
	void show();
}


//class test implements myinterface 
//{ 
//public void show() 
//{
//    System.out.println("Hello, learners");
//}


public class InterfaceEx {
public static void main(String[] args) {

	myinterface i = ()->{ //shows implementation of show() method by lambda expression
		System.out.println("Hello, learners");
	};
    i.show();        
}
}
