package com.thoughtworks;

import org.junit.Test;
import org.junit.Assert;

public class TestLine {

    @Test
    public void fromZeroZeroToOneOnehasLengthRootTwo(){
        Line line = new Line();
        Assert.assertEquals(1.0, line.calculateLength(), 0.001);
    }
}
