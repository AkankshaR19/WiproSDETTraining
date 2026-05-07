package assignment_4;

class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public void moveUp() { center.moveUp(); }
    public void moveDown() { center.moveDown(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }

    public String toString() {
        return "Circle Center: " + center + " Radius: " + radius;
    }
}