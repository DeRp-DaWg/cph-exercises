package Task1;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Lars", 20);
        Car car = new Car("Land Rover", "Range Rover Velar P400e", 2020, "5-doors, suv/crossover");
        car.setDriver(driver);
        System.out.println(""+car+driver);
        Car car2 = new Car("BMW", "840i Gran Coupe", 2019, "4-doors, sedan");
        car2.setDriver(driver);
        System.out.println(""+car2+driver);
    }
}
