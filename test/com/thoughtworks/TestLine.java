package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLine {

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantOne() {
        Line line = new Line(1, 1, 1, 1);
        assertEquals(0.0, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantTwo() {
        Line line = new Line(-1, 1, -1, 1);
        assertEquals(0.0, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantThree() {
        Line line = new Line(-1, -1, -1, -1);
        assertEquals(0.0, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantFour() {
        Line line = new Line(1, -1, 1, -1);
        assertEquals(0.0, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthAsAbsoluteDiffrenceOfThierAbsiccaWhenThierOrdinatesAreSame() {
        Line line = new Line(1, 1, 3, 1);
        assertEquals(3 - 1, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthAsAbsoluteDiffrenceOfThierOrdinateWhenThierAbsiccaAreSame() {
        Line line = new Line(1, 3, 1, 5);
        assertEquals(5 - 3, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthAsRootOfSumOfSquaresOfDiffrenceOfOrdinatesAndAbsiccaOfEndPoints() {
        Line line = new Line(1, 3, 8, 5);
        assertEquals(7.28010, line.length(), 0.001);
    }

    @Test
    public void shouldReturnTrueComparingALineToItself() {
        Line line = new Line(1, 3, 8, 5);
        assertEquals(line, line);
    }

    @Test
    public void shouldReturnTrueComparingALineToAnotherLineWithSameCoordinates() {
        assertEquals(new Line(0, 0, 1, 1), new Line(0, 0, 1, 1));
    }
}
