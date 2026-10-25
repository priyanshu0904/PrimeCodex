package com.oop.polymorphism.Memory;

public class PassByReference {
    //objects and references
    //java passes the reference value for objects
    //modification to objects in method affect original
    public static void move(Point p){
        p.x++;
        p.y++;
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
