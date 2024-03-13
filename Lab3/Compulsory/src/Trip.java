import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Trip implements Payable,Visitable{
    //    name of the city, the period of time and the List of attractions.
    private String city;
    private LocalDate start, end;
    private List<Attraction> attractions = new ArrayList<>();

    public Trip(String city) {
        this.city = city;
    }

    public Trip(String city, LocalDate start, LocalDate end) {
        this.city = city;
        this.start = start;
        this.end = end;
    }

    public Trip(String city, LocalDate start, LocalDate end, List<Attraction> attractions) {
        this.city = city;
        this.start = start;
        this.end = end;
        this.attractions = attractions;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "city='" + city + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", attractions=" + attractions +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    @Override
    public double getTicketPrice() {
        return 20000;
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
