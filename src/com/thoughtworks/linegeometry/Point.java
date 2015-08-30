package com.thoughtworks.linegeometry;

import static java.lang.Math.*;

public class Point {

    private int x1, y1;

    public Point(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Point thatPoint = (Point) that;
        if (this.x1 != thatPoint.x1) return false;
        return this.y1 == thatPoint.y1;
    }

    public double distanceTo(Point that) {
        return sqrt(SquareOfDifferenceOfXCoordinates(that) + SquareOfDifferenceOfYCoordinates(that));
    }

    private double SquareOfDifferenceOfYCoordinates(Point that) {
        return pow(this.y1 - that.y1, 2);
    }

    private double SquareOfDifferenceOfXCoordinates(Point that) {
        return pow(this.x1 - that.x1, 2);
    }
}
