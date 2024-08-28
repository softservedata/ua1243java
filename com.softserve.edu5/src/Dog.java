import Breed.Breed;

public class Dog {
    private String name;
    private Breed breed;
    private int age;


    public Dog(String name, Breed breed, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }
}
