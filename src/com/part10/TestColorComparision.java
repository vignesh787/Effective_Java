package com.part10;

public class TestColorComparision {

    public static void main(String args[]) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, "BLUE");
        ColorPoint p4 = new ColorPoint(1, 2, "RED");
        CorrectedColorPoint p5 = new CorrectedColorPoint(1, 2, "BLUE");
        CorrectedColorPoint p6 = new CorrectedColorPoint(1, 2, "RED");


        System.out.println(" Result of Comparision : " + p1.equals(p2));
        System.out.println("Result of second compairision : " + p1.equals(p3));
        System.out.println("Result of second reverse compairision : " + p3.equals(p1)); // non-reflective
        System.out.println("Result of third comparision " + p2.equals(p3));
        System.out.println("Result of Fourth comparision :" + p2.equals(p4));
        System.out.println("Result of fifth comparision :" + p3.equals(p4)); // non-transitive


        System.out.println(" Result of Comparision : " + p1.equals(p2));
        System.out.println("Result of second compairision : " + p1.equals(p5));
        System.out.println("Result of second reverse compairision : " + p5.equals(p1)); // non-reflective
        System.out.println("Result of third comparision " + p2.equals(p5));
        System.out.println("Result of Fourth comparision :" + p2.equals(p6));
        System.out.println("Result of fifth comparision :" + p5.equals(p6)); // non-transitive
    }
    }
