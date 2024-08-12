package TaskFive;

public class Dog {

    public enum Breed {
        LABRADOR, BULLDOG, BEAGLE, POODLE, SHEPHERD;
    }

    private final String name;
    private final Breed breed;
    private final int age;

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

    public static boolean hasSameName(Dog... dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void findAndPrintOldestDogs(Dog... dogs) {
        Dog oldestDog = dogs[0];

        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].getAge() > oldestDog.getAge()) {
                oldestDog = dogs[i];
            }
        }

        System.out.println("The oldest dogs:");
        for (Dog dog : dogs) {
            if (dog.getAge() == oldestDog.getAge()) {
                System.out.println(dog.getName() + ", breed: " + dog.getBreed() + ", age: " + dog.getAge());
            }
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", Breed.LABRADOR, 5);
        Dog dog2 = new Dog("Charlie", Breed.BEAGLE, 5);
        Dog dog3 = new Dog("Buddy", Breed.SHEPHERD, 4);

        if (hasSameName(dog1, dog2, dog3)) {
            System.out.println("There are dogs with the same name.");
        } else {
            System.out.println("All dogs have unique names.");
        }

        findAndPrintOldestDogs(dog1, dog2, dog3);
    }
}
