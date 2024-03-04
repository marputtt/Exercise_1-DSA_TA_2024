public class Main {
    public static void main(String[] args) {
        // Creating a Lion object
        Lion lion = new Lion("Farrel", 19);

        // Using getters to get Lion's details
        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());

        // Using Lion's methods
        lion.makeSound();
        lion.move();
        lion.hunt();
    }
}
