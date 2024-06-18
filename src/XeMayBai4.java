
public class XeMayBai4 extends XeCoBai4{

    @Override
    public void getModel() {
        System.out.println("Motorcycle Model: "  + this.nhanHieu);
    }

    @Override
    public void getFuelEff() {
        System.out.println("Fuel Efficiency: 2.1 mpg");
    }

    @Override
    public void getDistanceTraveled() {
        System.out.println("Distance Traveled: 4.41 miles");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Max speed: 80.0 mph");
    }
}
