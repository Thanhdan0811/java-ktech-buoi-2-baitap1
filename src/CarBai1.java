public class CarBai1 extends VehicleBai1 {

    CarBai1() {}

    CarBai1(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp() {
        this.speed += 10;
        System.out.println("Speed up Car : " + this.speed);
    }
}
