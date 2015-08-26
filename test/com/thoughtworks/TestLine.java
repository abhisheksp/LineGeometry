package com.thoughtworks;

import org.junit.Test;
import org.junit.Assert;

public class TestLine {

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantOne(){
        Line line = new Line(1, 1, 1, 1);
        Assert.assertEquals(0.0, line.calculateLength(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantTwo(){
        Line line = new Line(-1, 1, -1, 1);
        Assert.assertEquals(0.0, line.calculateLength(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantThree(){
        Line line = new Line(-1, -1, -1, -1);
        Assert.assertEquals(0.0, line.calculateLength(), 0.001);
    }

    @Test
    public void shouldHaveLengthZeroHavingSameEndPointsInQuadrantFour(){
        Line line = new Line(1, -1, 1, -1);
        Assert.assertEquals(0.0, line.calculateLength(), 0.001);
    }
    
}
