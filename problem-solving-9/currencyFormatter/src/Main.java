import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        NumberFormat NFus = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat NFindia = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat NFfrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat NFchina = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String china = NFchina.format(payment);
        String india = NFindia.format(payment);
        String france = NFfrance.format(payment);
        String us = NFus.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("US: " + china);
        System.out.println("France: " + france);


    }

}
