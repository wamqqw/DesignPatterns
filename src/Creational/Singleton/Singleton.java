package Creational.Singleton;

public class Singleton {
    private static Singleton uniqueInstanse;

    private Singleton() {}
    public static Singleton getInstance(){
        if (uniqueInstanse == null) {
            uniqueInstanse = new Singleton();
        }
        return uniqueInstanse;
    }
    public String getDescription() {
        return "I'm a simple Singleton!";
    }
}
