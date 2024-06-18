public class Vehicle {
    protected double speed;

    public Vehicle(){

    }

    public Vehicle(double speed){
        this.speed = speed;
    }

    public void speedUp(){
        System.out.println("Speed: " + this.speed);
    }
}
