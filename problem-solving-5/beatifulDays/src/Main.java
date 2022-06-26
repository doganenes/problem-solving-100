import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(beatifulDays(i, j, k));

    }

    public static int beatifulDays(int a, int b, int c) {
        int counter = 0;

        for (int i = a; i <= b; i++) {
            int temp = 0;
            int reverseNumber = 0;
            int remainder = 0;

            temp = i;

            while (temp != 0) {
                remainder = temp % 10;

                reverseNumber = reverseNumber * 10 + remainder;

                temp /= 10;

            }

            double result = Math.abs(i - reverseNumber);

            result /= c;

            if (result == (int) result) {

                counter++;
            }

        }

        return counter;
    }

}
