
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Parking {
    private static Parking instance;
    private int places = 20;
    private int FreePlaces = 20;
    ArrayList<Car> cars = new ArrayList<>();

    private Parking(){}

    public static Parking createParking(){
        if(instance == null){
            instance = new Parking();
        }else {
            return instance;
        }
        return instance;
    }
    public int getPlaces() {
        return places;
    }

    public int getFreePlaces() {
        return FreePlaces;
    }

    public void addSomePlace(){
        System.out.println("How many plases you want to add?");
        Scanner input = new Scanner(System.in);
        int newPlaces =  input.nextInt();
        places = places + newPlaces;
        System.out.println("Now parking have : " + places + " places");
    }

    public boolean removeCar(Car car){
        return cars.remove(car);
    }
    
    public void addNewCar(Car car){
       if(FreePlaces == 0){
           System.out.println("We have no free places, wait please.");
       }else if(car.getWeight() > 3000){
           System.out.println("Your car is so heavy.");
       }else if(car.isWithTrailer()){
           System.out.println("We cannot add car with trailer.");
       }else {
           cars.add(car);
           FreePlaces--;
       }
    }

    public int whiteCarNums(){
        int counter = 0;
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getColor() == Colors.WHITE){
                counter++;
            }
        }
        return counter;
    }

    public int withAutomatCarNums(){
        int counter = 0;
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).isAutomat()){
                counter++;
            }
        }
        return counter;
    }

    public void searchSimilarCars(){
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size(); j++) {
                if(cars.get(i).equals(cars.get(j))){
                    System.out.println("The car : " + cars.get(i).toString() +
                            "\nThe same as :\n" + cars.get(j).toString() + "\n\n\n");
                }
            }
        }
    }

    public void sortCarsByName(){
        Collections.sort(cars);
        }

    @Override
    public String toString() {
        return "Parking{" +
                "places=" + places +
                ", FreePlaces=" + FreePlaces +
                ", cars=" + cars +
                '}';
    }
}
