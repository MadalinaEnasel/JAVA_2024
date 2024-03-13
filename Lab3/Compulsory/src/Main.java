import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Trip trip = new Trip("Iasi", LocalDate.of(2020, 1, 8), LocalDate.of(2020, 1, 15));
        Church church = new Church();
        Statue statue = new Statue();
        Concert concert = new Concert();

        Visitable[] arr = {trip, church, statue, concert};

        for (Visitable i : arr){
            System.out.println(i);
        }

    }
}