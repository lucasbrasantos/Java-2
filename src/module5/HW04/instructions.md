
### Instructions.md

## Problem Description

In this assignment, you will apply your understanding of several Object-Oriented Programming concepts. You will create `Frog.java`, `Fly.java`, and `Pond.java` files to simulate interactions within a pond ecosystem.

### Solution Description

Create three Java files: `Fly.java`, `Frog.java`, and `Pond.java`, which model a pond ecosystem. You will define fields and methods for each file, ensuring proper use of visibility modifiers, static keywords, and encapsulation.

### Fly.java

Defines fly objects within the pond.

#### Variables

- `private double mass`: Mass of the fly in grams.
- `private double speed`: Speed of the fly in the air.

#### Constructors

1. `Fly(double mass, double speed)`: Initializes fly with given mass and speed.
2. `Fly(double mass)`: Initializes fly with given mass and default speed of 10.
3. `Fly()`: Initializes fly with default mass of 5 and speed of 10.

#### Methods

- `public double getMass()`
- `public double getSpeed()`
- `public void setMass(double mass)`
- `public void setSpeed(double speed)`
- `public String toString()`
  - Returns: "I’m dead, but I used to be a fly with a speed of [speed]." if mass is 0.
  - Otherwise: "I’m a speedy fly with [speed] speed and [mass] mass."
- `public void grow(int addedMass)`: Increases the mass and adjusts speed accordingly.
- `public boolean isDead()`: Returns true if mass is 0, otherwise false.

### Frog.java

Defines frog objects within the pond.

#### Variables

- `private String name`
- `private int age`
- `private double tongueSpeed`
- `private boolean isFroglet`: True if the frog is between 1 and 7 months old.
- `private static String species = "Rare Pepe"`

#### Constructors

1. `Frog(String name, int age, double tongueSpeed)`
2. `Frog(String name, double ageInYears, double tongueSpeed)`
3. `Frog(String name)`: Initializes frog with 5 months old and tongueSpeed of 5.

#### Methods

- `public String getName()`
- `public int getAge()`
- `public double getTongueSpeed()`
- `public boolean getIsFroglet()`
- `public static String getSpecies()`
- `public void setSpecies(String species)`
- `public void grow(int months)`
- `public void grow()`
- `public void eat(Fly fly)`
- `public String toString()`
  - Returns: "My name is [name] and I’m a rare froglet! I’m [age] months old and my tongue has a speed of [tongueSpeed]." if frog is a froglet.
  - Otherwise: "My name is [name] and I’m a rare frog. I’m [age] months old and my tongue has a speed of [tongueSpeed]."

### Pond.java

This is the driver class that will simulate the pond ecosystem.

#### Methods

- `public static void main(String[] args)`
  - Create at least 4 `Frog` objects:
    - `Frog peepo = new Frog("Peepo")`
    - `Frog pepe = new Frog("Pepe", 10, 15)`
    - `Frog peepaw = new Frog("Peepaw", 4.6, 5)`
    - One more `Frog` object of your choice
  - Create at least 3 `Fly` objects:
    - `Fly fly1 = new Fly(1, 3)`
    - `Fly fly2 = new Fly(6)`
    - One more `Fly` object of your choice
  - Perform the following operations:
    - Set the species of any Frog to "1331 Frogs"
    - Print the description of `peepo`
    - Have `peepo` attempt to eat `fly2`
    - Print the description of `fly2`
    - Have `peepo` grow by 8 months
    - Have `peepo` attempt to eat `fly2` again
    - Print the description of `fly2`
    - Print the description of `peepo`
    - Print the description of your own Frog
    - Have `peepaw` grow by 4 months
    - Print the description of `peepaw`
    - Print the description of `pepe`

### Allowed Imports

You may not import any classes or packages.

### Feature Restrictions

Do not use the following:
- `var` keyword
- `System.exit`

### Grading

Homeworks are graded "all or nothing". Correct code receives 100; incorrect code receives 0.

### Allowed Collaboration

You may discuss:
- General strategies or algorithms
- Unclear parts of the homework
- Online resources
- Key course concepts and Java language features

You may not:
- Share specific code
- Use code shared by others

### Vocareum Troubleshooting

- Close any other homework from this course or another that uses Vocareum integration.
- Reload the webpage.
- Open Vocareum in a new window.
- Select the course CS1331 and start or continue the homework.
- Edit files in the "work" folder only.

For additional help, visit the Vocareum information page in the course information module.