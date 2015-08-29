package com.thoughtworks.linegeometry;

public class Line {

    private Point pointOne;
    private Point pointTwo;

    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public double length() {
        return pointOne.distanceTo(pointTwo);
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || !(that instanceof Line))
            return false;
        if (this == that)
            return true;
        Line thatLine = (Line) that;
        return compareTwoPointsInterchangibly(thatLine.pointOne, thatLine.pointTwo);
    }

    private boolean compareTwoPointsInterchangibly(Point thatLinePointOne, Point thatLingPointTwo) {
        return (this.pointOne.equals(thatLinePointOne) && this.pointTwo.equals(thatLingPointTwo)) ||
                (this.pointOne.equals(thatLingPointTwo) && this.pointTwo.equals(thatLinePointOne));
    }

    @Override
    public int hashCode() {
        return pointOne.hashCode() * pointTwo.hashCode();
    }
}
