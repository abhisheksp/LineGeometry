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
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Line thatLine = (Line) that;
        return compareTwoPointsInterchangibly(thatLine.pointOne, thatLine.pointTwo);
    }

    private boolean compareTwoPointsInterchangibly(Point thatLinePointOne, Point thatLinePointTwo) {
        return (this.pointOne.equals(thatLinePointOne) && this.pointTwo.equals(thatLinePointTwo)) ||
                (this.pointOne.equals(thatLinePointTwo) && this.pointTwo.equals(thatLinePointOne));
    }
}
