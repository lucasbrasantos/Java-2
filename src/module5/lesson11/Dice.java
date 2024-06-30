package lesson11;

import java.util.Random;

public class Dice {


    public static final int SIDES = 6;
    private int faceValue;
    private Random rand;

    // -- Constructor
    public Dice(){
        faceValue = 1;
        rand = new Random();
    }
    
    // -- Methods
    public int roll(){
        faceValue = rand.nextInt(SIDES) + 1;
        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }

    public String toString(){
        return "Dice with face value: " + faceValue;
    }

    public static void main(String[] args) {
        
        Dice dice1 = new Dice();

        System.out.println(dice1.roll());
        System.out.println(dice1.toString());
        System.out.println(dice1.roll());

    }

}
