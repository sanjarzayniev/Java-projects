package com.epam.rd.autotasks.triangle;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double ab = distance(a, b);
        double bc = distance(b, c);
        double ac = distance(a, c);

        if (!isValidTriangle(ab, bc, ac)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isValidTriangle(double ab, double bc, double ac) {
        return ab + bc > ac && ab + ac > bc && bc + ac > ab;
    }

    private double distance(Point p1, Point p2) {
        return sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));
    }

    public double area() {
        double ab = distance(a, b);
        double bc = distance(b, c);
        double ac = distance(a, c);

        double halfPerimeter = (ab + bc + ac) / 2;
        double area = sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - bc) * (halfPerimeter - ac));
        return area;
    }

    public Point centroid() {
        double _x = (a.x + b.x + c.x) / 3;
        double _y = (a.y + b.y + c.y) / 3;
        return new Point(_x, _y);
    }

}


