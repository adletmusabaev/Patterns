package Assignment4.TemplateMethod;

// Главный класс Main для проверки продуктов.
public class Main {
    public static void main(String[] args) {
        QualityCheck foodCheck = new FoodQualityCheck(); // Проверка продуктов питания.
        QualityCheck electronicsCheck = new ElectronicsQualityCheck(); // Проверка электронных товаров.

        foodCheck.checkProduct();         // Запуск проверки для продуктов питания.
        electronicsCheck.checkProduct();  // Запуск проверки для электроники.
    }
}