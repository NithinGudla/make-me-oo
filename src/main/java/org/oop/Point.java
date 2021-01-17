package org.oop;

public class Point {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {

        double xDistance = point.getX() - getX();
        double yDistance = point.getY() - getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point point) {

        double xDistance = point.getX() - getX();
        double yDistance = point.getY() - getY();
        return Math.atan2(yDistance, xDistance);
    }
}
