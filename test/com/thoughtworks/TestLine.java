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

    @Test
    public void shouldHaveLengthAsAbsoluteDiffrenceOfThierAbsiccaWhenThierOrdinatesAreSame(){
        Line line = new Line(1, 1, 3, 1);
        Assert.assertEquals(3-1, line.calculateLength(), 0.001);
    }

    @Test
    public void shouldHaveLengthAsAbsoluteDiffrenceOfThierOrdinateWhenThierAbsiccaAreSame(){
        Line line = new Line(1, 3, 1, 5);
        Assert.assertEquals(5-3, line.calculateLength(), 0.001);
    }

    @Test
    public void shouldHaveLengthAsRootOfSumOfSquaresOfDiffrenceOfOrdinatesAndAbsiccaOfEndPoints(){
        Line line = new Line(1, 3, 8, 5);
        Assert.assertEquals(7.28010, line.calculateLength(), 0.001);
    }
}
