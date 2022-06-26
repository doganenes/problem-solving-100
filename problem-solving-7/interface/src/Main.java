import java.util.Scanner;

interface AdvancedArithmetic {

    void divisor_sum(int n);

}

class MyCalculator implements AdvancedArithmetic {


    public void divisor_sum(int n) {

        int divisorTotal = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                divisorTotal += i;
            }

        }

        System.out.println(divisorTotal);

    }

}

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        MyCalculator myCalc = new MyCalculator();
        int n = scan.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        myCalc.divisor_sum(n);
    }

}
