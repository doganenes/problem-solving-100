import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();

        kangaroo(x1, v1, x2, v2);

    }

    public static void kangaroo(int x1, int v1, int x2, int v2) {

        String result = "NO";
        int jump = 0;
        int location1, location2;

        do {
            jump++;

            location1 = x1 + jump * v1;
            location2 = x2 + jump * v2;

            if (location1 == location2) {
                result = "YES";
            }

        } while (location1 < location2);

        System.out.println(result);
    }

}
