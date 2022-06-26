import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> L = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            L.add(value);

        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String s = scan.next();
            if (s.equals("Insert")) {
                int k = scan.nextInt();
                int t = scan.nextInt();
                L.add(k, t);
            }
            if (s.equals("Delete")) {
                int m = scan.nextInt();

                L.remove(m);
            }

        }
        for (int i = 0; i < L.size(); i++) {

            System.out.print(L.get(i) + " ");
        }

    }
}
