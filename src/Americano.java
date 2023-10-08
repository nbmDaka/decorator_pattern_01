public class Americano implements Coffee {

    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double cost() {
        return 600;
    }
}
