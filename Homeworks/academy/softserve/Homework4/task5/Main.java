package academy.softserve.Homework4.task5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Foxy", Breed.BULLDOG, 5);
        Dog dog2 = new Dog("Bucky", Breed.BULLDOG, 3);
        Dog dog3 = new Dog("Lala", Breed.RETRIEVER,1);
        Dog[] dogs = new Dog[] {dog1, dog2,dog3};

        Dog oldestDog = Dog.whoIsTheOldest(dogs);
        boolean uniqueNames = Dog.areNameUnique(dogs);
        System.out.println("Are all dogs have different names? "+uniqueNames);
        System.out.println("Oldest dog: " + oldestDog);
    }
}
