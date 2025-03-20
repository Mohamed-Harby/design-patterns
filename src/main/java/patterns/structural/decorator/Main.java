package patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new CrispPizzaDecorator(new ShrimpPizzaDecorator(
                new SmallPizza()));
        System.out.println(pizza.cost());
        System.out.println(pizza.description());

        System.out.println("----------");
        Pizza pizza1 = new PizzaBuilder(new MediumPizza())
                .addCrisp()
                .addShrimp()
                .build();
    }

}
