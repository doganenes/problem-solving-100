import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        int counter = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i))) { // sorgu yaparken isUpperCase kullan, yazdırırken toUpperCase kullan.

                counter++;
            }
        }

        System.out.println(counter + 1); // en baştaki kelime küçük harfle yazıldı.
    }

}
