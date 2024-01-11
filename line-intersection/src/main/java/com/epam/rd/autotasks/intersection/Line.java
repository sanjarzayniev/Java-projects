package com.epam.rd.autotasks.intersection;

public class Line {
    int k;
    int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        Point point;
        if (k == other.k) {
            return null;
        } else {
            int x = (other.b - b) / (k - other.k);
            int y = k * (other.b - b) / (k - other.k) + b;
            point = new Point(x, y);
            return point;
        }
    }
}
