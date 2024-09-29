interface Milk {
    String getMilk();
}

class RegularMilk implements Milk {
    @Override
    public String getMilk() {
        return "Regular Milk";
    }
}

class AlmondMilk implements Milk {
    @Override
    public String getMilk() {
        return "Almond Milk";
    }
}

interface Syrup {
    String getSyrup();
}

class VanillaSyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Vanilla Syrup";
    }
}

class CaramelSyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Caramel Syrup";
    }
}

interface CoffeeIngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}

class EspressoIngredientFactory implements CoffeeIngredientFactory {
    @Override
    public Milk createMilk() {
        return new RegularMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}

class CappuccinoIngredientFactory implements CoffeeIngredientFactory {
    @Override
    public Milk createMilk() {
        return new AlmondMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new CaramelSyrup();
    }
}