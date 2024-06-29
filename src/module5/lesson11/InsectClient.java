package lesson11;

public class InsectClient {

    public static void main(String[] args) {
        System.out.println(Insect.produceRandomFact());


        Insect bug1 = new Insect(30, 2, 3);
        System.out.println(bug1.getWeight());
        System.out.println(bug1.getX());
        System.out.println(bug1.getY());
        System.out.println(Insect.getPopulation());
        System.out.print("\n\n-------------\n\n");
        
        System.out.println(bug1.getX());
        bug1.setX(-20);
        System.out.println(bug1.getX());
        bug1.setX(20);
        System.out.println(bug1.getX());
        
        
        System.out.print("\n\n-------------\n\n");
        System.out.println("Overloading constructors"); // overloading constructors
        Insect bug2 = new Insect(10);
        System.out.println(bug2.getWeight());
        System.out.println(bug2.getX());


        // both work on toString
        System.out.println("\n\n" + bug2.toString()); 
        System.out.println(bug2); // calls toString automatically without the need to put
    }
}
