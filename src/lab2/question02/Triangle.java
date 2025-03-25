package question02;

import question01.Point2D;

public class Triangle {
    Point2D p1, p2, p3;
    public Triangle(Point2D p1, Point2D p2, Point2D p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double perimeter(){
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public double area(){
        return Math.sqrt(perimeter()/2*(perimeter()/2-p1.distance(p2))*(perimeter()/2-p1.distance(p3))*(perimeter()/2-p2.distance(p3)));
    } 
}
