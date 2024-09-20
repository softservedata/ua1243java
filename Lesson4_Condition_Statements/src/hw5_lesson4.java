import java.util.Scanner;

class Dog {
    private String name;
    private Breed breed;
    private int age;

    public enum Breed {
        LABRADOR, BULLDOG, BEAGLE, POODLE, ROTTWEILER, GERMAN_SHEPHERD, GOLDEN_RETRIEVER
    }

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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Dog dog1 = new Dog("Zhuzha", Breed.BEAGLE, 5);
        Dog dog2 = new Dog("Oleg", Breed.BULLDOG, 3);
        Dog dog3 = new Dog("Uta", Breed.GERMAN_SHEPHERD, 7);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("There are dogs with the same name.");
        } else {
            System.out.println("All dogs have unique names.");
        }

        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }

        System.out.println("The oldest dog is " + oldestDog.getName() + " and its breed is " + oldestDog.getBreed() + ".");
    }
}
