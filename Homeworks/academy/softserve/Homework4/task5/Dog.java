package academy.softserve.Homework4.task5;

enum Breed {
    BULLDOG, RETRIEVER, POODLE;
}

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public static boolean areNameUnique(Dog[] dogs) {
        int length = dogs.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Dog whoIsTheOldest(Dog[] dogs) {
        if (dogs == null || dogs.length == 0) {
            return null;
        }
        Dog oldest = dogs[0];
        for (Dog dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }
        return oldest;
    }
}

