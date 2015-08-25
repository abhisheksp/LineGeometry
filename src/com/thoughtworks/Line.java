package com.thoughtworks;


public class Line {
    private double x1, x2, y1, y2;

    public Line(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(x1 - x2, 2)+Math.pow(y1-y2, 2));
    }
}
