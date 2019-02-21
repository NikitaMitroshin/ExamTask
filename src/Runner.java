import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        Parking parking = Parking.createParking();
        Car car1 = new Car("Kia", Colors.WHITE,2500,true,false);
        Car car2 = new Car("Mazda", Colors.BLACK,1500,false,false);
        Car car3 = new Car("Toyota", Colors.WHITE,3200,false,false);
        Car car4 = new Car("Kia", Colors.WHITE,2500,true,false);
        Car car5 = new Car("Golf", Colors.GREEN,1200,true,false);
        Car car6 = new Car("Sia", Colors.WHITE,2200,true,true);
        Car car7 = new Car("Audi", Colors.BLUE,2800,true,false);
        Car car8 = new Car("Kia", Colors.RED,2600,true,false);
        Car car9 = new Car("Kia", Colors.WHITE,1900,false,true);
        parking.addNewCar(car1);
        parking.addNewCar(car2);
        parking.addNewCar(car3);
        parking.addNewCar(car4);
        parking.addNewCar(car5);
        parking.addNewCar(car6);
        parking.addNewCar(car7);
        parking.addNewCar(car8);
        parking.addNewCar(car9);

        System.out.println(parking.toString());

        System.out.println("The number of white auto is : " + parking.whiteCarNums());
        System.out.println("The number of cars with automatic transmisson : " + parking.withAutomatCarNums());
        parking.searchSimilarCars();
        parking.sortCarsByName();

        System.out.println(parking.toString());

    }
}
