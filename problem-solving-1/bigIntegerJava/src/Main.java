import java.util.*;
import java.math.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BigInteger x = new BigInteger(scan.next());
        BigInteger y = new BigInteger(scan.next());

        System.out.println(x.add(y));
        System.out.println(x.multiply(y));

    }

}
