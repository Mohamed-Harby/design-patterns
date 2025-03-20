package patterns.structural.decorator;

public class MediumPizza implements Pizza {
    @Override
    public double cost() {
        return 20f;
    }

    @Override
    public String description() {
        return "Medium pizza";
    }
}
