import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] keyboards = new int[n];
        int[] drives = new int[m];

        for (int i = 0; i < keyboards.length; i++) {
            keyboards[i] = scan.nextInt();
        }

        for (int j = 0; j < drives.length; j++) {
            drives[j] = scan.nextInt();
        }

        getMoneySpent(keyboards, drives, b);

    }

    public static void getMoneySpent(int keyboard[], int drive[], int budget) {

        int result = -1;

        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < drive.length; j++) {

                int k = keyboard[i] + drive[j];

                if (k > result && k <= budget) {
                    result = k;
                }
            }
        }

        System.out.println(result);
    }

}
