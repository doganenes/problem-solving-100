import java.util.Scanner;

abstract class Book {

    abstract void bookName();

}

class BookTwo extends Book {

    void bookName() {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.print(s);
    }

}

public class Main {

    public static void main(String[] args) {

        Book booktwo = new BookTwo();

        System.out.print("The title is: ");
        booktwo.bookName();

    }

}
