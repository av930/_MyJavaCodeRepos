package shape;

interface Color {
    public void setColor(int color);
    public int getColor();
}


class Shape implements Color{
    private int color;
    public void setColor(int color){ this.color= color;}
    public int getColor(){return color;}

    public double getPerimeter();
    public double getArea();
}

class Quadrangle implements Shape{
    private int color;
    private int width;
    private int height;

    public Quadrangle(int width, int height){ this.width= width; this.height= height;}
    public void setColor(int color){ this.color= color;}
    public int getColor(){return color;}
    public double getPerimeter(){return width * height * 2;}
    public double getArea(){return width * height;}
}

class Triangle extends Shape {
    private int color;
    private int width;
    private int height;

    public Triangle(int width, int height){ this.width= width; this.height= height;}
    public double getPerimeter(){return width * height * 2;}
    public double getArea(){return width * height;}
}

interface Eclipse implements Shape {
    private static final double PI = Math.PI;
    private int color;
    private int radius;

    public Eclipse(int radius){ this.radius= radius;}
    public void setColor(int color){ this.color= color;}
    public int getColor(){return color;}
    public double getPerimeter(){return (2* PI* radius);}
    public double getArea(){return (PI * Math.pow(radius, 2));}
}


class Rectangle


public class ControlShape {

    public static void main(String[] args) {

    }
}
