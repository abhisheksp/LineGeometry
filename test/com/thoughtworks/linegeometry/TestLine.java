package com.thoughtworks.linegeometry;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLine {

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantOne() {
        Line line = new Line(new Point(1, 1), new Point(1, 1));

        assertEquals(0.0, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantTwo() {
        Line line = new Line(new Point(-1, 1), new Point(-1, 1));

        assertEquals(0.0, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantThree() {
        Line line = new Line(new Point(-1, -1), new Point(-1, -1));

        assertEquals(0.0, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantFour() {
        Line line = new Line(new Point(1, -1), new Point(1, -1));

        assertEquals(0.0, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthAsAbsoluteDifferenceOfTheirAbsiccaWhenTheirOrdinatesAreSame() {
        Line line = new Line(new Point(1, 1), new Point(3, 1));

        assertEquals(3 - 1, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthAsAbsoluteDifferenceOfTheirOrdinateWhenTheirAbscissaAreSame() {
        Line line = new Line(new Point(1, 3), new Point(1, 1));

        assertEquals(5 - 3, line.length(), 0.001);
    }

    @Test
    public void shouldHaveLengthAsRootOfSumOfSquaresOfDifferenceOfOrdinatesAndAbscissaOfEndPoints() {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        assertEquals(2.8284, line.length(), 0.001);
    }

    @Test
    public void shouldBeEqualWhenComparingALineToItself() {
        Line line = new Line(new Point(1, 1), new Point(2, 2));

        assertEquals(line, line);
    }

    @Test
    public void shouldBeEqualWhenComparingALineToAnotherLineWithSameCoordinates() {
        assertEquals(new Line(new Point(1, 1), new Point(2, 2)), new Line(new Point(1, 1), new Point(2, 2)));
    }

    @Test
    public void shouldNotBeEqualWhenComparingALineToAnotherLineWithDifferentCoordinates() {
        assertNotEquals(new Line(new Point(1, 1), new Point(2, 2)), new Line(new Point(3, 4), new Point(5, 6)));
    }

    @Test
    public void shouldBeEqualWhenComparingALineToAnotherLineWithInterchangedCoordinates() {
        assertEquals(new Line(new Point(3, 4), new Point(5, 6)), new Line(new Point(5, 6), new Point(3, 4)));
    }

    @Test
    public void shouldNotBeEqualWhenComparingALineToNull() {
        assertNotEquals(new Line(new Point(1, 1), new Point(2, 2)), null);
    }

    @Test
    public void shouldNotBeEqualWhenComparingALineToNonLineEntity() {
        assertNotEquals(new Line(new Point(0, 0), new Point(6, 6)), "I am Not a Line");
    }
}
