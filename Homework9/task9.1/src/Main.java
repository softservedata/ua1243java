import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>(10);
        System.out.println("Please, enter the 10 integer value:");
        for (int i = 0; i < 10; i++) {
            myCollection.add(SCANNER.nextInt());
            System.out.println(myCollection.get(i));
        }
        System.out.println("Your input: "+myCollection);

        arrayListMaxAndMin(myCollection);
        arrayListInsertData(myCollection);
        arrayListInsertZero(myCollection);
        copyList(myCollection);
        removeLastEven(myCollection);
        removeFirstMin(myCollection);


    }

    public static void arrayListMaxAndMin(ArrayList<Integer> myCollection) {


        int max = Collections.max(myCollection);
        System.out.println("Maximum is : " + max);

        int min = Collections.min(myCollection);
        System.out.println("Minimum is : " + min);
        System.out.println("=".repeat(60));

    }

    public static void arrayListInsertData(ArrayList<Integer> myCollection) {
        System.out.println("Please, enter 3 integer number: ");
        int firstNumber = SCANNER.nextInt();
        int secondNumber = SCANNER.nextInt();
        int thirdNumber = SCANNER.nextInt();
        ArrayList<Integer> copiedList = new ArrayList<>(myCollection);

        List<Integer> addList = List.of(firstNumber, secondNumber, thirdNumber);
        boolean hasNegative = false;
        for (int i = 0; i < 10; i++) {
            if (copiedList.get(i) < 0) {
                copiedList.addAll(i, addList);
                hasNegative = true;
                break;
            }
        }
        if (!hasNegative) {
            System.out.println("Sorry! But this list consist only positive value, so we can not insert your numbers.");
        }
        System.out.println("Original list:  " + myCollection);
        System.out.println("List after inserting your three integers numbers: " + copiedList);
        System.out.println("=".repeat(60));

    }

    public static void arrayListInsertZero(ArrayList<Integer> myCollection) {
        boolean hasNegative = false;
        ArrayList<Integer> copiedList = new ArrayList<>(myCollection);
        for (int i = 0; i < copiedList.size() - 1; i++) {
            if (copiedList.get(i) >= 0 && copiedList.get(i + 1) < 0 || copiedList.get(i) < 0 && copiedList.get(i + 1) >= 0) {
                copiedList.add(i + 1, 0);
                hasNegative = true;
                i++;

            }

        }
        if (!hasNegative) {
            System.out.println("Sorry! But this list consist only positive value, so we can not insert zero.");
        }
        System.out.println("Original list:  " + myCollection);
        System.out.println("list after inserting zero: " + copiedList);
        System.out.println("=".repeat(60));

    }
    public static void copyList(ArrayList<Integer> myCollection){
        int k = 5;
        ArrayList<Integer> copiedList = new ArrayList<>(myCollection);
        List<Integer> list1 = copiedList.subList(0, k);
        List<Integer> list2 = copiedList.subList(k+1, 10);

        Collections.sort(list1);
        list2.sort(Comparator.reverseOrder());
        System.out.println("Original list:  " + myCollection);
        System.out.println("list1 is a part of original list, in direct order: "+list1);
        System.out.println("list2 is a next part of original list, in reverse order: "+list2);
        System.out.println("=".repeat(60));
    }
    public static void removeLastEven(ArrayList<Integer> myCollection){
        boolean hasEven = false;
        ArrayList<Integer> copiedList = new ArrayList<>(myCollection);

        if (copiedList.get(copiedList.size()-1) % 2 == 0) {
                hasEven = true;
            copiedList.remove(copiedList.size()-1);
            System.out.println("Original list:  " + myCollection);
            System.out.println("After removing the last even element: "+copiedList);
        }
        if (!hasEven){
            System.out.println("We have not removed the last element , because it is not even.");
        }
        System.out.println("=".repeat(60));
    }
    public static void removeFirstMin(ArrayList<Integer> myCollection){
        ArrayList<Integer> copiedList = new ArrayList<>(myCollection);
        if(Objects.equals(copiedList.get(0), Collections.min(copiedList))){
            copiedList.remove(0);
            System.out.println("Original list:  " + myCollection);
            System.out.println("After removing the first min even element: "+copiedList);
        } else {
            System.out.println("The first element is not min, so we have not removed first element.");
        }
        System.out.println("=".repeat(60));

    }
}


