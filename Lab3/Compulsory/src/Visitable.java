import java.util.HashMap;
import java.util.Map;

public interface Visitable {
    String getDayOfTheWeek();
    Map<Integer,Integer> getTimeInterval();

    default Map<String,Map<Integer,Integer>> getOpeningHours(){
        Map<String, Map<Integer, Integer>> openingHours = new HashMap<>();
        String day = getDayOfTheWeek();
        Map<Integer,Integer> interval = getTimeInterval();
        openingHours.put(day, interval);
        return openingHours;
    }
}
