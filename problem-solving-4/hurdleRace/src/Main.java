import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < height.length; i++) {

            height[i] = scan.nextInt();
        }

        System.out.println(hurdleRace(k, height));

    }

    public static int hurdleRace(int kX, int heightX[]) {

        int maxValue = heightX[0];

        for (int i = 0; i < heightX.length; i++) {

            if (heightX[i] > maxValue) {

                maxValue = heightX[i];
            }
        }
        if (kX > maxValue) {

            return 0;
        }
        return maxValue - kX;
    }

}
