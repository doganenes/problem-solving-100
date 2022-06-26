import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[] apples = new int[m];
        int[] oranges = new int[n];

        for (int i = 0; i < apples.length; i++) {
            apples[i] = scan.nextInt();
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = scan.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    public static void countApplesAndOranges(int lS, int lE, int aL, int oL, int apArr[], int orArr[]) {

        int counterApple = 0;
        int counterOrange = 0;

        for (int i = 0; i < apArr.length; i++) {
            apArr[i] = apArr[i] + aL;
        }

        for (int i = 0; i < orArr.length; i++) {
            orArr[i] = orArr[i] + oL;
        }

        for (int i = 0; i < apArr.length; i++) {

            if (apArr[i] >= lS && apArr[i] <= lE) {
                counterApple++;
            }
        }

        for (int i = 0; i < orArr.length; i++) {

            if (orArr[i] >= lS && orArr[i] <= lE) {
                counterOrange++;
            }
        }

        System.out.print(counterApple + "\n" + counterOrange);
    }

}
