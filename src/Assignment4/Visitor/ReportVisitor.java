package Assignment4.Visitor;

// Класс ReportVisitor генерирует отчет о проверке файлов.
public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file."); // Генерация отчета для текстового файла.
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file."); // Генерация отчета для исполняемого файла.
    }
}