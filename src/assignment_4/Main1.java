package assignment_4;

public class Main1 {
	
	public static void main(String[] args) {

        MovablePoint p1 = new MovablePoint(0, 0, 2, 2);
        MovableCircle circle = new MovableCircle(5, p1);

        MovablePoint p2 = new MovablePoint(1, 1, 1, 1);
        MovablePoint p3 = new MovablePoint(4, 4, 1, 1);
        MovableRectangle rect = new MovableRectangle(p2, p3);

        System.out.println(circle);
        circle.moveRight();
        circle.moveUp();
        System.out.println("After moving: " + circle);

        System.out.println(rect);
        rect.moveDown();
        System.out.println("After moving: " + rect);
    }

}
