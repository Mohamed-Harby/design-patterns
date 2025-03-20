package patterns.structural.decorator;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    public PizzaBuilder addShrimp() {
        this.pizza = new ShrimpPizzaDecorator(pizza);
        return this;
    }

    public PizzaBuilder addCrisp() {
        this.pizza = new CrispPizzaDecorator(pizza);
        return this;
    }

    public Pizza build() {
        return pizza;
    }

}
