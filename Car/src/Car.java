import java.util.Scanner;

public class Car {
    // Attributes
    private int maxSpeed;
    private String name;
    private int yearOfMake;

    // Constructor
    public Car(int maxSpeed, String name, int yearOfMake) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.yearOfMake = yearOfMake;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Year of Make: " + yearOfMake);
    }

    // Method to check if the car is vintage (more than 20 years old)
    public boolean isVintage() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - yearOfMake > 20;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for car details
        System.out.println("Enter car name:");
        String name = input.nextLine();

        System.out.println("Enter max speed (km/h):");
        int maxSpeed = input.nextInt();

        System.out.println("Enter year of make:");
        int yearOfMake = input.nextInt();

        // Creating a new Car object
        Car myCar = new Car(maxSpeed, name, yearOfMake);

        // Closing the scanner

        // Displaying car details
        System.out.println("Car Details:");
        myCar.displayDetails();

        // Checking if the car is vintage
        if (myCar.isVintage()) {
            System.out.println("This car is vintage.");
        } else {
            System.out.println("This car is not vintage.");
        }
    }
}
