package OpenClosedPrinciple;

import java.awt.*;

abstract class Shape{
    int type;
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("drawing triangle...");
    }
}

class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing Rectangle...");
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

public class NewDemo {
    public static void main(String[] args) {
        GraphicEditor g = new GraphicEditor();
        g.drawShape(new Circle());
        g.drawShape(new Triangle());
    }
}

