package patterns.structural.decorator;

public class LargePizza implements Pizza {

    @Override
    public double cost() {
        return 30f;
    }

    @Override
    public String description() {
        return "Large pizza";
    }
}
