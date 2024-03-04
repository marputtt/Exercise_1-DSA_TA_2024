public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method for Lion
    @Override
    public void makeSound() {
        System.out.println("Roarrr!");
    }

    // Overriding move method for Lion
    @Override
    public void move() {
        System.out.println("Lion jumps over the tree");
    }

    // Additional method specific to Lion
    public void hunt() {
        System.out.println("Lion is hunting");
    }
}
