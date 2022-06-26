import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();

        for (int i = 0; i < k; i++) {

            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            catAndMouse(x, y, z);
        }


    }

    public static void catAndMouse(int a, int b, int c) {

        int k = (int) Math.abs(c - a);
        int t = (int) Math.abs(c - b);

        if (k == t) {

            System.out.println("Mouse C");

        } else {
            if (t > k) {

                System.out.println("Cat A");

            }

            if (k > t) {

                System.out.println("Cat B");

            }

        }
    }
}
