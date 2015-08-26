package com.thoughtworks;

import org.junit.Test;
import org.junit.Assert;

public class TestLine {

    @Test
    public void fromZeroZeroToZeroTwohasLengthTwo(){
        Line line = new Line(0, 0, 0, 2);
        Assert.assertEquals(2.0, line.calculateLength(), 0.001);
    }

    @Test
    public void fromOneOneToOneTenhasLengthNine(){
        Line line = new Line(1, 1, 1, 10);
        Assert.assertEquals(9.0, line.calculateLength(), 0.001);
    }

    @Test
    public void fromZeroZeroToOneOnehasLengthOne(){
        Line line = new Line(0, 0, 1, 1);
        Assert.assertEquals(1.41421, line.calculateLength(), 0.001);
    }

}
