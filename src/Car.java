import java.util.Objects;

public class Car implements Comparable<Car>{
    private String name;
    private Colors color;
    private int weight;
    private boolean isAutomat;
    private boolean isWithTrailer;

    public Car(String name, Colors color, int weight, boolean isAutomat, boolean isWithTrailer) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isAutomat = isAutomat;
        this.isWithTrailer = isWithTrailer;
    }

    public boolean isWithTrailer() {
        return isWithTrailer;
    }

    public String getName() {
        return name;
    }

    public Colors getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isAutomat() {
        return isAutomat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                color == car.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }


    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.name);
    }
}
