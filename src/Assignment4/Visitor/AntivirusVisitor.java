package Assignment4.Visitor;

// Класс AntivirusVisitor выполняет проверку файлов.
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for prohibited words..."); // Проверка текстового файла.
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code..."); // Проверка исполняемого файла.
    }
}