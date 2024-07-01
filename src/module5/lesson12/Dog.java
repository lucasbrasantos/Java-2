package lesson12;

public class Dog extends Canine { // -- extends keyword extends a class (indicates that a class is inherited from another class).
    
    protected String name;

    public Dog(String name, double size) {
        super(size); // super constructor always in first line
        this.name = name;
    }

    public void fetch(){
        System.out.println("Run");
        System.out.println("Clinch");
        System.out.println("Return");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("anton", 2);

        dog1.fetch();
        dog1.bark();
    }
    
}
