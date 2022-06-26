import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();

            int start = (int) Math.sqrt(a);
            int finish = (int) Math.sqrt(b);

            int squareValues = finish - start;

            if ((Math.pow(start, 2) >= a)) {

                squareValues += 1;
            }
            System.out.println(squareValues);
        }

    }

}
