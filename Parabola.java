package kyle_pacaña_finals;

public class Parabola extends ConicSection {
    private double h, k, p; // Vertex coordinates and distance to focus

    public Parabola(double h, double k, double p) {
        this.h = h;
        this.k = k;
        this.p = p;
    }

    @Override
    public void calculateProperties() {
        double focusY = k + p;
        double directrixY = k - p;
        double latusRectumLength = Math.abs(4 * p);

        System.out.println("Parabola Properties:");
        System.out.println("Vertex: (" + h + ", " + k + ")");
        System.out.println("Focus: (" + h + ", " + focusY + ")");
        System.out.println("Directrix: y = " + directrixY);
        System.out.println("Latus Rectum Length: " + latusRectumLength);
    }
}
