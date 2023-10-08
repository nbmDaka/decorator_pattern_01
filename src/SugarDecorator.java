class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 150;
    }
}
