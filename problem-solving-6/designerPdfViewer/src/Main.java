import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int alphabetOfEnglish = 26;

        int h[] = new int[alphabetOfEnglish];

        for (int i = 0; i < alphabetOfEnglish; i++) {

            h[i] = scan.nextInt();

        }

        String word = scan.next();

        int max = 0;

        for (int i = 0; i < word.length(); i++) {

            int k = h[(int) (word.charAt(i) - 'a')];
            if (k > max) {

                max = k;

            }
        }

        System.out.println(max * word.length());

    }
}
