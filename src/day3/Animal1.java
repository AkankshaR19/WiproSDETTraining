package day3;

abstract class Animal {
    abstract void sound(); //abstract method
    void sleep() //concrete method
    {
    	System.out.println("Sleeping");
    }
}
class Dog extends Animal {
    void sound() 
    {
        System.out.println("Barks");
    }
}

public class Animal1 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
