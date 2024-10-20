package Assignment4.Visitor;

// Класс TextFile представляет текстовый файл.
public record TextFile(String content) implements File {
    // Содержимое текстового файла.

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Принятие посетителя.
    }
}