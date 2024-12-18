package kyle_pacaña_finals;

public class Circle extends ConicSection {
    private double radius;
    private double h;
    private double k;

    public Circle(double h, double k, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.h = h;  // Directly assigning values
        this.k = k;
        this.radius = radius;
    }

    public void calculateProperties() {
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circle Properties:");
        System.out.println("Center: (" + h + ", " + k + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
