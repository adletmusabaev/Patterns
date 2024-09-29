public class Main {
    public static void main(String[] args) {
        // Singleton - Создаем единственный экземпляр кофейни
        CoffeeShop shop = CoffeeShop.getInstance();

        // Factory Method - Создаем кофе с помощью фабрик
        CoffeeFactory espressoFactory = new EspressoFactory();
        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();
        Coffee espresso = espressoFactory.createCoffee();  // Создаем эспрессо
        Coffee cappuccino = cappuccinoFactory.createCoffee();  // Создаем капучино

        // Abstract Factory - Добавляем ингредиенты к кофе
        CoffeeIngredientFactory espressoIngredients = new EspressoIngredientFactory();
        espresso.milk = espressoIngredients.createMilk().getMilk();  // Добавляем молоко к эспрессо
        espresso.syrup = espressoIngredients.createSyrup().getSyrup();  // Добавляем сироп к эспрессо

        CoffeeIngredientFactory cappuccinoIngredients = new CappuccinoIngredientFactory();
        cappuccino.milk = cappuccinoIngredients.createMilk().getMilk();  // Добавляем молоко к капучино
        cappuccino.syrup = cappuccinoIngredients.createSyrup().getSyrup();  // Добавляем сироп к капучино

        // Используем Singleton CoffeeShop для размещения заказов
        shop.orderCoffee(espresso);  // Заказываем эспрессо через кофейню
        shop.orderCoffee(cappuccino);  // Заказываем капучино через кофейню

        // Prototype - Клонируем заказ эспрессо
        CoffeeOrder originalOrder = new CoffeeOrder(espresso);
        CoffeeOrder clonedOrder = originalOrder.clone();
        shop.orderCoffee(clonedOrder.coffee);  // Заказываем клонированный кофе через кофейню

        // Builder - Создаем кастомный кофе
        Coffee customCoffee = new CustomCoffeeBuilder()
                .setName("Custom Coffee")
                .setMilk("Soy Milk")
                .setSyrup("Hazelnut Syrup")
                .build();
        shop.orderCoffee(customCoffee);  // Заказываем кастомный кофе через кофейню
    }
}