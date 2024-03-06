public class Main {
    public static void main(String[] args) {
        System.out.println("My Classes:");

        Depot depot = new Depot();
        System.out.println(depot);

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);

        Client client = new Client(ClientType.PREMIUM);
        System.out.println(client);

    }
}