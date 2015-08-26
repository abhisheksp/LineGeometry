package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class TestLineComparator {

    @Test
    public void shouldReturnTrueComparingALineToItself() {
        Line line = new Line(0, 0, 1, 1);
        LineComparator lineComparator = new LineComparator(line, line);
        Assert.assertEquals(true, lineComparator.checkIfEqual());
    }

    @Test
    public void shouldReturnFalseComparingALinetoAnotherLineWithDiffrentCoordinates() {
        LineComparator lineComparator = new LineComparator(new Line(0, 0, 1, 1), new Line(0, 0, 2, 2));
        Assert.assertEquals(false, lineComparator.checkIfEqual());
    }

    @Test
    public void shouldReturnTrueComparingALinetoAnotherLineWithSameCoordinates() {
        LineComparator lineComparator = new LineComparator(new Line(0, 0, 1, 1), new Line(0, 0, 1, 1));
        Assert.assertEquals(true, lineComparator.checkIfEqual());
    }

    @Test
    public void shouldReturnTrueComparingALinetoAnotherLineWithInterchangedCoordinates() {
        LineComparator lineComparator = new LineComparator(new Line(0, 0, 1, 1), new Line(1, 1, 0, 0));
        Assert.assertEquals(true, lineComparator.checkIfEqual());
    }
}
