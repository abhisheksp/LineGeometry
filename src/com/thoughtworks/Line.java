package com.thoughtworks;


public class Line {
    private int x1, x2, y1, y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double calculateLength() {
        if( y1 == y2)
            return Math.abs(x1 - x2);
        else if( x1 == x2)
            return Math.abs(y1 - y2);
        else
            return 0.0;
    }
}
