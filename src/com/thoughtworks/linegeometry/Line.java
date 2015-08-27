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
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Line))
            return false;
        if(this == o)
            return true;
        Line line = (Line) o;
        return line.x1 == this.x1 && line.y1 == this.y1 && line.x2 == this.x2 && line.y2 == this.y2 ||
                line.x1 == this.x2 && line.y1 == this.y2 && line.x2 == this.x1 && line.y2 == this.y1;
    }
}
