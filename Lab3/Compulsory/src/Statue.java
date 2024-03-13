import java.util.Map;

public class Statue implements Visitable, Payable{

    @Override
    public String toString() {
        return "Statue{}";
    }

    @Override
    public String getDayOfTheWeek() {
        return null;
    }

    @Override
    public Map<Integer, Integer> getTimeInterval() {
        return null;
    }

    @Override
    public double getTicketPrice() {
        return 0;
    }
}
