package patterns.structural.decorator;

public class SmallPizza implements Pizza {
    @Override
    public double cost() {
        return 10f;
    }

    @Override
    public String description() {
        return "Small pizza";
    }
}
