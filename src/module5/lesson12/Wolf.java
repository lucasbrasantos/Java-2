package lesson12;

public class Wolf extends Canine {
    
    protected int rank;

    public Wolf(int rank, double size){
        super(size); // Using super to call the superclass of WOLF (subclass):

        this.rank = rank;
    }

    public int getRank(){
        return rank;
    }

    
    public void bark(){
        for (int i = 0; i < 3; i++) {
            super.bark();
        }
    }

    public static void main(String[] args) {
        Wolf alpha = new Wolf(10, 5);
        alpha.bark();
    }

}
