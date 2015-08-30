package com.thoughtworks.linegeometry;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPoint {

    @Test
    public void shouldBeEqualComparingAPointToItself() {
        Point point = new Point(0, 1);

        assertEquals(point, point);
    }

    @Test
    public void shouldNotBeEqualComparingAPointToNull() {
        assertNotEquals(new Point(1, 2), null);
    }

    @Test
    public void shouldNotBeEqualComparingAPointToNonPointEntity() {
        assertNotEquals(new Point(1, 2), "Not a Point!");
    }

    @Test
    public void shouldBeEqualComparingAPointToAnotherPointWithSameCoordinates() {
        assertEquals(new Point(1, 2), new Point(1, 2));
    }

    @Test
    public void shouldHaveSameHashCodeComparingAPointToItself() {
        Point point = new Point(1, 2);

        assertEquals(point.hashCode(), point.hashCode());
    }

    @Test
    public void shouldHaveSameHashCodeComparingAPointToAnotherPointWithSameCoordinates() {
        assertEquals(new Point(9,10), new Point(9, 10));
    }

    @Test
    public void shouldBeZeroCalculatingDistanceFromOnePointToItself() {
        Point point = new Point(1, 2);

        assertEquals(0.0, point.distanceTo(point), 0.0001);
    }

    @Test
    public void shouldNotBeZeroCalculatingDistanceFromOnePointToAnotherPointWithDifferentCoordinates() {
        assertNotEquals(0.0, new Point(3, 4).distanceTo(new Point(5, 6)), 0.0001);
    }

    @Test
    public void shouldBeZeroCalculatingDistanceFromOnePointToAnotherPointWithSameCoordinates() {
        assertEquals(0.0, new Point(3, 4).distanceTo(new Point(3, 4)), 0.0001);
    }
}