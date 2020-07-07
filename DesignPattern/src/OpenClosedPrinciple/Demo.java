//package OpenClosedPrinciple;
//
//import java.awt.*;
//
//class Shape{
//    int type;
//}
//
//class Circle extends Shape {
//    Circle() {
//        super.type = 1;
//    }
//}
//
//class Triangle extends Shape {
//    Triangle() {
//        super.type = 2;
//    }
//}
//class GraphicEditor{
//    public void drawShape(Shape s){
//        if (s.type == 1){
//            drawCircle();
//        } else if (s.type == 2){
//            drawTriangle();
//        }
//    }
//
//    private void drawTriangle() {
//        System.out.println("drawing triangle...");
//    }
//
//    private void drawCircle() {
//        System.out.println("drawing circle...");
//    }
//
//
//}
//public class Demo {
//    public static void main(String[] args) {
//        GraphicEditor g = new GraphicEditor();
//        g.drawShape(new Circle());
//        g.drawShape(new Triangle());
//    }
//}
//
