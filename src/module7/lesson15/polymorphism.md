### Polymorphism in Java

Polymorphism is a fundamental concept in object-oriented programming that allows objects to be treated as instances of their parent class rather than their actual class. This means a single function can behave differently based on the object it is acting upon. There are two main types of polymorphism in Java:
1. **Compile-time Polymorphism (Method Overloading)**
2. **Runtime Polymorphism (Method Overriding)**

Let's explore both with examples.

#### Example Code

**Compile-time Polymorphism (Method Overloading)**

```java
class Printer {
    void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    void print(String str) {
        System.out.println("Printing string: " + str);
    }

    void print(double num) {
        System.out.println("Printing double: " + num);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(5);           // Calls print(int num)
        printer.print("Hello");     // Calls print(String str)
        printer.print(3.14);        // Calls print(double num)
    }
}
```

**Runtime Polymorphism (Method Overriding)**

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound();  // Outputs "Dog barks"
        myCat.makeSound();  // Outputs "Cat meows"
    }
}
```

## Summary

- **Compile-time Polymorphism**: Achieved through method overloading. The method to call is determined at compile time.
- **Runtime Polymorphism**: Achieved through method overriding. The method to call is determined at runtime based on the object's actual type.

Polymorphism allows for more flexible and reusable code, as methods can work with objects of different types as long as they share a common superclass.
