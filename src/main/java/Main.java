import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Counter counter = new Counter();
//        System.out.println(counter.getNumber());
//        try {
//            counter.add();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(counter.getNumber());
//        try {
//            counter.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            counter.add();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try (Counter counter1 = new Counter()) {
//            counter1.add();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(divide(5, 0));
        try {
            foo();
        } catch (NonExistedFileException e) {
            System.err.println(e.getMessage());
        }
    }
    public static double divide(int a, int b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new DivideByZeroException();
        }
        return result;
    }
    public static void foo() throws NonExistedFileException {
        try {
            FileReader reader = new FileReader(new File("dfgs"));
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}
