import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        String reverseString = sb.toString(); // convert to String for comparison
        System.out.println(isPalindromeString(s, reverseString));

        /*
        Example Output

        INPUT: Enes or enes - false
        INPUT: Ada or ada - true

         */
    }

    public static Boolean isPalindromeString(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }

    }
}
