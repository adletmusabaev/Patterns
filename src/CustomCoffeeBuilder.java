class CustomCoffeeBuilder {
    private String name;
    private String milk;
    private String syrup;

    public CustomCoffeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomCoffeeBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public CustomCoffeeBuilder setSyrup(String syrup) {
        this.syrup = syrup;
        return this;
    }

    public Coffee build() {
        Coffee coffee = new Coffee() {};
        coffee.name = this.name;
        coffee.milk = this.milk;
        coffee.syrup = this.syrup;
        return coffee;
    }
}