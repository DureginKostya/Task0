import java.io.IOException;

/**
 Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable {
    int number;
    boolean closed = false;
    public void add() throws IOException {
        if (closed) throw new IOException("Ресурс закрыт");
        number++;
    }

    @Override
    public void close() throws Exception {
        closed = true;
    }

    public int getNumber() {
        return number;
    }
}
