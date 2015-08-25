package com.thoughtworks;

import org.junit.Test;
import org.junit.Assert;

public class TestLine {
    @Test
    public void testSomething(){
        Line line = new Line();
        Assert.assertEquals(10.0, Line.calculateLength(), 0.001);
    }
}
