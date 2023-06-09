package Task4;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
    public MyArrayDataException(int i, int j) {
        this(String.format("В ячейке массива [%d][%d] не число", i, j));
    }
}
