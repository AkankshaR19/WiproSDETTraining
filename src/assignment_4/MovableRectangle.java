package assignment_4;

class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.xSpeed == bottomRight.xSpeed &&
            topLeft.ySpeed == bottomRight.ySpeed) {

            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        } else {
            System.out.println("Error: Speeds must match");
        }
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "Rectangle TopLeft: " + topLeft +
               " BottomRight: " + bottomRight;
    }
}