package HW04;

public class Fly{
    
    private double mass;
    private double speed;

    public static final double DEFAULT_MASS = 5;
    public static final double DEFAULT_SPEED = 10;

    public Fly(){
        this(DEFAULT_MASS, DEFAULT_SPEED);
    }

    public Fly(double mass){
        this(mass, DEFAULT_SPEED);
    }

    public Fly(double mass, double speed){
        this.mass = mass;
        this.speed = speed;
    }

    // -- Setter / Getter

    public double getMass(){
        return mass;
    }

    public void setMass(double newMass){
        this.mass = newMass;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double newSpeed){
        this.speed = newSpeed;
    }

    // ----//

    public String toString(){
        if (isDead()) {
            return String.format("I'm dead, but I used to be a fly with a speed of %.2f.", speed);
        }
        return String.format("I'm a speedy fly with %.2f speed and %.2f mass.", speed, mass);
    }

    public boolean isDead(){
        if (mass == 0) {
            return true;
        }
        return false;
    }

    public void grow(int massIncrement){
        this.mass += massIncrement;
        if (mass < 20) {
            this.speed += massIncrement;
        }else{
            this.speed -= (0.5 * (mass - 20));
        }
    }


    public static void main(String[] args) {
        
        Fly mosca = new Fly();

        System.out.println(mosca);
        mosca.grow(19); 
        System.out.println(mosca);
        
    }
}
