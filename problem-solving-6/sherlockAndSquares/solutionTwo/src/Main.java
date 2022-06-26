import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            int counter = 0;

            double temp = 0;
            for (double j = a; j <= b; j++) {

                temp = j;

                for (double k = 1; k <= temp; k++) {

                    if (temp == k * k) {

                        counter++;
                    }

                }

            }
            System.out.println(counter);
        }

    }
}
