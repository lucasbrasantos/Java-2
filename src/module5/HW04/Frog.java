package HW04;

public class Frog {
    
    private String name;
    private int age; // months
    private double tongueSpeed;
    private boolean isFroglet; // true is 1 < x < 7
    protected static String species;

    private Fly fly;

    public static String DEFAULT_SPECIES_NAME = "Rare Pepe";
    public static int DEFAULT_AGE = 5; // 5 months
    public static double DEFAULT_TONGUE_SPEED = 5;


    public Frog(String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGUE_SPEED);
    }

    // Constructor that takes name, age in years, and tongueSpeed
    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int)(ageInYears * 12), tongueSpeed);
    }

    // Constructor that takes name, age in months, and tongueSpeed
    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.isFroglet = (age > 1 && age < 7);
        this.species = DEFAULT_SPECIES_NAME;
        
        fly = new Fly();
    }

    // Setter / Getter

    public String getSpecies(){
        return species;
    }

    public static void setSpecies(String newSpecies){
        species = newSpecies;
    }

    // -- Methods

    public void grow(int months) {
        for (int i = 0; i < months; i++) {
            this.age += 1;
            updateAttributesBasedOnAge();
        }
    }

    public void grow(){
        this.age += 1;
        updateAttributesBasedOnAge();
    }

    private void updateAttributesBasedOnAge() {
        if (this.age <= 12) {
            this.tongueSpeed += 1;
        } else if (this.age >= 30 && this.tongueSpeed > 5) {
            this.tongueSpeed -= 1;
        }

        if (this.age >= 7) {
            this.isFroglet = false;
        }
    }

    public void eat(){
        if (!fly.isDead()) {
            if (catchAttempt()) {
                if((this.age*0.5) <= fly.getMass()){
                    this.age += 1;
                }
                grow();
                fly.setMass(0);
            }else{
                fly.grow(1);
            }
        }
    }

    private boolean catchAttempt(){
        if (this.tongueSpeed > fly.getSpeed()) {
            return true;
        }
        return false;
    }

    public String toString(){
        if (isFroglet) {
            return String.format("My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
        }
        return String.format("My name is %s and I'm a rare frog. I'm %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
    }

    public static void main(String[] args) {
        
        Frog sp1 = new Frog("ted");

        System.out.println(sp1);
        sp1.grow(25);
        System.out.println(sp1);
        sp1.eat();
        System.out.println(sp1);
    }

}
