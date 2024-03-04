# Animal Class Example

This Java project demonstrates the use of Object-Oriented Programming (OOP) principles including Inheritance, Encapsulation, Abstraction, and Polymorphism. It includes an `Animal` class as the base class and a `Lion` class as a subclass that extends `Animal`.

## Classes

### Animal.java
- The `Animal` class represents a generic animal with attributes for `name` and `age`.
- It includes constructor, getter, and setter methods for `name` and `age`.
- The class provides two abstract methods: `makeSound()` and `move()`. These methods are meant to be implemented by subclasses to provide specific behaviors for different types of animals.

### Lion.java
- The `Lion` class extends the `Animal` class.
- It provides specific implementations for the `makeSound()` and `move()` methods, representing the sounds and movements of a lion.
- Additionally, the `Lion` class includes a method `hunt()` which is specific to lions.

### Main.java
- The `Main` class serves as the driver class to run and test the code.
- It creates a `Lion` object, sets its attributes, and calls its methods to demonstrate the behavior of the `Animal` hierarchy.

## Principles Demonstrated
1. **Inheritance**:
   - The `Lion` class extends the `Animal` class, inheriting its attributes (`name`, `age`) and methods (`makeSound()`, `move()`).

2. **Encapsulation**:
   - Private attributes (`name`, `age`) in the `Animal` class with getter and setter methods provide controlled access to these fields.

3. **Abstraction**:
   - The `Animal` class declares abstract methods `makeSound()` and `move()`, leaving their implementation details to the subclasses. This allows for the abstraction of common behaviors across different animal types.

4. **Polymorphism**:
   - The `Lion` class provides different implementations of the `makeSound()` and `move()` methods compared to the generic `Animal` class.
   - It also introduces an additional method `hunt()`, which demonstrates the ability to have methods specific to a particular subclass.

