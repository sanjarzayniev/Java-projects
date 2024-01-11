package com.epam.rd.autotasks.segments;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        try {
            if (start.x == end.x && start.y == end.y) {
                throw new RuntimeException();
            } else {
                this.start = start;
                this.end = end;
            }
        } catch (IllegalArgumentException exc) {
            exc.printStackTrace();
        }
    }

    double length() {
        return sqrt(pow((start.x - end.x), 2) + pow((start.y - end.y), 2));
    }

    Point middle() {
        Point point;
        double x = (start.x + end.x) / 2;
        double y = (start.y + end.y) / 2;
        point = new Point(x, y);
        return point;
    }

    Point intersection(Segment another) {
        Point point;

        if ((start.x - end.x) * (another.start.y - another.end.y) == (start.y - end.y)
                * (another.start.x - another.end.x)) {
            return null;
        } else if (!(0 <= (((start.x - another.start.x) * (another.start.y - another.end.y)
                - (start.y - another.start.y) * (another.start.x - another.end.x))
                / ((start.x - end.x) * (another.start.y - another.end.y)
                        - (start.y - end.y) * (another.start.x - another.end.x)))
                && ((((start.x - another.start.x) * (another.start.y - another.end.y)
                        - (start.y - another.start.y) * (another.start.x - another.end.x))
                        / ((start.x - end.x) * (another.start.y - another.end.y)
                                - (start.y - end.y) * (another.start.x - another.end.x))) <= 1))
                || !((0 <= (((start.x - another.start.x) * (start.y - end.y)
                        - (start.y - another.start.y) * (start.x - end.x))
                        / ((start.x - end.x) * (another.start.y - another.end.y)
                                - (start.y - end.y) * (another.start.x - another.end.x))))
                        && ((((start.x - another.start.x) * (start.y - end.y)
                                - (start.y - another.start.y) * (start.x - end.x))
                                / ((start.x - end.x) * (another.start.y - another.end.y)
                                        - (start.y - end.y) * (another.start.x - another.end.x))) <= 1))) {
            return null;
        } else {
            double _x = ((start.x * end.y - start.y * end.x) * (another.start.x - another.end.x)
                    - (start.x - end.x) * (another.start.x * another.end.y - another.start.y * another.end.x))
                    / ((start.x - end.x) * (another.start.y - another.end.y)
                            - (start.y - end.y) * (another.start.x - another.end.x));
            double _y = ((start.x * end.y - start.y * end.x) * (another.start.y - another.end.y)
                    - (start.y - end.y) * (another.start.x * another.end.y - another.start.y * another.end.x))
                    / ((start.x - end.x) * (another.start.y - another.end.y)
                            - (start.y - end.y) * (another.start.x - another.end.x));
            point = new Point(_x, _y);
            return point;
        }
    }

}


