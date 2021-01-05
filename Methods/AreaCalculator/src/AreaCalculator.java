public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double circleRadius = radius * radius * Math.PI;
        return circleRadius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double areaRectangle = x*y;
        return areaRectangle;
    }
}
