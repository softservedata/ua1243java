interface Animal {
    void voice();
    void feed();
}

class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " says: Meow");
    }

    @Override
    public void feed() {
        System.out.println(name + " is being fed with cat food.");
    }
}

class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " says: Woof");
    }

    @Override
    public void feed() {
        System.out.println(name + " is being fed with dog food.");
    }
}


public class pr1_lesson7 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Cat("Daria");
        animals[1] = new Dog("Muhtar");
        animals[2] = new Cat("Rebit");
        animals[3] = new Dog("Recarding");

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
