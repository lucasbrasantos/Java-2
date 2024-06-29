package lesson11;

import java.util.Random;

public class Dice {


    public static final int SIDES = 6;
    private int faceValue;
    private Random rand;

    public Dice(){
        faceValue = 1;
        rand = new Random();
    }
    
    public int roll(){
        faceValue = rand.nextInt(SIDES) + 1;
        return faceValue;
    }




}
