package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class TestLineComparator {

    @Test
    public void shouldReturnTrueComparingALineToItself(){
        Line line = new Line(0, 0, 1, 1);
        LineComparator lineComparator = new LineComparator(line, line);
        Assert.assertEquals(true, lineComparator.checkIfEqual());
    }
}
