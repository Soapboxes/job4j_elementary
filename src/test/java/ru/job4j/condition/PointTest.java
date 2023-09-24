package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2d;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

    @Test
    void when12To21Then1dot414() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 1;
        double expected = 1.414d;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10To22Then2dot236() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double expected = 2.236d;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when100To22Then8() {
        int x1 = 10;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 8d;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}