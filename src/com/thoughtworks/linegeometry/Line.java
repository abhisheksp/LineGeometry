package com.thoughtworks.linegeometry;

import static java.lang.Math.*;

public class Line {

    private Point pointOne;
    private Point pointTwo;

    public Line(int x1, int y1, int x2, int y2) {
        this.pointOne = new Point(x1, y1);
        this.pointTwo = new Point(x2, y2);
    }

    public double length() {
        return sqrt(square(pointOne.differenceOfXCoordinates(pointTwo)) + square(pointOne.differenceOfYCoordinates(pointTwo)));
    }

    private double square(int value) {
        return pow(value, 2);
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
}
