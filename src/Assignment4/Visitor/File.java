package Assignment4.Visitor;

// Интерфейс File описывает метод для принятия посетителя.
public interface File {
    void accept(Visitor visitor); // Метод для принятия посетителя.
}