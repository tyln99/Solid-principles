package org.example.ocp;

/**
 * Open/Closed Principle (OCP)
 * Definition: Software entities (classes, modules, functions, etc.)
 * should be open for extension but closed for modification.
 */
public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2, 3);

        Shape circle = new Circle(2);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println(calculator.calculateArea(rectangle));
        System.out.println(calculator.calculateArea(circle));

    }
}

//// Before OCP
//public class AreaCalculator {
//    public double calculateArea(Object shape) {
//        if (shape instanceof Circle) {
//            Circle circle = (Circle) shape;
//            return Math.PI * circle.getRadius() * circle.getRadius();
//        } else if (shape instanceof Rectangle) {
//            Rectangle rectangle = (Rectangle) shape;
//            return rectangle.getWidth() * rectangle.getHeight();
//        }
//        return 0;
//    }
//}