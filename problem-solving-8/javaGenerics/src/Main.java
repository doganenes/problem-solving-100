import java.lang.reflect.Method;

class Printer {
    <T> void printArray(T[] array) { // T is optional and it specifies <T> java generics.
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("printArray"))
                count++;
        }

    }
}
