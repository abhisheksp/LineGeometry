package com.thoughtworks;

public class LineComparator {

    private Line line1, line2;

    public LineComparator(Line line1, Line line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    public boolean checkIfEqual() {
        return (line1.x1() == line2.x1() && line1.y1() == line2.y1() && line1.x2() == line2.x2() && line1.y2() == line2.y2());
    }
}
