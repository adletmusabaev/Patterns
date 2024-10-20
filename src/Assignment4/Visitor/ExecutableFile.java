package Assignment4.Visitor;

// Класс ExecutableFile представляет исполняемый файл.
public record ExecutableFile(String binaryCode) implements File {
    // Данные исполняемого файла.

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Принятие посетителя.
    }
}
