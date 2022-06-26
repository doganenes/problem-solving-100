import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int p = scan.nextInt();

        pageCount(n, p);

    }

    public static void pageCount(int numberBook, int numberPage) {

        int fromFirstPage = numberPage / 2;

        int fromLastPage = numberBook / 2 - fromFirstPage;

        if (fromFirstPage < fromLastPage) {
            System.out.println(fromFirstPage);
        }

        if (fromFirstPage > fromLastPage) {
            System.out.println(fromLastPage);
        }

        if (numberBook == 1) {

            System.out.println(0);
        }

    }

}
