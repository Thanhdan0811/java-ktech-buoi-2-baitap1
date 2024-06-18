public class Car extends Vehicle{

    Car() {}

    Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp() {
        this.speed += 10;
        System.out.println("Speed up Car : " + this.speed);
    }
}
