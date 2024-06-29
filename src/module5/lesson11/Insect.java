package lesson11;

public class Insect {
    
    // -- Instance variables
    private double weight;
    private int x;
    private int y;

    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    private static final double DIST_WEIGHT_LOSS_FACTOR = .0001;
    private static int population = 0;
    private static String[] FACTS = {
        "The two main groups of insects are winged and wingless",
        "There are more than 1 million insects species",
        "Spiders are not considered insects"
    };


    // -- Constructor 2
    public Insect(){
        this(1.0, DEFAULT_X, DEFAULT_Y);
    }
    
    // -- Constructor 2
    public Insect(double initWeight){ // Overloading constructors
        this(initWeight, DEFAULT_X, DEFAULT_Y); // Constructor chaining -> this()
    }   

    // -- Final Constructor
    public Insect(double weight, int x, int y){
        this.weight = weight;
        this.x = x;
        this.y = y;
        population++;
    }

    // -- Accessor methods (getter)

    public double getWeight(){
        return weight;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public static int getPopulation(){ // getters for static variables must also be -static-
        return population;
    }

    // -- Mutator methods (setter)

    public void setX(int newX){
        if (isLegalX(newX)) {
            this.x = x;
        }        
    }

    public void setY(int newY){
        if (isLegalX(newY)) {
            this.y = y;
        }        
    }

    // ------------ //

    public static boolean isLegalX(int newX){
        return (newX >= 0 ? true : false);
    }
    
    public static boolean isLegalY(int newY){
        return (newY >= 0 ? true : false);
    }

    // ------------ //

    public String toString(){ // -- toString method
        return "weight: " + weight + "\nx: " + x + "\ny: " + y;
    }

    // ------------ //


    public void eat(double amount){
        System.out.println("Nhum Nhum Whomp Whomp");
        weight = weight + amount;
    }

    public void move(int newX, int newY) {
        double distance = calculateDistance(x, y, newX, newY);
        if (distance > 0) {
            x = newX;
            y = newY;
            weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
            System.out.printf("Moved %.2f units\n", distance);
        }else{
            System.out.println("Staying put");
        }        
    }

    private double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static String produceRandomFact(){
        int index = (int)(Math.random() * ((FACTS.length -1) + 1));
        return FACTS[index];
    }

    // ------------ //

    // -- Test method
    public static void main(String[] args) {        
        // Insect buzz1 = new Insect(); without constructor this is fine because takes the default values
        // Insect buzz2 = new Insect();

        Insect bug1 = new Insect(20, 30, 10);
        Insect bug2 = new Insect(10, 20, -20);

        bug1.move(34, 12);

        System.out.println(produceRandomFact());


    }
}
