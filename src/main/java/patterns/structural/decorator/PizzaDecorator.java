package patterns.structural.decorator;

public class PizzaDecorator implements Pizza {

    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost();
    }

    @Override
    public String description() {
        return pizza.description();
    }
}
