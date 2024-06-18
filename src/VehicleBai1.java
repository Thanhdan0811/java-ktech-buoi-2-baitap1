public class VehicleBai1 {
    int speed;

    VehicleBai1() {}

    VehicleBai1(int speed) {
        this.speed = speed;
    }

    public void speedUp() {
        this.speed += 3;
        System.out.println("Speed up Vehicle : " + this.speed);
    }
}
