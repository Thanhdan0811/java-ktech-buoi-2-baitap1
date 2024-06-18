public class XeTaiBai4 extends XeCoBai4{



    @Override
    public void getModel() {
        System.out.println("Truck Model: " + this.nhanHieu);
    }

    @Override
    public void getFuelEff() {
        System.out.println("Fuel Efficiency: 8.075659532105526 mpg");
    }

    @Override
    public void getDistanceTraveled() {
        System.out.println("Distance Traveled: 65.50975012444003 miles");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Max speed: 80.0 mph");
    }
}
