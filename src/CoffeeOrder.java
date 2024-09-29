class CoffeeOrder implements Cloneable {
    Coffee coffee;

    public CoffeeOrder(Coffee coffee) {
        this.coffee = coffee;
    }

    public CoffeeOrder clone() {
        try {
            return (CoffeeOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "coffee=" + coffee +
                '}';
    }
}