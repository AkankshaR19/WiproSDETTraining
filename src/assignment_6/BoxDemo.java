package assignment_6;

class Box {
    int length;

    Box(int length) {
        this.length = length;
    }
}

public class BoxDemo {

    public static void updateBox(Box b) {
        b.length = b.length + 20;
    }

    public static void main(String[] args) {
        Box myBox = new Box(10);

        System.out.println("Before change: " + myBox.length);

        updateBox(myBox);

        System.out.println("After change: " + myBox.length);
    }
}