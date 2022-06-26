import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int b = scan.nextInt();

        getSmallestAndLargest(a, b);
    }

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, i + k);
            if (smallest.compareTo(str) > 0) {
                smallest = str;
            }
            if (largest.compareTo(str) < 0) {
                largest = str;
            }
        }


        System.out.println(smallest);
        System.out.println(largest);
    }
}
