package Creational.Factorymethod;

public abstract class SmartPhone {
    public abstract String getModelName();

    public String toString() {
        return "Model: " + this.getModelName();
    }
}
