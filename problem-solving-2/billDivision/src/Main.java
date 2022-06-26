import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] bill = new int[n];

        for (int i = 0; i < bill.length; i++) {

            bill[i] = scan.nextInt();

        }

        int b = scan.nextInt();
        bonAppetit(bill, k, b);
    }

    public static void bonAppetit(int billX[], int x, int y) {

        int total = 0;

        for (int i = 0; i < billX.length; i++) {

            total += billX[i];

        }
        int k = billX[x];
        total = total - k;


        int splitHalf = (int) total / 2;

        if (splitHalf == y) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(y - splitHalf);
        }
    }
}
