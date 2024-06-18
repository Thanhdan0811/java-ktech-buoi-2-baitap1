public class Bicycle extends Vehicle {

    Bicycle() {}

    Bicycle(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp() {
        this.speed += 5;
        System.out.println("Speed up Bicycle : " + this.speed);
    }
}
