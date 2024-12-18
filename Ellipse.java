package kyle_pacaña_finals;

public class Ellipse extends ConicSection {
    private double h, k, a, b, c; // Center coordinates, semi-major axis, and semi-minor axis

    public Ellipse(double h, double k, double a, double b) {
        this.h = h;
        this.k = k;
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a * a - b * b);
    }


    public void calculateProperties() {
        System.out.println("Ellipse Properties:");
        System.out.println("Center: (" + h + ", " + k + ")");
        System.out.println("Major Axis Length: " + (2 * Math.max(a, b)));
        System.out.println("Minor Axis Length: " + (2 * Math.min(a, b)));
        System.out.println("Foci: (" + h + " ± " + c + ", " + k + ")");
        System.out.println("Vertices: (" + h + " ± " + a + ", " + k + ")");
    }
}
