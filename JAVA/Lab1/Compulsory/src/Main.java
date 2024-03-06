import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        System.out.println("The languages Array is: " );
        for (int i = 0; i < languages.length; i++) {
            System.out.print(languages[i]);
            if (i < languages.length - 1) {
                System.out.print(", ");
            }
        }

        Random rand = new Random();
        int n = rand.nextInt(1_000_000);
        System.out.println("The random number is: " + n);

        int suma = 0;
        suma += n;
        n = n * 3;
        suma += n;
        n = n + 0b10101;
        suma += n;
        n = n + 0xFF;
        suma += n;
        n *= 6;
        suma += n;
        System.out.println("The final sum is: " + suma);

        int suma_noua = 0;
        boolean ok = false;

        while (ok != true) {
            while (suma != 0) {
                suma_noua += suma % 10;
                suma /= 10;
            }
            if (suma_noua < 9)
                ok = true;
            else{
                System.out.println("The sum of digits is now: " + suma_noua);
                suma = suma_noua;
                suma_noua = 0;
            }
        }

        System.out.println("And the final sum of the digits is: " + suma_noua);
        System.out.println("Willy-nilly, this semester I will learn " + languages[suma_noua]);
    }
}