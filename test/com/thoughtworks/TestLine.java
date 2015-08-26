package com.thoughtworks;

import org.junit.Test;
import org.junit.Assert;

public class TestLine {

    @Test
    public void shouldHaveLengthZeroHavingSameEndPoints(){
        Line line = new Line(1, 1, 1, 1);
        Assert.assertEquals(0.0, line.calculateLength(), 0.001);
    }

}
