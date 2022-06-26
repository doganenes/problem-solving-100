import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[100];

        for (int i = 0; i < n; i++) {

            a[scan.nextInt()]++;

        }

        int max = 0;

        for (int i = 0; i < 99; i++) {

            max = Math.max(max, a[i] + a[i + 1]);
        }
        System.out.println(max);
    }
}
