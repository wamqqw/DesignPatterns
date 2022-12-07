package Creational.Factorymethod;

public class IPhone extends SmartPhone {
    private String modelName;

    IPhone(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModelName() {
        return this.modelName;
    }
}
