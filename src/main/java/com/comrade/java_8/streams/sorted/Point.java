package com.comrade.java_8.streams.sorted;

import java.util.Objects;

public class Point implements Comparable<Point>{
    public int x;

    public Point(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Point point && x == point.x;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Point o) {
        return Integer.compare(this.x,o.x);
    }
}
