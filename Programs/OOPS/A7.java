interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

class Animal implements Walkable, Swimmable {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}

public class A7 {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog");
        Animal fish = new Animal("Fish");

        dog.walk();
        dog.swim(); 

        System.out.println("");

        fish.swim();
        fish.walk();

        System.out.println("");

        Walkable walker = new Animal("Penguin");
        Swimmable swimmer = new Animal("Dolphin");

        walker.walk();
        swimmer.swim();
    }
}
