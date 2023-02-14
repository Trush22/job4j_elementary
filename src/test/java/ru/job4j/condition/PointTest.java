package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to00then2() {
        double expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to22then2dot24() {
        double expected = 2.24;
        Point a = new Point(3, 4);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to99then5dot66() {
        double expected = 5.65;
        Point a = new Point(5, 5);
        Point b = new Point(9, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}