public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = CoffeeShop.getInstance();

        CoffeeFactory espressoFactory = new EspressoFactory();
        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        Coffee cappuccino = cappuccinoFactory.createCoffee();  

        CoffeeIngredientFactory espressoIngredients = new EspressoIngredientFactory();
        espresso.milk = espressoIngredients.createMilk().getMilk();  
        espresso.syrup = espressoIngredients.createSyrup().getSyrup();  

        CoffeeIngredientFactory cappuccinoIngredients = new CappuccinoIngredientFactory();
        cappuccino.milk = cappuccinoIngredients.createMilk().getMilk();  
        cappuccino.syrup = cappuccinoIngredients.createSyrup().getSyrup();  

        shop.orderCoffee(espresso);  
        shop.orderCoffee(cappuccino); 

        CoffeeOrder originalOrder = new CoffeeOrder(espresso);
        CoffeeOrder clonedOrder = originalOrder.clone();
        shop.orderCoffee(clonedOrder.coffee);  

        Coffee customCoffee = new CustomCoffeeBuilder()
                .setName("Custom Coffee")
                .setMilk("Soy Milk")
                .setSyrup("Hazelnut Syrup")
                .build();
        shop.orderCoffee(customCoffee); 
    }
}
