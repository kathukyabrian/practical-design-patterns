package tech.kitucode.design.decorator;

public abstract class Mazda {
    public String description = "Unknown Mazda";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
