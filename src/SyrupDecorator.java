public class SyrupDecorator extends CoffeeDecorator {
    public SyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with syrup";
    }

    @Override
    public double cost() {
        return coffee.cost() + 300;
    }
}
