import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {

            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < arr.length; j++) {

                arr[j] = scan.nextInt();
            }
            angryProfessor(k, arr);
        }

    }

    public static void angryProfessor(int thresHold, int a[]) {

        int counter = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] <= 0) {

                counter++;
            }

        }

        if (counter >= thresHold) {

            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
