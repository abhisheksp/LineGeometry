package com.thoughtworks.linegeometry;

import static java.lang.Math.*;

public class Line {

    private int x1, x2, y1, y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double length() {
        return sqrt(squareOfDifference(x1, x2) + squareOfDifference(y1, y2));
    }

    private double squareOfDifference(int value1, int value2) {
        return pow(value1 - value2, 2);
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || !(that instanceof Line))
            return false;
        if(this == that)
            return true;
        Line thatLine = (Line) that;
        return compareTwoCoordinatePairsInterchangibly(thatLine.x1, thatLine.y1, thatLine.x2, thatLine.y2);
    }

    private boolean compareTwoCoordinatePairsInterchangibly(int otherX1, int otherY1, int otherX2, int otherY2) {
        return compareTwoCoordinatePairs(otherX1, otherY1, otherX2, otherY2) ||
                compareTwoCoordinatePairs(otherX2, otherY2, otherX1, otherY1);
    }

    private boolean compareTwoCoordinatePairs(int otherX1, int otherY1, int otherX2, int otherY2) {
        return otherX1 == this.x1 && otherY1 == this.y1 && otherX2 == this.x2 && otherY2 == this.y2;
    }
}
