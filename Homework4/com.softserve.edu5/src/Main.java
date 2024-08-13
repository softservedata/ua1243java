import Breed.Breed;

import java.util.Objects;

public class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", Breed.BULLDOGS,5);
        Dog dog2 = new Dog("Rex", Breed.CHIHUAHUA,1);
        Dog dog3 = new Dog("Alex", Breed.LABRADOR,3);

        Dog theOldest = dog1;
        if(dog2.getAge()>theOldest.getAge()){
            theOldest=dog2;
        }
        if(dog3.getAge()>theOldest.getAge()){
            theOldest=dog3;
        }
        System.out.println("The oldest dog is:  "+ theOldest);


        if (Objects.equals(dog1.getName(), dog2.getName())){
            System.out.println("Name of the dog1 and dog2 are the same");
        }

        else if(Objects.equals(dog1.getName(), dog3.getName())){
            System.out.println("Name of the dog1 and dog3 are the same");
        }
        else if(Objects.equals(dog2.getName(), dog3.getName())){
            System.out.println("Name of the dog3 and dog2 are the same");

}
       else{ System.out.println("There are no dogs with the same name");
       }

}
}