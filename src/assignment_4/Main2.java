package assignment_4;

public class Main2 {
	
	public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 3);
        Triangle tri = new Triangle(4, 6);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter(5,3,5,3));

        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter(3,4,5));

        System.out.println(Polygon.shapeInfo());
    }

}
