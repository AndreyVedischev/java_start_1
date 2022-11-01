package lesson3;

import java.util.Arrays;

public class hod_koniom {
    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        int[][] place = new int[N][N];
        int pos = 1;
        horseJourney(place, 0, 0, pos);
    }

    public static final int N = 5;
    public static final int[] row = {2, 1, -1, -2, -2, -1, 1, 2, 2};
    public static final int[] col = {1, 2, 2, 1, -1, -2, -2, -1, 1};

    private static boolean valid(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < N;
    }

    private static void print(int[][] place) {
        for (var r : place) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
        System.exit(0);
    }

    public static void horseJourney(int[][] place, int x, int y, int pos) {
        place[x][y] = pos;
        if (pos >= N * N) {
            print(place);
            place[x][y] = 0;
            return;
        }
        for (int k = 0; k < 8; k++) {
            int newX = x + row[k];
            int newY = y + col[k];
            if (valid(newX, newY) && place[newX][newY] == 0) {
                horseJourney(place, newX, newY, pos + 1);
            }
        }
        place[x][y] = 0;
    }

}
