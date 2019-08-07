package com.ravi.com.ravi.generalProblems.distanceBtnPnts;

public class DistanceBtnPoints {
    public static void main(String[] args) {
        DistanceBtnPoints distanceBtnPoints = new DistanceBtnPoints();
        Point point1 = new Point();
        point1.setX(0);
        point1.setY(0);


        Point point2 = new Point();
        point2.setX(3);
        point2.setY(4);

        System.out.println(distanceBtnPoints.isWithInDistance(point1, point2, 10));

    }

    public double getDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }

    public boolean isWithInDistance(Point point1, Point point2, double distance) {
        if (getDistance(point1, point2) <= distance) {
            return true;
        }
        return false;
    }
}
