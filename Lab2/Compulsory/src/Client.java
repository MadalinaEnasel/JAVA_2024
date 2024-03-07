public class Client {
    ClientType type;
    String name;

    public Client(ClientType type) {
        this.type = type;
        this.name = "unknown";
    }

    public Client(ClientType type, String name) {
        this.type = type;
        this.name = name;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Client{" +
                "type=" + type +
                '}';
    }
}
