package com.thoughtworks;

import org.junit.Test;
import org.junit.Assert;

public class TestLine {

    @Test
    public void fromZeroZeroToOneOnehasLengthOne(){
        Line line = new Line(0, 0, 1, 1);
        Assert.assertEquals(1.0, line.calculateLength(), 0.001);
    }

    @Test
    public void fromZeroZeroToZeroTwohasLengthTwo(){
        Line line = new Line(0, 0, 0, 2);
        Assert.assertEquals(1.0, line.calculateLength(), 0.001);
    }
}
