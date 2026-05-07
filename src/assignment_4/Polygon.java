package assignment_4;

interface Polygon {

    double getArea();

    default double getPerimeter(int... sides) {
        double sum = 0;
        for (int s : sides) {
            sum += s;
        }
        return sum;
    }

    static String shapeInfo() {
        return "Polygons are shapes with multiple sides.";
    }
}
