/*WAP in Java to demonstrate multiple inheritance using interfaces
+ Interface A
- has points as input parameters
> Interfare B
> has length as input
- Create a class circle
-> call both interfaces
+ a circle has radius as
length and centre as a point
-> display properties of 2 circles
2 objects
.- auto increment
- pur values for each circle
> display the properties 
author-barkha   500105541 r2142220462*/


interface A {
    void setPoints(int point1, int point2);
}

interface B {
    void setRadius(int radius);
}

class Circle implements A, B {
    private int radius;
    private int point1;
    private int point2;
    private int idnum;
    private static int nextid = 1;

    public Circle(int radius, int point1, int point2) {
        this.idnum = nextid++;
        this.radius = radius;
        this.point1 = point1;
        this.point2 = point2;
    }

    public void setPoints(int point1, int point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void displayProperties() {
        System.out.println("Circle " + idnum);
        System.out.println("Radius: " + radius);
        System.out.println("Center coordinates: " + point1 + "," + point2);
    }
}

public class interface2 {

    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 0, 10);
        Circle circle2 = new Circle(9, 0, 1);

        circle1.displayProperties();
        circle2.displayProperties();
    }
}
