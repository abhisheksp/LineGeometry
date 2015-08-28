package com.thoughtworks.linegeometry;

import static java.lang.Math.pow;

public class Point {

    private int x1, y1;

    public Point(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public int differenceOfXCoordinates(Point that) {
        return this.x1 - that.x1;
    }

    public int differenceOfYCoordinates(Point that) {
        return this.y1 - that.y1;
    }

    @Override
    public boolean equals(Object thatPoint) {
        if (thatPoint == null || !(thatPoint instanceof Point))
            return false;
        if (this == thatPoint)
            return true;
        Point that = (Point) thatPoint;
        return this.x1 == that.x1 && this.y1 == that.y1;
    }

    @Override
    public int hashCode() {
        return (int) pow(x1, y1) % Integer.MAX_VALUE;
    }
}
