public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println("The result is:" + checkIfnReductible(13, 1));
        System.out.println("All reductible numbers are: ");
        int[] numbers = findAllkReductible(1, 100, 1);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 && i > 0) {
                break;
            } else {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("The result is:" + checkIfnReductible(42, 1)); // 2
        System.out.println("n is: " + nReductible(42));
    }

    public static boolean checkIfnReductible(int number, int n) {
        boolean ok = false;
        int summ;

        summ = nReductible(number);

        if (n == summ && summ != -1) {
            ok = true;
        } else if(summ == -1){
            System.out.println("The number must be positive!");
        }

        return ok;
    }

    public static int nReductible(int number) {
        boolean isDigit = false;
        int summ = 0;
        int ceva = 1;

        if (number < 10 && number > -1) {
            summ = number;
        } else if (number < 0) {
            summ = -1;
        } else {
            while (isDigit != true) {
//            System.out.println("number:" + number);
                while (number != 0) {
                    ceva = number % 10 * number % 10;
                    summ += ceva;
                    number /= 10;
                }
//            System.out.println("The new sum is: " + summ);
                if (summ < 9)
                    isDigit = true;
                else {
//                System.out.println("The sum of digits is now: " + summ);
                    number = summ;
                    summ = 0;
                }
            }
        }

        return summ;
    }

    public static int[] findAllkReductible(int a, int b, int k) {
        int[] isInvalid = new int[1];

        if (k > 9 || k < 0) {
            return isInvalid;
        } else if (a < 0 || b < 0) {
            return isInvalid;
        } else if (k == 0) {
            return new int[]{0};
        } else {
            if (a > b) {
//            swap elements
                int c;
                c = a;
                a = b;
                b = c;
            }
            int[] kReductible = new int[b - a];
            int n = 0;
            while (a <= b) {
                if (checkIfnReductible(a, k)) {
//                    System.out.println("This is reductible:" + a);
                    kReductible[n] = a;
                    n += 1;
                }
                a += 1;
            }

            return kReductible;
        }
    }
}