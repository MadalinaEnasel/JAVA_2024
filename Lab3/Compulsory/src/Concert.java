import java.util.Map;

public class Concert implements Visitable, Payable {

    @Override
    public String toString() {
        return "Concert{}";
    }

    @Override
    public double getTicketPrice() {
        return 0;
    }

    @Override
    public String getDayOfTheWeek() {
        return null;
    }

    @Override
    public Map<Integer, Integer> getTimeInterval() {
        return null;
    }
}
