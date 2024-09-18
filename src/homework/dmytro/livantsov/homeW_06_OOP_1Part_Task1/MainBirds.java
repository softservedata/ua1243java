package homework.dmytro.livantsov.homeW_06_OOP_1Part_Task1;

public class MainBirds {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};

        for (Bird typeOfBird : birds){
            if ((typeOfBird instanceof Penguin)){
                typeOfBird.setFeathers("Without Feathers!");
                typeOfBird.setLayEggs("Yes, this bird lay eggs!\n");
            }else {
                typeOfBird.setFeathers("With Feathers!");
                typeOfBird.setLayEggs("Yes, this bird lay eggs!\n");
            }
        }


        for (Bird typeOfBird : birds){
            typeOfBird.fly();
            System.out.println(typeOfBird.getFeathers());
            System.out.println(typeOfBird.getLayEggs());

        }


    }
}
