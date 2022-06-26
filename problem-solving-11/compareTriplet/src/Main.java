import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
        }
        compareTriplets(a, b);
    }

    public static void compareTriplets(int arrX[], int arrY[]) {

        int totalA = 0;
        int totalB = 0;
        for (int i = 0; i < 3; i++) {
            if (arrX[i] > arrY[i]) {

                totalA++;

            }
            if (arrY[i] > arrX[i]) {
                totalB++;
            }
        }
        System.out.println(totalA + " " + totalB);

    }

}
