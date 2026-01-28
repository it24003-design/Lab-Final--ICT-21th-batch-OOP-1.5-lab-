abstract class Shape {
    public abstract double area();
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}

class Rectangle extends Shape implements Drawable {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length " + length + " and width " + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        Drawable d1 = (Drawable) s1;
        Drawable d2 = (Drawable) s2;

        System.out.println("Circle area: " + s1.area());
        d1.draw();

        System.out.println("Rectangle area: " + s2.area());
        d2.draw();
    }
}
