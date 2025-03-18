import java.util.Random;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        systemOut(colors);
        System.out.println();
        systemOut(rotatedColors(colors));

    }
    public static void systemOut(int[][] colors){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();

        }
    }
    public static int[][] rotatedColors(int[][] colors){
        int[][] rotated = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[j][SIZE - 1 - i] = colors[i][j];

            }
            
        }
        return rotated;
    }

}