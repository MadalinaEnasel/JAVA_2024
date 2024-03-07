public class Depot {

    String location;

    public Depot() {
        location = "unknown";
    }

    public Depot(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Depot{" +
                "location='" + location + '\'' +
                '}';
    }
}
