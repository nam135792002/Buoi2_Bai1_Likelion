public class Car extends Vehicle{

    public Car(double speed){
        super(speed);
    }

    // this function is override
    @Override
    public void speedUp() {
        speed += 10;
        System.out.println("Speed: " + this.speed);
    }
}
