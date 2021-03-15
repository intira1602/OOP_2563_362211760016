package LAB8;

import java.awt.*;
import java.util.ArrayList;

public class Object2DApp {
    public static void main(String[] args) {
        //Circle
        Circle c1 = new Circle(10.0);
        c1.calArea();
        System.out.println(c1.getArea());
        //Rectangle
        Rectangle r1;
        r1 = new Rectangle();
        //r1.calArea();
        //System.out.println(r1.getArea());
        //Triangle
        //Triangle t1 = new Triangle(10.0, 5.0);
        //t1.calArea();
        //System.out.println(t1.getArea());

        ArrayList<Object2D> myObject = new ArrayList<Object2D>();
        myObject.add(c1);
        //myObject.add();
        //myObject.add();

    }//main
}//class
