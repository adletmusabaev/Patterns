package Assignment4.TemplateMethod;

// Абстрактный класс QualityCheck описывает общий процесс проверки продукта.
public abstract class QualityCheck {
    // Шаблонный метод для проверки продукта.
    public void checkProduct() {
        checkAppearance();       // Шаг 1: проверка внешнего вида.
        checkSpecificDetails();  // Шаг 2: проверка специфических характеристик.
        generateReport();        // Шаг 3: генерация отчета.
    }

    // Проверка внешнего вида (одинаково для всех продуктов).
    private void checkAppearance() {
        System.out.println("Checking appearance...");
    }

    // Абстрактный метод для проверки специфических характеристик (различается для каждого типа продукта).
    protected abstract void checkSpecificDetails();

    // Заключительный отчет (одинаково для всех продуктов).
    private void generateReport() {
        System.out.println("Generating report...");
    }
}