package Assignment4.TemplateMethod;

// Класс ElectronicsQualityCheck реализует проверку электронных товаров.
public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificDetails() {
        System.out.println("Checking functionality and warranty."); // Проверка работоспособности и гарантии.
    }
}
