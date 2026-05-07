package assignment_4;

class Rectangle implements Polygon {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}