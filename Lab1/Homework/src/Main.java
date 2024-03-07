import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int j = 4;
        StringBuilder result = new StringBuilder();
        for (int i : findAllkReductible(1, 20, j)) {
            result.append(i).append(" ");
        }
        System.out.println("The " + j + "-reductible numbers are: " + result);
        long endTime = System.nanoTime();
        System.out.println("The total time in nanoseconds is: " + (endTime-startTime));
    }

    public static boolean checkIfReductible(int number, int k) {
        int suma;

        if (number == k) {
            return true;
        } else if (number < 10) {
            return false;
        } else if (k < 0) {
            System.out.println("k must be non-negative!");
            return false;
        } else {
            while (true) {
                suma = 0; // Reset suma before each iteration
                while (number != 0) {
                    suma += (number % 10) * (number % 10);
                    number /= 10;
                }

                if (suma <= 9) {
                    break;
                } else {
                    number = suma;
                }
            }

            return suma == k;
        }
    }

    public static ArrayList<Integer> findAllkReductible(int a, int b, int k) {
        ArrayList<Integer> kReductible = new ArrayList<>();

        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        if (k == 0) {
            if (a <= 0 && b >= 0) {
                kReductible.add(0);
            }
        } else if (a <= 0 && b < 10) {
            kReductible.add(k);
        } else {
            if (a < 0) {
                a = 0;
            }
            for (int i = a; i <= b; i++) {
                if (checkIfReductible(i, k)) {
                    kReductible.add(i);
                }
            }
        }
        return kReductible;
    }


}