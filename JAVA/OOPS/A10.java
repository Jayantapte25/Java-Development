
class Engine {
    public void start() {
        System.out.println("Engine starting...");
    }
}

class Car {
    private String model;
    private Engine engine; //Engine onject is stored in Car object

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine; //Enginer object is passed to Car object & stored in engine
    }

    public void startCar() {
        System.out.println("Starting " + model);
        engine.start(); //Calling start method of Engine object
    }
}

public class A10 {
    public static void main(String[] args) {
        Engine engine = new Engine(); //we can't start car without engine object
        Car myCar = new Car("Toyota", engine);
        myCar.startCar();
    }    
}