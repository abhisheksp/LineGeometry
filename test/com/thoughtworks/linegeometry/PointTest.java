package com.thoughtworks.linegeometry;

import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {

    @Test
    public void shouldBeEqualComparingAPointToItself() throws Exception {
        Point point = new Point(0, 1);

        assertEquals(point, point);
    }
}