import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int y = scan.nextInt();

        dayOfProgrammer(y);

    }

    public static void dayOfProgrammer(int year) {

        int fixTotalOfMonth = 215;

        if (year >= 1700 && year <= 1917) {


            if (year % 4 == 0) {

                fixTotalOfMonth += 29;

            } else {
                fixTotalOfMonth += 28;
            }

            int day = 256 - fixTotalOfMonth;

            System.out.println(day + ".09." + year);


        }

        if (year == 1918) {

            fixTotalOfMonth += 29;

            int day = 256 - fixTotalOfMonth + 14;

            System.out.println(day + ".09." + year);

        }

        if (year > 1918 && year <= 2700) {
            if ((year % 400 == 0) || ((year % 4 == 0) && !(year % 100 == 0))) {
                fixTotalOfMonth += 29;
            } else {
                fixTotalOfMonth += 28;
            }

            int day = 256 - fixTotalOfMonth;

            System.out.println(day + ".09." + year);

        }
    }

}
