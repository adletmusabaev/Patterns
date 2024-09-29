abstract class Coffee {
    String name;
    String milk;
    String syrup;

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", milk='" + milk + '\'' +
                ", syrup='" + syrup + '\'' +
                '}';
    }
}

class Espresso extends Coffee {
    public Espresso() {
        name = "Espresso";
    }
}

class Cappuccino extends Coffee {
    public Cappuccino() {
        name = "Cappuccino";
    }
}

abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
}

class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}

class CappuccinoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}