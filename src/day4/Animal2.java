package day4;

interface Animal {
        
    	void sound();
}
interface Pet
{
	void play();
}
class Dog implements Animal, Pet { //multiple inheritance
    public void sound() 
    {
        System.out.println("Barks");
    }
    public void play()
    {
    	System.out.println("Dog plays");
    }
}

public class Animal2 {
    public static void main(String[] args) {

        Animal a = new Dog(); //runtime polymorphism
        a.sound();        
    }
}
