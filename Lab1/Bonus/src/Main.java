public class Main {
    public static void main(String[] args) {
        int n = 6;
        printAdjacencyMatrix(n);

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
        System.out.println("The adjacency Matrix of W" + n + " is:");
        int[][] matrix = adjacencyMatrix(n);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}