import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {

            int n = scan.nextInt();
            int counter = 0;
            String nString = String.valueOf(n);
            Integer nInt = Integer.parseInt(nString);

            for (int j = 0; j < nString.length(); j++) {

                int digit = Character.getNumericValue(nString.charAt(j)); // getNumbericValue() returns int from char

                if (digit != 0 && nInt % digit == 0) {

                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
