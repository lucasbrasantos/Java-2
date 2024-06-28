package lesson11;

public class InsectClient {

    public static void main(String[] args) {
        System.out.println(Insect.produceRandomFact());


        Insect bug1 = new Insect(30, 2, 3);
        System.out.println(bug1.getWeight());
        System.out.println(bug1.getX());
        System.out.println(bug1.getY());
        System.out.println(Insect.getPopulation());
    }
}
