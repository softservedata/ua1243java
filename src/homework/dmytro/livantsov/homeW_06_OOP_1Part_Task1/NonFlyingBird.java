package homework.dmytro.livantsov.homeW_06_OOP_1Part_Task1;

public class NonFlyingBird extends Bird{

    @Override
    void fly(){
        System.out.println("This bird can't fly!");
    }
}
