package lesson11;

public class Craps {
    
    private Dice dice1, dice2;
    private int point;

    // -- Constructor
    public Craps(){

        dice1 = new Dice();
        dice2 = new Dice();
    }

    // -- Methods
    public int toss(){

        int total = dice1.roll() + dice2.roll();

        System.out.println("Dice1: " + dice1.getFaceValue());
        System.out.println("Dice2: " + dice2.getFaceValue());

        return total;
    }

    public void go(){

        point = toss();
        System.out.println("Point: " + point);

        if ((point == 7) || (point == 11)) {
            System.out.println("Winner!");

        }else if((point == 2) || (point == 3) || (point == 12)){
            System.out.println("You lost!");

        }else{
            System.out.println("Entering in stage 2!");
            stage2();
        }

    }

    private void stage2(){

        boolean endGame = false;

        while (!endGame) {
            int total = toss();

            System.out.println("Total: " + total);
            if (total == point) {
                System.out.println("Winner!");
                endGame = true;
            }else{
                System.out.println("You lost!");
                endGame = true;
            }
        }
    }

    public static void main(String[] args) {
        
        Craps game = new Craps();

        game.go();
    }

}
