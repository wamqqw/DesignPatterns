package Creational.AbstractFactory;

import java.awt.*;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        }
        else if (factory.equalsIgnoreCase("Shape")) {
          return new ShapeFactory();
        }
        return null;
    }
}
