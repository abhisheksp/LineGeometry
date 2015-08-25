package com.thoughtworks;

import org.junit.Test;
import org.junit.Assert;

public class TestLine {
    @Test
    public void testCalculateLength(){
        Line line = new Line(10, 20, 30, 40);
        Assert.assertEquals(10.0, line.calculateLength(), 0.001);
    }
}
