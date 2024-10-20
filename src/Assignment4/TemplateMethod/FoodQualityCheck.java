package Assignment4.TemplateMethod;

// Класс FoodQualityCheck реализует проверку продуктов питания.
public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificDetails() {
        System.out.println("Checking expiration date and ingredients."); // Проверка срока годности и состава.
    }
}
