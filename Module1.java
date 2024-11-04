import java.util.Scanner;

public class Module1 {
    // Data fields
    private Scanner sc;
    private int i;
    private double d;

    // Constructor method
    public Module1() {
        sc = new Scanner(System.in); // Creating Scanner object
    }

    // Method to calculate int square root
    public int squareRoot(int number) {
        return (int) Math.pow(number, 0.5); // Square root calculation for int
    }

    // Method to calculate int cube root
    public int cubeRoot(int number) {
        return (int) Math.pow(number, 1.0 / 3.0); // Cube root calculation for int
    }

    // Method to calculate double square root
    public double squareRoot(double number) {
        return Math.pow(number, 0.5); // Square root calculation for double
    }

    // Method to calculate double cube root
    public double cubeRoot(double number) {
        return Math.pow(number, 1.0 / 3.0); // Cube root calculation for double
    }

    // Main method
    public static void main(String[] args) {
        Module1 m = new Module1(); // Creating new Module1 object

        System.out.println("starting application");
        System.out.println("Please enter an integer:");

        m.d = m.sc.nextDouble(); // Reading user input as double
        m.i = (int) m.d; // Typecasting double to int

        // Calling methods and printing results
        System.out.println("int square root: " + m.squareRoot(m.i));
        System.out.println("int cube root: " + m.cubeRoot(m.i));

        System.out.println("double square root: " + m.squareRoot(m.d));
        System.out.println("double cube root: " + m.cubeRoot(m.d));

        System.out.println("ending application");
    }
}
