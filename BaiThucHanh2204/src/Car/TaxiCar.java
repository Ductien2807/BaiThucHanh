package Car;
public class TaxiCar implements Car {
    public void Move() {
        System.out.println("Taxi di chuyen");
    }

    public void Stop() {
        System.out.println("Taxi dung lai");
    }

    public void TurnLeft() {
        System.out.println("Taxi re trai");
    }

    public void TurnRight() {
        System.out.println("Taxi re phai");
    }

    public void Reverse() {
        System.out.println("Taxi quay dau");
    }
}