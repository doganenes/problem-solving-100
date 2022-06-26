import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {

            Scanner scan = new Scanner(System.in);

            int x = scan.nextInt();
            int y = scan.nextInt();

            System.out.println(x / y);

        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero"); //for x / 0 situation
        } catch (Exception e) {

            System.out.println("java.util.InputMismatchException"); // for example x / "hello"

        }


    }

}