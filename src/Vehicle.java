public class Vehicle {
    int speed;

    Vehicle() {}

    Vehicle(int speed) {
        this.speed = speed;
    }

    public void speedUp() {
        this.speed += 3;
        System.out.println("Speed up Vehicle : " + this.speed);
    }
}
