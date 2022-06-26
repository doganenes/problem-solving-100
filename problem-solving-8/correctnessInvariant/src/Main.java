import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();

        int[] arr = new int[k];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();

        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    }

}
