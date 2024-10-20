package Assignment4.Visitor;

// Главный класс Main для проверки файлов.
public class Main {
    public static void main(String[] args) {
        // Создание файлов.
        File textFile = new TextFile("This is a document.");
        File executableFile = new ExecutableFile("binarydata...");

        // Создание посетителей.
        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        // Запуск антивирусной проверки.
        textFile.accept(antivirus);
        executableFile.accept(antivirus);

        // Генерация отчета.
        textFile.accept(report);
        executableFile.accept(report);
    }
}