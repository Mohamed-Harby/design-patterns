package patterns.structural.decorator;

public class CrispPizzaDecorator extends PizzaDecorator {
    public CrispPizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double cost() {
        return super.cost() + 20;
    }

    @Override
    public String description() {
        return super.description() + " with crisp";
    }
}
