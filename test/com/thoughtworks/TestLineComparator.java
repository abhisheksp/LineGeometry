package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class TestLineComparator {

    @Test
    public void shouldReturnTrueComparingALineToItself(){
        LineComparator lineComparator = new LineComparator(new Line(0, 0, 1, 1), new Line(0, 0, 1, 1));
        Assert.assertEquals(true, lineComparator.checkIfEqual());
    }
}
