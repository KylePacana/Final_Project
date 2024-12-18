package kyle_pacaña_finals;

import java.util.Scanner;

public class Kyle_Pacaña_Finals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Select a conic section to calculate properties:");
            System.out.println("1. Parabola\n2. Ellipse\n3. Circle\n4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vertex (h, k): ");
                    double h1 = scanner.nextDouble();
                    double k1 = scanner.nextDouble();
                    System.out.print("Enter distance to focus (p): ");
                    double p1 = scanner.nextDouble();
                    Parabola parabola = new Parabola(h1, k1, p1);
                    parabola.calculateProperties();
                    break;

                case 2:
                    System.out.print("Enter center (h, k): ");
                    double h2 = scanner.nextDouble();
                    double k2 = scanner.nextDouble();
                    System.out.print("Enter semi-major axis (a): ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Enter semi-minor axis (b): ");
                    double b2 = scanner.nextDouble();
                    Ellipse ellipse = new Ellipse(h2, k2, a2, b2);
                    ellipse.calculateProperties();
                    break;

                case 3:
                    System.out.print("Enter center (h, k): ");
                    double h3 = scanner.nextDouble();
                    double k3 = scanner.nextDouble();
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(h3, k3, radius);
                    circle.calculateProperties();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        scanner.close();
    }
}
