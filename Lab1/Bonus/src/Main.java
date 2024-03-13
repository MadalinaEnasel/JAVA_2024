public class Main {
    public static void main(String[] args) {
        int n = 20;

        printAdjacencyMatrix(n);

        String[] cycles = findCyclesInWheelGraph(n);

        System.out.println("\nNumber of cycles in W_" + n + ": " + cycles.length);

        for (String cycle : cycles) {
            System.out.print(cycle + " ");
        }
    }

    public static int[][] adjacencyMatrix(int n) {
        if (n < 4) {
            System.out.println("The smallest wheel graph has 4 vertices. Please try again!");
        }
        int[][] adjacencyMatrix = new int[n][n];

        for (int i = 1; i < n; i++) {
            adjacencyMatrix[0][i] = 1;
            adjacencyMatrix[i][0] = 1;
        }

        for (int i = 1; i < n - 1; i++) {
            adjacencyMatrix[i][i + 1] = 1;
            adjacencyMatrix[i + 1][i] = 1;
        }

        adjacencyMatrix[1][n - 1] = 1;
        adjacencyMatrix[n - 1][1] = 1;

        return adjacencyMatrix;
    }

    public static void printAdjacencyMatrix(int n) {
        System.out.println("The adjacency Matrix of W_" + n + " is:");
        int[][] matrix = adjacencyMatrix(n);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static String[] findCyclesInWheelGraph(int n) {
        int totalNumbers = (n - 1) * (n - 2) + 1; // n^2 - 3n + 3
        String[] result = new String[totalNumbers];
        int index = 0;
        int count = 0;
        for (int len = 4; len <= n + 1; len++) {
            for (int start = 2; start <= n; start++) {
                StringBuilder sb = new StringBuilder();
                sb.append(1);
                for (int i = 0; i < len - 2; i++) {
                    sb.append((start + i - 1) % (n - 1) + 2);
                }
                sb.append(1);
                result[index++] = sb.toString();
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(i);
        }
        sb.append(2);
        result[index] = sb.toString();
        assert count == totalNumbers;
        return result;

    }
}
