package Assignment4.Visitor;

// Интерфейс Visitor описывает методы взаимодействия с файлами.
// Интерфейс Visitor описывает методы взаимодействия с файлами.
public interface Visitor {
    void visit(TextFile textFile);          // Метод для проверки текстовых файлов.
    void visit(ExecutableFile executableFile); // Метод для проверки исполняемых файлов.
}