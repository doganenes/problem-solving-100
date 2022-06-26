import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        viralAdvertising(n);

    }

    public static void viralAdvertising(int k) {

        int num = 5;

        int result = 0;

        for (int i = 1; i <= k; i++) {

            int newNum = (int) (Math.floor(num / 2));
            num = newNum * 3;
            result += newNum;
        }

        System.out.println(result);

    }
}
