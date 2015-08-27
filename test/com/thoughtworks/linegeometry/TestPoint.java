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
}