public class ViajeMasBarato {

    public static final int INF = Integer.MAX_VALUE;

    public static int[][] calcularCostosMinimos(int[][] T) {
        int n = T.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    C[i][j] = 0;
                } else {
                    C[i][j] = T[i][j];
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i + 1; k < j; k++) {
                    if (T[i][k] != INF && C[k][j] != INF) {
                        C[i][j] = Math.min(C[i][j], T[i][k] + C[k][j]);
                    }
                }
            }
        }

        return C;
    }

    public static void imprimirMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == INF) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE;
        int[][] T = {
                { 0, 1, 5, 8 },
                { INF, 0, 1, 4 },
                { INF, INF, 0, 1 },
                { INF, INF, INF, 0 }
        };
        int[][] C = calcularCostosMinimos(T);
        System.out.println("Matriz de costos mínimos:");
        imprimirMatriz(C);
    }
}
