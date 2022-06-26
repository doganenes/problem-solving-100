import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {

            ar[i] = scan.nextInt();
        }
        System.out.println(sockMerchant(n, ar));
    }

    public static int sockMerchant(int a, int[] arX) {

        int counter = 0;
        for (int i = 0; i < arX.length; i++) {


            if (arX[i] != 0) {
                for (int j = i + 1; j < arX.length; j++) {

                    if (arX[i] == arX[j]) {
                        counter++;
                        arX[j] = 0;
                        break;
                    }
                }
            }
        }
        return counter;
    }
}
