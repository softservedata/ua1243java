package academy.softserve.Homework9.Task1;

public class Main {
    public static void main(String[] args) {
        ManagerList managerList = new ManagerList();
        FillList fillList = new FillList();
        fillList.inputList(managerList);

        System.out.println("Your started collection:");
        System.out.println(managerList.getMyCollection());

        managerList.swapMinWithMax();
        System.out.println("Collection after swapping min. and max.");
        System.out.println(managerList.getMyCollection());

        managerList.insertRandomThreeDigitalNumber();
        System.out.println("Collection after inserting random three digital" +
                " number after first negative number:");
        if (managerList.getMyCollection().size() >= 11) {
            System.out.println(managerList.getMyCollection());
        } else {
            System.out.println("Your collection don't have negative elements");
        }

        System.out.println("Collection after inserting" +
                " a zero between all neighboring elements" +
                " collection myCollection with different signs:");
        managerList.insertZero();
        System.out.println(managerList.getMyCollection());

        managerList.copyToList(5);

        System.out.println("Collection after removing last even element");

        managerList.removeLastEvenElement();
        System.out.println(managerList.getMyCollection());

        System.out.println("Collection after removing element following the first minimum");
        managerList.removeElement();
        System.out.println(managerList.getMyCollection());
    }
}
