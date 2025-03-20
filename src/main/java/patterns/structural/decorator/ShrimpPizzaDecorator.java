package patterns.structural.decorator;

public class ShrimpPizzaDecorator extends PizzaDecorator {
    public ShrimpPizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double cost() {
        return super.cost() + 10;
    }

    @Override
    public String description() {
        return super.description() + " with shrimp";
    }
}
