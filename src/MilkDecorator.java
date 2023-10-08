class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "with Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 200;
    }
}
