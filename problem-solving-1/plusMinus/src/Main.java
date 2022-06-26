import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        plusMinus(arr, n);
    }

    public static void plusMinus(int arrX[], int n) {

        int counterPositive = 0;
        int counterNegative = 0;
        int counterZero = 0;

        for (int i = 0; i < arrX.length; i++) {

            if (arrX[i] > 0) {
                counterPositive += 1;
            }
            if (arrX[i] < 0) {
                counterNegative += 1;
            }
            if (arrX[i] == 0) {
                counterZero += 1;
            }
        }

        double value1 = (double) (counterPositive) / n;
        double value2 = (double) (counterNegative) / n;
        double value3 = (double) (counterZero) / n;

        System.out.printf("%.6f %n %.6f %n %.6f", value1, value2, value3);
    }
}
