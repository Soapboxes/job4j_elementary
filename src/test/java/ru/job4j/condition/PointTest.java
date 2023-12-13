package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2d;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12To21Then1dot414() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        double expected = 1.414d;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10To22Then2dot236() {
        Point c = new Point(1, 0);
        Point d = new Point(2, 2);
        double out = d.distance(c);
        double expected = 2.236d;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when100To22Then8() {
        Point a = new Point(10, 0);
        Point b = new Point(2, 0);
        double expected = 8d;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12To23To64Then2dot449() {
        Point three3 = new Point(1, 2, 6);
        Point thr3 = new Point(2, 3, 4);
        double expected = 2.449d;
        double out = three3.distance3d(thr3);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when21To21To22Then2dot449() {
        Point three3 = new Point(2, 2, 2);
        Point thr3 = new Point(1, 1, 2);
        double expected = 1.414d;
        double out = three3.distance3d(thr3);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}

