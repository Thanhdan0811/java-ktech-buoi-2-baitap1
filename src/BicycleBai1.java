public class BicycleBai1 extends VehicleBai1 {

    BicycleBai1() {}

    BicycleBai1(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp() {
        this.speed += 5;
        System.out.println("Speed up Bicycle : " + this.speed);
    }
}
