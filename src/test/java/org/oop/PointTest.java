package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {

        Point origin = new Point(0, 0);

        double distance = origin.distance(origin);

        Assertions.assertEquals(0, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {

        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distance1 = origin.distance(point1);
        double distance2 = origin.distance(point2);

        Assertions.assertEquals(1, distance1);
        Assertions.assertEquals(1, distance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {

        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distance = point1.distance(point2);

        Assertions.assertEquals(2, distance);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {

        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double direction1 = origin.direction(point1);
        double direction2 = origin.direction(point2);

        Assertions.assertEquals(0, direction1);
        Assertions.assertEquals(0, direction2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {

        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double direction1 = origin.direction(point1);
        double direction2 = origin.direction(point2);

        Assertions.assertEquals(Math.PI, direction1);
        Assertions.assertEquals(Math.PI, direction2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {

        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double direction1 = origin.direction(point1);
        double direction2 = origin.direction(point2);

        Assertions.assertEquals(Math.PI / 2, direction1);
        Assertions.assertEquals(Math.PI / 2, direction2);
    }
}
