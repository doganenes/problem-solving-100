import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] arr = new int[k];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();

        }

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                if (sum < 0) {

                    counter++;
                }
            }

        }

        System.out.println(counter);

    }

}
