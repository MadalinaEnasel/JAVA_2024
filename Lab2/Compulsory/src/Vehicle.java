public class Vehicle {

    String number;

    public Vehicle() {
        number = "unknown";
    }

    public Vehicle(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                '}';
    }
}
