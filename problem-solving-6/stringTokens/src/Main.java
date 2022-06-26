import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        scan.close();

        str = str.trim();

        String[] tokens = str.split("[^\\p{Alpha}]+"); // regular expressions(RegEx)

        if (str.isEmpty()) {

            System.out.println(0);

        } else {
            System.out.println(tokens.length);
        }

        for (String s : tokens) {

            System.out.println(s);

        }

    }

}
