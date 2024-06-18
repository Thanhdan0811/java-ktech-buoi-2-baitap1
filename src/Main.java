public class Main {
    public static void main(String[] args) {
        // tạo Car
        Car car = new Car(10);
        Bicycle bic = new Bicycle(10);

        car.speedUp();
        bic.speedUp();
    }
}