import java.awt.RadialGradientPaint;

public class Main {
    interface Shape {
        double area();
    }

    static class Circle implements Shape {

        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

    }

    static class Square implements Shape {

        double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }

    }
    // (they must be `static` — main is static and cannot build an inner class)

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String kind = sc.nextLine();
        double dim = Double.parseDouble(sc.nextLine());
        Shape s = kind.equals("circle") ? new Circle(dim) : new Square(dim);
        System.out.println(String.format("%.2f", s.area()));
    }
}
